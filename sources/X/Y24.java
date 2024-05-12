package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y24 implements Y3D<Y1Y> {
    public final Y1Y LJLIL;
    public final AnonymousClass860 LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y24)) {
            return false;
        }
        Y24 y24 = (Y24) obj;
        return o.LJ(this.LJLIL, y24.LJLIL) && o.LJ(this.LJLILLLLZI, y24.LJLILLLLZI) && this.LJLJI == y24.LJLJI && this.LJLJJI == y24.LJLJJI && this.LJLJJL == y24.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        AnonymousClass860 anonymousClass860 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (anonymousClass860 == null ? 0 : anonymousClass860.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LJLJJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.LJLJJL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TranslationUiState(state=");
        LIZ.append(this.LJLIL);
        LIZ.append(", descriptionData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", translationStateForceHidden=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showSetTranslationLanguage=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", reportET=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.Y3D
    public final /* bridge */ /* synthetic */ Y1Y getState() {
        return this.LJLIL;
    }

    public Y24(Y1Y state, AnonymousClass860 anonymousClass860, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(state, "state");
        this.LJLIL = state;
        this.LJLILLLLZI = anonymousClass860;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
    }

    public static Y24 LIZ(Y24 y24, Y1Y y1y, AnonymousClass860 anonymousClass860, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        Y1Y state = y1y;
        AnonymousClass860 anonymousClass8602 = anonymousClass860;
        if ((i & 1) != 0) {
            state = y24.LJLIL;
        }
        if ((i & 2) != 0) {
            anonymousClass8602 = y24.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z6 = y24.LJLJI;
        }
        if ((i & 8) != 0) {
            z5 = y24.LJLJJI;
        }
        if ((i & 16) != 0) {
            z4 = y24.LJLJJL;
        }
        y24.getClass();
        o.LJIIIZ(state, "state");
        return new Y24(state, anonymousClass8602, z6, z5, z4);
    }
}
