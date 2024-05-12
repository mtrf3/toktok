package X;

import Y.ARunnableS33S0200000_14;
import android.os.Handler;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VMR {
    public volatile AtomicInteger LIZ;
    public final Handler LIZIZ;
    public boolean LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public final WeakReference<WebView> LJFF;
    public final long LJI;
    public final int LJII;
    public InterfaceC79625VMv LJIIIIZZ;

    public final void LIZ(AtomicInteger atomicInteger) {
        WebView webView;
        if (this.LJ && (webView = this.LJFF.get()) != null) {
            this.LIZIZ.post(new ARunnableS33S0200000_14(atomicInteger, this, 102));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("infinite = ");
            LIZ.append(atomicInteger.get() + 1);
            webView.evaluateJavascript(X1D.LIZIZ(LIZ), new C79614VMk(this));
            this.LIZIZ.postDelayed(new ARunnableS33S0200000_14(atomicInteger, this, 103), this.LJI);
        }
    }

    public VMR(WeakReference webviewRef, long j, int i, VM7 vm7) {
        o.LJIIJ(webviewRef, "webviewRef");
        this.LJFF = webviewRef;
        this.LJI = j;
        this.LJII = i;
        this.LJIIIIZZ = vm7;
        this.LIZ = new AtomicInteger(0);
        this.LIZIZ = new Handler(C16880lQ.LLJJJJ());
        this.LIZLLL = "var infinite = 1";
        this.LJ = true;
    }
}
