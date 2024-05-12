package X;

import android.os.Process;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PC7 {
    public static long LIZ = -1;

    public static long LIZ() {
        if (LIZ == -1) {
            LIZ = (PC5.LJJII() << 16) | Process.myPid();
        }
        return LIZ;
    }

    public static JSONObject LIZIZ(PCA pca) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {pca};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/bytedance/apm6/consumer/slardar/header/HeaderInfo;)Lorg/json/JSONObject;", "-2999622757829731014");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(400501, "com/bytedance/apm6/consumer/slardar/header/HeaderUtils", "serialize", PC7.class, objArr, "org.json.JSONObject", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(400501, "com/bytedance/apm6/consumer/slardar/header/HeaderUtils", "serialize", null, objArr, PC7.class, c65300Pk0, false);
            return (JSONObject) LIZJ.LIZIZ;
        }
        if (pca == null) {
            c03880Dg.LIZIZ(400501, "com/bytedance/apm6/consumer/slardar/header/HeaderUtils", "serialize", null, objArr, PC7.class, c65300Pk0, true);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = pca.LJJIFFI;
            if (jSONObject2 != null) {
                jSONObject = C64055PBz.LIZ(jSONObject, jSONObject2);
            }
            JSONObject jSONObject3 = pca.LJJI;
            if (jSONObject3 != null) {
                jSONObject = C64055PBz.LIZ(jSONObject, jSONObject3);
            }
            jSONObject.put("version_code", pca.LJI);
            jSONObject.put("version_name", pca.LJII);
            jSONObject.put("manifest_version_code", pca.LJFF);
            jSONObject.put("update_version_code", pca.LIZLLL);
            jSONObject.put("app_version", pca.LJ);
            jSONObject.put("os", pca.LJIIIZ);
            jSONObject.put("device_platform", pca.LJIIJ);
            jSONObject.put("os_version", pca.LJIIJJI);
            jSONObject.put("os_api", pca.LJIIL);
            jSONObject.put("device_model", pca.LJIILIIL);
            jSONObject.put("device_brand", pca.LJIILJJIL);
            jSONObject.put("device_manufacturer", pca.LJIILL);
            jSONObject.put("process_name", pca.LJIILLIIL);
            jSONObject.put("sid", pca.LJIIZILJ);
            jSONObject.put("rom_version", pca.LJIJ);
            jSONObject.put("package", pca.LJIJI);
            jSONObject.put("monitor_version", pca.LJIJJ);
            jSONObject.put("channel", pca.LIZJ);
            jSONObject.put("aid", pca.LIZ);
            if (!TextUtils.isEmpty(pca.LIZIZ)) {
                jSONObject.put("device_id", pca.LIZIZ);
            }
            jSONObject.put("uid", pca.LJIJJLI);
            jSONObject.put("phone_startup_time", pca.LJIL);
            jSONObject.put("release_build", pca.LJIIIIZZ);
            long j = pca.LJJIIJ;
            if (j != -1) {
                jSONObject.put("config_time", String.valueOf(j));
            }
            if (!TextUtils.isEmpty(pca.LJJ)) {
                jSONObject.put("verify_info", pca.LJJ);
            }
            jSONObject.put("current_update_version_code", pca.LJJIII);
            long j2 = pca.LJJIIJZLJL;
            if (j2 != -1) {
                jSONObject.put("ntp_time", j2);
            }
            long j3 = pca.LJJIIZ;
            if (j3 != -1) {
                jSONObject.put("ntp_offset", j3);
            }
            JSONObject jSONObject4 = pca.LJJII;
            if (jSONObject4 != null) {
                jSONObject.put("filters", jSONObject4);
            }
            c03880Dg.LIZIZ(400501, "com/bytedance/apm6/consumer/slardar/header/HeaderUtils", "serialize", jSONObject, objArr, PC7.class, c65300Pk0, true);
            return jSONObject;
        } catch (Exception unused) {
            c03880Dg.LIZIZ(400501, "com/bytedance/apm6/consumer/slardar/header/HeaderUtils", "serialize", null, objArr, PC7.class, c65300Pk0, true);
            return null;
        }
    }
}
