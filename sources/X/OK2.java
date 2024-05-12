package X;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes11.dex */
public final class OK2 extends WebView {
    @Override // android.webkit.WebView
    public final boolean canGoBack() {
        if (super.canGoBack() && C59312NPo.LIZIZ(this)) {
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        if (C59312NPo.LJ(this)) {
            return;
        }
        super.goBack();
    }

    public OK2(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException unused) {
        }
    }
}
