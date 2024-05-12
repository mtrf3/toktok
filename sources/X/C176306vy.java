package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.6vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176306vy {
    public static final int LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("offline_pin_comment", "1");
            o.LJIIIIZZ(LJI, "getInstance().getStringV…mmentSetting::class.java)");
            return CastIntegerProtector.parseInt(LJI);
        } catch (Throwable unused) {
            return CastIntegerProtector.parseInt("1");
        }
    }
}
