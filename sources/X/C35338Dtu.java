package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Dtu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35338Dtu {
    public static final C35338Dtu LIZ = new C35338Dtu();
    public static Boolean LIZIZ;

    public static final boolean LIZ() {
        Boolean bool;
        Boolean bool2 = LIZIZ;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        synchronized (LIZ) {
            if (LIZIZ == null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    bool = Boolean.valueOf(SettingsManager.LIZ("enable_6_digit_sms_verification", false));
                } catch (Throwable unused) {
                    bool = Boolean.FALSE;
                }
                LIZIZ = bool;
            }
        }
        Boolean bool3 = LIZIZ;
        o.LJI(bool3);
        return bool3.booleanValue();
    }
}
