package X;

/* renamed from: X.Oqr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63177Oqr {
    COLUMN_CONV_ID("conv_id"),
    COLUMN_KEY("key"),
    COLUMN_VALUE("value");

    public String key;
    public String type = "TEXT";

    public static EnumC63177Oqr valueOf(String str) {
        return (EnumC63177Oqr) V0N.LJJJ(EnumC63177Oqr.class, str);
    }

    EnumC63177Oqr(String str) {
        this.key = str;
    }
}
