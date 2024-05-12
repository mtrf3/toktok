package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9cR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240639cR extends F9E {
    public final EnumC240399c3 LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL), Boolean.valueOf(this.LJLJLJ), Boolean.valueOf(this.LJLJLLL)};
    }

    public C240639cR(EnumC240399c3 pinStatus, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        pinStatus = (i2 & 1) != 0 ? EnumC240399c3.DISABLE_PINNED : pinStatus;
        z = (i2 & 2) != 0 ? false : z;
        z2 = (i2 & 4) != 0 ? false : z2;
        i = (i2 & 8) != 0 ? 0 : i;
        z3 = (i2 & 16) != 0 ? false : z3;
        z4 = (i2 & 32) != 0 ? false : z4;
        z5 = (i2 & 64) != 0 ? false : z5;
        z6 = (i2 & 128) != 0 ? false : z6;
        z7 = (i2 & 256) != 0 ? false : z7;
        o.LJIIIZ(pinStatus, "pinStatus");
        this.LJLIL = pinStatus;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = i;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
        this.LJLJL = z5;
        this.LJLJLJ = z6;
        this.LJLJLLL = z7;
    }
}
