package com.ss.android.ttve.vealgorithm.params;

import com.ss.android.vesdk.VERect;

/* loaded from: classes16.dex */
public class VEBachCommonImageResult extends VEAlgorithmResult {
    public MattingContent mattingContent;
    public float[] vectorResult;

    /* loaded from: classes16.dex */
    public static class MattingContent {
        public VERect box;
        public boolean isValid;
        public String outputPath;
    }

    public VEBachCommonImageResult() {
        this.type = VEAlgorithmType.VEAlgorithmTypeBachCommonImage;
    }
}
