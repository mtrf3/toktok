package com.ss.android.ttve.vealgorithm.params;

import X.C87322YOw;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public class VESmartCutParam extends VEAlgorithmParam {
    public C87322YOw audioBeatParam;
    public int frameCountPerStep;
    public ArrayList<String> paths;
    public int stepDurationMs;
    public int threadNum;
    public int threadNumOfSW;

    public VESmartCutParam() {
        this.type = VEAlgorithmType.VEAlgorithmTypeSmartCut;
        this.threadNum = 1;
        this.stepDurationMs = 1000;
        this.frameCountPerStep = 2;
        this.audioBeatParam = new C87322YOw();
    }
}
