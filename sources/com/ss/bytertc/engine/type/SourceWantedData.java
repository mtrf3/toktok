package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalSourceWantedData;

/* loaded from: classes33.dex */
public class SourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SourceWantedData{width='");
        LIZ.append(this.width);
        LIZ.append('\'');
        LIZ.append(", height='");
        LIZ.append(this.height);
        LIZ.append('\'');
        LIZ.append(", frameRate='");
        LIZ.append(this.frameRate);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public SourceWantedData() {
    }

    public SourceWantedData(InternalSourceWantedData internalSourceWantedData) {
        this.width = internalSourceWantedData.width;
        this.height = internalSourceWantedData.height;
        this.frameRate = internalSourceWantedData.frameRate;
    }
}
