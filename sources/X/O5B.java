package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O5B implements O55 {
    @Override // X.O55
    public final void LIZ(boolean z, String str, Long l, Long l2, Long l3, Long l4, O54 o54) {
        Object LIZ;
        Object LIZ2;
        Object LIZ3;
        Object LIZ4;
        Object valueOf;
        try {
            LIZ = UriProtector.parse(str);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Object obj = null;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        android.net.Uri uri = (android.net.Uri) LIZ;
        if (uri == null || !uri.isHierarchical()) {
            return;
        }
        try {
            LIZ2 = UriProtector.getQueryParameter(uri, "__image");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        String str2 = (String) LIZ2;
        if (str2 == null) {
            return;
        }
        try {
            LIZ3 = JSONObjectProtectorUtils.getString(new JSONObject(str2), "ext_path");
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (C3C5.m12isFailureimpl(LIZ3)) {
            LIZ3 = null;
        }
        String str3 = (String) LIZ3;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        try {
            LIZ4 = UriProtector.parse(str3);
            C3C5.m7constructorimpl(LIZ4);
        } catch (Throwable th4) {
            LIZ4 = C141335gf.LIZ(th4);
            C3C5.m7constructorimpl(LIZ4);
        }
        if (!C3C5.m12isFailureimpl(LIZ4)) {
            obj = LIZ4;
        }
        android.net.Uri uri2 = (android.net.Uri) obj;
        if (uri2 == null) {
            return;
        }
        String LJJJJI = C78926UyI.LJJJJI(uri2, "imagex_flight_id");
        String LJJJJI2 = C78926UyI.LJJJJI(uri2, "imagex_vid");
        String LJJJJI3 = C78926UyI.LJJJJI(uri2, "biz_tag");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(LJJJJI) || !TextUtils.isEmpty(LJJJJI2)) {
            jSONObject.put("imagex_flight_id", LJJJJI);
            jSONObject.put("imagex_vid", LJJJJI2);
        }
        try {
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uri", str3);
                jSONObject2.put("load_status", "success");
                jSONObject2.put("duration", l4);
                jSONObject2.put("download_duration", l2);
                jSONObject2.put("decode_duration", l3);
                jSONObject2.put("file_size", l);
                if (LJJJJI3 == null) {
                    LJJJJI3 = "hybrid";
                }
                jSONObject2.put("biz_tag", LJJJJI3);
                jSONObject2.put("extra", jSONObject);
                jSONObject2.put("timestamp", System.currentTimeMillis());
                jSONObject2.put("image_sdk_version", "hybrid");
                C09900aA.LJ("image_monitor_v2", jSONObject2);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("uri", str3);
            jSONObject3.put("load_status", "fail");
            Object obj2 = "unknown_error";
            if (o54 == null) {
                valueOf = "unknown_error";
            } else {
                valueOf = Integer.valueOf(o54.getCode());
            }
            jSONObject3.put("fail_phase", valueOf);
            if (o54 != null) {
                obj2 = Integer.valueOf(o54.getCode());
            }
            jSONObject3.put("err_desc", obj2);
            if (LJJJJI3 == null) {
                LJJJJI3 = "hybrid";
            }
            jSONObject3.put("biz_tag", LJJJJI3);
            jSONObject3.put("extra", jSONObject);
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("image_sdk_version", "hybrid");
            C09900aA.LJ("image_monitor_v2", jSONObject3);
        } catch (Exception unused) {
        }
    }
}
