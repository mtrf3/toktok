package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.ttnet.TTNetInit;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Tq2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75866Tq2 extends C05630Jz {
    public final long LIZ = SystemClock.uptimeMillis();
    public final JSONObject LIZIZ = new JSONObject();
    public final JSONObject LIZJ = new JSONObject();
    public final JSONObject LIZLLL = new JSONObject();

    public abstract void LJIILIIL();

    public final void LJIIL() {
        LJIIIZ(this.LIZJ, "cost", Long.valueOf(SystemClock.uptimeMillis() - this.LIZ), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.Throwable r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = r7 instanceof X.C29401Dk
            if (r0 == 0) goto L3c
            r1 = r7
            X.1Dk r1 = (X.C29401Dk) r1
            int r0 = r1.getErrorCode()
            long r2 = (long) r0
            java.lang.String r5 = r1.getErrorMsg()
            java.lang.String r4 = "ApiServerException"
            if (r5 != 0) goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Class r0 = r7.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "error_class"
            LJIIJJI(r6, r0, r1)
            java.lang.String r0 = "error_class_source"
            LJIIJJI(r6, r0, r4)
            java.lang.String r1 = "error_msg"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            LJIIJJI(r6, r1, r0)
            org.json.JSONObject r2 = r6.LIZLLL
            r1 = 1
            java.lang.String r0 = "error_detail"
            LJIIIZ(r2, r0, r5, r1)
            return
        L3c:
            boolean r0 = r7 instanceof X.C0TL
            if (r0 == 0) goto L51
            r1 = r7
            X.0TL r1 = (X.C0TL) r1
            int r0 = r1.getCronetError()
            long r2 = (long) r0
            java.lang.String r5 = r1.getMessage()
            java.lang.String r4 = "NetworkErrorException"
            if (r5 != 0) goto L18
            goto L17
        L51:
            boolean r0 = r7 instanceof X.C276516r
            if (r0 == 0) goto L66
            r1 = r7
            X.16r r1 = (X.C276516r) r1
            int r0 = r1.getErrorCode()
            long r2 = (long) r0
            java.lang.String r5 = r1.getMessage()
            java.lang.String r4 = "ApiException"
            if (r5 != 0) goto L18
            goto L17
        L66:
            boolean r0 = r7 instanceof X.C64799Pbv
            if (r0 == 0) goto L7b
            r1 = r7
            X.Pbv r1 = (X.C64799Pbv) r1
            int r0 = r1.getCronetInternalErrorCode()
            long r2 = (long) r0
            java.lang.String r5 = r1.getMessage()
            java.lang.String r4 = "CronetIOException"
            if (r5 != 0) goto L18
            goto L17
        L7b:
            java.lang.String r5 = r7.getMessage()
            java.lang.String r4 = "unknow_exception"
            if (r5 != 0) goto L84
            r5 = r4
        L84:
            r2 = -1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75866Tq2.LJIIJ(java.lang.Throwable):void");
    }

    public final void LJIILJJIL(String str) {
        LJIIJJI(this, "event_id", str);
        LJIIIZ(this.LIZLLL, "event_id", str, true);
        LJIIIZ(this.LIZLLL, "network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()), true);
        LJIIIZ(this.LIZLLL, "server_timestamp", Long.valueOf(C30725C4b.LIZ()), true);
        LJIIIZ(this.LIZLLL, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()), true);
        LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        C1DI.LIZIZ(LIZ, "eventId:", str, " extra:");
        LIZ.append(this.LIZLLL);
        LIZ.append(" category:");
        LIZ.append(this.LIZIZ);
        TYQ.LIZLLL("ttlive_cohost", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = this.LIZIZ;
        JSONObject jSONObject2 = this.LIZJ;
        JSONObject jSONObject3 = this.LIZLLL;
        LJIIIIZZ(jSONObject3, jSONObject);
        LJIIIIZZ(jSONObject3, jSONObject2);
        C0K2.LJ(((C75870Tq6) this).LJ, jSONObject, jSONObject2, jSONObject3);
        CL5.LIZIZ(str, this.LIZLLL, this.LIZIZ, this.LIZJ, false, 0, false);
    }

    public static final void LJIIIIZZ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        o.LJIIIIZZ(keys, "source.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    public static void LJIIJJI(AbstractC75866Tq2 abstractC75866Tq2, String str, Object obj) {
        abstractC75866Tq2.getClass();
        LJIIIZ(abstractC75866Tq2.LIZIZ, str, obj, true);
    }

    public static final void LJIIIZ(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (jSONObject.has(str) && !z) {
            return;
        }
        if (obj instanceof Integer) {
            C05630Jz.LIZ(((Number) obj).intValue(), str, jSONObject);
            return;
        }
        if (obj instanceof Long) {
            C05630Jz.LJFF(jSONObject, str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            C05630Jz.LJ(jSONObject, str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            C05630Jz.LIZLLL(jSONObject, str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            C05630Jz.LJI(jSONObject, str, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            C05630Jz.LJII(jSONObject, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof JSONObject) {
            C05630Jz.LIZJ(str, jSONObject, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            C05630Jz.LIZIZ(str, (JSONArray) obj, jSONObject);
        } else {
            C05630Jz.LJI(jSONObject, str, obj.toString());
        }
    }
}
