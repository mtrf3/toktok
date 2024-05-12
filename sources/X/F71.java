package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F71 implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;

    public F71(WeakReference<Context> weakReference) {
        this.LJLIL = weakReference;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        JSONObject jSONObject2 = c38048EwW.LIZLLL;
        int i = -1;
        if (jSONObject2 == null) {
            jSONObject.put("installed", -1);
            return;
        }
        String optString = jSONObject2.optString("pkg_name");
        String optString2 = jSONObject2.optString("open_url");
        Context LJJI = UC0.LJJI(this.LJLIL);
        if (LJJI != null) {
            if (!TextUtils.isEmpty(optString)) {
                if (FCD.LJFF(LJJI, optString)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (!TextUtils.isEmpty(optString2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(optString2));
                if (FCD.LJ(LJJI, intent)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
        }
        jSONObject.put("installed", i);
    }
}
