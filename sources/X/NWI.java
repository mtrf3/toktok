package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import defpackage.a1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class NWI extends FrameLayout {
    public static final /* synthetic */ int LJLLL = 0;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public C60723NsN LJLILLLLZI;
    public AtomicBoolean LJLJI;
    public AdSparkContext LJLJJI;
    public InterfaceC59221NMb LJLJJL;
    public Activity LJLJJLL;
    public WebKitView LJLJL;
    public long LJLJLJ;
    public boolean LJLJLLL;
    public C59222NMc LJLL;
    public View.OnTouchListener LJLLI;
    public InterfaceC59494NWo LJLLILLLL;
    public NUM LJLLJ;

    @QD3
    public final void onJsBroadcast(C59231NMl event) {
        o.LJIIIZ(event, "event");
    }

    public final String getContainerId() {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null) {
            return sparkContext.containerId;
        }
        return null;
    }

    public final String getCurrentUrl() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCurrentUrl: ");
        WebKitView webKitView = this.LJLJL;
        if (webKitView != null) {
            str = webKitView.getUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        C59500NWu.LIZ(X1D.LIZIZ(LIZ));
        WebKitView webKitView2 = this.LJLJL;
        if (webKitView2 == null) {
            return null;
        }
        return webKitView2.getUrl();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
    }

    public final Activity getActivity() {
        return this.LJLJJLL;
    }

    public final C59222NMc getAdWebModel() {
        return this.LJLL;
    }

    public final NUM getIAdWebBottomBar() {
        return this.LJLLJ;
    }

    public final InterfaceC59494NWo getIAdWebTitleBar() {
        return this.LJLLILLLL;
    }

    public final InterfaceC59221NMb getScrollListener() {
        return this.LJLJJL;
    }

    public final AdSparkContext getSparkContext() {
        return this.LJLJJI;
    }

    public final C60723NsN getSparkCustomView() {
        return this.LJLILLLLZI;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS getSparkView() {
        return this.LJLIL;
    }

    public final View.OnTouchListener getTouchListener() {
        return this.LJLLI;
    }

    public final WebKitView getWebView() {
        return this.LJLJL;
    }

    public final void LIZ(String str) {
        InterfaceC60770Nt8 interfaceC60770Nt8;
        WebBackForwardList webBackForwardList;
        AdSparkContext adSparkContext = this.LJLJJI;
        if (adSparkContext != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) adSparkContext.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            WebKitView webKitView = this.LJLJL;
            WebKitView webKitView2 = null;
            if (webKitView != null) {
                webBackForwardList = webKitView.copyBackForwardList();
            } else {
                webBackForwardList = null;
            }
            WebKitView webKitView3 = this.LJLJL;
            if (webKitView3 != null) {
                webKitView2 = webKitView3;
            }
            interfaceC60770Nt8.LJIILJJIL(webBackForwardList, webKitView2, str);
        }
    }

    public final void setActivity(Activity activity) {
        this.LJLJJLL = activity;
    }

    public final void setAdWebModel(C59222NMc c59222NMc) {
        this.LJLL = c59222NMc;
    }

    public final void setIAdWebBottomBar(NUM num) {
        this.LJLLJ = num;
    }

    public final void setIAdWebTitleBar(InterfaceC59494NWo interfaceC59494NWo) {
        this.LJLLILLLL = interfaceC59494NWo;
    }

    public final void setPrepared(AtomicBoolean atomicBoolean) {
        o.LJIIIZ(atomicBoolean, "<set-?>");
        this.LJLJI = atomicBoolean;
    }

    public final void setScrollListener(InterfaceC59221NMb interfaceC59221NMb) {
        this.LJLJJL = interfaceC59221NMb;
    }

    public final void setSparkContext(AdSparkContext adSparkContext) {
        this.LJLJJI = adSparkContext;
    }

    public final void setSparkCustomView(C60723NsN c60723NsN) {
        this.LJLILLLLZI = c60723NsN;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LJLIL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.LJLLI = onTouchListener;
    }

    public final void setWebView(WebKitView webKitView) {
        this.LJLJL = webKitView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NWI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = new AtomicBoolean(false);
        C60723NsN c60723NsN = new C60723NsN(context);
        this.LJLILLLLZI = c60723NsN;
        this.LJLIL = c60723NsN.getSparkView();
        addView(this.LJLILLLLZI, -1, -1);
    }
}
