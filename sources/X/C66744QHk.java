package X;

import com.ss.android.common.applog.AppLog;
import org.json.JSONArray;

/* renamed from: X.QHk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66744QHk {
    public static volatile C66744QHk LIZIZ;
    public final InterfaceC66743QHj LIZ;

    public static C66744QHk LIZ() {
        if (LIZIZ == null) {
            synchronized (C66744QHk.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C66744QHk();
                }
            }
        }
        return LIZIZ;
    }

    public C66744QHk() {
        if (AppLog.getSwitchToBdtracker()) {
            this.LIZ = new C66742QHi();
        } else {
            this.LIZ = new QHR();
        }
    }

    public void setEventVerifyUrl(String str) {
        this.LIZ.setEventVerifyUrl(str);
    }

    public final void LIZJ(String str, JSONArray jSONArray) {
        this.LIZ.putEvent(str, jSONArray);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(15:6|7|8|9|(1:11)(1:42)|12|13|(5:15|(1:17)|18|(1:20)|21)(6:32|(1:34)|35|(1:37)|38|(1:40))|22|(1:24)|25|(1:27)|28|29|30)|45|9|(0)(0)|12|13|(0)(0)|22|(0)|25|(0)|28|29|30) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[Catch: JSONException -> 0x00c5, TryCatch #0 {JSONException -> 0x00c5, blocks: (B:13:0x0031, B:15:0x003b, B:17:0x0041, B:18:0x0048, B:20:0x0056, B:21:0x0060, B:24:0x009f, B:25:0x00a4, B:27:0x00ae, B:28:0x00b3, B:32:0x006e, B:34:0x007e, B:37:0x0088, B:40:0x0094), top: B:12:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[Catch: JSONException -> 0x00c5, TryCatch #0 {JSONException -> 0x00c5, blocks: (B:13:0x0031, B:15:0x003b, B:17:0x0041, B:18:0x0048, B:20:0x0056, B:21:0x0060, B:24:0x009f, B:25:0x00a4, B:27:0x00ae, B:28:0x00b3, B:32:0x006e, B:34:0x007e, B:37:0x0088, B:40:0x0094), top: B:12:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[Catch: JSONException -> 0x00c5, TryCatch #0 {JSONException -> 0x00c5, blocks: (B:13:0x0031, B:15:0x003b, B:17:0x0041, B:18:0x0048, B:20:0x0056, B:21:0x0060, B:24:0x009f, B:25:0x00a4, B:27:0x00ae, B:28:0x00b3, B:32:0x006e, B:34:0x007e, B:37:0x0088, B:40:0x0094), top: B:12:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: JSONException -> 0x00c5, TryCatch #0 {JSONException -> 0x00c5, blocks: (B:13:0x0031, B:15:0x003b, B:17:0x0041, B:18:0x0048, B:20:0x0056, B:21:0x0060, B:24:0x009f, B:25:0x00a4, B:27:0x00ae, B:28:0x00b3, B:32:0x006e, B:34:0x007e, B:37:0x0088, B:40:0x0094), top: B:12:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, long r17, long r19, long r21, org.json.JSONObject r23) {
        /*
            r11 = this;
            java.lang.String r6 = "ab_sdk_version"
            java.lang.String r8 = "nt"
            X.QHj r0 = r11.LIZ
            boolean r0 = r0.isEnable()
            if (r0 != 0) goto Ld
            return
        Ld:
            if (r23 == 0) goto L19
            java.lang.String r0 = r23.toString()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L19
            r3.<init>(r0)     // Catch: org.json.JSONException -> L19
            goto L1e
        L19:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L1e:
            java.lang.String r1 = "event_v3"
            boolean r0 = r1.equals(r12)
            java.lang.String r7 = "event"
            if (r0 == 0) goto L2f
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r4 = r1
            goto L31
        L2f:
            r5 = r3
            r4 = r7
        L31:
            boolean r2 = r1.equals(r12)     // Catch: org.json.JSONException -> Lc5
            r9 = 0
            r0 = r21
            if (r2 == 0) goto L6e
            boolean r2 = r3.has(r8)     // Catch: org.json.JSONException -> Lc5
            if (r2 == 0) goto L48
            int r2 = r3.optInt(r8)     // Catch: org.json.JSONException -> Lc5
            r5.put(r8, r2)     // Catch: org.json.JSONException -> Lc5
        L48:
            r3.remove(r8)     // Catch: org.json.JSONException -> Lc5
            java.lang.String r2 = "_event_v3"
            r3.remove(r2)     // Catch: org.json.JSONException -> Lc5
            boolean r2 = r3.has(r6)     // Catch: org.json.JSONException -> Lc5
            if (r2 == 0) goto L60
            java.lang.String r2 = r3.optString(r6)     // Catch: org.json.JSONException -> Lc5
            r5.put(r6, r2)     // Catch: org.json.JSONException -> Lc5
            r3.remove(r6)     // Catch: org.json.JSONException -> Lc5
        L60:
            r5.put(r7, r13)     // Catch: org.json.JSONException -> Lc5
            java.lang.String r2 = "params"
            r5.put(r2, r3)     // Catch: org.json.JSONException -> Lc5
            java.lang.String r2 = "local_time_ms"
            r5.put(r2, r0)     // Catch: org.json.JSONException -> Lc5
            goto L99
        L6e:
            java.lang.String r2 = "category"
            r5.put(r2, r12)     // Catch: org.json.JSONException -> Lc5
            java.lang.String r2 = "tag"
            r5.put(r2, r13)     // Catch: org.json.JSONException -> Lc5
            boolean r2 = android.text.TextUtils.isEmpty(r14)     // Catch: org.json.JSONException -> Lc5
            if (r2 != 0) goto L83
            java.lang.String r2 = "label"
            r5.put(r2, r14)     // Catch: org.json.JSONException -> Lc5
        L83:
            r2 = r15
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 == 0) goto L8e
            java.lang.String r6 = "value"
            r5.put(r6, r2)     // Catch: org.json.JSONException -> Lc5
        L8e:
            r2 = r17
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 == 0) goto L99
            java.lang.String r6 = "ext_value"
            r5.put(r6, r2)     // Catch: org.json.JSONException -> Lc5
        L99:
            r2 = r19
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 <= 0) goto La4
            java.lang.String r6 = "user_id"
            r5.put(r6, r2)     // Catch: org.json.JSONException -> Lc5
        La4:
            java.lang.String r3 = com.ss.android.common.applog.AppLog.getUserUniqueId()     // Catch: org.json.JSONException -> Lc5
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Lc5
            if (r2 != 0) goto Lb3
            java.lang.String r2 = "user_unique_id"
            r5.put(r2, r3)     // Catch: org.json.JSONException -> Lc5
        Lb3:
            java.lang.String r3 = "session_id"
            java.lang.String r2 = com.ss.android.common.applog.AppLog.getCurrentSessionId()     // Catch: org.json.JSONException -> Lc5
            r5.put(r3, r2)     // Catch: org.json.JSONException -> Lc5
            java.lang.String r2 = "datetime"
            java.lang.String r0 = com.ss.android.common.applog.AppLog.formatDate(r0)     // Catch: org.json.JSONException -> Lc5
            r5.put(r2, r0)     // Catch: org.json.JSONException -> Lc5
        Lc5:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r0.put(r5)
            r11.LIZJ(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66744QHk.LIZIZ(java.lang.String, java.lang.String, java.lang.String, long, long, long, long, org.json.JSONObject):void");
    }
}
