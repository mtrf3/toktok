package X;

/* renamed from: X.aaL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC94025aaL {
    CAPABILITY_ENTER_FROM("enter_from"),
    CAPABILITY_PREVIEW_CNT("preview_cnt"),
    CAPABILITY_CREATE_DURATION("create_duration"),
    CAPABILITY_ICON_EDIT("icon_edit");

    public static final C94024aaK Companion = new Object() { // from class: X.aaK
    };
    public final String LJLIL;

    public static EnumC94025aaL valueOf(String str) {
        return (EnumC94025aaL) V0N.LJJJ(EnumC94025aaL.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    EnumC94025aaL(String str) {
        this.LJLIL = str;
    }
}
