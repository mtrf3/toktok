package X;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.14m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C270814m {
    public static volatile C270814m LIZLLL;
    public static final Object LJ = new Object();
    public final Context LIZJ;
    public final java.util.Set<Class<? extends InterfaceC270914n<?>>> LIZIZ = new HashSet();
    public final java.util.Map<Class<?>, Object> LIZ = new HashMap();

    public C270814m(Context context) {
        this.LIZJ = C16880lQ.LLLLL(context);
    }

    public final <T> T LIZ(Class<? extends InterfaceC270914n<?>> cls, java.util.Set<Class<?>> set) {
        T t;
        synchronized (LJ) {
            if (C00R.LIZ()) {
                try {
                    Trace.beginSection(C16880lQ.LJLLJ(cls));
                } finally {
                    Trace.endSection();
                }
            }
            HashSet hashSet = (HashSet) set;
            if (!hashSet.contains(cls)) {
                if (!((HashMap) this.LIZ).containsKey(cls)) {
                    hashSet.add(cls);
                    try {
                        InterfaceC270914n<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends InterfaceC270914n<?>>> LIZ = newInstance.LIZ();
                        if (!LIZ.isEmpty()) {
                            for (Class<? extends InterfaceC270914n<?>> cls2 : LIZ) {
                                if (!((HashMap) this.LIZ).containsKey(cls2)) {
                                    LIZ(cls2, set);
                                }
                            }
                        }
                        t = (T) newInstance.create(this.LIZJ);
                        hashSet.remove(cls);
                        ((HashMap) this.LIZ).put(cls, t);
                    } catch (Throwable th) {
                        throw new C271014o(th);
                    }
                } else {
                    t = (T) ((HashMap) this.LIZ).get(cls);
                }
            } else {
                throw new IllegalStateException(C16880lQ.LLLZ("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
            }
        }
        return t;
    }
}
