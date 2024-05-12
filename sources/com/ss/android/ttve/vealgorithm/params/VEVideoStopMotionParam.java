package com.ss.android.ttve.vealgorithm.params;

/* loaded from: classes16.dex */
public class VEVideoStopMotionParam extends VEAlgorithmParam {
    public int compileHeight;
    public int compileWidth;
    public String graphPath;
    public int interval;
    public String saveDir;
    public int startTime;
    public String videoPath;

    public VEVideoStopMotionParam() {
        this.type = VEAlgorithmType.VEAlgorithmTypeVideoStopMotionFrame;
    }
}
