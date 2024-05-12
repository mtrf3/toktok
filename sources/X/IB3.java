package X;

/* loaded from: classes8.dex */
public final class IB3 extends F9E {
    public String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLILLLLZI, Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IB3(java.lang.String r9, int r10, long r11, int r13) {
        /*
            r8 = this;
            r1 = r10
            r0 = r13 & 4
            if (r0 == 0) goto L6
            r1 = 1
        L6:
            r0 = r13 & 8
            r7 = 0
            java.lang.String r6 = ""
            if (r0 == 0) goto L21
            r3 = r6
        Le:
            r0 = r13 & 16
            if (r0 == 0) goto L1f
        L12:
            r0 = r13 & 32
            if (r0 == 0) goto L18
            java.lang.String r7 = "unknown"
        L18:
            r2 = r9
            r0 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return
        L1f:
            r6 = r7
            goto L12
        L21:
            r3 = r7
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IB3.<init>(java.lang.String, int, long, int):void");
    }

    public IB3(int i, String str, String str2, long j, String str3, String str4) {
        C43588H8u.LIZLLL(str, "filePath", str2, "mediaId", str3, "userName", str4, "source");
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
        this.LJLIL = "";
    }
}
