package X;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ngx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60015Ngx {
    public C60016Ngy LIZIZ;
    public C59753Ncj LIZJ;
    public long LJ = System.nanoTime();
    public EnumC60020Nh2 LIZLLL = EnumC60020Nh2.AD_STATE_IDLE;
    public C60022Nh4 LIZ = new C60022Nh4(null);

    public void LIZ() {
    }

    public void LIZJ(C60014Ngw c60014Ngw, NR8 nr8) {
        LIZLLL(c60014Ngw, nr8, null);
    }

    public void LJ() {
        this.LIZ.clear();
    }

    public final WebView LJFF() {
        return this.LIZ.get();
    }

    public final void LIZIZ(String str) {
        C37137Ehp.LIZIZ(LJFF(), "publishMediaEvent", str);
    }

    public final void LIZLLL(C60014Ngw c60014Ngw, NR8 nr8, JSONObject jSONObject) {
        String str = c60014Ngw.LJII;
        JSONObject jSONObject2 = new JSONObject();
        C60031NhD.LIZJ(jSONObject2, "environment", "app");
        C60031NhD.LIZJ(jSONObject2, "adSessionType", nr8.LJII);
        JSONObject jSONObject3 = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Build.MANUFACTURER);
        LIZ.append("; ");
        LIZ.append(Build.MODEL);
        C60031NhD.LIZJ(jSONObject3, "deviceType", X1D.LIZIZ(LIZ));
        C60031NhD.LIZJ(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C60031NhD.LIZJ(jSONObject3, "os", "Android");
        C60031NhD.LIZJ(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C60031NhD.LIZJ(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C60031NhD.LIZJ(jSONObject4, "partnerName", nr8.LIZ.LJLIL);
        C60031NhD.LIZJ(jSONObject4, "partnerVersion", nr8.LIZ.LJLILLLLZI);
        C60031NhD.LIZJ(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C60031NhD.LIZJ(jSONObject5, "libraryVersion", "1.3.0-Bytedance");
        C60031NhD.LIZJ(jSONObject5, "appId", C16880lQ.LLLLL(C59999Ngh.LIZIZ.LIZ).getPackageName());
        C60031NhD.LIZJ(jSONObject2, "app", jSONObject5);
        String str2 = nr8.LJI;
        if (str2 != null) {
            C60031NhD.LIZJ(jSONObject2, "contentUrl", str2);
        }
        String str3 = nr8.LJFF;
        if (str3 != null) {
            C60031NhD.LIZJ(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (NSD nsd : Collections.unmodifiableList(nr8.LIZJ)) {
            C60031NhD.LIZJ(jSONObject6, nsd.LIZ, nsd.LIZJ);
        }
        C37137Ehp.LIZIZ(LJFF(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }
}
