package X;

/* renamed from: X.Oqp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63175Oqp {
    COLUMN_MSG_ID("uuid"),
    COLUMN_KEY("key"),
    COLUMN_VALUE("value");

    public String key;
    public String type = "TEXT";

    public static EnumC63175Oqp valueOf(String str) {
        return (EnumC63175Oqp) V0N.LJJJ(EnumC63175Oqp.class, str);
    }

    EnumC63175Oqp(String str) {
        this.key = str;
    }
}
