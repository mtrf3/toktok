package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.32f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C774532f {
    public static final String LIZ;

    static {
        new C774532f();
        LIZ = "";
    }

    public static final String LIZ() {
        Object LIZ2;
        boolean z;
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ2 = SettingsManager.LJI("promote_web_creation_h5_url", "");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        String str = (String) LIZ2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return LIZ;
        }
        return str;
    }
}