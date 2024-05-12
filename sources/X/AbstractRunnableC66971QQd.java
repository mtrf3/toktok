package X;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.QQd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractRunnableC66971QQd implements Runnable {
    public final void LIZ() {
        byte[] bArr;
        C66972QQe c66972QQe = (C66972QQe) this;
        java.util.Map<String, String> LIZ = QRM.LJIIIIZZ.LIZ();
        String LIZIZ = C36929EeT.LIZIZ(C73312Spw.LJFF("/cloudpush/callback/client_show/"), LIZ);
        HashMap hashMap = (HashMap) LIZ;
        Object obj = hashMap.get("device_id");
        Object obj2 = hashMap.get("aid");
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_time", String.valueOf(System.currentTimeMillis() / 1000));
            jSONObject.put("did", obj);
            jSONObject.put("aid", obj2);
            jSONObject.put("sender", String.valueOf(c66972QQe.LJLIL));
            jSONObject.put("group_id", String.valueOf(c66972QQe.LJLILLLLZI.groupId));
            jSONObject.put("rid", String.valueOf(c66972QQe.LJLILLLLZI.id));
            jSONObject.put("rid64", String.valueOf(c66972QQe.LJLILLLLZI.rid64));
            jSONArray.put(jSONObject);
            bArr = jSONArray.toString().getBytes("UTF-8");
        } catch (Throwable unused) {
            bArr = null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("Content-Type", "application/json; charset=utf-8");
            AbstractC66805QJt.LIZ.LJ(LIZIZ, bArr, hashMap2, new QKY());
        } catch (Throwable unused2) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
