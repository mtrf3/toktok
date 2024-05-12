package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lfz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54859Lfz extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final long LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), this.LJLJJL, Integer.valueOf(this.LJLJJLL), Long.valueOf(this.LJLJL)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C54859Lfz(java.lang.String r11, long r12, int r14, java.lang.String r15, int r16, int r17) {
        /*
            r10 = this;
            r7 = r16
            r5 = 0
            r0 = r17 & 32
            if (r0 == 0) goto L8
            r7 = 0
        L8:
            r0 = r17 & 64
            if (r0 == 0) goto L19
            long r8 = java.lang.System.currentTimeMillis()
        L10:
            r1 = r11
            r0 = r10
            r2 = r12
            r4 = r14
            r6 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            return
        L19:
            r8 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54859Lfz.<init>(java.lang.String, long, int, java.lang.String, int, int):void");
    }

    public C54859Lfz(String awemeId, long j, int i, boolean z, String userId, int i2, long j2) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(userId, "userId");
        this.LJLIL = awemeId;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = userId;
        this.LJLJJLL = i2;
        this.LJLJL = j2;
    }
}
