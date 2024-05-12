package X;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Nqn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60625Nqn {
    public static Context LJI;
    public static C39863Fkh LJII;
    public static final java.util.Map<String, List<Pair<Class<? extends InterfaceC60410NnK>, AbstractC60346NmI>>> LJIIIIZZ = new HashMap();
    public static final java.util.Map<String, java.util.Map<Class<? extends InterfaceC60410NnK>, C60625Nqn>> LJIIIZ = new HashMap();
    public final Class<? extends InterfaceC60410NnK> LIZ;
    public final LinkedHashSet<Class<? extends AbstractC60629Nqr>> LIZIZ;
    public final LinkedHashSet<Class<? extends AbstractC60629Nqr>> LIZJ;
    public LinkedHashSet<InterfaceC60639Nr1> LIZLLL;
    public HashMap<Class<? extends AbstractC60629Nqr>, LinkedHashSet<InterfaceC60639Nr1>> LJ;
    public HashSet<C37731ErP> LJFF;

    public C60625Nqn() {
        throw null;
    }

    public static void LIZJ() {
        LJII.getClass();
    }

    public static C60625Nqn LIZ(Class cls, String str) {
        java.util.Map<String, java.util.Map<Class<? extends InterfaceC60410NnK>, C60625Nqn>> map = LJIIIZ;
        java.util.Map map2 = (java.util.Map) ((HashMap) map).get(str);
        if (map2 == null) {
            synchronized (C60625Nqn.class) {
                map2 = (java.util.Map) ((HashMap) map).get(str);
                if (map2 == null) {
                    map2 = new Hashtable();
                    ((HashMap) map).put(str, map2);
                }
            }
        }
        C60625Nqn c60625Nqn = (C60625Nqn) map2.get(cls);
        if (c60625Nqn != null) {
            return c60625Nqn;
        }
        synchronized (C60625Nqn.class) {
            C60625Nqn c60625Nqn2 = (C60625Nqn) map2.get(cls);
            if (c60625Nqn2 != null) {
                return c60625Nqn2;
            }
            C60628Nqq c60628Nqq = new C60628Nqq();
            List<Pair> list = (List) ((HashMap) LJIIIIZZ).get(str);
            if (list == null) {
                return null;
            }
            for (Pair pair : list) {
                if (((Class) pair.first).equals(cls)) {
                    AbstractC60346NmI abstractC60346NmI = (AbstractC60346NmI) pair.second;
                    abstractC60346NmI.getClass();
                    abstractC60346NmI.LIZ(c60628Nqq);
                }
            }
            C60625Nqn c60625Nqn3 = new C60625Nqn(cls, c60628Nqq.LIZ, c60628Nqq.LIZIZ);
            c60625Nqn3.LIZLLL = c60628Nqq.LIZJ;
            c60625Nqn3.LJ = c60628Nqq.LIZLLL;
            c60625Nqn3.LJFF = c60628Nqq.LJ;
            map2.put(cls, c60625Nqn3);
            return c60625Nqn3;
        }
    }

    public C60625Nqn(Class cls, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.LIZ = cls;
        this.LIZIZ = linkedHashSet;
        this.LIZJ = linkedHashSet2;
    }

    public static <T extends InterfaceC60410NnK> void LIZIZ(String str, Class<T> cls, AbstractC60346NmI abstractC60346NmI) {
        java.util.Map<String, List<Pair<Class<? extends InterfaceC60410NnK>, AbstractC60346NmI>>> map = LJIIIIZZ;
        List list = (List) ((HashMap) map).get(str);
        if (list == null) {
            synchronized (C60625Nqn.class) {
                list = (List) ((HashMap) map).get(str);
                if (list == null) {
                    list = new ArrayList();
                    ((HashMap) map).put(str, list);
                }
            }
        }
        Pair pair = new Pair(cls, abstractC60346NmI);
        synchronized (C60625Nqn.class) {
            list.add(pair);
        }
    }
}
