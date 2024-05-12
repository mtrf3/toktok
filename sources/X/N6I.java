package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N6I extends F9E {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final N6E LJLJL;

    public N6I() {
        this(127);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), this.LJLJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ N6I(int r9) {
        /*
            r8 = this;
            r1 = 0
            r0 = r9 & 32
            if (r0 == 0) goto L17
            r6 = 1
        L6:
            r0 = r9 & 64
            if (r0 == 0) goto L15
            X.N6E r7 = X.N6E.OTHER
        Lc:
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L15:
            r7 = 0
            goto Lc
        L17:
            r6 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6I.<init>(int):void");
    }

    public static N6I L(N6I n6i, boolean z, int i, boolean z2, int i2, int i3) {
        int i4;
        boolean z3;
        N6E clickTypeEnterDetail;
        int i5 = i2;
        boolean z4 = z2;
        boolean z5 = z;
        int i6 = i;
        if ((i3 & 1) != 0) {
            z5 = n6i.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i6 = n6i.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            z4 = n6i.LJLJI;
        }
        if ((i3 & 8) != 0) {
            i4 = n6i.LJLJJI;
        } else {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            z3 = n6i.LJLJJL;
        } else {
            z3 = false;
        }
        if ((i3 & 32) != 0) {
            i5 = n6i.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            clickTypeEnterDetail = n6i.LJLJL;
        } else {
            clickTypeEnterDetail = null;
        }
        n6i.getClass();
        o.LJIIIZ(clickTypeEnterDetail, "clickTypeEnterDetail");
        return new N6I(z5, i6, z4, i4, z3, i5, clickTypeEnterDetail);
    }

    public N6I(boolean z, int i, boolean z2, int i2, boolean z3, int i3, N6E clickTypeEnterDetail) {
        o.LJIIIZ(clickTypeEnterDetail, "clickTypeEnterDetail");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = z2;
        this.LJLJJI = i2;
        this.LJLJJL = z3;
        this.LJLJJLL = i3;
        this.LJLJL = clickTypeEnterDetail;
    }
}
