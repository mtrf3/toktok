package X;

import Y.ACallableS113S0100000_10;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebEventLoger;
import com.ss.android.ugc.aweme.log.AdWebLogModel;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.web.business.special.CWebViewInterceptor;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NMZ implements InterfaceC60770Nt8 {
    public C59222NMc LIZ;
    public N1V LIZIZ;
    public NU6 LIZJ;
    public InterfaceC59221NMb LJ;
    public InterfaceC59494NWo LJFF;
    public NUM LJI;
    public View.OnTouchListener LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public NJZ LJIIJ;
    public float LJIIJJI;
    public InterfaceC39904FlM LJIILIIL;
    public String LJIILJJIL;
    public final C59223NMd LIZLLL = new C59223NMd();
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 427));

    @Override // X.InterfaceC60770Nt8
    public final void canGoBack() {
    }

    @Override // X.InterfaceC60770Nt8
    public final void canGoForward() {
    }

    @Override // X.InterfaceC60770Nt8
    public final void goBack() {
    }

    @Override // X.InterfaceC60770Nt8
    public final void goForward() {
    }

    @Override // X.InterfaceC60770Nt8
    public final NUJ getWebViewClient() {
        return new NUJ(this);
    }

    @Override // X.InterfaceC60770Nt8
    public final void onDestroy() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy ");
        C59222NMc c59222NMc = this.LIZ;
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        NU6 nu6 = this.LIZJ;
        if (nu6 != null) {
            if (nu6.LIZ()) {
                nu6.LJIIJJI = null;
                C10K.LIZJ(new ACallableS113S0100000_10(nu6, 4));
            }
            ((Handler) nu6.LIZ.getValue()).removeCallbacksAndMessages(null);
        }
        this.LIZLLL.LIZIZ = null;
    }

    @Override // X.InterfaceC60770Nt8
    public final void onResume() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResume ");
        C59222NMc c59222NMc = this.LIZ;
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        N1V n1v = this.LIZIZ;
        if (n1v != null) {
            n1v.LJIIIIZZ();
        }
        C59223NMd c59223NMd = this.LIZLLL;
        C59222NMc c59222NMc2 = this.LIZ;
        if (c59223NMd.LIZ) {
            return;
        }
        c59223NMd.LIZ(false, true, c59222NMc2);
    }

    @Override // X.InterfaceC60770Nt8
    public final void LIZ(int i) {
        N1V n1v = this.LIZIZ;
        if (n1v != null) {
            n1v.LIZ(i);
        }
    }

    @Override // X.InterfaceC60770Nt8
    public final void LIZIZ(C59222NMc c59222NMc) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initAdWeb ");
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        this.LIZ = c59222NMc;
        this.LIZIZ = new N1V();
        NU6 nu6 = new NU6();
        this.LIZJ = nu6;
        nu6.LIZLLL(this.LIZ);
    }

    @Override // X.InterfaceC60770Nt8
    public final C59227NMh LIZJ(WebKitView webKitView) {
        return new C59227NMh(this, webKitView);
    }

    @Override // X.InterfaceC60770Nt8
    public final void LIZLLL(InterfaceC39904FlM interfaceC39904FlM) {
        if (interfaceC39904FlM != null) {
            this.LJIILIIL = interfaceC39904FlM;
        }
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJ(InterfaceC59221NMb interfaceC59221NMb) {
        this.LJ = interfaceC59221NMb;
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJI(C59222NMc c59222NMc) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        int i;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onShow ");
        String str6 = null;
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        this.LIZ = c59222NMc;
        C59223NMd c59223NMd = this.LIZLLL;
        c59223NMd.LIZ = false;
        c59223NMd.LIZ(false, true, c59222NMc);
        C59222NMc c59222NMc2 = this.LIZ;
        if (c59222NMc2 != null) {
            c59222NMc2.LJIILIIL = System.currentTimeMillis();
        }
        C59222NMc c59222NMc3 = this.LIZ;
        if (c59222NMc3 != null) {
            c59222NMc3.LJIIJ = AnonymousClass629.LIZ("randomUUID().toString()");
        }
        AdWebLogService adWebLogService = new AdWebLogService();
        C59222NMc c59222NMc4 = this.LIZ;
        if (c59222NMc4 != null && (awemeRawAd2 = c59222NMc4.LIZ) != null) {
            str2 = awemeRawAd2.getCreativeIdStr();
        } else {
            str2 = null;
        }
        C59222NMc c59222NMc5 = this.LIZ;
        if (c59222NMc5 != null && (awemeRawAd = c59222NMc5.LIZ) != null) {
            str3 = awemeRawAd.getLogExtra();
        } else {
            str3 = null;
        }
        C59222NMc c59222NMc6 = this.LIZ;
        if (c59222NMc6 == null || (str4 = c59222NMc6.LJIIJ) == null) {
            str4 = "";
        }
        if (c59222NMc6 != null) {
            str5 = c59222NMc6.LJ;
            str6 = c59222NMc6.LIZJ;
        } else {
            str5 = null;
        }
        if (c59222NMc6 != null) {
            z = c59222NMc6.LJIIL;
            i = c59222NMc6.LJIIIIZZ;
        } else {
            z = false;
            i = 0;
        }
        adWebLogService.LJ(z, str2, i, str3, 0, str4, str5, str6);
        this.LJIILJJIL = "full_screen_slide";
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJII(WebView webView) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPause ");
        C59222NMc c59222NMc = this.LIZ;
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        N1V n1v = this.LIZIZ;
        if (n1v != null) {
            n1v.LIZIZ();
        }
        NU6 nu6 = this.LIZJ;
        if (nu6 != null) {
            nu6.LJ(webView, false);
        }
        C59223NMd c59223NMd = this.LIZLLL;
        C59222NMc c59222NMc2 = this.LIZ;
        if (c59223NMd.LIZ) {
            return;
        }
        c59223NMd.LIZ(true, false, c59222NMc2);
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIIIZ(String str) {
        this.LJIILJJIL = str;
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIIL(View.OnTouchListener onTouchListener) {
        this.LJII = onTouchListener;
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIILIIL(String str) {
        AdWebLogModel adWebLogModel;
        String cid;
        N1V n1v = this.LIZIZ;
        if (n1v == null || (adWebLogModel = n1v.LIZ) == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJJJJJL;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new AqS63S1100000_10(n1v, str, 10));
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIIZILJ(NJZ njz) {
        this.LJIIJ = njz;
    }

    @Override // X.InterfaceC60770Nt8
    public final void loadUrl(String str) {
        String str2;
        NU6 nu6;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadUrl ");
        C59222NMc c59222NMc = this.LIZ;
        if (c59222NMc != null) {
            str2 = c59222NMc.LJ;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" url ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (C59303NPf.LIZ(this.LIZ) && C78685UuP.LJJJZ(str) && o.LJ(str, "about:blank") && (nu6 = this.LIZJ) != null) {
            if (nu6.LIZ()) {
                nu6.LJIIJJI = null;
                C10K.LIZJ(new ACallableS113S0100000_10(nu6, 4));
            }
            ((Handler) nu6.LIZ.getValue()).removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIIIIZZ(Long l, String str) {
        AdWebLogModel adWebLogModel;
        String cid;
        N1V n1v = this.LIZIZ;
        if (n1v == null || (adWebLogModel = n1v.LIZ) == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJJJJIZL;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new AqS52S1200000_10(n1v, l, str, 6));
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIIJ(WebView webView, MotionEvent motionEvent) {
        Integer num;
        String str;
        String cid;
        C59222NMc c59222NMc;
        if (!C59303NPf.LIZ(this.LIZ)) {
            return;
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                this.LJIIJJI = motionEvent.getRawY();
                this.LJIIIIZZ = System.currentTimeMillis();
            } else if (num.intValue() == 1) {
                N1V n1v = this.LIZIZ;
                if (n1v != null) {
                    if (motionEvent.getRawY() > this.LJIIJJI) {
                        str = "down";
                    } else {
                        str = "up";
                    }
                    AdWebLogModel adWebLogModel = n1v.LIZ;
                    if (adWebLogModel != null && (cid = adWebLogModel.getCid()) != null && cid.length() != 0) {
                        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
                        C58685N1l.LIZ.getClass();
                        C58653N0f c58653N0f = C58685N1l.LJJJJJ;
                        String cid2 = adWebLogModel.getCid();
                        if (cid2 == null) {
                            cid2 = "";
                        }
                        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new AqS63S1100000_10(n1v, str, 11));
                    }
                }
                if (System.currentTimeMillis() - this.LJIIIIZZ < 100) {
                    this.LJIIIZ++;
                }
            }
        }
        if (C35730E0o.LIZ() && (((c59222NMc = this.LIZ) == null || c59222NMc.LJIIJJI != 1) && webView != null)) {
            webView.requestDisallowInterceptTouchEvent(true);
        }
        View.OnTouchListener onTouchListener = this.LJII;
        if (onTouchListener != null) {
            onTouchListener.onTouch(webView, motionEvent);
        }
        if (motionEvent != null) {
            NUM num2 = this.LJI;
            if (num2 != null) {
                num2.LJFF(motionEvent);
            }
            if (motionEvent.getActionMasked() == 0) {
                int[] iArr = new int[2];
                if (webView != null) {
                    webView.getLocationInWindow(iArr);
                }
                C17N.LJJJJI(motionEvent.getRawX() - iArr[0]);
                C17N.LJJJJI(motionEvent.getRawY() - iArr[1]);
            }
            ((GestureDetector) this.LJIIL.getValue()).onTouchEvent(motionEvent);
        }
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIIJJI(long j, String str) {
        AdWebLogModel adWebLogModel;
        String cid;
        N1V n1v = this.LIZIZ;
        if (n1v == null || (adWebLogModel = n1v.LIZ) == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJJJJL;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new N1P(n1v, j, str));
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIILLIIL(InterfaceC59494NWo interfaceC59494NWo, NUM num) {
        this.LJFF = interfaceC59494NWo;
        this.LJI = num;
    }

    @Override // X.InterfaceC60770Nt8
    public final java.util.Map<String, String> LJFF(WebView webView, String str, java.util.Map<String, String> map) {
        String str2;
        int i;
        boolean z;
        AwemeRawAd awemeRawAd;
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadUrl additionalHttpHeaders ");
        C59222NMc c59222NMc = this.LIZ;
        if (c59222NMc != null) {
            str2 = c59222NMc.LJ;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" url ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (str == null) {
            return map;
        }
        C59222NMc c59222NMc2 = this.LIZ;
        if (c59222NMc2 == null) {
            return map;
        }
        AwemeRawAd awemeRawAd2 = c59222NMc2.LIZ;
        if (awemeRawAd2 == null) {
            return map;
        }
        c59222NMc2.LJJI = false;
        N1V n1v = this.LIZIZ;
        if (n1v != null) {
            String creativeIdStr = awemeRawAd2.getCreativeIdStr();
            String logExtra = awemeRawAd2.getLogExtra();
            int i3 = c59222NMc2.LJIIJJI;
            int i4 = c59222NMc2.LJIIIIZZ;
            boolean z2 = c59222NMc2.LJIIL;
            String str3 = c59222NMc2.LJ;
            String str4 = c59222NMc2.LJIIJ;
            long j = c59222NMc2.LJIILIIL;
            String str5 = c59222NMc2.LJIILJJIL;
            int LJIIJ = c59222NMc2.LJIIJ();
            int LJIIJJI = c59222NMc2.LJIIJJI();
            String LIZJ = c59222NMc2.LIZJ();
            String LJ = c59222NMc2.LJ();
            boolean z3 = c59222NMc2.LJJ;
            AwemeRawAd awemeRawAd3 = c59222NMc2.LIZ;
            if (awemeRawAd3 != null) {
                i2 = awemeRawAd3.getPreloadH5Type();
            } else {
                i2 = 0;
            }
            n1v.LJIIJ(new AdWebLogModel(creativeIdStr, logExtra, i3, i4, z2 ? 1 : 0, str, str3, str4, j, str5, LJIIJ, LJIIJJI, LIZJ, LJ, z3, i2, c59222NMc2.LJJIFFI), str);
        }
        AwemeRawAd awemeRawAd4 = c59222NMc2.LIZ;
        if (awemeRawAd4 != null) {
            i = awemeRawAd4.getPreloadH5Type();
        } else {
            i = 0;
        }
        int i5 = c59222NMc2.LJIIZILJ;
        AwemeRawAd awemeRawAd5 = c59222NMc2.LIZ;
        if (awemeRawAd5 != null) {
            z = awemeRawAd5.isEnableWebGoogleLogin();
        } else {
            z = false;
        }
        C35998EAw.LIZJ(webView, str, i, i5, z);
        C59222NMc c59222NMc3 = this.LIZ;
        if (C59303NPf.LIZIZ(c59222NMc3, str) && c59222NMc3 != null && webView != null) {
            CWebViewInterceptor.LIZ = str;
            if (C35261Dsf.LIZ() && (awemeRawAd = c59222NMc3.LIZ) != null && awemeRawAd.isEnableWebGoogleLogin()) {
                String oldUa = webView.getSettings().getUserAgentString();
                o.LJIIIIZZ(oldUa, "oldUa");
                if (C35261Dsf.LIZ()) {
                    oldUa = ujb.o.LJJJJZ(oldUa, "wv", "", false);
                }
                C16880lQ.LLZL(webView.getSettings(), oldUa);
            }
        }
        C59303NPf.LIZLLL(c59222NMc2.LJIILLIIL, webView, "spark");
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r3 != null) goto L32;
     */
    @Override // X.InterfaceC60770Nt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.webkit.WebBackForwardList r7, android.webkit.WebView r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onHide "
            r1.append(r0)
            X.NMc r0 = r6.LIZ
            r4 = 0
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.LJ
        L10:
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            X.NWo r0 = r6.LJFF
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L26
            boolean r0 = r0.LIZLLL()
            if (r0 != r3) goto L26
            java.lang.String r0 = "full_screen_page_click"
            r6.LJIILJJIL = r0
        L26:
            android.app.Activity r1 = X.C84763XOl.LJIIIIZZ()
            java.lang.String r0 = "profile_2_feed"
            java.lang.String r1 = X.C54154LNe.LIZ(r1, r0)
            android.app.Activity r0 = X.C84763XOl.LJIIIIZZ()
            java.lang.String r0 = X.C54154LNe.LIZIZ(r0)
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = "full_screen_system_click"
            r6.LJIILJJIL = r0
        L42:
            X.N1V r2 = r6.LIZIZ
            if (r2 == 0) goto L58
            X.NMc r0 = r6.LIZ
            if (r0 == 0) goto L6a
            int r0 = r0.LJIIJJI
            if (r0 != r3) goto L6a
        L4e:
            kotlin.jvm.internal.AqS157S0200000_10 r1 = new kotlin.jvm.internal.AqS157S0200000_10
            r0 = 25
            r1.<init>(r6, r8, r0)
            r2.LJIIJJI(r7, r9, r1)
        L58:
            X.NMd r1 = r6.LIZLLL
            X.NMc r0 = r6.LIZ
            r1.LIZ = r3
            r1.LIZ(r3, r5, r0)
            X.NMc r1 = r6.LIZ
            if (r1 == 0) goto L79
            int r0 = r1.LJIIJJI
            if (r0 != r3) goto L6f
            return
        L6a:
            java.lang.String r9 = r6.LJIILJJIL
            goto L4e
        L6d:
            r0 = r4
            goto L10
        L6f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.LIZ
            if (r0 == 0) goto L79
            java.lang.String r3 = r0.getCreativeIdStr()
            if (r3 != 0) goto L7b
        L79:
            java.lang.String r3 = ""
        L7b:
            X.NMc r0 = r6.LIZ
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZ
            if (r0 == 0) goto Lac
            java.lang.String r2 = r0.getLogExtra()
        L87:
            X.NMc r0 = r6.LIZ
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZ
            if (r0 == 0) goto L99
            java.lang.Long r0 = r0.getGroupId()
            if (r0 == 0) goto L99
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L99:
            java.lang.String r1 = "landing_ad"
            java.lang.String r0 = "close"
            X.N0h r2 = X.C58704N2e.LJ(r1, r0, r3, r2, r4)
            java.lang.String r1 = "refer"
            java.lang.String r0 = r6.LJIILJJIL
            r2.LIZJ(r0, r1)
            r2.LJI()
            return
        Lac:
            r2 = r4
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMZ.LJIILJJIL(android.webkit.WebBackForwardList, android.webkit.WebView, java.lang.String):void");
    }

    @Override // X.InterfaceC60770Nt8
    public final void LJIILL(WebView webView, boolean z, boolean z2) {
        if (!C59303NPf.LIZ(this.LIZ) || !C35730E0o.LIZ()) {
            return;
        }
        if ((!z && !z2) || webView == null) {
            return;
        }
        webView.requestDisallowInterceptTouchEvent(false);
    }

    @Override // X.InterfaceC60770Nt8
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        NUM num = this.LJI;
        if (num != null) {
            num.LIZ(i2, i4);
        }
        InterfaceC59221NMb interfaceC59221NMb = this.LJ;
        if (interfaceC59221NMb != null) {
            interfaceC59221NMb.onScrollChanged(i, i2, i3, i4);
        }
    }
}
