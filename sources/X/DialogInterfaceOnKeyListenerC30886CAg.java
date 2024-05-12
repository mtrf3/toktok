package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;

/* renamed from: X.CAg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnKeyListenerC30886CAg implements DialogInterface.OnKeyListener {
    public final /* synthetic */ HybridDialogFragment LJLIL;

    public DialogInterfaceOnKeyListenerC30886CAg(HybridDialogFragment hybridDialogFragment) {
        this.LJLIL = hybridDialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && this.LJLIL.LLIIJI.re() != null) {
            View re = this.LJLIL.LLIIJI.re();
            if (re instanceof WebView) {
                WebView webView = (WebView) re;
                if (webView.canGoBack()) {
                    webView.goBack();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
