package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PDJ {
    public final String LIZ;
    public final Bundle LIZIZ;
    public Bundle LIZJ;
    public final /* synthetic */ C67274Qak LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: NumberFormatException | JSONException -> 0x00a2, NumberFormatException | JSONException -> 0x00a2, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x00a2, blocks: (B:16:0x0027, B:28:0x0082, B:28:0x0082, B:31:0x0072, B:31:0x0072, B:33:0x008e, B:33:0x008e, B:35:0x009a, B:35:0x009a), top: B:15:0x0027, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle LIZ() {
        /*
            r10 = this;
            android.os.Bundle r0 = r10.LIZJ
            if (r0 == 0) goto L7
        L4:
            android.os.Bundle r0 = r10.LIZJ
            return r0
        L7:
            X.Qak r0 = r10.LIZLLL
            android.content.SharedPreferences r2 = r0.LJIIJ()
            java.lang.String r1 = r10.LIZ
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r0 == 0) goto Lc7
            android.os.Bundle r4 = new android.os.Bundle     // Catch: org.json.JSONException -> Lb8
            r4.<init>()     // Catch: org.json.JSONException -> Lb8
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb8
            r3.<init>(r0)     // Catch: org.json.JSONException -> Lb8
            r2 = 0
        L21:
            int r0 = r3.length()     // Catch: org.json.JSONException -> Lb8
            if (r2 >= r0) goto Lb5
            org.json.JSONObject r8 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getJSONObject(r3, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "n"
            java.lang.String r5 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r8, r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "t"
            java.lang.String r6 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r8, r0)     // Catch: java.lang.Throwable -> La2
            int r9 = r6.hashCode()     // Catch: java.lang.Throwable -> La2
            r0 = 100
            r7 = 2
            r1 = 1
            if (r9 == r0) goto L42
            goto L54
        L42:
            java.lang.String r0 = "d"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L5c
            r9 = 1
        L4b:
            java.lang.String r0 = "v"
            if (r9 == 0) goto L9a
            if (r9 == r1) goto L8e
            if (r9 == r7) goto L82
            goto L72
        L54:
            r0 = 108(0x6c, float:1.51E-43)
            if (r9 == r0) goto L68
            r0 = 115(0x73, float:1.61E-43)
            if (r9 == r0) goto L5e
        L5c:
            r9 = -1
            goto L4b
        L5e:
            java.lang.String r0 = "s"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L5c
            r9 = 0
            goto L4b
        L68:
            java.lang.String r0 = "l"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L5c
            r9 = 2
            goto L4b
        L72:
            X.Qak r0 = r10.LIZLLL     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            X.Qar r1 = r0.LJFF     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            java.lang.String r0 = "Unrecognized persisted bundle type. Type"
            r1.LIZIZ(r6, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            goto Lb1
        L82:
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r8, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            r4.putLong(r5, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            goto Lb1
        L8e:
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r8, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            double r0 = com.bytedance.mt.protector.impl.string2number.CastDoubleProtector.parseDouble(r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            r4.putDouble(r5, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            goto Lb1
        L9a:
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r8, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            r4.putString(r5, r0)     // Catch: java.lang.Throwable -> La2 java.lang.Throwable -> La2
            goto Lb1
        La2:
            X.Qak r0 = r10.LIZLLL     // Catch: org.json.JSONException -> Lb8
            X.Qmz r0 = r0.LIZ     // Catch: org.json.JSONException -> Lb8
            X.Qaq r0 = r0.LIZJ()     // Catch: org.json.JSONException -> Lb8
            X.Qar r1 = r0.LJFF     // Catch: org.json.JSONException -> Lb8
            java.lang.String r0 = "Error reading value from SharedPreferences. Value dropped"
            r1.LIZ(r0)     // Catch: org.json.JSONException -> Lb8
        Lb1:
            int r2 = r2 + 1
            goto L21
        Lb5:
            r10.LIZJ = r4     // Catch: org.json.JSONException -> Lb8
            goto Lc7
        Lb8:
            X.Qak r0 = r10.LIZLLL
            X.Qmz r0 = r0.LIZ
            X.Qaq r0 = r0.LIZJ()
            X.Qar r1 = r0.LJFF
            java.lang.String r0 = "Error loading bundle from SharedPreferences. Values will be lost"
            r1.LIZ(r0)
        Lc7:
            android.os.Bundle r0 = r10.LIZJ
            if (r0 != 0) goto L4
            android.os.Bundle r0 = r10.LIZIZ
            r10.LIZJ = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PDJ.LIZ():android.os.Bundle");
    }

    public PDJ(C67274Qak c67274Qak) {
        this.LIZLLL = c67274Qak;
        QH7.LJI("default_event_parameters");
        this.LIZ = "default_event_parameters";
        this.LIZIZ = new Bundle();
    }

    public final void LIZIZ(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.LIZLLL.LJIIJ().edit();
        if (bundle.size() == 0) {
            edit.remove(this.LIZ);
        } else {
            String str = this.LIZ;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle, str2);
                if (LLJJIII != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", LLJJIII.toString());
                        if (!(LLJJIII instanceof String)) {
                            if (LLJJIII instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (LLJJIII instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                this.LIZLLL.LIZ.LIZJ().LJFF.LIZIZ(LLJJIII.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else {
                            jSONObject.put("t", "s");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.LIZLLL.LIZ.LIZJ().LJFF.LIZIZ(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.LIZJ = bundle;
    }
}
