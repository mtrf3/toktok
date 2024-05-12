package X;

import java.util.HashMap;

/* renamed from: X.aQ6, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93390aQ6 extends AbstractC93356aPY<R0A, C93389aQ5> implements R0E, R0G, R0C, R0D, R0F {
    public C93390aQ6(C68824Qzk c68824Qzk) {
        super(c68824Qzk);
    }

    @Override // X.R0F
    public final void LIZ(R0A r0a) {
        R0F r0f;
        C93389aQ5 c93389aQ5 = (C93389aQ5) ((HashMap) this.LIZIZ).get(r0a);
        if (c93389aQ5 != null && (r0f = c93389aQ5.LIZLLL) != null) {
            r0f.LIZ(r0a);
        }
    }

    @Override // X.R0G
    public final boolean LIZIZ(R0A r0a) {
        R0G r0g;
        C93389aQ5 c93389aQ5 = (C93389aQ5) ((HashMap) this.LIZIZ).get(r0a);
        if (c93389aQ5 != null && (r0g = c93389aQ5.LJ) != null) {
            return r0g.LIZIZ(r0a);
        }
        return false;
    }

    @Override // X.R0C
    public final void LIZJ(R0A r0a) {
        ((HashMap) this.LIZIZ).get(r0a);
    }

    @Override // X.R0E
    public final void LIZLLL(R0A r0a) {
        R0E r0e;
        C93389aQ5 c93389aQ5 = (C93389aQ5) ((HashMap) this.LIZIZ).get(r0a);
        if (c93389aQ5 != null && (r0e = c93389aQ5.LIZJ) != null) {
            r0e.LIZLLL(r0a);
        }
    }

    @Override // X.R0D
    public final void LJ(R0A r0a) {
        ((HashMap) this.LIZIZ).get(r0a);
    }

    @Override // X.R0D
    public final void LJFF(R0A r0a) {
        ((HashMap) this.LIZIZ).get(r0a);
    }

    @Override // X.R0C
    public final void LJI(R0A r0a) {
        ((HashMap) this.LIZIZ).get(r0a);
    }

    @Override // X.R0C
    public final void LJII(R0A r0a) {
        ((HashMap) this.LIZIZ).get(r0a);
    }
}
