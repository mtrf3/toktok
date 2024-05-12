package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2S implements Y3D<Y3Y> {
    public final Y3Y LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2S)) {
            return false;
        }
        Y2S y2s = (Y2S) obj;
        return o.LJ(this.LJLIL, y2s.LJLIL) && this.LJLILLLLZI == y2s.LJLILLLLZI && this.LJLJI == y2s.LJLJI && this.LJLJJI == y2s.LJLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LJLJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.LJLJJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DubbingUiState(state=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hideControls=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showIntro=");
        LIZ.append(this.LJLJI);
        LIZ.append(", switchError=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.Y3D
    public final /* bridge */ /* synthetic */ Y3Y getState() {
        return this.LJLIL;
    }

    public Y2S(Y3Y state, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(state, "state");
        this.LJLIL = state;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }

    public static Y2S LIZ(Y2S y2s, Y3Y state, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            state = y2s.LJLIL;
        }
        if ((i & 2) != 0) {
            z = y2s.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = y2s.LJLJI;
        }
        if ((i & 8) != 0) {
            z3 = y2s.LJLJJI;
        }
        y2s.getClass();
        o.LJIIIZ(state, "state");
        return new Y2S(state, z, z2, z3);
    }
}
