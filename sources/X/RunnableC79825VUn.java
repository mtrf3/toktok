package X;

import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.VUn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC79825VUn implements Runnable {
    public final WeakReference<C79826VUo> LJLIL;

    public final void LIZ() {
        boolean equals;
        C79826VUo c79826VUo = this.LJLIL.get();
        if (c79826VUo == null) {
            return;
        }
        c79826VUo.LIZJ = null;
        while (c79826VUo.LIZLLL.size() > 0) {
            C79827VUp removeFirst = c79826VUo.LIZLLL.removeFirst();
            if (c79826VUo.LJI(removeFirst)) {
                Iterator<C79827VUp> it = c79826VUo.LIZLLL.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C79827VUp next = it.next();
                        if (c79826VUo.LJ(removeFirst, next)) {
                            c79826VUo.LIZLLL.remove(next);
                            break;
                        }
                    } else {
                        Iterator<C79827VUp> it2 = c79826VUo.LJ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C79827VUp next2 = it2.next();
                                if (c79826VUo.LJ(removeFirst, next2)) {
                                    c79826VUo.LJ.remove(next2);
                                    break;
                                }
                            } else if (c79826VUo.LJI(removeFirst)) {
                                UIComponent uIComponent = removeFirst.LIZ.LJLIL.LJLILLLLZI;
                                if (uIComponent == null || uIComponent.getEvents() == null) {
                                    if (c79826VUo.LJFF) {
                                        equals = "nodedisappear".equals(removeFirst.LIZIZ);
                                    }
                                } else {
                                    equals = uIComponent.getEvents().containsKey(removeFirst.LIZIZ);
                                }
                                if (equals && c79826VUo.LJI(removeFirst)) {
                                    VUO vuo = new VUO(removeFirst.LJ, removeFirst.LIZIZ);
                                    vuo.LIZJ(Integer.valueOf(removeFirst.LIZJ), "position");
                                    vuo.LIZJ(removeFirst.LIZLLL, "key");
                                    c79826VUo.LIZ.LIZIZ(vuo);
                                }
                            }
                        }
                    }
                }
            }
        }
        c79826VUo.LIZLLL = c79826VUo.LJ;
        c79826VUo.LJ = new LinkedList<>();
        if (c79826VUo.LIZLLL.size() > 0) {
            c79826VUo.LJFF();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC79825VUn(C79826VUo c79826VUo) {
        this.LJLIL = new WeakReference<>(c79826VUo);
    }
}
