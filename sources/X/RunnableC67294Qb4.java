package X;

import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Qb4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67294Qb4 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    public final void LIZ() {
        synchronized (this.LJLILLLLZI) {
            try {
                AtomicReference atomicReference = (AtomicReference) this.LJLILLLLZI;
                Object obj = this.LJLJI;
                atomicReference.set(Long.valueOf(((C68082Qnm) obj).LIZ.LJI.LJIIJJI(((C68082Qnm) obj).LIZ.LJIILJJIL().LJIIJ(), C68555QvP.LJJIZ)));
            } finally {
                ((AtomicReference) this.LJLILLLLZI).notify();
            }
        }
    }

    public final void LIZIZ() {
        synchronized (((C67651Qgp) this.LJLJI).LJLILLLLZI) {
            Object obj = this.LJLJI;
            if (((C67651Qgp) obj).LJLJI != null) {
                ((C67651Qgp) obj).LJLJI.onSuccess(((AbstractC67638Qgc) this.LJLILLLLZI).LJIIIZ());
            }
        }
    }

    public final void LIZJ() {
        C208108Es c208108Es;
        Reference reference = (Reference) this.LJLILLLLZI;
        ConcurrentHashMap concurrentHashMap = null;
        if (reference != null) {
            c208108Es = (C208108Es) reference.get();
        } else {
            c208108Es = null;
        }
        Reference reference2 = (Reference) this.LJLJI;
        if (reference2 != null) {
            concurrentHashMap = (ConcurrentHashMap) reference2.get();
        }
        if (c208108Es != null && concurrentHashMap != null) {
            Iterator it = ((ArrayList) c208108Es.LIZ).iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                Object first = osz.getFirst();
                int intValue = ((Number) osz.getSecond()).intValue();
                int intValue2 = ((Number) first).intValue();
                LinkedList linkedList = (LinkedList) concurrentHashMap.get(Integer.valueOf(intValue2));
                if (linkedList != null) {
                    if (linkedList.size() <= intValue) {
                        concurrentHashMap.remove(Integer.valueOf(intValue2));
                    } else {
                        synchronized (linkedList) {
                            int i = 0;
                            while (true) {
                                if (i >= intValue) {
                                    break;
                                } else if (((View) linkedList.poll()) == null) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        boolean LIZ2;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            case 1:
                try {
                    LIZIZ();
                    return;
                } finally {
                    if (LIZ2) {
                    }
                }
            default:
                try {
                    LIZJ();
                    return;
                } finally {
                    if (C39223FaN.LIZ(th)) {
                        return;
                    }
                }
        }
    }

    public RunnableC67294Qb4(C208108Es target, ConcurrentHashMap viewCaches) {
        this.LJLIL = 2;
        o.LJIIIZ(target, "target");
        o.LJIIIZ(viewCaches, "viewCaches");
        this.LJLILLLLZI = new WeakReference(target);
        this.LJLJI = new WeakReference(viewCaches);
    }

    public /* synthetic */ RunnableC67294Qb4(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
