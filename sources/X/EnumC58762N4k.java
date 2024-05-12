package X;

/* renamed from: X.N4k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC58762N4k implements InterfaceC58699N1z<String> {
    NONE(""),
    TEXT_ONLY(""),
    RECOMMEND_MUSIC_LIST("1.0"),
    NEW_UI_2_MV_LIST_SHEET("2.0_V1"),
    NEW_UI_2_MUSIC_LIST_SHEET("2.0_V2");

    public final String LJLIL;

    public static EnumC58762N4k valueOf(String str) {
        return (EnumC58762N4k) V0N.LJJJ(EnumC58762N4k.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    EnumC58762N4k(String str) {
        this.LJLIL = str;
    }
}
