package X;

import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.No7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60459No7 {
    public final Context LIZIZ;
    public MessageQueue LIZJ;
    public final Object LIZ = new Object();
    public final java.util.Map<String, C60461No9> LIZLLL = new HashMap();

    public C60459No7(Context context) {
        this.LIZIZ = context;
    }

    public final void LIZIZ(C60461No9 c60461No9) {
        MessageQueue messageQueue = this.LIZJ;
        if (messageQueue != null) {
            C16880lQ.LJLI(messageQueue, new C60460No8(this, c60461No9));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.LIZJ = C16880lQ.LLJJJJ().getQueue();
            LIZIZ(c60461No9);
        } else if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LIZJ = Looper.myQueue();
            LIZIZ(c60461No9);
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS29S0200000_10(c60461No9, this, 55));
        }
    }

    public final void LIZ(int i, String str) {
        synchronized (this.LIZ) {
            C60461No9 c60461No9 = (C60461No9) ((HashMap) this.LIZLLL).get(str);
            if (c60461No9 == null) {
                return;
            }
            int size = ((ArrayList) c60461No9.LIZ).size();
            c60461No9.LIZJ = i;
            int i2 = 0;
            if (size < i) {
                while (i2 < i - size) {
                    LIZIZ(c60461No9);
                    i2++;
                }
            } else {
                while (i2 < size - i) {
                    WebView webView = (WebView) ((SoftReference) ((ArrayList) c60461No9.LIZ).remove((size - 1) - i2)).get();
                    Context context = this.LIZIZ;
                    if (webView != null) {
                        webView.stopLoading();
                        if (context != null) {
                            Context context2 = webView.getContext();
                            if (context2 instanceof MutableContextWrapper) {
                                ((MutableContextWrapper) context2).setBaseContext(context);
                            }
                        }
                        C16880lQ.LLZZ(webView, "about:blank");
                        webView.destroy();
                    }
                    i2++;
                }
            }
        }
    }
}
