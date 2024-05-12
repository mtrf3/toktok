package X;

/* renamed from: X.4sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123174sT {
    PAGE_CREATION_TO_VIEW_VISIBLE("page_creation_to_view_visible"),
    PAGE_CREATION_TO_FIRST_FRAME_RENDER("page_creation_to_first_frame_render");

    public final String LJLIL;

    public static EnumC123174sT valueOf(String str) {
        return (EnumC123174sT) V0N.LJJJ(EnumC123174sT.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC123174sT(String str) {
        this.LJLIL = str;
    }
}
