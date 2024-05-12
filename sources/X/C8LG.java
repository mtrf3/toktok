package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.8LG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LG {
    public static final boolean LIZ;

    static {
        new C8LG();
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LIZ("caption_debug_setting", false);
    }

    public static final boolean LIZ() {
        if (AnonymousClass845.LIZ) {
            return LIZ;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("caption_debug_setting", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
