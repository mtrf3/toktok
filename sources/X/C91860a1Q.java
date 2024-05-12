package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a1Q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91860a1Q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(C11850dJ c11850dJ, Boolean bool, String url, boolean z, InterfaceC88472Yns<? super String, Boolean> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super WebView, C76800UCe> interfaceC88472Yns3, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Integer valueOf;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        String str;
        android.net.Uri parse;
        T t;
        InterfaceC88472Yns<? super String, Boolean> interfaceC88472Yns4 = interfaceC88472Yns;
        C11850dJ c11850dJ2 = c11850dJ;
        Boolean bool2 = bool;
        boolean z2 = z;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns5 = interfaceC88472Yns2;
        InterfaceC88472Yns<? super WebView, C76800UCe> interfaceC88472Yns6 = interfaceC88472Yns3;
        o.LJIIIZ(url, "url");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1083583056);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(c11850dJ2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(bool2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(url)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJI(z2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        int i15 = i2 & 32;
        if (i15 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns5)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i16 = i2 & 64;
        if (i16 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns6)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if (((i3 & 2995931) ^ 599186) != 0 || !LJIL.LIZ()) {
            if (i11 != 0) {
                c11850dJ2 = null;
            }
            if (i12 != 0) {
                bool2 = Boolean.FALSE;
            }
            if (i13 != 0) {
                z2 = false;
            }
            if (i14 != 0) {
                interfaceC88472Yns4 = C92670aEU.LJLIL;
            }
            if (i15 != 0) {
                interfaceC88472Yns5 = C92671aEV.LJLIL;
            }
            if (i16 != 0) {
                interfaceC88472Yns6 = C92672aEW.LJLIL;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = C78966Uyw.LJJJIL(0);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJJJZ2 == c24490xh) {
                LJJJZ2 = C78966Uyw.LJJJIL(Boolean.FALSE);
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) LJJJZ2;
            Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = url;
            if (o.LJ(bool2, Boolean.TRUE)) {
                if (C91671ZyN.LIZ) {
                    str = "light";
                } else {
                    str = "dark";
                }
                if (url.length() != 0) {
                    try {
                        parse = UriProtector.parse(url);
                    } catch (Throwable unused) {
                    }
                    if (UriProtector.getQueryParameter(parse, "color_theme") == null) {
                        String uri = parse.buildUpon().appendQueryParameter("color_theme", str).build().toString();
                        o.LJIIIIZZ(uri, "uri.buildUpon().appendQu…              .toString()");
                        t = uri;
                        c68322mC.element = t;
                    }
                }
                t = url;
                c68322mC.element = t;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ3 = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh2 = C24500xi.LIZIZ;
            if (LJJJZ3 == c24490xh2) {
                LJJJZ3 = new C91859a1P(interfaceC35811ar2, interfaceC88472Yns4, c68322mC, interfaceC88472Yns6);
                LJIL.LJLJLLL(LJJJZ3);
            }
            LJIL.LJJJJJ(false);
            WebViewClient webViewClient = (WebViewClient) LJJJZ3;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ4 = LJIL.LJJJZ();
            if (LJJJZ4 == c24490xh2) {
                LJJJZ4 = new C91858a1O(interfaceC35811ar, interfaceC88472Yns5);
                LJIL.LJLJLLL(LJJJZ4);
            }
            LJIL.LJJJJJ(false);
            WebChromeClient webChromeClient = (WebChromeClient) LJJJZ4;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ5 = LJIL.LJJJZ();
            Object obj = LJJJZ5;
            if (LJJJZ5 == c24490xh2) {
                InterfaceC92107a5P interfaceC92107a5P = C92111a5T.LIZ;
                if (interfaceC92107a5P != null) {
                    if (c11850dJ2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(C78897Uxp.LJJJZ(c11850dJ2.LIZ));
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = interfaceC92107a5P.LIZ(url, context, new C92110a5S(webChromeClient, webViewClient, valueOf, z2));
                    if (LIZ != null) {
                        LIZ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LIZ;
                        LJIL.LJLJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                        obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
                    }
                }
                WebView webView = new WebView(context);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                C16880lQ.LLZLI(webView, webViewClient);
                webView.setWebChromeClient(webChromeClient);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setJavaScriptEnabled(true);
                if (c11850dJ2 != null) {
                    webView.setBackgroundColor(C78897Uxp.LJJJZ(c11850dJ2.LIZ));
                }
                C16880lQ.LLZZ(webView, (String) c68322mC.element);
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = webView;
                LJIL.LJLJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
            }
            LJIL.LJJJJJ(false);
            View view = (View) obj;
            C24610xt.LIZIZ(C76800UCe.LIZ, new IDqS418S0100000_31(view, 66), LJIL);
            if (((CharSequence) c68322mC.element).length() > 0) {
                LJIL.LJJIIJ(1083587055);
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                LJIL.LJJIIJ(-483455358);
                C32371Ov c32371Ov = C0YW.LIZJ;
                InterfaceC07760Se.LJJJ.getClass();
                InterfaceC273215k LIZ2 = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
                LJIL.LJJIIJ(-1323940314);
                Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
                Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
                Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C24830yF.LIZ(LJIL, LIZ2, C03720Cq.LJ);
                    C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                    C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                    C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                    LJIL.LJIIIIZZ();
                    LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                    LJIL.LJJIIJ(2058660585);
                    LJIL.LJJIIJ(-1163856341);
                    C06500Ni.LIZLLL(C1P2.LIZ, !((Boolean) interfaceC35811ar2.getValue()).booleanValue(), null, null, null, null, C1DJ.LJ(LJIL, -819891729, new IDqS441S0100000_31(interfaceC35811ar, (InterfaceC35811ar<Integer>) 4)), LJIL, 1572870, 30);
                    C24920yO.LIZ(new IDqS418S0100000_31(view, 67), null, null, LJIL, 0, 6);
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                    LJIL.LJIJ();
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } else {
                LJIL.LJJIIJ(1083587497);
                C21430sl.LIZIZ("empty", C09290Yb.LJI(InterfaceC07790Sh.LJJJI), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, LJIL, 54, 0, 65532);
                LJIL.LJJJJJ(false);
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92673aEX(c11850dJ2, bool2, url, z2, interfaceC88472Yns4, interfaceC88472Yns5, interfaceC88472Yns6, i, i2);
    }
}
