package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.6i9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167736i9 {
    public Effect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public final int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;

    public C167736i9(Effect effect, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        int i4;
        z = (i3 & 2) != 0 ? true : z;
        z2 = (i3 & 4) != 0 ? false : z2;
        z3 = (i3 & 8) != 0 ? false : z3;
        i = (i3 & 32) != 0 ? 0 : i;
        i2 = (i3 & 64) != 0 ? 0 : i2;
        if ((i3 & 256) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        int i5 = (i3 & 512) == 0 ? 0 : -1;
        this.LIZ = effect;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = 0;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = false;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
        this.LJIIJ = false;
        if (z2) {
            this.LJFF = 0;
        }
    }
}
