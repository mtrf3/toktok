package X;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UBq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76786UBq {
    public final InterfaceC88472Yns<Object, JSONObject> LIZIZ;
    public final String LIZ = "ttlive_link_interact_sequential_event_monitor";
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 740));

    public final C76788UBs LIZLLL() {
        return (C76788UBs) this.LIZJ.getValue();
    }

    public C76786UBq(C75821TpJ c75821TpJ) {
        this.LIZIZ = c75821TpJ;
    }

    public static boolean LIZ(C76786UBq c76786UBq, String str, String str2, String str3) {
        c76786UBq.getClass();
        boolean z = false;
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI(str3, str, str2, "_");
        if (!(LJJIJIIJI instanceof Collection) || !LJJIJIIJI.isEmpty()) {
            for (String str4 : LJJIJIIJI) {
                if (str4 == null || str4.length() == 0) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    public final void LJI(String str, String str2, String srcRecordId, String dstRecordId) {
        o.LJIIIZ(srcRecordId, "srcRecordId");
        o.LJIIIZ(dstRecordId, "dstRecordId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dstRecordId:");
        LIZ.append(dstRecordId);
        X1D.LIZIZ(LIZ);
        C76788UBs.LJI(LIZLLL(), srcRecordId, str, str2, C65232Piu.LIZJ("id", dstRecordId));
        C76788UBs LIZLLL = LIZLLL();
        LIZLLL.getClass();
        C0K1 c0k1 = LIZLLL.LJI;
        if (c0k1 != null) {
            c0k1.LIZ(C76788UBs.LIZJ(srcRecordId, str, str2), C76788UBs.LIZJ(dstRecordId, str, str2));
        }
    }

    public final void LJII(String str, String str2, String str3, JSONObject data) {
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data:");
        LIZ.append(data);
        X1D.LIZIZ(LIZ);
        if (LIZ(this, str, str2, str3) && str3 != null) {
            C76788UBs LIZLLL = LIZLLL();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("extra", data);
            C76788UBs.LJI(LIZLLL, str3, str, str2, jSONObject);
        }
    }

    public static void LIZJ(C76786UBq c76786UBq, String str, String str2, String str3, int i) {
        c76786UBq.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data:");
        LIZ.append((Object) null);
        X1D.LIZIZ(LIZ);
        if (LIZ(c76786UBq, str, str2, str3) && str3 != null) {
            c76786UBq.LIZLLL().LJ(i, str3, str, str2, null);
        }
    }

    public final void LIZIZ(long j, long j2, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data:");
        LIZ.append(jSONObject);
        X1D.LIZIZ(LIZ);
        if (LIZ(this, str, str2, str3) && str3 != null) {
            LIZLLL().LIZIZ(str3, str4, jSONObject, str, str2, Long.valueOf(j), j2);
        }
    }

    public final void LJ(long j, long j2, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data:");
        LIZ.append(jSONObject);
        X1D.LIZIZ(LIZ);
        if (LIZ(this, str, str2, str3) && str3 != null) {
            LIZLLL().LJFF(j, j2, str3, str4, str, str2, jSONObject);
        }
    }

    public static void LJFF(C76786UBq c76786UBq, String str, String str2, String str3, String recordId, JSONObject jSONObject, long j, long j2) {
        c76786UBq.getClass();
        o.LJIIIZ(recordId, "recordId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("json:");
        LIZ.append(jSONObject);
        X1D.LIZIZ(LIZ);
        if (LIZ(c76786UBq, str, str2, recordId)) {
            jSONObject.put("record_id", recordId);
            C76788UBs LIZLLL = c76786UBq.LIZLLL();
            LIZLLL.getClass();
            C0K1 c0k1 = LIZLLL.LJI;
            if (c0k1 != null) {
                c0k1.LIZIZ(C76788UBs.LIZJ(recordId, str, str2));
            }
            c76786UBq.LIZLLL().LIZLLL(jSONObject, str, str2, str3, -1L, "multi_live_sdk", false, j, j2);
        }
    }
}
