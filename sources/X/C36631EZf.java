package X;

import android.text.TextUtils;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.services.apm.api.IHttpService;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EZf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36631EZf {
    public static C36633EZh LIZ(String str, List<File> list, java.util.Map<String, String> map) {
        try {
            IHttpService iHttpService = (IHttpService) C171096nZ.LIZ(IHttpService.class);
            if (iHttpService == null) {
                iHttpService = new DefaultHttpServiceImpl();
            }
            InterfaceC36632EZg buildMultipartUpload = iHttpService.buildMultipartUpload(str, "UTF-8", false);
            if (list != null && !list.isEmpty()) {
                for (File file : list) {
                    if (file.exists()) {
                        buildMultipartUpload.LIZJ(file.getName(), file, new HashMap());
                    }
                }
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    buildMultipartUpload.LIZ(entry.getKey(), entry.getValue());
                }
            }
            String str2 = new String(buildMultipartUpload.finish().LIZJ);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    return new C36633EZh(jSONObject.optInt("error_code", 0), jSONObject.optString("message", "").getBytes());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
