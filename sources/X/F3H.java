package X;

import android.text.TextUtils;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.services.apm.api.IHttpService;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F3H implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ List LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL;
    public final /* synthetic */ F3J LJLJL;
    public final /* synthetic */ UCH LJLJLJ;

    public final void LIZ() {
        String jSONObject;
        int optInt;
        UCH uch = this.LJLJLJ;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        String str3 = this.LJLJI;
        List list = this.LJLJJI;
        String str4 = this.LJLJJL;
        JSONObject jSONObject2 = this.LJLJJLL;
        F3J f3j = this.LJLJL;
        uch.getClass();
        try {
            IHttpService iHttpService = (IHttpService) C171096nZ.LIZ(IHttpService.class);
            if (iHttpService == null) {
                iHttpService = new DefaultHttpServiceImpl();
            }
            InterfaceC36632EZg buildMultipartUpload = iHttpService.buildMultipartUpload(UCH.LJLJJL, "UTF-8", false);
            buildMultipartUpload.LIZ("aid", str);
            buildMultipartUpload.LIZ("device_id", str2);
            buildMultipartUpload.LIZ("os", "Android");
            buildMultipartUpload.LIZ("process_name", "main");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", str3);
                    hashMap.put(WM7.SCENE_SERVICE, str4);
                    hashMap.put("env", "params.txt");
                    buildMultipartUpload.LIZJ(file.getName(), file, hashMap);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("filetype", "common_params");
            hashMap2.put("logtype", "env");
            if (jSONObject2 == null) {
                jSONObject = null;
            } else {
                jSONObject = jSONObject2.toString();
            }
            if (TextUtils.isEmpty(jSONObject)) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("defaultData", "none commonParams");
                } catch (JSONException unused) {
                }
                jSONObject = jSONObject3.toString();
            }
            buildMultipartUpload.LIZIZ(jSONObject, hashMap2);
            String str5 = new String(buildMultipartUpload.finish().LIZJ);
            try {
                optInt = new JSONObject(str5).optInt("errno", -1);
            } catch (JSONException e) {
                if (f3j != null) {
                    f3j.LIZ(e.getMessage());
                } else {
                    return;
                }
            }
            if (f3j != null) {
                if (optInt == 200) {
                    f3j.onSuccess();
                    return;
                }
                f3j.LIZ(str5);
            }
        } catch (Exception e2) {
            if (f3j != null) {
                f3j.LIZ(e2.getMessage());
            }
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

    public F3H(UCH uch, String str, String str2, String str3, List list, String str4, JSONObject jSONObject, F3J f3j) {
        this.LJLJLJ = uch;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = list;
        this.LJLJJL = str4;
        this.LJLJJLL = jSONObject;
        this.LJLJL = f3j;
    }
}
