package X;

/* renamed from: X.a4N, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92043a4N {
    QuitTransaction("quit_transaction"),
    LocateCvv("locate_cvv"),
    CameraPermission("camera_permission"),
    CameraSetting("camera_setting"),
    AlbumPermission("album_permission"),
    AlbumSetting("album_setting"),
    NetworkError("network_error");

    public final String LJLIL;

    public static EnumC92043a4N valueOf(String str) {
        return (EnumC92043a4N) V0N.LJJJ(EnumC92043a4N.class, str);
    }

    public final String getPopupId() {
        return this.LJLIL;
    }

    EnumC92043a4N(String str) {
        this.LJLIL = str;
    }
}
