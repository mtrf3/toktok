package com.ss.bytertc.engine.video;

import X.X1D;
import java.util.Arrays;

/* loaded from: classes33.dex */
public class FaceDetectionResult {
    public int detectResult;
    public Rectangle[] faces;
    public long frameTimestampUs;
    public int imageHeight;
    public int imageWidth;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FaceDetectionResult{detectResult=");
        LIZ.append(this.detectResult);
        LIZ.append(", imageWidth=");
        LIZ.append(this.imageWidth);
        LIZ.append(", imageHeight=");
        LIZ.append(this.imageHeight);
        LIZ.append(", faces=");
        LIZ.append(Arrays.toString(this.faces));
        LIZ.append(", frameTimestampUs=");
        LIZ.append(this.frameTimestampUs);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
