package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135695Uf {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final int LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public final EnumC132905Jm LJIIJJI;
    public final boolean LJIIL;
    public final InterfaceC65784Pro<C76800UCe> LJIILIIL;

    public C135695Uf(float f, float f2, float f3, int i, float f4, EnumC132905Jm enumC132905Jm, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        int i4 = i;
        float f8 = f4;
        EnumC132905Jm refreshLevelDurationOperation = enumC132905Jm;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f5 = (i2 & 32) != 0 ? AnonymousClass564.LIZIZ(1.0f) : f5;
        if ((i2 & 64) != 0) {
            i3 = -1;
        } else {
            i3 = -15686971;
        }
        f6 = (i2 & 128) != 0 ? AnonymousClass564.LIZIZ(2.0f) : f6;
        f7 = (i2 & 256) != 0 ? AnonymousClass564.LIZIZ(20.0f) : f7;
        i4 = (i2 & 512) != 0 ? -1 : i4;
        f8 = (i2 & 1024) != 0 ? AnonymousClass564.LIZIZ(2.0f) : f8;
        refreshLevelDurationOperation = (i2 & 2048) != 0 ? EnumC132905Jm.ALL : refreshLevelDurationOperation;
        boolean z5 = (i2 & 4096) == 0;
        o.LJIIIZ(refreshLevelDurationOperation, "refreshLevelDurationOperation");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = -1;
        this.LJFF = f5;
        this.LJI = i3;
        this.LJII = f6;
        this.LJIIIIZZ = f7;
        this.LJIIIZ = i4;
        this.LJIIJ = f8;
        this.LJIIJJI = refreshLevelDurationOperation;
        this.LJIIL = z5;
        this.LJIILIIL = null;
    }
}
