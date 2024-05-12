package com.byted.cast.common.bean;

import X.X1D;
import java.util.Arrays;

/* loaded from: classes29.dex */
public class DramaInfo {
    public DramaBean[] dramaBeans;
    public String dramaId;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DramaInfo{dramaId='");
        LIZ.append(this.dramaId);
        LIZ.append('\'');
        LIZ.append(", dramaBeans=");
        LIZ.append(Arrays.toString(this.dramaBeans));
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
