package X;

/* renamed from: X.YWs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87526YWs extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final RCZ LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final long LJLJL;
    public final String LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Long.valueOf(this.LJLJL), this.LJLJLJ};
    }

    public C87526YWs(String str, long j, RCZ rcz, String str2, boolean z, boolean z2, long j2, String str3) {
        HH1.LIZ(str, "secUid", str2, "aid", str3, "UrlKey");
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = rcz;
        this.LJLJJI = str2;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = j2;
        this.LJLJLJ = str3;
    }
}
