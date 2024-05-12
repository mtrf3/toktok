package com.ss.android.ttvecamera.cameraalgorithm;

/* loaded from: classes12.dex */
public class TETaintSceneDetectParams extends TECameraAlgorithmParam {
    public int backendType;
    public String kernelBinPath;
    public String modelPath;
    public int detectFrequency = 3;
    public int numThread = 2;
    public int detectRepeatNum = 1;

    public TETaintSceneDetectParams() {
        this.type = 2048;
    }
}
