package X;

import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.MzY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C58620MzY implements L71, InterfaceC58295MuJ, InterfaceC56585MIr {
    public final java.util.Map<Class<? extends Object>, Object> LIZ;
    public final C62822Ol8 LIZIZ;
    public final C58601MzF<?>[] LIZJ;
    public final IHostContextDepend LIZLLL;
    public final IMonitorDepend LJ;

    @Override // X.InterfaceC58295MuJ
    public final java.util.Map<String, InterfaceC88472Yns<M95, Object>> LIZ() {
        return (java.util.Map) this.LIZIZ.getValue();
    }

    @Override // X.L71
    public final java.util.Map<Class<? extends Object>, Object> LJFF() {
        return this.LIZ;
    }

    public C58601MzF<?>[] LJIILL() {
        return this.LIZJ;
    }

    public C58620MzY(Object... contexts) {
        o.LJIIIZ(contexts, "contexts");
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = C221108m2.LIZIZ(new C58599MzD(this));
        this.LIZJ = new C58601MzF[0];
        this.LIZLLL = C59835Ne3.LIZIZ();
        this.LJ = C59835Ne3.LIZJ();
        LJIJJ(Arrays.copyOf(contexts, contexts.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC56585MIr
    public final void LJIIJ(Object obj) {
        if (!(obj instanceof Object[])) {
            if (obj != null) {
                this.LIZ.put(obj.getClass(), obj);
                Class<?>[] interfaces = obj.getClass().getInterfaces();
                o.LJIIIIZZ(interfaces, "context.javaClass.interfaces");
                for (Class<?> it : interfaces) {
                    java.util.Map<Class<? extends Object>, Object> map = this.LIZ;
                    o.LJIIIIZZ(it, "it");
                    map.put(it, obj);
                }
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public M95 LJIILLIIL(C58620MzY... c58620MzYArr) {
        return new M95((L71[]) Arrays.copyOf(c58620MzYArr, c58620MzYArr.length));
    }

    public final void LJIJJ(Object... contexts) {
        o.LJIIIZ(contexts, "contexts");
        Iterator it = ORY.LJJIJLIJ(contexts).iterator();
        while (it.hasNext()) {
            LJIIJ(it.next());
        }
    }

    @Override // X.InterfaceC56585MIr
    public final <T> void LJII(InterfaceC58602MzG<T, ?> paramKey, T t) {
        o.LJIIIZ(paramKey, "paramKey");
        LIZ().put(paramKey.getName(), new AqS176S0100000_10(t, 107));
    }

    @Override // X.InterfaceC56585MIr
    public final java.util.Map<String, Object> LJIIIIZZ(InterfaceC58602MzG<?, ?>[] keys, InterfaceC88472Yns<? super C58620MzY, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(keys, "keys");
        C58620MzY c58620MzY = new C58620MzY(new Object[0]);
        interfaceC88472Yns.invoke(c58620MzY);
        return LJIJ(keys, c58620MzY);
    }

    public final java.util.Map<String, Object> LJIJ(InterfaceC58602MzG<?, ?>[] keys, C58620MzY extraInjector) {
        o.LJIIIZ(keys, "keys");
        o.LJIIIZ(extraInjector, "extraInjector");
        return LJIIZILJ(keys, LJIILLIIL(this, extraInjector), new C58308MuW(this, extraInjector));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJLI(Class<?> cls, Object obj) {
        if (!(obj instanceof Object[])) {
            if (obj != null && cls.isAssignableFrom(obj.getClass())) {
                this.LIZ.put(cls, obj);
                Class<?>[] interfaces = cls.getInterfaces();
                o.LJIIIIZZ(interfaces, "clz.interfaces");
                for (Class<?> it : interfaces) {
                    java.util.Map<Class<? extends Object>, Object> map = this.LIZ;
                    o.LJIIIIZZ(it, "it");
                    map.put(it, obj);
                }
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public static Object LJIJI(InterfaceC58602MzG interfaceC58602MzG, C58308MuW c58308MuW, M95 contextRetriever) {
        o.LJIIIZ(contextRetriever, "contextRetriever");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) c58308MuW.LIZ).get(interfaceC58602MzG.getName());
        if (interfaceC88472Yns != null || (interfaceC88472Yns = interfaceC58602MzG.LIZIZ()) != null) {
            return interfaceC58602MzG.LIZ(interfaceC88472Yns.invoke(contextRetriever));
        }
        throw new C58621MzZ(interfaceC58602MzG);
    }

    public final java.util.Map<String, Object> LJIIZILJ(InterfaceC58602MzG<?, ?>[] keys, M95 contextRetriever, C58308MuW c58308MuW) {
        o.LJIIIZ(keys, "keys");
        o.LJIIIZ(contextRetriever, "contextRetriever");
        ArrayList arrayList = new ArrayList();
        int LJJIIZ = C51029K0z.LJJIIZ(keys.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        int length = keys.length;
        boolean z = false;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= length) {
                break;
            }
            InterfaceC58602MzG<?, ?> interfaceC58602MzG = keys[i];
            String name = interfaceC58602MzG.getName();
            try {
                obj = LJIJI(interfaceC58602MzG, c58308MuW, contextRetriever);
            } catch (AbstractC58622Mza e) {
                if (interfaceC58602MzG.LIZJ()) {
                    arrayList.add(e);
                }
            }
            OSZ osz = new OSZ(name, obj);
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
            i++;
        }
        if ((!arrayList.isEmpty()) && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Throwable) it.next()).getMessage());
            }
            String LJIILLIIL = o.LJIILLIIL(ORZ.LLD(arrayList2, ", ", null, null, null, 62), "parameter unsatisfied:\n");
            IHostContextDepend iHostContextDepend = this.LIZLLL;
            if (iHostContextDepend != null && iHostContextDepend.isDebuggable()) {
                z = true;
            }
            if (!z) {
                IMonitorDepend iMonitorDepend = this.LJ;
                if (iMonitorDepend != null) {
                    iMonitorDepend.ensureNotReachHere(new IllegalStateException(LJIILLIIL), LJIILLIIL, null);
                }
            } else {
                throw new IllegalStateException(LJIILLIIL);
            }
        }
        return linkedHashMap;
    }
}
