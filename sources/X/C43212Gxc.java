package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Gxc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43212Gxc implements InterfaceC28616BKy {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;

    public C43212Gxc() {
        this(0, false, 7);
    }

    public C43212Gxc(int i) {
        this(R.color.cz, false, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LJLIL * 31;
        boolean z = this.LJLILLLLZI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((i + i2) * 31) + (this.LJLJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImmersiveConfig(statusBarColor=");
        LIZ.append(this.LJLIL);
        LIZ.append(", autoDarkEnable=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", disable=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        C43212Gxc c43212Gxc;
        if (obj instanceof C43212Gxc) {
            c43212Gxc = (C43212Gxc) obj;
        } else {
            c43212Gxc = null;
        }
        if (c43212Gxc == null || this.LJLIL != c43212Gxc.LJLIL || this.LJLJJI != c43212Gxc.LJLJJI || this.LJLJJL != c43212Gxc.LJLJJL || this.LJLJJLL != c43212Gxc.LJLJJLL || this.LJLILLLLZI != c43212Gxc.LJLILLLLZI || this.LJLJI != c43212Gxc.LJLJI || this.LJLJL != c43212Gxc.LJLJL) {
            return false;
        }
        return true;
    }

    public C43212Gxc(int i, boolean z, int i2) {
        boolean z2;
        i = (i2 & 1) != 0 ? R.color.b5 : i;
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i2 & 4) != 0 ? false : z;
        this.LJLIL = i;
        this.LJLILLLLZI = z2;
        this.LJLJI = z;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
    }
}
