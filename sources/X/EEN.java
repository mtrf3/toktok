package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class EEN implements InterfaceC36091EEl {
    public final EEO LJLIL = new EEO();

    @Override // X.InterfaceC36091EEl
    public void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        List<String> list = this.LJLIL.get();
        o.LJI(list);
        ArrayList arrayList = new ArrayList(list);
        List<String> list2 = this.LJLIL.get();
        if (list2 != null) {
            list2.clear();
        }
        C36093EEn.LIZ.getClass();
        EEM eem = C36093EEn.LIZLLL;
        Object obj = ListProtector.get(components, 0);
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoService");
        EFK type = ((EEP) obj).type();
        o.LJIIIIZZ(type, "components[0] as LegoService).type()");
        eem.getClass();
        synchronized (eem.LIZLLL) {
            Object obj2 = ((HashMap) eem.LIZLLL).get(type);
            o.LJI(obj2);
            ((List) obj2).addAll(arrayList);
        }
    }

    @Override // X.InterfaceC36091EEl
    public final EEY LIZLLL(EEY bean) {
        o.LJIIIZ(bean, "bean");
        C36093EEn.LIZ.getClass();
        EEM eem = C36093EEn.LIZLLL;
        String key = bean.key();
        o.LJIIIIZZ(key, "bean.key()");
        eem.getClass();
        EEY eey = (EEY) ((ConcurrentHashMap) eem.LIZIZ).get(key);
        if (eey == null) {
            return eem.LIZIZ(key);
        }
        return eey;
    }

    @Override // X.InterfaceC36091EEl
    public final void LJ(EEY bean) {
        o.LJIIIZ(bean, "bean");
        if (EEQ.LIZ || EEQ.LIZ(bean)) {
            String key = bean.key();
            C36093EEn.LIZ.getClass();
            EEM eem = C36093EEn.LIZLLL;
            o.LJIIIIZZ(key, "key");
            eem.getClass();
            if (!((ConcurrentHashMap) eem.LIZJ).containsKey(key)) {
                ((ConcurrentHashMap) eem.LIZJ).put(key, bean);
            }
            List<String> list = this.LJLIL.get();
            if (list != null) {
                list.add(key);
            }
        }
    }
}
