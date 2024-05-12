package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;

/* loaded from: classes7.dex */
public final class F73 {
    public static InterfaceC28647BMd LIZ;

    static {
        C16880lQ.LJLLJ(F73.class);
    }

    public static boolean LIZ(String str) {
        InterfaceC28647BMd interfaceC28647BMd = LIZ;
        if (TextUtils.isEmpty(str)) {
            C46496IMq.LIZ();
            return false;
        }
        if (interfaceC28647BMd != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Loading [");
            LIZ2.append(str);
            LIZ2.append("] with external loader ");
            LIZ2.append(interfaceC28647BMd);
            X1D.LIZIZ(LIZ2);
            C46496IMq.LIZ();
            return LiveAppBundleUtils.loadSOByLoader(str, "liveplayer-loadPlayerLibrary", true);
        }
        try {
            C16880lQ.LLJJJIL(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZIZ(String str) {
        InterfaceC28647BMd interfaceC28647BMd = LIZ;
        if (!TextUtils.isEmpty(str)) {
            if (interfaceC28647BMd != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Loading [");
                LIZ2.append(str);
                LIZ2.append("] with external loader ");
                LIZ2.append(interfaceC28647BMd);
                X1D.LIZIZ(LIZ2);
                C46496IMq.LIZ();
                return LiveAppBundleUtils.loadSOByLoader(str, "liveplayer-loadPluginLibrary", true);
            }
            C16880lQ.LLJJJIL(str);
            return true;
        }
        throw new Exception("Invalid library name.");
    }
}
