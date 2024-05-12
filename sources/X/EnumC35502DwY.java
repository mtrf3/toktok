package X;

/* renamed from: X.DwY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC35502DwY {
    FILE_DOWNLOAD("file_download"),
    TOOLS_API("tools_api");

    public final String LJLIL;

    public static EnumC35502DwY valueOf(String str) {
        return (EnumC35502DwY) V0N.LJJJ(EnumC35502DwY.class, str);
    }

    public final String getFailureReason() {
        return this.LJLIL;
    }

    EnumC35502DwY(String str) {
        this.LJLIL = str;
    }
}
