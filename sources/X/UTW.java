package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UTW extends F9E {
    public final boolean LJLIL;
    public final long LJLILLLLZI;
    public final String LJLJI;

    public UTW() {
        this(0L, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UTW(long r3, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L7
            r3 = 45000(0xafc8, double:2.2233E-319)
        L7:
            r0 = r5 & 4
            if (r0 == 0) goto L12
            java.lang.String r1 = "default"
        Ld:
            r0 = 0
            r2.<init>(r3, r1, r0)
            return
        L12:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UTW.<init>(long, int):void");
    }

    public UTW(long j, String apiName, boolean z) {
        o.LJIIIZ(apiName, "apiName");
        this.LJLIL = z;
        this.LJLILLLLZI = j;
        this.LJLJI = apiName;
    }
}
