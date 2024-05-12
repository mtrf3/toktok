package X;

/* loaded from: classes11.dex */
public final class P1J extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public P1J(String str, int i) {
        String str2;
        String str3;
        String str4 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        String str5 = (i & 8) == 0 ? null : "";
        C43588H8u.LIZLLL(str4, "enterFrom", str2, "previousPage", str3, "enterMethod", str5, "homepageUid");
        this.LJLIL = str4;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str5;
    }
}
