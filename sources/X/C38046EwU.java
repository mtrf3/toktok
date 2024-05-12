package X;

import android.os.Message;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EwU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38046EwU implements ValueCallback<String> {
    public final /* synthetic */ C38049EwX LIZ;

    public C38046EwU(C38049EwX c38049EwX) {
        this.LIZ = c38049EwX;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        String str2 = str;
        C38049EwX c38049EwX = this.LIZ;
        c38049EwX.getClass();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{a=");
            LIZ.append(str2);
            LIZ.append("}");
            JSONArray jSONArray = new JSONArray(new JSONObject(X1D.LIZIZ(LIZ)).optString("a", ""));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                C38048EwW c38048EwW = new C38048EwW();
                c38048EwW.LIZ = JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
                String str3 = null;
                c38048EwW.LIZIZ = jSONObject.optString("__callback_id", null);
                c38048EwW.LIZJ = jSONObject.optString("func");
                c38048EwW.LIZLLL = jSONObject.optJSONObject("params");
                c38048EwW.LJ = jSONObject.optInt("JSSDK");
                c38048EwW.LJFF = jSONObject.optString("namespace");
                c38048EwW.LJI = jSONObject.optString("__iframe_url");
                c38048EwW.LJIIIIZZ = jSONObject.optString("token");
                if (!TextUtils.isEmpty(c38048EwW.LIZ) && !TextUtils.isEmpty(c38048EwW.LIZJ)) {
                    InterfaceC38047EwV interfaceC38047EwV = c38049EwX.LJI;
                    if (interfaceC38047EwV != null && interfaceC38047EwV.needUpdateConfig(c38048EwW)) {
                        JSONObject jSONObject2 = new JSONObject();
                        WebView webView = c38049EwX.LIZ;
                        if (webView != null) {
                            str3 = webView.getUrl();
                        }
                        c38049EwX.LJI.updateProtectedFunc(c38048EwW, jSONObject2, str3, c38049EwX);
                        return;
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = c38048EwW;
                    c38049EwX.LJIIJ.sendMessage(obtain);
                }
            }
        } catch (JSONException | Exception unused) {
        }
    }
}
