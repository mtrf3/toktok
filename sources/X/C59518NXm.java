package X;

import Y.ACListenerS30S0100000_10;
import Y.IDTListenerS119S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NXm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59518NXm extends FrameLayout implements GenericLifecycleObserver, NZX {
    public static final /* synthetic */ int LJZ = 0;
    public C59525NXt LJLIL;
    public AdPopUpWebPageContainer LJLILLLLZI;
    public boolean LJLJI;
    public NWW LJLJJI;
    public NYQ LJLJJL;
    public NYO LJLJJLL;
    public NYP LJLJL;
    public InterfaceC65784Pro<? extends Object> LJLJLJ;
    public final C44428Hc8 LJLJLLL;
    public boolean LJLL;
    public C59529NXx LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C59519NXn LJLLJ;
    public final NXC LJLLL;
    public final IDTListenerS119S0100000_10 LJLLLL;
    public final NY9 LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ = new LinkedHashMap();

    public final View LIZIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.NZX
    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // X.NZX
    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
        return false;
    }

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final NXA getLoadListener() {
        return (NXA) this.LJLLILLLL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.LJLILLLLZI;
        if (adPopUpWebPageContainer != null) {
            adPopUpWebPageContainer.LJLJJLL.getLifecycle().removeObserver(adPopUpWebPageContainer);
            adPopUpWebPageContainer.LJ();
            if (adPopUpWebPageContainer.LJLJLLL) {
                adPopUpWebPageContainer.LJLJLJ = false;
                adPopUpWebPageContainer.LJLILLLLZI.LIZJ(adPopUpWebPageContainer.LJLIL);
                adPopUpWebPageContainer.LJLJJL.getClass();
            }
        }
        super.onDetachedFromWindow();
        C59525NXt c59525NXt = this.LJLIL;
        if (c59525NXt != null) {
            c59525NXt.enable(false);
        }
        this.LJLIL = null;
    }

    public final boolean LIZLLL() {
        C59520NXo c59520NXo = (C59520NXo) LIZIZ(R.id.hx7);
        if (c59520NXo == null) {
            return false;
        }
        int i = c59520NXo.LLFII.LJIIIIZZ;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final C59521NXp getActionMode() {
        return ((C59520NXo) LIZIZ(R.id.hx7)).getActionMode();
    }

    public final NZR getWebView() {
        return ((NXI) ((NZQ) LIZIZ(R.id.hxh)).LJI(NXI.class)).LIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Bundle bundle;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        LifecycleOwner lifecycleOwner;
        super.onAttachedToWindow();
        NWW nww = this.LJLJJI;
        if (nww == null || (bundle = nww.LIZLLL) == null) {
            return;
        }
        bundle.putBoolean("show_load_dialog", false);
        View.inflate(getContext(), R.layout.bbl, this);
        View LIZIZ = LIZIZ(R.id.hfe);
        ViewGroup.LayoutParams layoutParams = LIZIZ.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
        NWW nww2 = this.LJLJJI;
        if (nww2 != null) {
            i = nww2.LIZJ;
        } else {
            i = 0;
        }
        marginLayoutParams3.topMargin = i;
        LIZIZ.requestLayout();
        C60996Nwm.LJIIIIZZ(getContext());
        C60996Nwm.LJ(getContext());
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C63081OpJ.LJJJJLI(context);
        C59520NXo c59520NXo = (C59520NXo) LIZIZ(R.id.hx7);
        View pop_up_web_round_layout = LIZIZ(R.id.hxm);
        o.LJIIIIZZ(pop_up_web_round_layout, "pop_up_web_round_layout");
        c59520NXo.getClass();
        ViewGroup.LayoutParams layoutParams2 = pop_up_web_round_layout.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((C06F) layoutParams2).LIZIZ(c59520NXo.LLFII);
        ((NZQ) LIZIZ(R.id.hxh)).setCustomWebViewStatus(this);
        ((NXI) ((NZQ) LIZIZ(R.id.hxh)).LJI(NXI.class)).LIZ().setWebScrollListener(new C59531NXz(this));
        ((NZQ) LIZIZ(R.id.hxh)).setShouldShowProgressBarBg(false);
        C7FC.LIZIZ(LIZIZ(R.id.hxl));
        View LIZIZ2 = LIZIZ(R.id.c4e);
        if (LIZIZ2 != null) {
            LIZIZ2.setVisibility(8);
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context2);
        if (LJIJJ != null) {
            this.LJLIL = new C59525NXt(LJIJJ, this);
            NWW nww3 = this.LJLJJI;
            if (nww3 != null && (lifecycleOwner = nww3.LIZIZ) != null) {
                NZQ pop_up_web_page_webview = (NZQ) LIZIZ(R.id.hxh);
                o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
                this.LJLILLLLZI = C59483NWd.LIZ(LJIJJ, pop_up_web_page_webview, getLoadListener(), bundle, lifecycleOwner);
            }
            ((C59520NXo) LIZIZ(R.id.hx7)).setCallback(this.LJLLJ);
            ((C59520NXo) LIZIZ(R.id.hx7)).getBehavior().LJIJJLI = true;
            C16880lQ.LJJJJI((TuxTextView) LIZIZ(R.id.hxl), new ACListenerS30S0100000_10(this, 98));
            ((C2UA) LIZIZ(R.id.hxq)).setTitleBarListener(this.LJLLLLLL);
            LIZIZ(R.id.hxq).setOnTouchListener(new IDTListenerS119S0100000_10(this, 5));
            ((NZQ) LIZIZ(R.id.hxh)).setWebViewTouchListener(this.LJLLLL);
            int LJIILL = C17N.LJIILL(52.5d);
            View pop_up_web_page_webview2 = LIZIZ(R.id.hxh);
            o.LJIIIIZZ(pop_up_web_page_webview2, "pop_up_web_page_webview");
            ViewGroup.LayoutParams layoutParams3 = pop_up_web_page_webview2.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams2.topMargin = LJIILL;
                pop_up_web_page_webview2.setLayoutParams(marginLayoutParams2);
            }
            View pop_up_web_network_error_view = LIZIZ(R.id.hxg);
            o.LJIIIIZZ(pop_up_web_network_error_view, "pop_up_web_network_error_view");
            ViewGroup.LayoutParams layoutParams4 = pop_up_web_network_error_view.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.topMargin = LJIILL;
                pop_up_web_network_error_view.setLayoutParams(marginLayoutParams);
            }
        }
        InterfaceC65784Pro<? extends Object> interfaceC65784Pro = this.LJLJLJ;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final NYP getKeyDownCallBack() {
        return this.LJLJL;
    }

    public final NYO getMBehaviorCallback() {
        return this.LJLJJLL;
    }

    public final NWW getParams() {
        return this.LJLJJI;
    }

    public final NYQ getTitleBarCallback() {
        return this.LJLJJL;
    }

    public C59518NXm(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        this.LJLJLLL = new C44428Hc8();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 423));
        this.LJLLJ = new C59519NXn(activityC45651qj, this);
        this.LJLLL = new NXC(activityC45651qj, this);
        this.LJLLLL = new IDTListenerS119S0100000_10(this, 6);
        this.LJLLLLLL = new NY9(this);
    }

    public final void LIZJ(boolean z) {
        if (!z) {
            NZQ pop_up_web_page_webview = (NZQ) LIZIZ(R.id.hxh);
            o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
            NZQ.LJIJI(pop_up_web_page_webview, "about:blank", false, null, 14);
        }
        AdPopUpWebBottomSheetBehavior<C59520NXo> adPopUpWebBottomSheetBehavior = ((C59520NXo) LIZIZ(R.id.hx7)).LLFII;
        int i = adPopUpWebBottomSheetBehavior.LJIIIIZZ;
        if (i == 3 || i == 4) {
            adPopUpWebBottomSheetBehavior.setState(5);
        }
        C9UE.LIZIZ(getContext());
    }

    public final void LJI(String str) {
        NWW nww;
        this.LJLL = false;
        if (str == null && ((nww = this.LJLJJI) == null || (str = nww.LIZ) == null)) {
            return;
        }
        String uri = UriProtector.parse(str).buildUpon().appendQueryParameter("hide_loading", "1").build().toString();
        o.LJIIIIZZ(uri, "parse(url)\n            .…)\n            .toString()");
        NZQ pop_up_web_page_webview = (NZQ) LIZIZ(R.id.hxh);
        o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
        NZQ.LJIJI(pop_up_web_page_webview, uri, false, null, 14);
    }

    public final void LJII(int i) {
        if (this.LJLJI || this.LJLL) {
            return;
        }
        this.LJLL = true;
        C59529NXx c59529NXx = this.LJLLI;
        if (c59529NXx != null) {
            String str = c59529NXx.LIZJ.get("EVENT_NAME_WHEN_REQUEST");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : c59529NXx.LIZJ.entrySet()) {
                if (!o.LJ(entry.getKey(), "EVENT_NAME_WHEN_REQUEST") && !o.LJ(entry.getKey(), "EVENT_NAME_FOR_STAY")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.put("status", String.valueOf(i));
            linkedHashMap.put("duration", String.valueOf(this.LJLJLLL.LIZIZ(TimeUnit.MILLISECONDS)));
            if (C78857UxB.LJJJIL(str)) {
                FMX.LJIIL(str, linkedHashMap);
            }
        }
    }

    public final void setKeyDownCallBack(NYP nyp) {
        this.LJLJL = nyp;
    }

    public final void setMBehaviorCallback(NYO nyo) {
        this.LJLJJLL = nyo;
    }

    public final void setParams(NWW nww) {
        this.LJLJJI = nww;
    }

    public final void setTitleBarCallback(NYQ nyq) {
        this.LJLJJL = nyq;
    }

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        String str2;
        LIZIZ(R.id.hx6).setVisibility(8);
        String str3 = null;
        if (webView != null) {
            str2 = webView.getTitle();
        } else {
            str2 = null;
        }
        if (!C78857UxB.LJJJIL(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            if (ujb.o.LJJJLIIL(str2, "about:blank", true)) {
                ((TextView) LIZIZ(R.id.hxp)).setText("");
                LIZJ(true);
                return;
            }
            ((TextView) LIZIZ(R.id.hxp)).setText(str2);
        }
        if (webView != null) {
            str3 = webView.getUrl();
        }
        if (C78857UxB.LJJJIL(str3) && str3 != null) {
            if (ujb.o.LJJJLIIL(str3, "about:blank", true)) {
                ((TextView) LIZIZ(R.id.hxo)).setText("");
            } else {
                ((TextView) LIZIZ(R.id.hxo)).setText(str3);
            }
        }
        if (this.LJLJLLL.LIZIZ) {
            LJII(1);
        }
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.LJLJLLL.LIZIZ) {
            LJII(0);
        }
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
        LIZIZ(R.id.hx6).setVisibility(0);
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        if (this.LJLJLLL.LIZIZ) {
            LJII(0);
        }
    }
}
