package X;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import ujb.s;

/* renamed from: X.NsG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60716NsG extends C60404NnE {
    public View LJLIL;
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public final /* synthetic */ InterfaceC60718NsI LJLJI;
    public final /* synthetic */ SparkContext LJLJJI;

    @Override // X.AbstractC60402NnC
    public final void onHideCustomView() {
        super.onHideCustomView();
        InterfaceC60717NsH interfaceC60717NsH = (InterfaceC60717NsH) this.LJLJJI.LIZIZ(InterfaceC60717NsH.class);
        if (interfaceC60717NsH != null) {
            interfaceC60717NsH.LIZ();
            return;
        }
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        C16880lQ.LJZ(view, this.LJLILLLLZI);
        this.LJLIL = null;
    }

    @Override // X.AbstractC60402NnC
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C37682Eqc.LIZIZ(this.LJLJJI, "SparkView", KMP.LJ("webview newProgress = ", i));
        InterfaceC60721NsL interfaceC60721NsL = this.LJLILLLLZI.LJLLILLLL;
        if (interfaceC60721NsL != null) {
            interfaceC60721NsL.LIZIZ(((int) (i * 0.9f)) + 10);
        }
    }

    @Override // X.AbstractC60402NnC
    public final void onReceivedTitle(WebView webView, String str) {
        String url;
        super.onReceivedTitle(webView, str);
        if (str == null || str.length() == 0 || (webView != null && (url = webView.getUrl()) != null && s.LJJJLZIJ(url, str, false))) {
            InterfaceC60718NsI interfaceC60718NsI = this.LJLJI;
            if (interfaceC60718NsI != null) {
                interfaceC60718NsI.LIZIZ("");
                return;
            }
            return;
        }
        InterfaceC60718NsI interfaceC60718NsI2 = this.LJLJI;
        if (interfaceC60718NsI2 == null) {
            return;
        }
        interfaceC60718NsI2.LIZIZ(str);
    }

    @Override // X.AbstractC60402NnC
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        if (view != null) {
            InterfaceC60717NsH interfaceC60717NsH = (InterfaceC60717NsH) this.LJLJJI.LIZIZ(InterfaceC60717NsH.class);
            if (interfaceC60717NsH != null) {
                interfaceC60717NsH.LIZIZ(view);
            } else {
                this.LJLIL = view;
                this.LJLILLLLZI.addView(view);
            }
        }
    }

    public C60716NsG(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, InterfaceC60718NsI interfaceC60718NsI, SparkContext sparkContext) {
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLJI = interfaceC60718NsI;
        this.LJLJJI = sparkContext;
    }
}
