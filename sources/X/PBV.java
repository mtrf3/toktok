package X;

import android.text.TextUtils;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PBV {
    public static final AtomicInteger LIZ = new AtomicInteger(0);

    public static List<JSONObject> LIZLLL(byte[] bArr) {
        JSONArray optJSONArray;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("list")) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("list");
                if (optJSONArray2 == null) {
                    return null;
                }
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(optJSONArray2, i);
                    if (jSONObject2 != null && (optJSONArray = jSONObject2.optJSONArray("data")) != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            arrayList.add(JSONArrayProtectorUtils.getJSONObject(optJSONArray, i2));
                        }
                    }
                }
            } else {
                JSONArray optJSONArray3 = jSONObject.optJSONArray("data");
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    arrayList.add(JSONArrayProtectorUtils.getJSONObject(optJSONArray3, i3));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            DoctorManager.getInstance().LIZ(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void LIZJ(byte[] bArr, JSONObject jSONObject) {
        Iterator it = ((ArrayList) LIZLLL(bArr)).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = (JSONObject) it.next();
            try {
                JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
                JSONObject optJSONObject = jSONObject2.optJSONObject("DATA_DOCTOR");
                if (optJSONObject != null) {
                    jSONObject3.put("DATA_DOCTOR", optJSONObject);
                }
                LIZIZ("DATA_SEND_RESPONSE", jSONObject3);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LIZ(JSONObject jSONObject, String str, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("DATA_DOCTOR");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        try {
            if (optJSONObject.optInt("DATA_ID", -1) == -1) {
                optJSONObject.put("DATA_ID", LIZ.incrementAndGet());
            }
            optJSONObject.put("DATA_PROCESS", FCD.LIZ(C78248UnM.LJLJJI));
            optJSONObject.put("DATA_TYPE", str);
            optJSONObject.put("DATA_SAMPLE", z);
            optJSONObject.put("DATA_SAVE_DB_IMMEDIATE", false);
            optJSONObject.put("DATA_UPLOAD_IMMEDIATE", false);
            optJSONObject.put("DATA_AID", PC5.LJIIZILJ());
            jSONObject.put("DATA_DOCTOR", optJSONObject);
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            DoctorManager.getInstance().LIZ("DATA_RECEIVE", jSONObject2);
            DoctorManager.getInstance().LIZ("DATA_CACHE", jSONObject2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
