package X;

/* renamed from: X.9Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC236999Rv {
    NOT_ENOUGH_SPACE("not_enough_space"),
    NO_INTERNET_CONNECTION("no_internet_connection"),
    CANCEL_CELLULAR_DATA_DOWNLOAD("cancel_cellular_data_download"),
    CONTINUE_CELLULAR_DATA_DOWNLOAD("continue_cellular_data_download");

    public final String LJLIL;

    public static EnumC236999Rv valueOf(String str) {
        return (EnumC236999Rv) V0N.LJJJ(EnumC236999Rv.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC236999Rv(String str) {
        this.LJLIL = str;
    }
}
