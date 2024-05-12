package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WVY {
    public final int LIZ;
    public final boolean LIZIZ;
    public final C08630Vn<Boolean> LIZJ;
    public final AbstractC173906s6 LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C08630Vn<Boolean> LJI;
    public final C08630Vn<Boolean> LJII;
    public final C08630Vn<C76800UCe> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final long LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WVY)) {
            return false;
        }
        WVY wvy = (WVY) obj;
        return this.LIZ == wvy.LIZ && this.LIZIZ == wvy.LIZIZ && o.LJ(this.LIZJ, wvy.LIZJ) && o.LJ(this.LIZLLL, wvy.LIZLLL) && this.LJ == wvy.LJ && this.LJFF == wvy.LJFF && o.LJ(this.LJI, wvy.LJI) && o.LJ(this.LJII, wvy.LJII) && o.LJ(this.LJIIIIZZ, wvy.LJIIIIZZ) && this.LJIIIZ == wvy.LJIIIZ && this.LJIIJ == wvy.LJIIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        C08630Vn<Boolean> c08630Vn = this.LIZJ;
        int hashCode = (i3 + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31;
        AbstractC173906s6 abstractC173906s6 = this.LIZLLL;
        int hashCode2 = (hashCode + (abstractC173906s6 == null ? 0 : abstractC173906s6.hashCode())) * 31;
        boolean z2 = this.LJ;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z3 = this.LJFF;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        C08630Vn<Boolean> c08630Vn2 = this.LJI;
        int hashCode3 = (i7 + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn3 = this.LJII;
        int hashCode4 = (hashCode3 + (c08630Vn3 == null ? 0 : c08630Vn3.hashCode())) * 31;
        C08630Vn<C76800UCe> c08630Vn4 = this.LJIIIIZZ;
        return C16880lQ.LLJIJIL(this.LJIIJ) + ((((hashCode4 + (c08630Vn4 != null ? c08630Vn4.hashCode() : 0)) * 31) + (this.LJIIIZ ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "NowsBarSceneStates(barState=" + this.LIZ + ", flashOn=" + this.LIZIZ + ", showTooltip=" + this.LIZJ + ", save2LocalState=" + this.LIZLLL + ", enableSwitchDualCamera=" + this.LJ + ", isDefaultDualCamera=" + this.LJFF + ", switchDualLayoutVisible=" + this.LJI + ", showBottomTab=" + this.LJII + ", modifyDisplayView=" + this.LJIIIIZZ + ", enableStoryPublish=" + this.LJIIIZ + ", enterEditUIFinish=" + this.LJIIJ + ')';
    }

    public /* synthetic */ WVY(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this(i, z, null, null, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3, null, null, null, (i2 & 512) != 0 ? true : z4, 0L);
    }

    public static WVY LIZ(WVY wvy, int i, boolean z, C08630Vn c08630Vn, AbstractC173906s6 abstractC173906s6, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        C08630Vn c08630Vn5 = c08630Vn4;
        boolean z5 = z;
        int i3 = i;
        C08630Vn c08630Vn6 = c08630Vn3;
        C08630Vn c08630Vn7 = c08630Vn;
        AbstractC173906s6 abstractC173906s62 = abstractC173906s6;
        C08630Vn c08630Vn8 = c08630Vn2;
        if ((i2 & 1) != 0) {
            i3 = wvy.LIZ;
        }
        if ((i2 & 2) != 0) {
            z5 = wvy.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            c08630Vn7 = wvy.LIZJ;
        }
        if ((i2 & 8) != 0) {
            abstractC173906s62 = wvy.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z2 = wvy.LJ;
        } else {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            z3 = wvy.LJFF;
        } else {
            z3 = false;
        }
        if ((i2 & 64) != 0) {
            c08630Vn8 = wvy.LJI;
        }
        if ((i2 & 128) != 0) {
            c08630Vn6 = wvy.LJII;
        }
        if ((i2 & 256) != 0) {
            c08630Vn5 = wvy.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            z4 = wvy.LJIIIZ;
        } else {
            z4 = false;
        }
        if ((i2 & 1024) != 0) {
            j = wvy.LJIIJ;
        } else {
            j = 0;
        }
        wvy.getClass();
        return new WVY(i3, z5, c08630Vn7, abstractC173906s62, z2, z3, c08630Vn8, c08630Vn6, c08630Vn5, z4, j);
    }

    public WVY(int i, boolean z, C08630Vn<Boolean> c08630Vn, AbstractC173906s6 abstractC173906s6, boolean z2, boolean z3, C08630Vn<Boolean> c08630Vn2, C08630Vn<Boolean> c08630Vn3, C08630Vn<C76800UCe> c08630Vn4, boolean z4, long j) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = c08630Vn;
        this.LIZLLL = abstractC173906s6;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = c08630Vn2;
        this.LJII = c08630Vn3;
        this.LJIIIIZZ = c08630Vn4;
        this.LJIIIZ = z4;
        this.LJIIJ = j;
    }
}
