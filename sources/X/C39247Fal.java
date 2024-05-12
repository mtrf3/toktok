package X;

import android.content.Context;
import android.util.Pair;
import com.ss.android.deviceregister.DeviceRegisterManager;
import p83.a;

/* renamed from: X.Fal, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39247Fal {
    public static volatile Pair<String, Boolean> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    public static Pair<String, Boolean> LIZ(Context context) {
        Pair<String, Boolean> pair;
        if (LIZ == null) {
            synchronized (C39247Fal.class) {
                if (LIZ == null) {
                    InterfaceC39244Fai bpeaApiCallback = DeviceRegisterManager.getBpeaApiCallback();
                    if (bpeaApiCallback != null) {
                        pair = bpeaApiCallback.LIZIZ();
                    } else {
                        ?? r3 = 0;
                        Object obj = null;
                        boolean z = false;
                        try {
                            a.C0043a LIZIZ = C39243Fah.LIZIZ(context);
                            if (LIZIZ != null) {
                                z = LIZIZ.LIZIZ;
                                r3 = LIZIZ.LIZ;
                                obj = r3;
                            }
                        } catch (Throwable th) {
                            obj = r3;
                            if (!(th instanceof ClassNotFoundException)) {
                                obj = r3;
                                if (!(th instanceof NoClassDefFoundError)) {
                                    pair = r3;
                                }
                            }
                        }
                        pair = new Pair<>(obj, Boolean.valueOf(z));
                    }
                    LIZ = pair;
                }
            }
        }
        return LIZ;
    }
}
