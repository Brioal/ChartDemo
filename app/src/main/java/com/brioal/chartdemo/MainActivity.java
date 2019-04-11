package com.brioal.chartdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.chart1)
    LineChart mChart1;
    @BindView(R.id.main_cb1)
    Switch mMainCb1;
    @BindView(R.id.main_cb2)
    Switch mMainCb2;
    @BindView(R.id.main_cb3)
    Switch mMainCb3;
    @BindView(R.id.main_cb4)
    Switch mMainCb4;
    @BindView(R.id.main_cb5)
    Switch mMainCb5;
    @BindView(R.id.main_cb6)
    Switch mMainCb6;
    @BindView(R.id.main_cb7)
    Switch mMainCb7;
    @BindView(R.id.main_sp8)
    Spinner mMainSp8;
    @BindView(R.id.main_cb9)
    Switch mMainCb9;
    @BindView(R.id.main_cb10)
    Switch mMainCb10;
    @BindView(R.id.main_cb11)
    Switch mMainCb11;
    @BindView(R.id.main_cb12)
    Switch mMainCb12;
    @BindView(R.id.main_cb13)
    Switch mMainCb13;
    @BindView(R.id.main_cb14)
    Switch mMainCb14;
    @BindView(R.id.main_btn15)
    Button mBtn15;
    @BindView(R.id.main_cb16)
    Switch mMainCb16;
    @BindView(R.id.main_cb17)
    Switch mMainCb17;


    // 条形图
    @BindView(R.id.chart2)
    BarChart mChart2;
    @BindView(R.id.main_cb18)
    Switch mMainCb18;
    @BindView(R.id.main_btn19)
    Button mBtn19;
    @BindView(R.id.main_cb20)
    Switch mMainCb20;
    @BindView(R.id.main_cb21)
    Switch mMainCb21;
    @BindView(R.id.main_cb22)
    Switch mMainCb22;
    @BindView(R.id.main_cb23)
    Switch mMainCb23;
    @BindView(R.id.main_cb24)
    Switch mMainCb24;
    @BindView(R.id.main_cb25)
    Switch mMainCb25;
    @BindView(R.id.main_cb26)
    Switch mMainCb26;
    @BindView(R.id.main_cb27)
    Switch mMainCb27;
    @BindView(R.id.main_cb28)
    Switch mMainCb28;
    @BindView(R.id.main_cb29)
    Switch mMainCb29;
    @BindView(R.id.main_cb30)
    Switch mMainCb30;

    // 饼状图
    @BindView(R.id.chart3)
    PieChart mChart3;
    @BindView(R.id.main_btn31)
    Button mBtn31;
    @BindView(R.id.main_cb32)
    Switch mMainCb32;
    @BindView(R.id.main_cb33)
    Switch mMainCb33;
    @BindView(R.id.main_cb34)
    Switch mMainCb34;
    @BindView(R.id.main_cb35)
    Switch mMainCb35;
    @BindView(R.id.main_cb36)
    Switch mMainCb36;
    @BindView(R.id.main_cb37)
    Switch mMainCb37;
    @BindView(R.id.main_cb38)
    Switch mMainCb38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setChartAction();
        // 折线图
        setChart1();
        // 条形图
        setChart2();
        // 饼状图
        setChart3();
    }

    /**
     * 设置饼状图
     */
    private void setChart3() {
        // 清空表单
        mChart3.clear();
        // 设置数据
        List<PieEntry> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new PieEntry((i + 1) * 10f, "模块" + i));
        }
        PieDataSet dataSet = new PieDataSet(list, "温度占比");
        dataSet.setLabel("Label");
        // 设置颜色
        dataSet.setColors(getRandomColor(), getRandomColor(), getRandomColor(), mMainCb35.isChecked() ? Color.TRANSPARENT : getRandomColor());
        // 设置字体颜色
        dataSet.setValueTextColor(getRandomColor());

        // 设置边距
        dataSet.setSliceSpace(mMainCb36.isChecked() ? 5f : 0f);
        // 设置显示内容的格式
        dataSet.setValueTextSize(20);
        dataSet.setValueLineColor(getRandomColor());
        dataSet.setValueLinePart1Length(0.5f);
        dataSet.setValueLinePart2Length(0.5f);
        if (mMainCb37.isChecked()) {
            // 值外部显示X
            dataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        } else {
            // 值内部显示
            dataSet.setXValuePosition(PieDataSet.ValuePosition.INSIDE_SLICE);
        }
        if (mMainCb38.isChecked()) {
            // 标签外部显示X
            dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        } else {
            // 标签内部显示
            dataSet.setYValuePosition(PieDataSet.ValuePosition.INSIDE_SLICE);
        }
        dataSet.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                if (mMainCb35.isChecked() && value == 40) {
                    return "";
                }
                return value + "%";
            }
        });
        PieData data = new PieData(dataSet);
        // 动画
        mChart3.animateX(mMainCb32.isChecked() ? 1500 : 0);
        mChart3.animateY(mMainCb33.isChecked() ? 1500 : 0);
        // 设置实心
        if (mMainCb34.isChecked()) {
            mChart3.setHoleRadius(0f);
            mChart3.setTransparentCircleRadius(0f);
        } else {
            mChart3.setHoleRadius(35f);
            mChart3.setTransparentCircleRadius(40f);
        }
        // 设置标签也暗色
        mChart3.setEntryLabelColor(getRandomColor());
        mChart3.setData(data);
    }

    /**
     * 设置条形图
     */
    private void setChart2() {
        // 清空表格
        mChart2.clear();
        // 显示边框
        mChart2.setDrawBorders(mMainCb18.isChecked());
        // 获取x轴对象
        XAxis xAxis = mChart2.getXAxis();
        // 设置显示的文字格式
        xAxis.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                int position = (int) value;
                String str = position + "";
                if (str.length() == 1) {
                    str = "0" + str;
                }
                return str + ":00";
            }
        });
        // 是否显示x轴的标签
        xAxis.setDrawLabels(mMainCb20.isChecked());
        // 是否显示x轴的网格
        xAxis.setDrawGridLines(mMainCb21.isChecked());
        xAxis.setDrawAxisLine(mMainCb21.isChecked());
        // Y轴
        // 是否显示右边Y轴
        mChart2.getAxisRight().setEnabled(mMainCb22.isChecked());
        // 左边Y轴对象
        YAxis yAxis = mChart2.getAxisLeft();
        // 是否显示标签
        yAxis.setDrawLabels(mMainCb23.isChecked());
        // 是否显示网格
        yAxis.setDrawGridLines(mMainCb24.isChecked());
        yAxis.setDrawAxisLine(mMainCb24.isChecked());
        LimitLine limitLine = new LimitLine(80, "最高污染"); //得到限制线
        limitLine.setLineWidth(1f);
        limitLine.setTextSize(10f);
        limitLine.setTextColor(getRandomColor());
        limitLine.setLineColor(getRandomColor());
        if (mMainCb28.isChecked()) {
            yAxis.addLimitLine(limitLine);
        }
        // 设置数据
        List<BarEntry> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add(new BarEntry(i, (float) ((Math.random() * 40) + 50)));
        }
        BarDataSet barDataSet = new BarDataSet(list, "空气污染等级");
        // 是否显示顶点数值
        barDataSet.setDrawValues(mMainCb25.isChecked());
        // 条形图颜色
        barDataSet.setGradientColor(getRandomColor(), getRandomColor());
        BarData data = new BarData(barDataSet);
        // 是否显示图例
        mChart2.getLegend().setEnabled(mMainCb26.isChecked());
        // 是否显示描述
        Description description = new Description();
        description.setTextColor(getRandomColor());
        description.setText("空气污染图");
        if (mMainCb27.isChecked()) {
            mChart2.setDescription(description);
        }
        // 设置动画
        mChart2.animateX(mMainCb29.isChecked() ? 1200 : 0);
        mChart2.animateY(mMainCb30.isChecked() ? 1200 : 0);
        mChart2.setData(data);
    }

    /**
     * 设置表格的事件
     */
    private void setChartAction() {
        CompoundButton.OnCheckedChangeListener changeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // 刷新表格
                setChart1();
            }
        };

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 刷新表格
                setChart1();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 刷新表格
                setChart1();
            }
        };

        mMainCb1.setOnCheckedChangeListener(changeListener);
        mMainCb2.setOnCheckedChangeListener(changeListener);
        mMainCb3.setOnCheckedChangeListener(changeListener);
        mMainCb4.setOnCheckedChangeListener(changeListener);
        mMainCb5.setOnCheckedChangeListener(changeListener);
        mMainCb6.setOnCheckedChangeListener(changeListener);
        mMainCb7.setOnCheckedChangeListener(changeListener);
        mMainCb9.setOnCheckedChangeListener(changeListener);
        mMainCb10.setOnCheckedChangeListener(changeListener);
        mMainCb11.setOnCheckedChangeListener(changeListener);
        mMainCb12.setOnCheckedChangeListener(changeListener);
        mMainCb13.setOnCheckedChangeListener(changeListener);
        mMainCb14.setOnCheckedChangeListener(changeListener);
        mMainCb16.setOnCheckedChangeListener(changeListener);
        mMainCb17.setOnCheckedChangeListener(changeListener);

        mMainSp8.setOnItemSelectedListener(itemSelectedListener);

        mBtn15.setOnClickListener(onClickListener);


        // 挑衅图
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // 刷新表格
                setChart2();
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 刷新表格
                setChart2();
            }
        };

        mMainCb18.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb20.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb21.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb22.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb23.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb24.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb25.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb26.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb27.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb28.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb29.setOnCheckedChangeListener(onCheckedChangeListener2);
        mMainCb30.setOnCheckedChangeListener(onCheckedChangeListener2);

        mBtn19.setOnClickListener(onClickListener2);


        // 饼状图
        CompoundButton.OnCheckedChangeListener checkedChangeListener3 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setChart3();
            }
        };

        mMainCb30.setOnCheckedChangeListener(checkedChangeListener3);
        mMainCb32.setOnCheckedChangeListener(checkedChangeListener3);
        mMainCb33.setOnCheckedChangeListener(checkedChangeListener3);
        mMainCb34.setOnCheckedChangeListener(checkedChangeListener3);
        mMainCb35.setOnCheckedChangeListener(checkedChangeListener3);
        mMainCb36.setOnCheckedChangeListener(checkedChangeListener3);
        mMainCb37.setOnCheckedChangeListener(checkedChangeListener3);
        mMainCb38.setOnCheckedChangeListener(checkedChangeListener3);

        View.OnClickListener onClickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setChart3();
            }
        };
        mBtn31.setOnClickListener(onClickListener3);

    }

    /**
     * 设置表格1
     */
    private void setChart1() {
        // 清空表格
        mChart1.clear();
        // 显示边界
        mChart1.setDrawBorders(mMainCb14.isChecked());
        //设置数据
        List<Entry> list = new ArrayList<>();
        List<Entry> list1 = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add(new Entry(i, (float) ((Math.random()) * 6) + 29));
            list1.add(new Entry(i, (float) ((Math.random()) * 10) + 25));
        }
        // 一个LineDataSet就是一条线
        LineDataSet lineDataSet = new LineDataSet(list, "昨天温度");
        // 设置线的颜色
        lineDataSet.setColor(getRandomColor());
        // 是否填充
        lineDataSet.setDrawFilled(mMainCb4.isChecked());
        // 顶点是否显示数值
        lineDataSet.setDrawValues(mMainCb5.isChecked());
        // 设置线条宽度
        lineDataSet.setLineWidth((float) ((Math.random() * 2) + 1));
        // 是否显示端点的圆点
        lineDataSet.setDrawCircles(mMainCb13.isChecked());
        LineDataSet lineDataSet1 = new LineDataSet(list1, "今天温度");
        lineDataSet1.setColor(Color.GREEN);
        // 设置折线类型
        switch (mMainSp8.getSelectedItemPosition()) {
            case 0:
                // 直线
                lineDataSet.setMode(LineDataSet.Mode.LINEAR);
                break;
            case 1:
                // 曲线
                lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
                break;
            case 2:
                // 梯度线
                lineDataSet.setMode(LineDataSet.Mode.STEPPED);
                break;
            case 4:
                // 水平直线
                lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
                break;
        }
        lineDataSet1.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        // 显示第二条线
        LineData data = null;
        if (mMainCb9.isChecked()) {
            data = new LineData(lineDataSet, lineDataSet1);
        } else {
            data = new LineData(lineDataSet);
        }
        // X轴对象
        XAxis xAxis = mChart1.getXAxis();
        // X轴刻度
        xAxis.setDrawLabels(mMainCb10.isChecked());
        // 设置x轴位置
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        // 设置是否绘制线条
        xAxis.setDrawGridLines(mMainCb2.isChecked());
        // 设置x轴间隔
        xAxis.setGranularity(1f);
        xAxis.setLabelCount(12, true);
        // 标签倾斜
        xAxis.setLabelRotationAngle((float) (Math.random() * 90));
        // 设置显示的内容
        xAxis.setValueFormatter(new ValueFormatter() {
            @Override
            public String getAxisLabel(float value, AxisBase axis) {
                int position = (int) value;
                String str = position + "";
                if (str.length() == 1) {
                    str = "0" + str;
                }
                return str + ":00";
            }
        });
        // 获取y轴对象
        YAxis yAxis = mChart1.getAxisLeft();
        // 显示标签
        yAxis.setDrawLabels(mMainCb12.isChecked());
        // 取消右边y轴
        mChart1.getAxisRight().setEnabled(mMainCb1.isChecked());
        // 设置值
        yAxis.setAxisMinimum(-10);
        yAxis.setAxisMaximum(40);
        // 显示刻度
        yAxis.setDrawAxisLine(mMainCb3.isChecked());
        // 设置y轴警示值
        LimitLine limitLine = new LimitLine(38, "最高温度"); //得到限制线
        limitLine.setLineWidth(1f);
        limitLine.setTextSize(10f);
        limitLine.setTextColor(getRandomColor());
        limitLine.setLineColor(getRandomColor());
        if (mMainCb11.isChecked()) {
            yAxis.addLimitLine(limitLine);
        }
        // 设置描述
        Description description = new Description();  // 这部分是深度定制描述文本，颜色，字体等
        description.setText("温度变化表");
        description.setTextColor(Color.RED);
        mChart1.setDescription(description);
        mChart1.getDescription().setEnabled(mMainCb17.isChecked());
        // 设置动画
        mChart1.animateX(mMainCb6.isChecked() ? 1200 : 0);
        mChart1.animateY(mMainCb7.isChecked() ? 1200 : 0);
        //无数据时显示的文字
        mChart1.setNoDataText("暂无数据");
        // 设置图例
        mChart1.getLegend().setEnabled(mMainCb16.isChecked());
        mChart1.setData(data);
    }


    /**
     * 获取随机的颜色
     *
     * @return
     */
    public static int getRandomColor() {
        Random random = new Random();
        int r = 0;
        int g = 0;
        int b = 0;
        for (int i = 0; i < 2; i++) {
            //       result=result*10+random.nextInt(10);
            int temp = random.nextInt(16);
            r = r * 16 + temp;
            temp = random.nextInt(16);
            g = g * 16 + temp;
            temp = random.nextInt(16);
            b = b * 16 + temp;
        }
        return Color.rgb(r, g, b);
    }
}
