package X;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.n_project.opensdk_tt.ui.WebAuthActivity;
import ujb.o;
import ujb.s;

/* renamed from: X.Okn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62801Okn extends WebViewClient {
    public int LIZ;
    public final int LIZIZ = 1;
    public final int LIZJ = 2;
    public long LIZLLL;
    public final /* synthetic */ WebAuthActivity LJ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public C62801Okn(WebAuthActivity webAuthActivity) {
        this.LJ = webAuthActivity;
    }

    public static int LIZ(String str) {
        try {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "scope");
            if (queryParameter == null || !s.LJLJJI(queryParameter, new char[]{','}, false, 6).contains("post.sync.past_2month")) {
                String queryParameter2 = UriProtector.getQueryParameter(UriProtector.parse(str), "scopes");
                if (queryParameter2 == null) {
                    return 0;
                }
                if (!s.LJLJJI(queryParameter2, new char[]{','}, false, 6).contains("post.sync.past_2month")) {
                    return 0;
                }
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r14, boolean r15) {
        /*
            r13 = this;
            long r4 = r13.LIZLLL
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L9
            return
        L9:
            X.UVX r0 = X.C62634Oi6.LIZ
            if (r0 != 0) goto Lae
            r0 = 0
        Le:
            r6 = 0
            r5 = 1
            if (r14 != 0) goto L96
        L12:
            r1 = 0
        L13:
            java.lang.String r9 = "duration"
            r12 = 2
            java.lang.String r7 = "success"
            java.lang.String r11 = "fail"
            java.lang.String r4 = "result"
            java.lang.String r10 = "url"
            r8 = 3
            if (r1 == 0) goto L56
            if (r0 != 0) goto L26
        L23:
            r13.LIZLLL = r2
            return
        L26:
            X.OSZ[] r8 = new X.OSZ[r8]
            X.OSZ r1 = new X.OSZ
            r1.<init>(r10, r14)
            r8[r6] = r1
            if (r15 == 0) goto L54
        L31:
            X.OSZ r1 = new X.OSZ
            r1.<init>(r4, r7)
            r8[r5] = r1
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r13.LIZLLL
            long r6 = r6 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            X.OSZ r1 = new X.OSZ
            r1.<init>(r9, r4)
            r8[r12] = r1
            java.util.Map r4 = X.C113554cx.LJJLIIIIJ(r8)
            java.lang.String r1 = "rd_lemon8_intro_load_status"
            r0.onEvent(r1, r4)
            goto L23
        L54:
            r7 = r11
            goto L31
        L56:
            if (r14 != 0) goto L59
            goto L23
        L59:
            com.ss.n_project.opensdk_tt.ui.WebAuthActivity r1 = r13.LJ
            java.lang.String r1 = r1.LJLJI
            boolean r1 = ujb.o.LJJJLIIL(r14, r1, r6)
            if (r1 != r5) goto L23
            if (r0 != 0) goto L66
            goto L23
        L66:
            X.OSZ[] r8 = new X.OSZ[r8]
            X.OSZ r1 = new X.OSZ
            r1.<init>(r10, r14)
            r8[r6] = r1
            if (r15 == 0) goto L94
        L71:
            X.OSZ r1 = new X.OSZ
            r1.<init>(r4, r7)
            r8[r5] = r1
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r13.LIZLLL
            long r6 = r6 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            X.OSZ r1 = new X.OSZ
            r1.<init>(r9, r4)
            r8[r12] = r1
            java.util.Map r4 = X.C113554cx.LJJLIIIIJ(r8)
            java.lang.String r1 = "rd_tt_auth_load_status"
            r0.onEvent(r1, r4)
            goto L23
        L94:
            r7 = r11
            goto L71
        L96:
            com.ss.n_project.opensdk_tt.ui.WebAuthActivity r1 = r13.LJ
            X.Ol8 r1 = r1.LJLILLLLZI
            java.lang.Object r4 = r1.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "lemon8IntroUrl"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r1)
            boolean r1 = ujb.o.LJJJLIIL(r14, r4, r6)
            if (r1 != r5) goto L12
            r1 = 1
            goto L13
        Lae:
            java.lang.Object r0 = r0.LJLILLLLZI
            X.2gN r0 = (X.InterfaceC64712gN) r0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62801Okn.LIZIZ(java.lang.String, boolean):void");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        LIZIZ(str, true);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        InterfaceC62810Okw interfaceC62810Okw;
        String str2;
        String str3;
        InterfaceC62810Okw interfaceC62810Okw2;
        Integer LJJIL;
        if (C59312NPo.LJFF(webView, str)) {
            return true;
        }
        int i = 0;
        if (str == null || !o.LJJJLIIL(str, this.LJ.LJLJJI, false)) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.LIZ != this.LIZJ) {
            InterfaceC64712gN interfaceC64712gN = (InterfaceC64712gN) this.LJ.LJLJJL.getValue();
            if (interfaceC64712gN != null) {
                interfaceC64712gN.onEvent("click_lemon8_authorize", C113554cx.LJJLIIIIJ(new OSZ("is_sync", Integer.valueOf(LIZ(str)))));
            }
            try {
                android.net.Uri parse = UriProtector.parse(str);
                String queryParameter = UriProtector.getQueryParameter(parse, "code");
                String queryParameter2 = UriProtector.getQueryParameter(parse, "scopes");
                UriProtector.getQueryParameter(parse, "state");
                String queryParameter3 = UriProtector.getQueryParameter(parse, "error");
                UriProtector.getQueryParameter(parse, "error_string");
                String queryParameter4 = UriProtector.getQueryParameter(parse, "errCode");
                InterfaceC64712gN interfaceC64712gN2 = (InterfaceC64712gN) this.LJ.LJLJJL.getValue();
                if (interfaceC64712gN2 != null) {
                    OSZ[] oszArr = new OSZ[3];
                    if (queryParameter == null || queryParameter.length() == 0) {
                        str2 = "fail";
                    } else {
                        str2 = "success";
                    }
                    oszArr[0] = new OSZ("result", str2);
                    String str4 = "";
                    if (queryParameter3 == null) {
                        str3 = "";
                    } else {
                        str3 = queryParameter3;
                    }
                    oszArr[1] = new OSZ("fail_reason", str3);
                    if (queryParameter4 != null) {
                        str4 = queryParameter4;
                    }
                    oszArr[2] = new OSZ("fail_code", str4);
                    interfaceC64712gN2.onEvent("lemon8_authorize_result", C113554cx.LJJLIIIIJ(oszArr));
                }
                if (queryParameter == null || queryParameter.length() == 0) {
                    UVX uvx = C62634Oi6.LIZ;
                    if (uvx != null && (interfaceC62810Okw2 = (InterfaceC62810Okw) uvx.LJLJI) != null) {
                        interfaceC62810Okw2.LIZJ();
                    }
                    InterfaceC62809Okv interfaceC62809Okv = C62634Oi6.LIZIZ;
                    if (interfaceC62809Okv != null) {
                        if (queryParameter4 != null && (LJJIL = C38350F3i.LJJIL(queryParameter4)) != null) {
                            i = LJJIL.intValue();
                        }
                        C62806Oks.LIZ(interfaceC62809Okv, queryParameter2, i, queryParameter3, this.LJ.LLFII(), 12);
                    }
                    C62634Oi6.LIZIZ = null;
                    this.LJ.finish();
                } else {
                    this.LJ.LLFZ(queryParameter, queryParameter2);
                }
            } catch (Exception unused) {
                UVX uvx2 = C62634Oi6.LIZ;
                if (uvx2 != null && (interfaceC62810Okw = (InterfaceC62810Okw) uvx2.LJLJI) != null) {
                    interfaceC62810Okw.LIZJ();
                }
                InterfaceC62809Okv interfaceC62809Okv2 = C62634Oi6.LIZIZ;
                if (interfaceC62809Okv2 != null) {
                    C62806Oks.LIZ(interfaceC62809Okv2, null, 20106, "opensdk get auth code failed", this.LJ.LLFII(), 12);
                }
                C62634Oi6.LIZIZ = null;
                this.LJ.finish();
            }
            this.LIZ = this.LIZJ;
            return true;
        }
        if (str != null && o.LJJJLIIL(str, this.LJ.LJLJI, false) && this.LIZ != this.LIZIZ) {
            InterfaceC64712gN interfaceC64712gN3 = (InterfaceC64712gN) this.LJ.LJLJJL.getValue();
            if (interfaceC64712gN3 != null) {
                interfaceC64712gN3.onEvent("click_lemon8_join", C113554cx.LJJLIIIIJ(new OSZ("is_sync", Integer.valueOf(LIZ(str)))));
            }
            this.LIZ = this.LIZIZ;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (str == null) {
            return;
        }
        String lemon8IntroUrl = (String) this.LJ.LJLILLLLZI.getValue();
        kotlin.jvm.internal.o.LJIIIIZZ(lemon8IntroUrl, "lemon8IntroUrl");
        if (!o.LJJJLIIL(str, lemon8IntroUrl, false) && !o.LJJJLIIL(str, this.LJ.LJLJI, false)) {
            return;
        }
        this.LIZLLL = System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        LIZIZ(str2, false);
        if (this.LIZ == 0) {
            InterfaceC62809Okv interfaceC62809Okv = C62634Oi6.LIZIZ;
            if (interfaceC62809Okv != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append(',');
                LIZ.append((Object) str);
                C62806Oks.LIZ(interfaceC62809Okv, null, 20105, X1D.LIZIZ(LIZ), this.LJ.LLFII(), 14);
            }
            C62634Oi6.LIZIZ = null;
            this.LJ.finish();
        }
    }
}
