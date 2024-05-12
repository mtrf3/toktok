package X;

/* renamed from: X.MIf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56573MIf implements InterfaceC58699N1z<String> {
    MUSIC_PAGE("music_page"),
    VIDEO_FEED("video_feed");

    public final String LJLIL;

    public static EnumC56573MIf valueOf(String str) {
        return (EnumC56573MIf) V0N.LJJJ(EnumC56573MIf.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    EnumC56573MIf(String str) {
        this.LJLIL = str;
    }
}
