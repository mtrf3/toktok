package X;

import android.webkit.WebResourceResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebResponseContentTypeModifySettings;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Dz7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35661Dz7 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final java.util.Map<String, String> LJ;
    public final InputStream LJFF;

    public final WebResourceResponse LIZ(String str) {
        HashMap hashMap;
        HashMap hashMap2;
        java.util.Map<String, String> map = this.LJ;
        if (map instanceof HashMap) {
            hashMap = (HashMap) map;
        } else {
            hashMap = null;
        }
        if (hashMap != null) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel webResponseContentTypeModifyModel = WebResponseContentTypeModifySettings.LIZ;
            WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel webResponseContentTypeModifyModel2 = (WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel) LIZLLL.LJIIIIZZ("web_response_content_type_modefify", WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel.class, webResponseContentTypeModifyModel);
            if (webResponseContentTypeModifyModel2 != null) {
                webResponseContentTypeModifyModel = webResponseContentTypeModifyModel2;
            }
            if (webResponseContentTypeModifyModel.enabled) {
                for (String str2 : webResponseContentTypeModifyModel.allowList) {
                    if (o.LJ(str2, "*") || (str != null && s.LJJJLZIJ(str, str2, false))) {
                        if (o.LJ(hashMap.get("content-type"), this.LIZ) || o.LJ(hashMap.get("Content-Type"), this.LIZ)) {
                            java.util.Map<String, String> map2 = this.LJ;
                            if ((map2 instanceof HashMap) && (hashMap2 = (HashMap) map2) != null) {
                                if (hashMap2.containsKey("content-type")) {
                                    hashMap2.remove("content-type");
                                } else if (hashMap2.containsKey("Content-Type")) {
                                    hashMap2.remove("Content-Type");
                                }
                            }
                        }
                    }
                }
            }
        }
        return new WebResourceResponse(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public C35661Dz7(String str, String str2, int i, String str3, java.util.Map<String, String> map, InputStream inputStream) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = inputStream;
    }
}
