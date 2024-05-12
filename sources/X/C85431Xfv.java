package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xfv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85431Xfv extends C85433Xfx {
    public final String LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    public C85431Xfv() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLJI.hashCode() * 31;
        boolean z = this.LJLJJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        if (!this.LJLJJL) {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultMixListItem(mixId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", select=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isNameValid=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.C85433Xfx
    public final boolean LIZ() {
        return this.LJLJJI;
    }

    public C85431Xfv(int i) {
        super(0);
        this.LJLJI = "";
        this.LJLJJI = false;
        this.LJLJJL = true;
    }

    @Override // X.C85433Xfx
    public final void LIZIZ(boolean z) {
        this.LJLJJI = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85431Xfv)) {
            return false;
        }
        C85431Xfv c85431Xfv = (C85431Xfv) obj;
        if (o.LJ(this.LJLJI, c85431Xfv.LJLJI) && this.LJLJJI == c85431Xfv.LJLJJI && this.LJLJJL == c85431Xfv.LJLJJL) {
            return true;
        }
        return false;
    }
}
