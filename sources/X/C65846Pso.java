package X;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.HashMap;
import m43.u;

/* renamed from: X.Pso, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65846Pso {
    public static final HashMap<String, NsdManager.RegistrationListener> LIZ;

    static {
        C16880lQ.LJLLILLLL(C65846Pso.class);
        LIZ = new HashMap<>();
    }

    public static boolean LIZJ() {
        if (C40700FyC.LIZ(C65846Pso.class)) {
            return false;
        }
        try {
            C65825PsT LIZIZ = C65819PsN.LIZIZ(u.LIZLLL());
            if (LIZIZ == null) {
                return false;
            }
            if (!LIZIZ.LIZJ.contains(EnumC65824PsS.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void LIZ(String str) {
        if (C40700FyC.LIZ(C65846Pso.class)) {
            return;
        }
        try {
            LIZIZ(str);
        } catch (Throwable unused) {
        }
    }

    public static void LIZIZ(String str) {
        if (C40700FyC.LIZ(C65846Pso.class)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = LIZ.get(str);
            if (registrationListener != null) {
                try {
                    ((NsdManager) C16880lQ.LLILL(u.LIZJ(), "servicediscovery")).unregisterService(registrationListener);
                } catch (IllegalArgumentException unused) {
                }
                LIZ.remove(str);
            }
        } catch (Throwable unused2) {
        }
    }

    public static boolean LIZLLL(String str) {
        if (C40700FyC.LIZ(C65846Pso.class)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = LIZ;
            if (hashMap.containsKey(str)) {
                return true;
            }
            C16880lQ.LLILII();
            String LLLZ = C16880lQ.LLLZ("%s_%s_%s", new Object[]{"fbsdk", C16880lQ.LLLZ("%s-%s", new Object[]{"android", "13.1.0".replace('.', '|')}), str});
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(LLLZ);
            nsdServiceInfo.setPort(80);
            NsdManager nsdManager = (NsdManager) C16880lQ.LLILL(u.LIZJ(), "servicediscovery");
            C65847Psp c65847Psp = new C65847Psp(LLLZ, str);
            hashMap.put(str, c65847Psp);
            nsdManager.registerService(nsdServiceInfo, 1, c65847Psp);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
