package X;

/* renamed from: X.Jqq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50436Jqq extends F9E {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50436Jqq() {
        /*
            r6 = this;
            r1 = 0
            com.ss.android.ugc.aweme.specact.api.ISpecActService r0 = com.ss.android.ugc.aweme.specact.SpecActServiceImpl.LJJJIL()
            boolean r0 = r0.LJJJI()
            if (r0 == 0) goto L16
            long r3 = java.lang.System.currentTimeMillis()
        Lf:
            r0 = r6
            r2 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r5)
            return
        L16:
            long r3 = com.ss.android.common.util.NetworkUtils.getServerTimeMills()
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50436Jqq.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public C50436Jqq(int i, boolean z, long j, boolean z2) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = z2;
    }

    public static C50436Jqq L(C50436Jqq c50436Jqq, int i, long j, int i2) {
        boolean z;
        boolean z2;
        long j2 = j;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c50436Jqq.LJLIL;
        }
        if ((i2 & 2) != 0) {
            z = c50436Jqq.LJLILLLLZI;
        } else {
            z = false;
        }
        if ((i2 & 4) != 0) {
            j2 = c50436Jqq.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z2 = c50436Jqq.LJLJJI;
        } else {
            z2 = false;
        }
        return new C50436Jqq(i3, z, j2, z2);
    }
}
