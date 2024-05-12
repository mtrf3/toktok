package com.ss.android.ttve.vealgorithm.params;

/* loaded from: classes16.dex */
public class VEFaceReenactParam extends VEAlgorithmParam {
    public String algConfigJson;
    public boolean blend;
    public int faceCount;
    public boolean hwEncode;
    public String imagePath;
    public String kernel_path;
    public String keyPointFilePath;
    public int outMaxHeight;
    public int outMaxWidth;
    public String outputPath;

    public VEFaceReenactParam() {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_FACE_REENACT;
    }
}
