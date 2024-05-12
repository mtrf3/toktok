package X;

import Y.IDComparatorS39S0000000_11;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: X.PmT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65453PmT {
    public static final java.util.Map<Class<?>, C65453PmT> LJ = new WeakHashMap();
    public static final java.util.Map<Class<?>, C65453PmT> LJFF = new WeakHashMap();
    public final Class<?> LIZ;
    public final boolean LIZIZ;
    public final IdentityHashMap<String, C65454PmU> LIZJ = new IdentityHashMap<>();
    public final List<String> LIZLLL;

    public final C65454PmU LIZ(String str) {
        if (str != null) {
            if (this.LIZIZ) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return this.LIZJ.get(str);
    }

    public C65453PmT(Class<?> cls, boolean z) {
        boolean z2;
        List<String> unmodifiableList;
        boolean z3;
        String str;
        Field field;
        this.LIZ = cls;
        this.LIZIZ = z;
        if (!z || !cls.isEnum()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        C77357UXp.LIZLLL(sb.toString(), z2);
        TreeSet treeSet = new TreeSet(new IDComparatorS39S0000000_11(2));
        for (Field field2 : cls.getDeclaredFields()) {
            C65454PmU LIZIZ = C65454PmU.LIZIZ(field2);
            if (LIZIZ != null) {
                String str2 = LIZIZ.LIZJ;
                str2 = z ? str2.toLowerCase().intern() : str2;
                C65454PmU c65454PmU = this.LIZJ.get(str2);
                if (c65454PmU == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object[] objArr = new Object[4];
                if (z) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = field2;
                if (c65454PmU == null) {
                    field = null;
                } else {
                    field = c65454PmU.LIZIZ;
                }
                objArr[3] = field;
                C77357UXp.LJ("two fields have the same %sname <%s>: %s and %s", z3, objArr);
                this.LIZJ.put(str2, LIZIZ);
                treeSet.add(str2);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            C65453PmT LIZIZ2 = LIZIZ(superclass, z);
            treeSet.addAll(LIZIZ2.LIZLLL);
            for (Map.Entry<String, C65454PmU> entry : LIZIZ2.LIZJ.entrySet()) {
                String key = entry.getKey();
                if (!this.LIZJ.containsKey(key)) {
                    this.LIZJ.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.LIZLLL = unmodifiableList;
    }

    public static C65453PmT LIZIZ(Class<?> cls, boolean z) {
        java.util.Map<Class<?>, C65453PmT> map;
        C65453PmT c65453PmT;
        if (z) {
            map = LJFF;
        } else {
            map = LJ;
        }
        synchronized (map) {
            c65453PmT = map.get(cls);
            if (c65453PmT == null) {
                c65453PmT = new C65453PmT(cls, z);
                map.put(cls, c65453PmT);
            }
        }
        return c65453PmT;
    }
}
