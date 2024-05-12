package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EEn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36093EEn {
    public static Context LJFF;
    public static EEA LJI;
    public static InterfaceC36096EEq LJII;
    public static EEX LJIIJJI;
    public static int LJIIL;
    public static int LJIILIIL;
    public static final C36093EEn LIZ = new C36093EEn();
    public static final EE9 LIZIZ = new EE9();
    public static final EFL LIZJ = new EFL();
    public static final EEM LIZLLL = new EEM();
    public static final C36098EEs LJ = new C36098EEs();
    public static final java.util.Map<EnumC36092EEm, List<EEY>> LJIIIIZZ = new LinkedHashMap();
    public static final java.util.Map<EnumC36092EEm, List<Object>> LJIIIZ = new LinkedHashMap();
    public static final java.util.Map<String, List<String>> LJIIJ = new LinkedHashMap();
    public static final HashMap<EnumC36103EEx, InterfaceC36091EEl> LJIILJJIL = new HashMap<>();
    public static final HashMap<Integer, InterfaceC36091EEl> LJIILL = new HashMap<>();

    public static void LIZJ() {
        HashMap<EnumC36103EEx, InterfaceC36091EEl> hashMap = LJIILJJIL;
        InterfaceC36091EEl interfaceC36091EEl = hashMap.get(EnumC36103EEx.SERVICE_BOOT_FINISH);
        o.LJI(interfaceC36091EEl);
        interfaceC36091EEl.LIZ();
        InterfaceC36091EEl interfaceC36091EEl2 = hashMap.get(EnumC36103EEx.TASK_BOOT_FINISH);
        o.LJI(interfaceC36091EEl2);
        interfaceC36091EEl2.LIZ();
    }

    public static void LIZLLL() {
        HashMap<EnumC36103EEx, InterfaceC36091EEl> hashMap = LJIILJJIL;
        InterfaceC36091EEl interfaceC36091EEl = hashMap.get(EnumC36103EEx.SERVICE_BOOT_FINISH);
        if (interfaceC36091EEl != null) {
            interfaceC36091EEl.LIZIZ();
        }
        InterfaceC36091EEl interfaceC36091EEl2 = hashMap.get(EnumC36103EEx.TASK_BOOT_FINISH);
        if (interfaceC36091EEl2 != null) {
            interfaceC36091EEl2.LIZIZ();
        }
    }

    public static C36089EEj LJIIIZ() {
        return new C36089EEj(false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.EE1 r4) {
        /*
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            boolean r0 = r4.meetTrigger()
            if (r0 == 0) goto L1f
            java.lang.String r3 = r4.key()
            r2 = 0
            java.util.Set<java.lang.String> r1 = X.C34592Dhs.LIZ     // Catch: java.lang.Exception -> L1d
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L19
            goto L20
        L19:
            boolean r2 = r1.contains(r3)     // Catch: java.lang.Exception -> L1d
        L1d:
            if (r2 == 0) goto L20
        L1f:
            return
        L20:
            X.EE9 r3 = X.C36093EEn.LIZIZ
            r3.getClass()
            java.util.Map<X.EFK, java.util.List<X.EEY>> r1 = r3.LIZIZ
            X.EFK r0 = X.EE9.LIZ(r4)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            kotlin.jvm.internal.o.LJI(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L83
            java.util.Map<X.EFK, java.util.List<X.EEY>> r2 = r3.LIZIZ
            monitor-enter(r2)
            java.util.Map<X.EFK, java.util.List<X.EEY>> r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> Lb5
            X.EFK r0 = X.EE9.LIZ(r4)     // Catch: java.lang.Throwable -> Lb5
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb5
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> Lb5
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lb5
            r0.remove(r4)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r2)
            java.util.Map<X.EFK, java.util.List<X.EEY>> r2 = r3.LIZJ
            monitor-enter(r2)
            java.util.Map<X.EFK, java.util.List<X.EEY>> r1 = r3.LIZJ     // Catch: java.lang.Throwable -> Lb2
            X.EFK r0 = X.EE9.LIZ(r4)     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb2
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L82
            java.util.Map<X.EFK, java.util.List<X.EEY>> r1 = r3.LIZJ     // Catch: java.lang.Throwable -> Lb2
            X.EFK r0 = X.EE9.LIZ(r4)     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb2
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lb2
            r0.add(r4)     // Catch: java.lang.Throwable -> Lb2
        L82:
            monitor-exit(r2)
        L83:
            java.util.Map<X.EFK, java.util.List<X.EEY>> r1 = r3.LIZJ
            X.EFK r0 = X.EE9.LIZ(r4)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            kotlin.jvm.internal.o.LJI(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L1f
            X.EEn r0 = X.C36093EEn.LIZ
            r0.getClass()
            X.EEA r0 = X.C36093EEn.LJI
            if (r0 == 0) goto La6
            r0.LIZIZ(r4)
        La6:
            r3.LJFF(r4)
            X.EEA r0 = X.C36093EEn.LJI
            if (r0 == 0) goto L1f
            r0.LIZ(r4)
            goto L1f
        Lb2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        Lb5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36093EEn.LJ(X.EE1):void");
    }

    public static EEY LJFF(EEY component) {
        o.LJIIIZ(component, "component");
        InterfaceC36091EEl interfaceC36091EEl = LJIILJJIL.get(component.triggerType());
        if (interfaceC36091EEl != null) {
            return interfaceC36091EEl.LIZLLL(component);
        }
        return null;
    }

    public static EEY LJI(Class cls) {
        Object newInstance = cls.newInstance();
        o.LJIIIIZZ(newInstance, "name.newInstance()");
        return LJFF((EEY) newInstance);
    }

    public static EEY LJII(Class cls) {
        Object newInstance = cls.newInstance();
        o.LJIIIIZZ(newInstance, "name.newInstance()");
        return LJFF((EEY) newInstance);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    public static void LJIIIIZZ(EnumC36092EEm scenesType) {
        o.LJIIIZ(scenesType, "scenesType");
        java.util.Map<EnumC36092EEm, List<Object>> map = LJIIIZ;
        if (map.isEmpty() && LJIIIIZZ.isEmpty()) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new ArrayList();
        Iterable iterable = (Iterable) ((LinkedHashMap) map).get(scenesType);
        if (iterable != null) {
            Iterator it = ((ArrayList) ORZ.LJLL(iterable)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) c68322mC.element;
                o.LJII(next, "null cannot be cast to non-null type kotlin.Function0<kotlin.collections.MutableList<com.ss.android.ugc.aweme.lego.LegoComponent>>");
                C65777Prh.LJ(0, next);
                list.addAll((Collection) ((InterfaceC65784Pro) next).invoke());
            }
        }
        if (!((Collection) c68322mC.element).isEmpty()) {
            C38995FSd.LJ().execute(new ARunnableS42S0100000_6(c68322mC, 84));
        }
        Iterable iterable2 = (Iterable) ((LinkedHashMap) LJIIIIZZ).get(scenesType);
        if (iterable2 != null) {
            C36089EEj c36089EEj = new C36089EEj(false, false);
            Iterator it2 = ((ArrayList) ORZ.LJLL(iterable2)).iterator();
            while (it2.hasNext()) {
                c36089EEj.LIZIZ((EEY) it2.next(), false);
            }
            c36089EEj.LIZJ();
        }
        LJIIIZ.remove(scenesType);
        LJIIIIZZ.remove(scenesType);
    }

    public final void LIZ(Class cls, InterfaceC36101EEv inflate) {
        o.LJIIIZ(inflate, "inflate");
        C36098EEs c36098EEs = LJ;
        String key = inflate.key();
        o.LJIIIIZZ(key, "inflate.key()");
        c36098EEs.getClass();
        if (!((ConcurrentHashMap) c36098EEs.LIZJ).containsKey(key)) {
            ((ConcurrentHashMap) c36098EEs.LIZJ).put(key, inflate);
        }
    }

    public static void LIZIZ(EnumC36092EEm scenesType, boolean z, InterfaceC65784Pro block) {
        o.LJIIIZ(scenesType, "scenesType");
        o.LJIIIZ(block, "block");
        if (z) {
            java.util.Map<EnumC36092EEm, List<Object>> map = LJIIIZ;
            List list = (List) ((LinkedHashMap) map).get(scenesType);
            if (list != null) {
                list.add(block);
                return;
            }
            map.put(scenesType, new ArrayList());
            List list2 = (List) ((LinkedHashMap) map).get(scenesType);
            if (list2 == null) {
                return;
            }
            list2.add(block);
            return;
        }
        java.util.Map<EnumC36092EEm, List<EEY>> map2 = LJIIIIZZ;
        List list3 = (List) ((LinkedHashMap) map2).get(scenesType);
        if (list3 != null) {
            list3.addAll((Collection) block.invoke());
            return;
        }
        map2.put(scenesType, new ArrayList());
        List list4 = (List) ((LinkedHashMap) map2).get(scenesType);
        if (list4 == null) {
            return;
        }
        list4.addAll((Collection) block.invoke());
    }
}
