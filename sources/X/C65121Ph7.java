package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ph7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65121Ph7 {
    public static volatile C65121Ph7 LIZLLL;
    public final java.util.Map<Class<?>, InterfaceC31105CIr<?>> LIZ = new ConcurrentHashMap();
    public final java.util.Map<Class<?>, InterfaceC64604PXc<?>> LIZIZ = new ConcurrentHashMap();
    public final C65196PiK LIZJ = new C65196PiK();

    public static C65121Ph7 LIZ() {
        if (LIZLLL == null) {
            synchronized (C65121Ph7.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C65121Ph7();
                }
            }
        }
        return LIZLLL;
    }

    public static String LIZJ(Class cls) {
        if (cls == null) {
            return "";
        }
        if (cls.getEnclosingClass() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZJ(cls.getEnclosingClass()));
            LIZ.append("_");
            LIZ.append(C16880lQ.LJLLJ(cls));
            return X1D.LIZIZ(LIZ);
        }
        return C16880lQ.LJLLJ(cls);
    }

    public static Object LIZIZ(Class cls, String str) {
        String LIZJ = C0ON.LIZJ(cls.getPackage().getName(), "._", LIZJ(cls), str);
        try {
            return Class.forName(LIZJ).newInstance();
        } catch (Exception e) {
            C0NB.LJI("NetworkServiceProvider", e);
            HashMap hashMap = new HashMap();
            hashMap.put("error_type", "proto_decode");
            hashMap.put("error_code", 1);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("model_class_name", C16880lQ.LJLLILLLL(cls));
            hashMap2.put("decode_class_name", LIZJ);
            hashMap2.put("decoder_map_size", Integer.valueOf(((ConcurrentHashMap) LIZ().LIZ).size()));
            hashMap2.put("error_code", 1);
            hashMap2.put("error_message", e.getMessage());
            hashMap2.put("error_stack", android.util.Log.getStackTraceString(e));
            C0K2.LJFF("ttlive_quality_stability_error", hashMap, null, hashMap2);
            return null;
        }
    }

    public final InterfaceC31677Cbx<C65126PhC> LIZLLL(String str, List<C05130Ib> list, String str2, byte[] bArr, Object obj) {
        C65196PiK c65196PiK = this.LIZJ;
        C65127PhD c65127PhD = new C65127PhD(str, list);
        c65196PiK.LIZIZ(c65127PhD);
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).post(c65127PhD.LIZ, list, str2, bArr, obj);
    }
}
