package X;

import defpackage.b0;
import java.nio.FloatBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.PMj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64325PMj {
    public final float[] LIZ;
    public final float[] LIZIZ;
    public final FloatBuffer LIZJ;
    public final FloatBuffer LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64325PMj)) {
            return false;
        }
        C64325PMj c64325PMj = (C64325PMj) obj;
        return o.LJ(this.LIZ, c64325PMj.LIZ) && o.LJ(this.LIZIZ, c64325PMj.LIZIZ) && o.LJ(this.LIZJ, c64325PMj.LIZJ) && o.LJ(this.LIZLLL, c64325PMj.LIZLLL) && this.LJ == c64325PMj.LJ && this.LJFF == c64325PMj.LJFF && this.LJI == c64325PMj.LJI;
    }

    public final int hashCode() {
        return ((((((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((Arrays.hashCode(this.LIZIZ) + (Arrays.hashCode(this.LIZ) * 31)) * 31)) * 31)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Data(vertexData=");
        LIZ.append(Arrays.toString(this.LIZ));
        LIZ.append(", uvData=");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append(", vertexBuffer=");
        LIZ.append(this.LIZJ);
        LIZ.append(", texCoordBuffer=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", program=");
        LIZ.append(this.LJ);
        LIZ.append(", aPositionHandle=");
        LIZ.append(this.LJFF);
        LIZ.append(", aTextureCoordHandle=");
        return b0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C64325PMj(float[] fArr, float[] fArr2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, int i, int i2, int i3) {
        this.LIZ = fArr;
        this.LIZIZ = fArr2;
        this.LIZJ = floatBuffer;
        this.LIZLLL = floatBuffer2;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
    }
}
