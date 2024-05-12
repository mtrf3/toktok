package X;

/* renamed from: X.5Mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC133695Mn {
    EDIT_EFFECT("edit_effect"),
    EDIT_PROP("edit_prop"),
    EDIT_EFFECT_SERVER("effect_server"),
    EDIT_EFFECT_CLIENT("effect_client"),
    EDIT_EFFECT_COMBINED("effect_combine");

    public final String LJLIL;

    public static EnumC133695Mn valueOf(String str) {
        return (EnumC133695Mn) V0N.LJJJ(EnumC133695Mn.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC133695Mn(String str) {
        this.LJLIL = str;
    }
}
