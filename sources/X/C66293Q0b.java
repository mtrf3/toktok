package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Q0b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66293Q0b {
    public static OHY LIZ;
    public static InterfaceC39128FXg LIZIZ;

    public static void LIZ(OHW context) {
        o.LJIIJ(context, "context");
        if (LIZIZ(context)) {
            C66292Q0a.LIZIZ(context, "SandboxCheck", null, new AqS177S0100000_11(context, 30));
        } else {
            if (!Q0O.LIZ) {
                return;
            }
            Q0L.LIZ("SandboxManager", "don't need sandbox check ,do not execute sandbox");
        }
    }

    public static boolean LIZIZ(OHW context) {
        o.LJIIJ(context, "context");
        if (LIZIZ == null) {
            LIZJ(-4005, context, "sandbox not config");
        }
        OHY ohy = LIZ;
        if (ohy == null || !ohy.LIZ(context) || LIZIZ == null) {
            return false;
        }
        return true;
    }

    public static void LIZJ(int i, OHW ohw, String str) {
        Integer num;
        C66297Q0f.LJIIL.getClass();
        C66297Q0f LIZ2 = C66299Q0h.LIZ(ohw, "SandboxCheck");
        LIZ2.LIZJ = i;
        LIZ2.LIZLLL = str;
        LIZ2.LIZJ(EnumC66303Q0l.WARN);
        LIZ2.LJI = new Throwable();
        Cert cert = ohw.LIZIZ;
        Object obj = null;
        if (cert != null) {
            num = C87277YNd.LJIIIIZZ(cert);
        } else {
            num = null;
        }
        Object LIZ3 = ohw.LIZ("classIdentifier");
        if (!(LIZ3 instanceof String)) {
            LIZ3 = null;
        }
        Object LIZ4 = ohw.LIZ("methodSignature");
        if (LIZ4 instanceof String) {
            obj = LIZ4;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dataflowID", num);
        linkedHashMap.put("classIdentifier", LIZ3);
        linkedHashMap.put("methodSignature", obj);
        java.util.Map<String, Object> map = LIZ2.LJII;
        if (map != null) {
            map.putAll(linkedHashMap);
        } else {
            LIZ2.LJII = linkedHashMap;
        }
        Q0Z.LIZ(LIZ2);
    }
}
