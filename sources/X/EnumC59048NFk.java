package X;

/* renamed from: X.NFk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC59048NFk {
    FEED("feed"),
    PROFILE("profile"),
    AGGREGATION_PAGE("aggregation_page"),
    COLD_BOOT("cold_boot"),
    PUBLISH("publish"),
    RETRY("retry");

    public final String LJLIL;

    public static EnumC59048NFk valueOf(String str) {
        return (EnumC59048NFk) V0N.LJJJ(EnumC59048NFk.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC59048NFk(String str) {
        this.LJLIL = str;
    }
}
