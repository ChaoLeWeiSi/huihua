package com.jsoft.paint.dto;

public class CnParam {
    public String cnInputImage; //Background, Sketch
    public String cnModule;
    public String cnModelKey;
    public String cnModel;
    public int cnResizeMode = -1;
    public int cnControlMode;
    public double cnWeight;
    public double cnModuleParamA = Double.NaN;
    public double cnModuleParamB = Double.NaN;
    public double cnStart = 0.0;
    public double cnEnd = 1.0;

    public static final String CN_RESIZE_MODE_RESIZE = "Just Resize";
    public static final String CN_RESIZE_MODE_CROP = "Crop and Resize";
    public static final String CN_RESIZE_MODE_FILL = "Resize and Fill";
}
