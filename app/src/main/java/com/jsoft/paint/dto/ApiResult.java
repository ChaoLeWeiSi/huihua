package com.jsoft.paint.dto;

import android.graphics.Bitmap;

public class ApiResult {
    public String requestType;
    public String savedImageName;
    public Bitmap mBitmap;
    public Bitmap inpaintBitmap;
    public String infoTexts;
}
