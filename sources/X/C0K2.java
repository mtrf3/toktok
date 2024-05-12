package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import org.json.JSONObject;

/* renamed from: X.0K2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0K2 {
    public static final InterfaceC31203CMl LIZ = ((ILoggerService) CN1.LIZ(ILoggerService.class)).Qs0();

    public static void LIZ(String str, Throwable th) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIILLIIL(str, th);
    }

    public static void LIZIZ(Throwable th, String str, java.util.Map<String, String> map) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIIIIZZ(th, str, map);
    }

    public static void LIZJ(String str, String str2, JSONObject jSONObject) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.monitorCommonLog(str, str2, jSONObject);
    }

    public static void LJII(int i, String str, java.util.Map map) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIJJ(i, str, map);
    }

    public static void LJIIIIZZ(String str, int i, JSONObject jSONObject) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.monitorStatus(str, i, jSONObject);
    }

    public static void LJIIIZ(int i, long j, String str) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIILJJIL(i, j, str);
    }

    public static void LJIIJJI(int i, String str, JSONObject jSONObject) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LIZLLL(i, str, jSONObject);
    }

    public static void LIZLLL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIIL(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZ.a3(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJFF(String str, java.util.Map<String, Object> map, java.util.Map<String, Object> map2, java.util.Map<String, Object> map3) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LIZ(str, map, map2, map3);
    }

    public static void LJI(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        interfaceC31203CMl.m2(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJIIJ(int i, long j, String str, JSONObject jSONObject) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIILIIL(i, j, str, jSONObject);
    }

    public static void LJIIL(long j, int i, String str, java.util.Map map) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIJJLI(j, i, str, map);
    }

    public static void LJIILJJIL(int i, long j, String str, java.util.Map map) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIIJJI(i, j, str, map);
    }

    public static void LJIILL(int i, int i2, String str, java.util.Map map) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJ(i, i2, str, map);
    }

    public static void LJIILLIIL(int i, int i2, String str, JSONObject jSONObject) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIIIZ(i, i2, str, jSONObject);
    }

    public static void LJIILIIL(int i, int i2, long j, String str, JSONObject jSONObject) {
        InterfaceC31203CMl interfaceC31203CMl = LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIILL(i, i2, j, str, jSONObject);
    }
}
