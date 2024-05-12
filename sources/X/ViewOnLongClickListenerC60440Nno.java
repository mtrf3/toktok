package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Nno, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLongClickListenerC60440Nno implements View.OnLongClickListener {
    public final /* synthetic */ C60407NnH LJLIL;

    public ViewOnLongClickListenerC60440Nno(C60407NnH c60407NnH) {
        this.LJLIL = c60407NnH;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView webView;
        WebView.HitTestResult hitTestResult;
        if ((view instanceof WebView) && (hitTestResult = (webView = (WebView) view).getHitTestResult()) != null && webView.getSettings() != null && (hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
            String extra = hitTestResult.getExtra();
            Context context = webView.getContext();
            if (extra != null && context != null && C40680Fxs.LIZIZ(extra)) {
                this.LJLIL.getClass();
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null) {
                    C245319jz c245319jz = new C245319jz();
                    C252669vq c252669vq = new C252669vq();
                    c252669vq.LIZIZ(context.getString(R.string.tw1));
                    c252669vq.LJ = new O1B(context, extra);
                    c245319jz.LIZIZ(c252669vq);
                    c245319jz.LIZJ().show(LJJIFFI.getSupportFragmentManager(), "saveImage");
                }
                return true;
            }
        }
        return false;
    }
}
