package X;

/* renamed from: X.BjU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC29596BjU {
    DIALOG_BIZ_FIRSTLY_EFFECT_PANEL("firstly_effect_panel"),
    DIALOG_BIZ_SECONDARY_EFFECT_PANEL("secondary_effect_panel"),
    DIALOG_BIZ_OTHERS("others");

    public final String LJLIL;

    public static EnumC29596BjU valueOf(String str) {
        return (EnumC29596BjU) V0N.LJJJ(EnumC29596BjU.class, str);
    }

    public final String getBizName() {
        return this.LJLIL;
    }

    EnumC29596BjU(String str) {
        this.LJLIL = str;
    }
}
