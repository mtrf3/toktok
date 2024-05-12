package com.bytedance.realx.video;

import X.X1D;

/* loaded from: classes33.dex */
public class Size {
    public int height;
    public int width;

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.width);
        LIZ.append("x");
        LIZ.append(this.height);
        return X1D.LIZIZ(LIZ);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width != size.width || this.height != size.height) {
            return false;
        }
        return true;
    }

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
