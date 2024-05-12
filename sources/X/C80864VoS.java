package X;

import android.graphics.Color;

/* renamed from: X.VoS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80864VoS {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public final int LIZ(double d) {
        return Color.argb((int) Math.rint((this.LJ * d) + this.LIZ), (int) Math.rint((this.LJFF * d) + this.LIZIZ), (int) Math.rint((this.LJI * d) + this.LIZJ), (int) Math.rint((d * this.LJII) + this.LIZLLL));
    }

    public C80864VoS(int i, int i2) {
        int i3 = (i >> 24) & 255;
        this.LIZ = i3;
        int i4 = (i >> 16) & 255;
        this.LIZIZ = i4;
        int i5 = (i >> 8) & 255;
        this.LIZJ = i5;
        int i6 = (i >> 0) & 255;
        this.LIZLLL = i6;
        this.LJ = ((i2 >> 24) & 255) - i3;
        this.LJFF = ((i2 >> 16) & 255) - i4;
        this.LJI = ((i2 >> 8) & 255) - i5;
        this.LJII = ((i2 >> 0) & 255) - i6;
    }
}
