package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136595Xr extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final C08630Vn<Boolean> LJLJJI;
    public final C08630Vn<Boolean> LJLJJL;
    public final C08630Vn<Boolean> LJLJJLL;
    public final String LJLJL;

    public C136595Xr() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C136595Xr(int r9) {
        /*
            r8 = this;
            r1 = 0
            X.0Vn r4 = new X.0Vn
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.<init>(r0)
            X.0Vn r5 = new X.0Vn
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.<init>(r0)
            X.0Vn r6 = new X.0Vn
            r6.<init>(r0)
            java.lang.String r7 = ""
            r0 = r8
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136595Xr.<init>(int):void");
    }

    public C136595Xr(int i, int i2, int i3, C08630Vn<Boolean> enableMusic, C08630Vn<Boolean> enableOriginal, C08630Vn<Boolean> enableRecord, String musicDetail) {
        o.LJIIIZ(enableMusic, "enableMusic");
        o.LJIIIZ(enableOriginal, "enableOriginal");
        o.LJIIIZ(enableRecord, "enableRecord");
        o.LJIIIZ(musicDetail, "musicDetail");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = enableMusic;
        this.LJLJJL = enableOriginal;
        this.LJLJJLL = enableRecord;
        this.LJLJL = musicDetail;
    }
}
