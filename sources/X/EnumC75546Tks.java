package X;

/* renamed from: X.Tks, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75546Tks {
    RANDOM_MATCH("quick_match"),
    RANDOM_RECOMMEND("quick_recommend"),
    CHANGE_PAIRING_MATCH("change_pairing"),
    SYSTEM_REMATCH("system_rematching");

    public final String LJLIL;

    public static EnumC75546Tks valueOf(String str) {
        return (EnumC75546Tks) V0N.LJJJ(EnumC75546Tks.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC75546Tks(String str) {
        this.LJLIL = str;
    }
}
