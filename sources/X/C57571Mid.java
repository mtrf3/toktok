package X;

/* renamed from: X.Mid, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57571Mid extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public C57571Mid() {
        this(null, null, null, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C57571Mid(String str, String str2, String str3, int i) {
        String str4;
        String str5 = str3;
        String str6 = str2;
        String str7 = (i & 1) != 0 ? "" : str;
        str6 = (i & 2) != 0 ? "" : str6;
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        str5 = (i & 8) != 0 ? "" : str5;
        C43588H8u.LIZLLL(str7, "enterFrom", str6, "enterMethod", str4, "previousPage", str5, "position");
        this.LJLIL = str7;
        this.LJLILLLLZI = str6;
        this.LJLJI = str4;
        this.LJLJJI = str5;
    }
}
