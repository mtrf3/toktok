package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LZ5 implements C33Q {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final OSZ<InterfaceC65784Pro<C76800UCe>, InterfaceC65784Pro<C76800UCe>> LJLJJL;

    public LZ5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LZ5)) {
            return false;
        }
        LZ5 lz5 = (LZ5) obj;
        return this.LJLIL == lz5.LJLIL && this.LJLILLLLZI == lz5.LJLILLLLZI && this.LJLJI == lz5.LJLJI && this.LJLJJI == lz5.LJLJJI && o.LJ(this.LJLJJL, lz5.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LJLILLLLZI;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (((((i + i2) * 31) + this.LJLJI) * 31) + (this.LJLJJI ? 1 : 0)) * 31;
        OSZ<InterfaceC65784Pro<C76800UCe>, InterfaceC65784Pro<C76800UCe>> osz = this.LJLJJL;
        return i3 + (osz == null ? 0 : osz.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowLiveSkyLightRelatedState(disappearAnimator=");
        LIZ.append(this.LJLIL);
        LIZ.append(", startAnimator=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", increaseTouchViewWidth=");
        LIZ.append(this.LJLJI);
        LIZ.append(", resetTouchView=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", viewCreated=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ LZ5(int i) {
        this(0, null, false, false, false);
    }

    public LZ5(int i, OSZ osz, boolean z, boolean z2, boolean z3) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = i;
        this.LJLJJI = z3;
        this.LJLJJL = osz;
    }

    public static LZ5 LIZ(LZ5 lz5, boolean z, boolean z2, int i, boolean z3, OSZ osz, int i2) {
        OSZ osz2 = osz;
        boolean z4 = z3;
        int i3 = i;
        boolean z5 = z;
        boolean z6 = z2;
        if ((i2 & 1) != 0) {
            z5 = lz5.LJLIL;
        }
        if ((i2 & 2) != 0) {
            z6 = lz5.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            i3 = lz5.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z4 = lz5.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            osz2 = lz5.LJLJJL;
        }
        lz5.getClass();
        return new LZ5(i3, osz2, z5, z6, z4);
    }
}
