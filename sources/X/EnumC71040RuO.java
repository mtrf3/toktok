package X;

/* renamed from: X.RuO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC71040RuO {
    SUCCESS("success"),
    EMPTY_ERROR("empty"),
    FORM_ERROR("form_error");

    public final String LJLIL;

    public static EnumC71040RuO valueOf(String str) {
        return (EnumC71040RuO) V0N.LJJJ(EnumC71040RuO.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC71040RuO(String str) {
        this.LJLIL = str;
    }
}
