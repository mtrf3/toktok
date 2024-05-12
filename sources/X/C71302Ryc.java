package X;

/* renamed from: X.Ryc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71302Ryc extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    public C71302Ryc() {
        this("", "", "", "", -1);
    }

    public C71302Ryc(String str, String str2, String str3, String str4, int i) {
        C43588H8u.LIZLLL(str, "productId", str2, "coverUrl", str3, "coverUrlKey", str4, "resizeCoverUrl");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = i;
    }
}
