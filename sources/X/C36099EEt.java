package X;

import Y.ARunnableS12S1000000_6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EEt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36099EEt implements InterfaceC36091EEl {
    public final C36100EEu LJLIL = new C36100EEu();

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        List<String> list = this.LJLIL.get();
        o.LJI(list);
        ArrayList arrayList = new ArrayList(list);
        List<String> list2 = this.LJLIL.get();
        if (list2 != null) {
            list2.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C37179EiV.LJFF.post(new ARunnableS12S1000000_6((String) it.next(), 8));
        }
    }

    @Override // X.InterfaceC36091EEl
    public final EEY LIZLLL(EEY bean) {
        Object obj;
        o.LJIIIZ(bean, "bean");
        C36093EEn.LIZ.getClass();
        C36098EEs c36098EEs = C36093EEn.LJ;
        String key = bean.key();
        o.LJIIIIZZ(key, "bean.key()");
        c36098EEs.getClass();
        synchronized (c36098EEs.LIZIZ) {
            obj = ((ConcurrentHashMap) c36098EEs.LIZIZ).get(key);
        }
        if (obj == null) {
            obj = c36098EEs.LIZ(key);
        }
        return (EEY) obj;
    }

    @Override // X.InterfaceC36091EEl
    public final void LJ(EEY bean) {
        o.LJIIIZ(bean, "bean");
        String inflateName = bean.key();
        C36093EEn.LIZ.getClass();
        C36098EEs c36098EEs = C36093EEn.LJ;
        o.LJIIIIZZ(inflateName, "inflateName");
        c36098EEs.getClass();
        if (((ConcurrentHashMap) c36098EEs.LIZIZ).containsKey(inflateName)) {
            return;
        }
        if (!((ConcurrentHashMap) c36098EEs.LIZJ).containsKey(inflateName)) {
            ((ConcurrentHashMap) c36098EEs.LIZJ).put(inflateName, bean);
        }
        List<String> list = this.LJLIL.get();
        if (list != null) {
            list.add(inflateName);
        }
    }
}
