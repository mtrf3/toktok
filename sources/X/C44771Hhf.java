package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Hhf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44771Hhf implements InterfaceC44780Hho {
    public static final C44771Hhf LJIILJJIL = new C44771Hhf();

    static {
        C5Z6.LIZ("BitrateByteBenchApi -> use DefaultApi");
    }

    @Override // X.InterfaceC44780Hho
    public final int videoBitrateCategoryIndex() {
        return C00F.LIZ(31744, 0, "video_bitrate_category_index", true);
    }

    @Override // X.InterfaceC44780Hho
    public final float syntheticVideoBitrate() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZJ("synthetic_video_bitrate", 1.0f);
    }

    @Override // X.InterfaceC44780Hho
    public final float videoBitrate() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZJ("video_bitrate", 1.0f);
    }
}
