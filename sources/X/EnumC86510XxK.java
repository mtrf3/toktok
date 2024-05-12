package X;

/* renamed from: X.XxK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86510XxK {
    PASS("PASS"),
    BY_INVALID("INVALID"),
    BY_COMMAND("COMMAND"),
    BY_BUSINESS("BUSINESS"),
    BY_PERMISSION("PERMISSION"),
    BY_EXPIRATION("EXPIRATION"),
    BY_DUPLICATION("DUPLICATION"),
    BY_FREQUENCY("FREQUENCY"),
    BY_NOTICE_READ("NOTICE_READ"),
    BY_AVOIDANCE("AVOIDANCE"),
    BY_UITEMPLATENULL("UITEMPLATENULL");

    public final String LJLIL;

    public static EnumC86510XxK valueOf(String str) {
        return (EnumC86510XxK) V0N.LJJJ(EnumC86510XxK.class, str);
    }

    public final String getInfo() {
        return this.LJLIL;
    }

    EnumC86510XxK(String str) {
        this.LJLIL = str;
    }
}
