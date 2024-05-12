package X;

import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.NrU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60668NrU {
    public static boolean LJFF = true;
    public final Context LIZIZ;
    public MessageQueue LIZJ;
    public InterfaceC60696Nrw LJ;
    public final Object LIZ = new Object();
    public final java.util.Map<String, C60674Nra> LIZLLL = new HashMap();

    public C60668NrU(Context context) {
        this.LIZIZ = context;
    }

    public final void LIZ(int i) {
        synchronized (this.LIZ) {
            C60674Nra c60674Nra = (C60674Nra) ((HashMap) this.LIZLLL).get("pre_create_webview");
            if (c60674Nra == null) {
                return;
            }
            int size = ((ArrayList) c60674Nra.LIZ).size();
            c60674Nra.LIZJ = i;
            int i2 = 0;
            if (size < i) {
                while (i2 < i - size) {
                    LIZIZ(c60674Nra);
                    i2++;
                }
            } else {
                while (i2 < size - i) {
                    C1JI.LJIIIIZZ((InterfaceC60761Nsz) ((SoftReference) ((ArrayList) c60674Nra.LIZ).remove((size - 1) - i2)).get(), this.LIZIZ);
                    i2++;
                }
            }
        }
    }

    public final void LIZIZ(C60674Nra c60674Nra) {
        MessageQueue messageQueue = this.LIZJ;
        if (messageQueue != null) {
            C16880lQ.LJLI(messageQueue, new C60669NrV(this, c60674Nra));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.LIZJ = C16880lQ.LLJJJJ().getQueue();
            LIZIZ(c60674Nra);
        } else if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LIZJ = Looper.myQueue();
            LIZIZ(c60674Nra);
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS29S0200000_10(c60674Nra, this, 42));
        }
    }
}
