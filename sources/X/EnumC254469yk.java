package X;

/* renamed from: X.9yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC254469yk {
    SERIES_LIST("b41589", "paid_content_series_list"),
    SERIES_DETAIL("b6274", "paid_content_series_detail");

    public final String LJLIL;
    public final String LJLILLLLZI;

    public static EnumC254469yk valueOf(String str) {
        return (EnumC254469yk) V0N.LJJJ(EnumC254469yk.class, str);
    }

    public final String getPageCode() {
        return this.LJLIL;
    }

    public final String getPageName() {
        return this.LJLILLLLZI;
    }

    EnumC254469yk(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
