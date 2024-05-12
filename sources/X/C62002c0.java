package X;

import com.ss.android.ugc.aweme.experiment.PhotoModeConfig;

/* renamed from: X.2c0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62002c0 {
    public static final C62002c0 LIZ = new C62002c0();
    public static final PhotoModeConfig LIZIZ = new PhotoModeConfig(false, null, false, null, false, 31, null);

    public static boolean LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PhotoModeConfig photoModeConfig = LIZIZ;
        LJIIIZ.getClass();
        PhotoModeConfig photoModeConfig2 = (PhotoModeConfig) FFL.LJIJ(true, "photo_mode", 31744, PhotoModeConfig.class, photoModeConfig);
        if (photoModeConfig2 != null) {
            photoModeConfig = photoModeConfig2;
        }
        return photoModeConfig.isUploadEnabled();
    }
}
