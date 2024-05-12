package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EE9 {
    public Context LIZ;
    public final java.util.Map<EFK, List<EEY>> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<EFK, List<EEY>> LIZJ = new ConcurrentHashMap();

    public final boolean LIZJ() {
        synchronized (this.LIZIZ) {
            java.util.Map<EFK, List<EEY>> map = this.LIZIZ;
            EFK efk = EFK.IDLE;
            Object obj = ((ConcurrentHashMap) map).get(efk);
            o.LJI(obj);
            if (!((List) obj).isEmpty()) {
                Object obj2 = ((ConcurrentHashMap) this.LIZIZ).get(efk);
                o.LJI(obj2);
                for (EEY eey : (Iterable) obj2) {
                    if ((eey instanceof EE8) && ((EE8) eey).LJ()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final boolean LJI() {
        boolean z = false;
        if (!C34195DbT.LIZ()) {
            return false;
        }
        synchronized (this.LIZIZ) {
            java.util.Map<EFK, List<EEY>> map = this.LIZIZ;
            EFK efk = EFK.BOOT_FINISH;
            o.LJI(((ConcurrentHashMap) map).get(efk));
            if (!((Collection) r0).isEmpty()) {
                Object obj = ((ConcurrentHashMap) this.LIZIZ).get(efk);
                o.LJI(obj);
                List<EEY> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (EEY eey : list) {
                    if (eey instanceof InterfaceC36076EDw) {
                        if (((InterfaceC36076EDw) eey).priority() == 2) {
                            arrayList.add(eey);
                        } else if (((InterfaceC36076EDw) eey).priority() == 0) {
                            arrayList2.add(eey);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    list.removeAll(arrayList);
                    list.addAll(0, arrayList);
                    z = true;
                }
                if (!arrayList2.isEmpty()) {
                    list.removeAll(arrayList2);
                    list.addAll(arrayList2);
                }
            }
        }
        return z;
    }

    public static EFK LIZ(EE1 ee12) {
        if (ee12.type().equals(EFK.BOOT_FINISH)) {
            String key = ee12.key();
            o.LJIIIIZZ(key, "task.key()");
            if (C34582Dhi.LIZJ(key)) {
                return EFK.IDLE;
            }
            String key2 = ee12.key();
            o.LJIIIIZZ(key2, "task.key()");
            if (C34582Dhi.LIZ(key2)) {
                return EFK.APP_BACKGROUND;
            }
        }
        EFK type = ee12.type();
        o.LJIIIIZZ(type, "task.type()");
        return type;
    }

    public final boolean LIZIZ(EFK type) {
        o.LJIIIZ(type, "type");
        o.LJI(((ConcurrentHashMap) this.LIZIZ).get(type));
        return !((List) r0).isEmpty();
    }

    public final EE1 LIZLLL(EFK type) {
        EFK type2;
        o.LJIIIZ(type, "type");
        synchronized (this.LIZIZ) {
            Object obj = ((ConcurrentHashMap) this.LIZIZ).get(type);
            o.LJI(obj);
            if (!((List) obj).isEmpty()) {
                Object obj2 = ((ConcurrentHashMap) this.LIZIZ).get(type);
                o.LJI(obj2);
                EEY eey = (EEY) ((List) obj2).remove(0);
                synchronized (this.LIZJ) {
                    java.util.Map<EFK, List<EEY>> map = this.LIZJ;
                    if (C34195DbT.LIZIZ()) {
                        o.LJII(eey, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                        type2 = LIZ((EE1) eey);
                    } else {
                        o.LJII(eey, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                        type2 = ((EE1) eey).type();
                    }
                    Object obj3 = ((ConcurrentHashMap) map).get(type2);
                    o.LJI(obj3);
                    ((List) obj3).add(eey);
                }
                return (EE1) eey;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (X.C34582Dhi.LIZIZ(r1) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.EE1 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            android.content.Context r0 = X.EF7.LIZIZ()
            X.FCD.LJI(r0)
            monitor-enter(r5)
            java.util.Map<X.EFK, java.util.List<X.EEY>> r1 = r4.LIZJ     // Catch: java.lang.Throwable -> La7
            X.EFK r0 = LIZ(r5)     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> La7
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> La7
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> La7
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto La5
            X.EEn r0 = X.C36093EEn.LIZ     // Catch: java.lang.Throwable -> La7
            r0.getClass()     // Catch: java.lang.Throwable -> La7
            X.EEA r0 = X.C36093EEn.LJI     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L30
            r0.LIZIZ(r5)     // Catch: java.lang.Throwable -> La7
        L30:
            X.EFK r1 = LIZ(r5)     // Catch: java.lang.Throwable -> La7
            X.EFK r0 = X.EFK.BOOT_FINISH     // Catch: java.lang.Throwable -> La7
            if (r1 != r0) goto L57
            java.lang.String r1 = r5.key()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "task.key()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> La7
            boolean r0 = X.C34582Dhi.LIZIZ(r1)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L57
        L47:
            X.EEn r0 = X.C36093EEn.LIZ     // Catch: java.lang.Throwable -> La7
            r0.getClass()     // Catch: java.lang.Throwable -> La7
            X.EEA r0 = X.C36093EEn.LJI     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L53
            r0.LIZ(r5)     // Catch: java.lang.Throwable -> La7
        L53:
            java.util.Map<X.EFK, java.util.List<X.EEY>> r2 = r4.LIZJ     // Catch: java.lang.Throwable -> La7
            monitor-enter(r2)     // Catch: java.lang.Throwable -> La7
            goto L85
        L57:
            android.content.Context r0 = r4.LIZ     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L9e
            r5.run(r0)     // Catch: java.lang.Throwable -> La7
            java.util.List r0 = r5.triggerOtherLegoComponents()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L47
            X.EEj r3 = X.C36093EEn.LJIIIZ()     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> La7
        L6c:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L81
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> La7
            X.EEY r1 = (X.EEY) r1     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "component"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> La7
            r3.LIZ(r1)     // Catch: java.lang.Throwable -> La7
            goto L6c
        L81:
            r3.LIZJ()     // Catch: java.lang.Throwable -> La7
            goto L47
        L85:
            java.util.Map<X.EFK, java.util.List<X.EEY>> r1 = r4.LIZJ     // Catch: java.lang.Throwable -> L9b
            X.EFK r0 = LIZ(r5)     // Catch: java.lang.Throwable -> L9b
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> L9b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L9b
            r0.remove(r5)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            goto La5
        L9b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> La7
        L9e:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIJI(r0)     // Catch: java.lang.Throwable -> La7
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> La7
        La5:
            monitor-exit(r5)
            return
        La7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EE9.LJFF(X.EE1):void");
    }

    public final void LJ(EFK type, List tasks) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(tasks, "tasks");
        synchronized (this.LIZIZ) {
            Iterator it = tasks.iterator();
            while (it.hasNext()) {
                EEY eey = (EEY) it.next();
                Object obj = ((ConcurrentHashMap) this.LIZIZ).get(type);
                o.LJI(obj);
                ((List) obj).remove(eey);
            }
            synchronized (this.LIZJ) {
                Object obj2 = ((ConcurrentHashMap) this.LIZJ).get(type);
                o.LJI(obj2);
                ((List) obj2).addAll(tasks);
            }
        }
    }
}
