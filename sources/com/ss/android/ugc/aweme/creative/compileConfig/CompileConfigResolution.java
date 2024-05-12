package com.ss.android.ugc.aweme.creative.compileConfig;

import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CompileConfigResolution {
    public int bitRate;
    public final int height;
    public final Float resizeX;
    public final Float resizeY;
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CompileConfigResolution() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution.<init>():void");
    }

    public static /* synthetic */ CompileConfigResolution copy$default(CompileConfigResolution compileConfigResolution, int i, int i2, Float f, Float f2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = compileConfigResolution.width;
        }
        if ((i3 & 2) != 0) {
            i2 = compileConfigResolution.height;
        }
        if ((i3 & 4) != 0) {
            f = compileConfigResolution.resizeX;
        }
        if ((i3 & 8) != 0) {
            f2 = compileConfigResolution.resizeY;
        }
        return compileConfigResolution.copy(i, i2, f, f2);
    }

    public final CompileConfigResolution copy(int i, int i2, Float f, Float f2) {
        return new CompileConfigResolution(i, i2, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileConfigResolution)) {
            return false;
        }
        CompileConfigResolution compileConfigResolution = (CompileConfigResolution) obj;
        return this.width == compileConfigResolution.width && this.height == compileConfigResolution.height && o.LJ(this.resizeX, compileConfigResolution.resizeX) && o.LJ(this.resizeY, compileConfigResolution.resizeY);
    }

    public int hashCode() {
        int i = ((this.width * 31) + this.height) * 31;
        Float f = this.resizeX;
        int hashCode = (i + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.resizeY;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompileConfigResolution(width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", resizeX=");
        LIZ.append(this.resizeX);
        LIZ.append(", resizeY=");
        LIZ.append(this.resizeY);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Float getResizeX() {
        return this.resizeX;
    }

    public final Float getResizeY() {
        return this.resizeY;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setBitRate(int i) {
        this.bitRate = i;
    }

    public CompileConfigResolution(int i, int i2, Float f, Float f2) {
        this.width = i;
        this.height = i2;
        this.resizeX = f;
        this.resizeY = f2;
        this.bitRate = 19;
    }

    public /* synthetic */ CompileConfigResolution(int i, int i2, Float f, Float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 576 : i, (i3 & 2) != 0 ? 1024 : i2, (i3 & 4) != 0 ? null : f, (i3 & 8) != 0 ? null : f2);
    }
}
