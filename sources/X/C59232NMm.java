package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* renamed from: X.NMm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59232NMm extends FrameLayout {
    public static final /* synthetic */ int LJLJL = 0;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public SparkWebViewTouchDelegate LJLILLLLZI;
    public InterfaceC59236NMq LJLJI;
    public Activity LJLJJI;
    public WebKitView LJLJJL;
    public String LJLJJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59232NMm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void setIsAutoReleasableWhenDetached(boolean z) {
    }

    public final String getContainerId() {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null) {
            return sparkContext.containerId;
        }
        return null;
    }

    public final NVO getRootContainer() {
        NZ1 nz1;
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null) {
            nz1 = (NZ1) sparkContext.LIZIZ(NZ1.class);
        } else {
            nz1 = null;
        }
        if (!(nz1 instanceof NVO)) {
            return null;
        }
        return (NVO) nz1;
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
        return this.LJLJJI;
    }

    public final InterfaceC59236NMq getScrollListener() {
        return this.LJLJI;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS getSparkView() {
        return this.LJLIL;
    }

    public final WebKitView getWebView() {
        return this.LJLJJL;
    }

    @QD3
    public final void onJsBroadcast(C59231NMl event) {
        o.LJIIIZ(event, "event");
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LJLILLLLZI;
        if (sparkWebViewTouchDelegate != null) {
            sparkWebViewTouchDelegate.LIZJ(event);
        }
    }

    public final void setActivity(Activity activity) {
        this.LJLJJI = activity;
    }

    public final void setCanScrollVertically(boolean z) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LJLILLLLZI;
        if (sparkWebViewTouchDelegate == null) {
            return;
        }
        sparkWebViewTouchDelegate.LIZIZ = z;
    }

    public final void setEnableScrollControl(boolean z) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LJLILLLLZI;
        if (sparkWebViewTouchDelegate == null) {
            return;
        }
        sparkWebViewTouchDelegate.LIZJ = z;
    }

    public final void setOutTouchDelegate(View.OnTouchListener onTouchListener) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LJLILLLLZI;
        if (sparkWebViewTouchDelegate == null) {
            return;
        }
        sparkWebViewTouchDelegate.LIZLLL = onTouchListener;
    }

    public final void setScrollListener(InterfaceC59236NMq interfaceC59236NMq) {
        this.LJLJI = interfaceC59236NMq;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LJLIL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    public final void setWebView(WebKitView webKitView) {
        this.LJLJJL = webKitView;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        InterfaceC60761Nsz kitView;
        JSONObject LIZJ = C65232Piu.LIZJ("eventName", str);
        if (C78685UuP.LJJJZ(getContainerId())) {
            LIZJ.put("reactId", getContainerId());
        }
        LIZJ.put("data", jSONObject);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIJ("notification", C47261Igj.LJJIJ(LIZJ));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C59232NMm(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto L6
            r5 = r2
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r4, r0)
            r0 = 0
            r3.<init>(r4, r5, r0)
            X.NtS r1 = new X.NtS
            r0 = 62
            r1.<init>(r4, r2, r0)
            r3.LJLIL = r1
            r0 = -1
            r3.addView(r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59232NMm.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.net.Uri r8, android.os.Bundle r9, X.AbstractC60800Ntc r10) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.spark.IAdSparkUtils r1 = com.ss.android.ugc.aweme.spark.AdSparkUtils.LJFF()
            if (r1 == 0) goto L3e
            android.content.Context r2 = r7.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r3 = r8.toString()
            r5 = 0
            r6 = 16
            r4 = r9
            com.ss.android.ugc.aweme.spark.AdSparkContext r2 = X.NGQ.LIZ(r1, r2, r3, r4, r5, r6)
            if (r2 == 0) goto L3e
            if (r10 != 0) goto L24
            X.NMo r10 = new X.NMo
            r10.<init>(r7)
        L24:
            r2.LJJIL(r10)
        L27:
            X.NtS r1 = r7.LJLIL
            if (r1 == 0) goto L36
            X.N9O r0 = new X.N9O
            r0.<init>(r7)
            r2.LJJIJIIJI(r0)
            r1.LJIIJJI(r2)
        L36:
            X.NtS r0 = r7.LJLIL
            if (r0 == 0) goto L3d
            r0.LIZIZ()
        L3d:
            return
        L3e:
            com.bytedance.hybrid.spark.SparkContext r2 = new com.bytedance.hybrid.spark.SparkContext
            r2.<init>()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59232NMm.LIZ(android.net.Uri, android.os.Bundle, X.Ntc):void");
    }
}
