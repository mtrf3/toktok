package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NwR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60975NwR extends C60413NnN {
    public final /* synthetic */ C60974NwQ LJLILLLLZI;

    public C60975NwR(C60974NwQ c60974NwQ) {
        this.LJLILLLLZI = c60974NwQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r8 != null) goto L12;
     */
    @Override // X.AbstractC60423NnX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LJIJ(android.webkit.WebView r7, android.webkit.WebResourceRequest r8) {
        /*
            r6 = this;
            X.NwQ r0 = r6.LJLILLLLZI
            boolean r0 = r0.LJLILLLLZI
            r5 = 0
            if (r0 != 0) goto L8
            return r5
        L8:
            r4 = 0
            if (r8 == 0) goto L23
            boolean r0 = r8.isForMainFrame()
            if (r0 != 0) goto L1f
            android.net.Uri r3 = r8.getUrl()
            X.NwQ r0 = r6.LJLILLLLZI
            java.lang.String r2 = r0.LJLJJLL
            X.F8s r1 = X.C38639FEl.LJ
            if (r1 != 0) goto L2c
        L1d:
            if (r8 == 0) goto L23
        L1f:
            android.net.Uri r5 = r8.getUrl()
        L23:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            android.webkit.WebResourceResponse r0 = r6.LJIJI(r7, r0)
            return r0
        L2c:
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L1d
            if (r3 != 0) goto L33
            goto L1d
        L33:
            boolean r0 = r1.LIZLLL
            if (r0 != 0) goto L38
            goto L1d
        L38:
            com.bytedance.lynx.webview.adblock.TTSccAdblockWrapper r0 = r1.LJ
            boolean r0 = r0.LIZ(r3, r2)
            if (r0 == 0) goto L1d
            android.webkit.WebResourceResponse r3 = new android.webkit.WebResourceResponse
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            byte[] r0 = new byte[r4]
            r2.<init>(r0)
            java.lang.String r1 = "text/plain"
            java.lang.String r0 = "UTF-8"
            r3.<init>(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60975NwR.LJIJ(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJI(WebView webView, String str) {
        boolean z;
        JSONObject jSONObject;
        String str2;
        C60974NwQ c60974NwQ = this.LJLILLLLZI;
        if (c60974NwQ.LJLILLLLZI && !ORZ.LJLJJI(str, c60974NwQ.LJLJJI)) {
            try {
                z = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                FP9 fp9 = this.LJLILLLLZI.LJLJI;
                if (fp9 != null) {
                    jSONObject = fp9.LIZIZ(str);
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return null;
                }
                this.LJLILLLLZI.getClass();
                try {
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "scc_logid");
                    o.LJIIIIZZ(string, "res.getString(SearchLand…eConstUtil.Key.SCC_LOGID)");
                    C35975E9z.LIZJ = string;
                    String string2 = JSONObjectProtectorUtils.getString(jSONObject, "scc_reason");
                    o.LJIIIIZZ(string2, "res.getString(SearchLand…ConstUtil.Key.SCC_REASON)");
                    C35975E9z.LIZIZ = string2;
                    str2 = jSONObject2.optString("label");
                } catch (JSONException unused2) {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                String str3 = "";
                if (o.LJ(str2, "deny")) {
                    if (str == null) {
                        str = "";
                    }
                    C60983NwZ.LIZJ = str;
                    C60983NwZ.LIZ = "not_secure";
                    return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                }
                if (o.LJ(str2, "notice")) {
                    if (str == null) {
                        str = "";
                    }
                    C60983NwZ.LIZJ = str;
                    C60983NwZ.LIZ = "protection";
                    return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                }
                C188727au c188727au = new C188727au();
                if (str != null) {
                    str3 = str;
                }
                c188727au.LJI("scc_url", str3);
                c188727au.LJI("scc_logid", C35975E9z.LIZJ);
                c188727au.LJI("scc_reason", C35975E9z.LIZIZ);
                FMX.LJIIL("edge_case_no_show", c188727au.LIZ);
                return this.LJLILLLLZI.LJLJI.LJFF(str);
            }
        }
        return null;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        FP9 fp9;
        android.net.Uri uri;
        C60974NwQ c60974NwQ = this.LJLILLLLZI;
        if (c60974NwQ.LJLILLLLZI && (fp9 = c60974NwQ.LJLJI) != null) {
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            fp9.LIZ(String.valueOf(uri));
            return false;
        }
        return false;
    }

    @Override // X.AbstractC60423NnX
    public final void LIZ(WebView webView, String str, boolean z) {
        C60737Nsb hybridContext;
        InterfaceC60844NuK interfaceC60844NuK;
        C60737Nsb hybridContext2;
        InterfaceC60844NuK interfaceC60844NuK2;
        C60792NtU.LIZ.getClass();
        int LIZ = C60792NtU.LIZ(webView);
        if (C60986Nwc.LJI != null) {
            if (LIZ != C60986Nwc.LIZJ) {
                C60986Nwc.LIZJ = LIZ;
                C60986Nwc.LIZIZ = LIZ;
                if (C60986Nwc.LJ) {
                    C60986Nwc.LJFF++;
                }
            }
            if (LIZ > 1) {
                C60986Nwc.LIZLLL = true;
            }
            SearchLandingPageViewModel searchLandingPageViewModel = C60983NwZ.LJI;
            if (searchLandingPageViewModel != null) {
                searchLandingPageViewModel.LJLJJI.setValue(Integer.valueOf(LIZ));
            } else {
                o.LJIJI("pageViewModel");
                throw null;
            }
        }
        if (LIZ > 1) {
            if ((webView instanceof WebKitView) && webView != null && (hybridContext2 = ((WebKitView) webView).getHybridContext()) != null && (interfaceC60844NuK2 = (InterfaceC60844NuK) hybridContext2.LIZIZ(InterfaceC60844NuK.class)) != null) {
                interfaceC60844NuK2.LJJJ(true);
            }
        } else if ((webView instanceof WebKitView) && webView != null && (hybridContext = ((WebKitView) webView).getHybridContext()) != null && (interfaceC60844NuK = (InterfaceC60844NuK) hybridContext.LIZIZ(InterfaceC60844NuK.class)) != null) {
            interfaceC60844NuK.LJJJ(false);
        }
        if (ORZ.LJLJJI(str, this.LJLILLLLZI.LJLJJI) && LIZ < this.LJLILLLLZI.LJLJJL) {
            C60983NwZ.LIZ = "safe";
            SearchLandingPageViewModel searchLandingPageViewModel2 = C60983NwZ.LJI;
            if (searchLandingPageViewModel2 != null) {
                searchLandingPageViewModel2.gv0("safe");
            } else {
                o.LJIJI("pageViewModel");
                throw null;
            }
        }
        if (!ORZ.LJLJJI(str, this.LJLILLLLZI.LJLJJI) && !C60983NwZ.LIZ()) {
            if (str != null) {
                ((ArrayList) this.LJLILLLLZI.LJLJJI).add(str);
            }
            this.LJLILLLLZI.LJLJJL = LIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC60423NnX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.webkit.WebView r6, java.lang.String r7, android.graphics.Bitmap r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60975NwR.LJFF(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }
}
