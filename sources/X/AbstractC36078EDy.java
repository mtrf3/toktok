package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EDy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36078EDy implements InterfaceC36091EEl {
    @Override // X.InterfaceC36091EEl
    public final EEY LIZLLL(EEY bean) {
        o.LJIIIZ(bean, "bean");
        return bean;
    }

    @Override // X.InterfaceC36091EEl
    public final void LJ(EEY bean) {
        o.LJIIIZ(bean, "bean");
    }

    public abstract EFK LJFF();

    public AbstractC36078EDy() {
        new EEC();
    }

    @Override // X.InterfaceC36091EEl
    public void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        C36093EEn.LIZ.getClass();
        EE9 ee9 = C36093EEn.LIZIZ;
        EFK type = LJFF();
        ee9.getClass();
        o.LJIIIZ(type, "type");
        synchronized (ee9.LIZIZ) {
            Object obj = ((ConcurrentHashMap) ee9.LIZIZ).get(type);
            o.LJI(obj);
            ((List) obj).addAll(components);
        }
    }
}
