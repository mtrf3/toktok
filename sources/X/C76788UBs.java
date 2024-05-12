package X;

import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import kotlin.jvm.internal.AqS43S1300000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.UBs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76788UBs {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC88472Yns<Object, String> LIZLLL;
    public final InterfaceC88472Yns<Object, JSONObject> LJ;
    public final InterfaceC88472Yns<Object, JSONObject> LJFF;
    public final C0K1 LJI;

    public static String LIZJ(String str, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        LIZ.append('_');
        LIZ.append(str3);
        LIZ.append("_{");
        LIZ.append(str);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        JSONObject jSONObject3;
        JSONObject jSONObject4 = new JSONObject();
        if (z && jSONObject2 != null && jSONObject2.has("code")) {
            try {
                JSONObject jSONObject5 = new JSONObject();
                C05630Jz.LJI(jSONObject5, "code", JSONObjectProtectorUtils.getString(jSONObject2, "code"));
                C05630Jz.LIZIZ("code", new JSONArray().put(jSONObject5), jSONObject4);
            } catch (Throwable th) {
                C0NB.LJFF("LiveLogService", "", th);
            }
        }
        o.LJIIIZ(jSONObject, "<this>");
        try {
            jSONObject3 = new JSONObject(jSONObject.toString());
        } catch (Exception unused) {
            jSONObject3 = new JSONObject();
        }
        C05630Jz.LIZJ("extra", jSONObject3, jSONObject2);
        C05630Jz.LIZIZ("event", new JSONArray().put(jSONObject3), jSONObject4);
        C0K1 c0k1 = this.LJI;
        if (c0k1 != null) {
            String jSONObject6 = jSONObject4.toString();
            o.LJIIIIZZ(jSONObject6, "this.toString()");
            C0K0.LIZ(c0k1, str, jSONObject6, false, 0L, false, 60);
        }
    }

    public static void LJI(C76788UBs c76788UBs, String id, String str, String str2, JSONObject jSONObject) {
        c76788UBs.getClass();
        o.LJIIIZ(id, "id");
        String LIZJ = LIZJ(id, str, str2);
        C0K1 c0k1 = c76788UBs.LJI;
        if (c0k1 != null) {
            c0k1.LJ(LIZJ, new C76791UBv(c76788UBs, LIZJ, jSONObject, -1L));
        }
    }

    public final void LJ(int i, String id, String str, String str2, JSONObject jSONObject) {
        o.LJIIIZ(id, "id");
        if (ujb.o.LJJJJJL(id) || this.LJI == null) {
            return;
        }
        String LIZJ = LIZJ(id, str, str2);
        this.LJI.LJ(LIZJ, new C76790UBu(this, LIZJ, jSONObject, i, System.currentTimeMillis()));
    }

    public static void LJII(C76788UBs c76788UBs, String id, String str, JSONObject jSONObject, java.util.Map map, int i) {
        String str2;
        String str3;
        long j;
        JSONObject jSONObject2 = jSONObject;
        if ((i & 4) != 0) {
            jSONObject2 = new JSONObject();
        }
        C76800UCe c76800UCe = null;
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            str2 = c76788UBs.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = c76788UBs.LIZIZ;
        } else {
            str3 = null;
        }
        long j2 = 0;
        if ((i & 64) != 0) {
            j = C31012CFc.LIZIZ();
        } else {
            j = 0;
        }
        if ((i & 128) != 0) {
            j2 = System.currentTimeMillis();
        }
        c76788UBs.getClass();
        o.LJIIIZ(id, "id");
        if (ujb.o.LJJJJJL(id) || c76788UBs.LJI == null) {
            return;
        }
        String LIZJ = LIZJ(id, str2, str3);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJI(jSONObject3, "event_id", str);
        C05630Jz.LJFF(jSONObject3, "server_time", j);
        C05630Jz.LJFF(jSONObject3, "client_time", j2);
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject3.putOpt((String) entry.getKey(), entry.getValue());
                }
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        c76788UBs.LJI.LJ(LIZJ, new AqS43S1300000_8(c76788UBs, LIZJ, jSONObject3, jSONObject2, 1));
    }

    public C76788UBs(String str, String str2, String str3, InterfaceC88472Yns idGenerator, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, PersistenceReporter persistenceReporter) {
        o.LJIIIZ(idGenerator, "idGenerator");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = idGenerator;
        this.LJ = interfaceC88472Yns;
        this.LJFF = interfaceC88472Yns2;
        this.LJI = persistenceReporter;
    }

    public final void LIZIZ(String id, String str, JSONObject jSONObject, String str2, String str3, Long l, long j) {
        o.LJIIIZ(id, "id");
        if (ujb.o.LJJJJJL(id)) {
            return;
        }
        String LIZJ = LIZJ(id, str2, str3);
        C0K1 c0k1 = this.LJI;
        if (c0k1 != null) {
            c0k1.LJ(LIZJ, new C76789UBt(this, LIZJ, str, l, j, jSONObject));
        }
    }

    public final void LJFF(long j, long j2, String id, String str, String str2, String str3, JSONObject jSONObject) {
        o.LJIIIZ(id, "id");
        if (ujb.o.LJJJJJL(id)) {
            return;
        }
        String LIZJ = LIZJ(id, str2, str3);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "event_id", str);
        C05630Jz.LJFF(jSONObject2, "server_time", j);
        C05630Jz.LJFF(jSONObject2, "client_time", j2);
        C0K1 c0k1 = this.LJI;
        if (c0k1 != null) {
            c0k1.LJ(LIZJ, new AqS43S1300000_8(this, LIZJ, jSONObject2, jSONObject, 0));
        }
    }

    public final String LIZLLL(Object obj, String str, String str2, String str3, long j, String source, boolean z, long j2, long j3) {
        boolean z2;
        JSONObject invoke;
        JSONObject invoke2;
        o.LJIIIZ(source, "source");
        String invoke3 = this.LIZLLL.invoke(obj);
        if (!ujb.o.LJJJJJL(invoke3)) {
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJI(jSONObject, "id", invoke3);
            C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
            C05630Jz.LJI(jSONObject, "sub_scene", str2);
            C05630Jz.LJI(jSONObject, "live_type", str3);
            C05630Jz.LJFF(jSONObject, "server_time", j2);
            C05630Jz.LJFF(jSONObject, "client_time", j3);
            C05630Jz.LIZIZ("code", new JSONArray(), jSONObject);
            C05630Jz.LIZIZ("event", new JSONArray(), jSONObject);
            InterfaceC88472Yns<Object, JSONObject> interfaceC88472Yns = this.LJ;
            if (interfaceC88472Yns != null && (invoke2 = interfaceC88472Yns.invoke(obj)) != null) {
                try {
                    C3C5.m7constructorimpl(invoke2.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                C05630Jz.LIZJ("extra", jSONObject, invoke2);
            }
            InterfaceC88472Yns<Object, JSONObject> interfaceC88472Yns2 = this.LJFF;
            if (interfaceC88472Yns2 != null && (invoke = interfaceC88472Yns2.invoke(obj)) != null) {
                C05630Jz.LIZJ("ab", jSONObject, invoke);
            }
            if (source.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C05630Jz.LJI(jSONObject, "source", source);
            }
            C0K1 c0k1 = this.LJI;
            if (c0k1 != null) {
                String LIZJ = LIZJ(invoke3, str, str2);
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "it.toString()");
                C0K0.LIZ(c0k1, LIZJ, jSONObject2, false, j, z, 12);
            }
        }
        return invoke3;
    }
}
