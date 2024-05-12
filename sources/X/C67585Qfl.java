package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Qfl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67585Qfl<T extends IInterface> {
    public static final java.util.Map<String, Handler> LJIIJJI = new HashMap();
    public final Context LIZ;
    public final C13T LIZIZ;
    public final String LIZJ;
    public boolean LJ;
    public final Intent LJFF;
    public final InterfaceC40572Fw8<T> LJI;
    public ServiceConnectionC67589Qfp LJIIIZ;
    public T LJIIJ;
    public final List<AbstractRunnableC40619Fwt> LIZLLL = new ArrayList();
    public final C67577Qfd LJIIIIZZ = new C67577Qfd(0, this);
    public final WeakReference<InterfaceC67581Qfh> LJII = new WeakReference<>(null);

    public C67585Qfl(Context context, C13T c13t, String str, Intent intent, InterfaceC40572Fw8<T> interfaceC40572Fw8) {
        this.LIZ = context;
        this.LIZIZ = c13t;
        this.LIZJ = str;
        this.LJFF = intent;
        this.LJI = interfaceC40572Fw8;
    }

    public final void LIZ(AbstractRunnableC40619Fwt abstractRunnableC40619Fwt) {
        LIZJ(new C67584Qfk(this, abstractRunnableC40619Fwt.LJLIL, abstractRunnableC40619Fwt));
    }

    public final void LIZIZ() {
        LIZJ(new C67587Qfn(this));
    }

    public final void LIZJ(AbstractRunnableC40619Fwt abstractRunnableC40619Fwt) {
        Handler handler;
        java.util.Map<String, Handler> map = LJIIJJI;
        synchronized (map) {
            if (!((HashMap) map).containsKey(this.LIZJ)) {
                HandlerThread handlerThread = new HandlerThread(this.LIZJ, 10);
                handlerThread.start();
                ((HashMap) map).put(this.LIZJ, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) ((HashMap) map).get(this.LIZJ);
        }
        handler.post(abstractRunnableC40619Fwt);
    }
}
