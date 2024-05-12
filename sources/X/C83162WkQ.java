package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WkQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83162WkQ extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final String LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), this.LJLJLLL};
    }

    public C83162WkQ(int i, String str, String str2, String str3, String unzipPath, int i2, String str4) {
        o.LJIIIZ(unzipPath, "unzipPath");
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = unzipPath;
        this.LJLJJLL = 0;
        this.LJLJL = i2;
        this.LJLJLJ = 100;
        this.LJLJLLL = str4;
    }
}
