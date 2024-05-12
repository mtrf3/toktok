package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.902, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass902 {
    public static final int LIZ;

    static {
        new AnonymousClass902();
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LJ("content_language_max_popup_count", 0);
    }

    public static final int LIZ() {
        Object LIZ2;
        if (C2299490s.LIZ) {
            return LIZ;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ2 = Integer.valueOf(SettingsManager.LJ("content_language_max_popup_count", 0));
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        Integer num = (Integer) LIZ2;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }
}
