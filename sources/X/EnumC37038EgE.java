package X;

/* renamed from: X.EgE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC37038EgE {
    PAGE_INIT("page_init"),
    PAGE_START("page_start"),
    PAGE_REDIRECT("page_redirect"),
    PAGE_LOADING("page_loading"),
    PAGE_FINISHED("page_finished");

    public final String LJLIL;

    public static EnumC37038EgE valueOf(String str) {
        return (EnumC37038EgE) V0N.LJJJ(EnumC37038EgE.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC37038EgE(String str) {
        this.LJLIL = str;
    }
}
