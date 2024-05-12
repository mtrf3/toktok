package com.ss.android.ttvecamera.cameraalgorithm;

/* loaded from: classes12.dex */
public class TEOneKeyProcessParams extends TECameraAlgorithmParam {
    public boolean enableAfs;
    public boolean enableAsyncProcess;
    public boolean enableDenoise;
    public boolean enableHDR;
    public boolean isFirstFrame;
    public int iso;
    public int maxIso;
    public int minIso;
    public boolean enableHdrV2 = true;
    public boolean enableDayScene = true;
    public boolean enableNightScene = true;
    public String algParams = "";
    public int cvdetectFrames = 3;
    public boolean enableAlgoConfig = true;

    public TEOneKeyProcessParams() {
        this.type = 256;
    }
}
