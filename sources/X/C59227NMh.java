package X;

import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.web.utils.UploadFileFragment;
import kotlin.jvm.internal.AqS157S0200000_10;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.NMh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59227NMh implements InterfaceC60437Nnl {
    public final NMZ LIZ;
    public final UploadFileFragment LIZIZ;

    @Override // X.InterfaceC60437Nnl
    public final void LJ(PermissionRequest permissionRequest) {
        C1DH.LJJIJIIJI(new ARunnableS29S0200000_10(this, permissionRequest, 40));
    }

    @Override // X.InterfaceC60437Nnl
    public final void LJFF(String str) {
        String str2;
        String str3;
        String str4;
        java.util.Map map;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConsoleMessage");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        java.util.Map map2 = null;
        if (c59222NMc != null) {
            str2 = c59222NMc.LJ;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" message ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (str == null || TextUtils.isEmpty(str) || !o.LJJJLIIL(str, "bytedance://log_event_v3", false)) {
            return;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (!kotlin.jvm.internal.o.LJ("log_event_v3", parse.getHost()) || NJX.LIZ) {
            return;
        }
        String queryParameter = UriProtector.getQueryParameter(parse, "event");
        String str5 = "";
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = UriProtector.getQueryParameter(parse, "params");
        if (queryParameter2 != null) {
            str5 = queryParameter2;
        }
        JSONObject jSONObject = new JSONObject(str5);
        if (jSONObject.optInt("is_ad_event") == 1) {
            String tag = jSONObject.optString("tag");
            String creativeId = jSONObject.optString("value");
            if (jSONObject.has("log_extra")) {
                str3 = jSONObject.optString("log_extra");
            } else {
                str3 = null;
            }
            if (jSONObject.has("group_id")) {
                str4 = jSONObject.optString("group_id");
            } else {
                str4 = null;
            }
            String optString = jSONObject.optString("ad_extra_data");
            try {
                java.util.Map map3 = (java.util.Map) C75792yF.LIZIZ().LJII(jSONObject.toString(), java.util.Map.class);
                try {
                    map2 = (java.util.Map) C75792yF.LIZIZ().LJII(optString, java.util.Map.class);
                } catch (Exception unused) {
                }
                map = map2;
                map2 = map3;
            } catch (Exception unused2) {
                map = null;
            }
            kotlin.jvm.internal.o.LJIIIIZZ(tag, "tag");
            kotlin.jvm.internal.o.LJIIIIZZ(creativeId, "creativeId");
            C58655N0h LJ = C58704N2e.LJ(tag, queryParameter, creativeId, str3, str4);
            LJ.LIZLLL(map2);
            LJ.LIZ(map);
            LJ.LJI();
        } else {
            FMX.LJIILJJIL(queryParameter, jSONObject);
        }
        NJX.LIZ = true;
    }

    public C59227NMh(NMZ adWebViewExtension, WebKitView webKitView) {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        Context context;
        kotlin.jvm.internal.o.LJIIIZ(adWebViewExtension, "adWebViewExtension");
        this.LIZ = adWebViewExtension;
        Fragment fragment = null;
        if (webKitView != null && (context = webKitView.getContext()) != null) {
            for (context = webKitView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof C29S) {
                    activityC45651qj = (ActivityC45651qj) context;
                    break;
                }
            }
        }
        activityC45651qj = null;
        if (activityC45651qj != null && (supportFragmentManager2 = activityC45651qj.getSupportFragmentManager()) != null) {
            fragment = supportFragmentManager2.LJJJIL("web_view_upload_file");
        }
        if (!(fragment instanceof UploadFileFragment)) {
            UploadFileFragment uploadFileFragment = new UploadFileFragment();
            this.LIZIZ = uploadFileFragment;
            if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIIIZZ(0, 1, uploadFileFragment, "web_view_upload_file");
                c1b3.LJI();
                return;
            }
            return;
        }
        this.LIZIZ = (UploadFileFragment) fragment;
    }

    @Override // X.InterfaceC60437Nnl
    public final void LIZJ(WebView webView, int i) {
        String str;
        N1V n1v;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onProgressChanged");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        String str2 = null;
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" webview.url ");
        if (webView != null) {
            str2 = webView.getUrl();
        }
        LIZ.append(str2);
        LIZ.append(" newProgress ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (webView != null && C59303NPf.LIZIZ(this.LIZ.LIZ, webView.getUrl()) && (n1v = this.LIZ.LIZIZ) != null) {
            n1v.LIZLLL(webView.getUrl(), i, new AqS157S0200000_10(this, webView, 23), webView);
        }
    }

    @Override // X.InterfaceC60437Nnl
    public final void LIZLLL(WebView webView, String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceivedTitle");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        String str3 = null;
        if (c59222NMc != null) {
            str2 = c59222NMc.LJ;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" webview.url ");
        if (webView != null) {
            str3 = webView.getUrl();
        }
        LIZ.append(str3);
        LIZ.append(" title ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC60437Nnl
    public final boolean LJI(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Context context;
        if (fileChooserParams != null && webView != null && (context = webView.getContext()) != null) {
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof C29S) {
                    if (context != null) {
                        this.LIZIZ.Al(webView, valueCallback, fileChooserParams);
                        return true;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        return false;
    }
}
