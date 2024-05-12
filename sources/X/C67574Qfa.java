package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Qfa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67574Qfa {
    public static final java.util.Map LJIILIIL = new HashMap();
    public final Context LIZ;
    public final C67554QfG LIZIZ;
    public boolean LJI;
    public final Intent LJII;
    public ServiceConnectionC67578Qfe LJIIJJI;
    public IInterface LJIIL;
    public final List LIZLLL = new ArrayList();
    public final java.util.Set LJ = new HashSet();
    public final Object LJFF = new Object();
    public final C67577Qfd LJIIIZ = new C67577Qfd(1, this);
    public final AtomicInteger LJIIJ = new AtomicInteger(0);
    public final String LIZJ = "IntegrityService";
    public final WeakReference LJIIIIZZ = new WeakReference(null);

    public final Handler LIZ() {
        Handler handler;
        java.util.Map map = LJIILIIL;
        synchronized (map) {
            if (!((HashMap) map).containsKey(this.LIZJ)) {
                HandlerThread handlerThread = new HandlerThread(this.LIZJ, 10);
                handlerThread.start();
                ((HashMap) map).put(this.LIZJ, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) ((HashMap) map).get(this.LIZJ);
        }
        return handler;
    }

    public final void LIZIZ() {
        synchronized (this.LJFF) {
            Iterator it = ((HashSet) this.LJ).iterator();
            while (it.hasNext()) {
                ((C67649Qgn) it.next()).LIZJ(new RemoteException(String.valueOf(this.LIZJ).concat(" : Binder has died.")));
            }
            ((HashSet) this.LJ).clear();
        }
    }

    public C67574Qfa(Context context, C67554QfG c67554QfG, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = c67554QfG;
        this.LJII = intent;
    }
}
