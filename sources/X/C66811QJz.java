package X;

import Y.ARunnableS22S0300000_11;
import Y.ARunnableS30S0200000_11;
import android.os.Looper;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.QJz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66811QJz {
    public final Object LIZ = new Object();
    public final Object LIZIZ = new Object();
    public final ConcurrentHashMap<Type, QKT> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractC66813QKb, Object> LIZLLL = new ConcurrentHashMap<>();

    public final <Event> void LIZ(Event event) {
        QKT qkt;
        if (Looper.myLooper() != JFV.LIZJ(null)) {
            JFV.LIZLLL(new ARunnableS30S0200000_11(this, event, 44), null);
            return;
        }
        synchronized (this.LIZ) {
            qkt = this.LIZJ.get(event.getClass());
            if (qkt == null) {
                qkt = new QKT();
                this.LIZJ.put(event.getClass(), qkt);
            }
        }
        qkt.LIZ = event;
        for (InterfaceC66822QKk interfaceC66822QKk : qkt.LIZIZ.keySet()) {
            if (interfaceC66822QKk != null) {
                interfaceC66822QKk.LIZ(event);
            }
        }
    }

    public final void LIZJ(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (this.LIZ) {
            Iterator<AbstractC66813QKb> it = this.LIZLLL.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC66813QKb next = it.next();
                if (next.LIZ == obj) {
                    LIZJ(next);
                    this.LIZLLL.remove(next);
                    break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <EVENT> void LIZIZ(boolean z, InterfaceC66822QKk<EVENT> interfaceC66822QKk) {
        Object obj;
        Type type = ((ParameterizedType) interfaceC66822QKk.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        synchronized (this.LIZ) {
            QKT qkt = this.LIZJ.get(type);
            if (qkt == null) {
                qkt = new QKT();
                this.LIZJ.put(type, qkt);
            }
            qkt.LIZIZ.put(interfaceC66822QKk, this.LIZIZ);
            this.LIZLLL.put((AbstractC66813QKb) interfaceC66822QKk, this.LIZIZ);
            if (z && (obj = qkt.LIZ) != null) {
                JFV.LIZLLL(new ARunnableS22S0300000_11(obj, qkt, interfaceC66822QKk, 7), null);
            }
        }
    }
}
