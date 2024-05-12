package X;

/* renamed from: X.UNq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC77098UNq {
    SINGLE_SCREEN(0),
    DUAL_SCREEN(1);

    public static final C77099UNr Companion = new C77099UNr();
    public final int LJLIL;

    public static EnumC77098UNq valueOf(String str) {
        return (EnumC77098UNq) V0N.LJJJ(EnumC77098UNq.class, str);
    }

    public final int getId() {
        return this.LJLIL;
    }

    EnumC77098UNq(int i) {
        this.LJLIL = i;
    }
}
