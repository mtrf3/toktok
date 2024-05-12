package X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: X.EzM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ViewOnAttachStateChangeListenerC38224EzM implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            C38222EzK c38222EzK = C38222EzK.LJI;
            c38222EzK.getClass();
            try {
                c38222EzK.LIZIZ(webView);
            } catch (Exception unused) {
                C70657RoD.LJIILL();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            C38222EzK c38222EzK = C38222EzK.LJI;
            c38222EzK.getClass();
            try {
                c38222EzK.LIZIZ(webView);
            } catch (Exception unused) {
                C70657RoD.LJIILL();
            }
            C38222EzK c38222EzK2 = C38222EzK.LJI;
            c38222EzK2.getClass();
            try {
                c38222EzK2.LIZIZ(webView);
            } catch (Exception unused2) {
                C70657RoD.LJIILL();
            }
        }
    }
}
