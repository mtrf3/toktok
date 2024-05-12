package com.ss.bytertc.engine.video;

import X.X1D;
import java.util.Arrays;

/* loaded from: classes33.dex */
public class ExpressionDetectResult {
    public static int MAX_COUNT = 10;
    public ExpressionDetectInfo[] detectInfo;
    public int detectResult;
    public int faceCount;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExpressionDetectResult{detectResult=");
        LIZ.append(this.detectResult);
        LIZ.append(", detectInfo=");
        LIZ.append(Arrays.toString(this.detectInfo));
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
