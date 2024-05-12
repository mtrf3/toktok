package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EV0 {
    public final Class<?> LIZ;
    public Class<?> LIZIZ;
    public HashMap<Integer, Method> LIZJ;
    public final java.util.Set<String> LIZLLL;
    public final AtomicBoolean LJ = new AtomicBoolean(false);

    static {
        C16880lQ.LJLLJ(EV0.class);
    }

    public final java.util.Map<Integer, Method> LIZ() {
        if (this.LJ.get()) {
            return this.LIZJ;
        }
        synchronized (this) {
            if (this.LIZJ == null) {
                this.LIZJ = LIZIZ();
            }
        }
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final HashMap<Integer, Method> LIZIZ() {
        String str;
        Field[] fieldArr;
        Method[] methodArr;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("parseCodeMethods: ");
        Class<?> cls = this.LIZIZ;
        if (cls != null) {
            str = C16880lQ.LJLLJ(cls);
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        boolean z = true;
        C38494F8w c38494F8w = new C38494F8w(true, "parseBinderCodes", 2);
        try {
            Class<?> cls2 = this.LIZ;
            if (cls2 != null) {
                fieldArr = cls2.getDeclaredFields();
            } else {
                fieldArr = null;
            }
            HashMap hashMap = new HashMap();
            ?? r9 = 0;
            r9 = 0;
            if (fieldArr != null) {
                int length = fieldArr.length;
                int i = 0;
                while (i < length) {
                    Field field = fieldArr[i];
                    o.LJIIIIZZ(field, "field");
                    String fieldName = field.getName();
                    field.setAccessible(z);
                    o.LJIIIIZZ(fieldName, "fieldName");
                    if (ujb.o.LJJJLIIL(fieldName, "TRANSACTION_", r9)) {
                        str2 = fieldName.substring(12);
                        o.LJIIIIZZ(str2, "(this as java.lang.String).substring(startIndex)");
                    } else if (ujb.o.LJJJJ(fieldName, "_TRANSACTION", r9)) {
                        List LJLJJL = s.LJLJJL(fieldName, new String[]{"_"}, r9, 6);
                        StringBuilder sb = new StringBuilder();
                        int size = LJLJJL.size() - 2;
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                String str3 = (String) LJLJJL.get(i2);
                                StringBuilder sb2 = new StringBuilder(str3.length());
                                for (int i3 = 0; i3 < str3.length(); i3++) {
                                    sb2.append(Character.toLowerCase(str3.charAt(i3)));
                                }
                                String sb3 = sb2.toString();
                                o.LJIIIIZZ(sb3, "sb.toString()");
                                if (i2 > 0) {
                                    sb.append(ujb.o.LJJJ(sb3));
                                } else {
                                    sb.append(sb3);
                                }
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        str2 = sb.toString();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        Object obj = field.get(null);
                        if (obj != null) {
                            int intValue = ((Integer) obj).intValue();
                            java.util.Set<String> set = this.LIZLLL;
                            if (set == null || set.contains(str2)) {
                                hashMap.put(Integer.valueOf(intValue), str2);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    }
                    i++;
                    z = true;
                    r9 = 0;
                }
            }
            C78605Ut7.LJIIIZ(c38494F8w, null);
            C38494F8w c38494F8w2 = new C38494F8w(true, "parseBinderMethods", 2);
            try {
                Class<?> cls3 = this.LIZIZ;
                if (cls3 != null) {
                    methodArr = cls3.getDeclaredMethods();
                } else {
                    methodArr = null;
                }
                HashMap hashMap2 = new HashMap();
                if (methodArr != null) {
                    int length2 = methodArr.length;
                    for (int i4 = r9; i4 < length2; i4++) {
                        Method it = methodArr[i4];
                        o.LJIIIIZZ(it, "it");
                        String name = it.getName();
                        java.util.Set<String> set2 = this.LIZLLL;
                        if (set2 == null || set2.contains(name)) {
                            o.LJIIIIZZ(name, "name");
                            hashMap2.put(name, it);
                        }
                    }
                }
                java.util.Set<String> set3 = this.LIZLLL;
                if (set3 != null) {
                    set3.clear();
                }
                C78605Ut7.LJIIIZ(c38494F8w2, null);
                HashMap<Integer, Method> hashMap3 = new HashMap<>();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object obj2 = hashMap2.get(entry.getValue());
                    if (obj2 != null) {
                        hashMap3.put(entry.getKey(), obj2);
                    }
                }
                this.LJ.set(true);
                return hashMap3;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EV0(java.lang.String r4, java.util.Collection<java.lang.String> r5) {
        /*
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r0.<init>(r2)
            r3.LJ = r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L28
            r1.append(r4)     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = "$Stub"
            r1.append(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L28
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L28
            java.lang.Class[] r0 = r1.getInterfaces()     // Catch: java.lang.Exception -> L29
            r0 = r0[r2]     // Catch: java.lang.Exception -> L29
            r3.LIZIZ = r0     // Catch: java.lang.Exception -> L29
            goto L34
        L28:
            r1 = 0
        L29:
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L30
            r3.LIZIZ = r1     // Catch: java.lang.ClassNotFoundException -> L30
            goto L34
        L30:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L34:
            r3.LIZ = r1
            if (r5 == 0) goto L42
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.LIZLLL = r0
            r0.addAll(r5)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EV0.<init>(java.lang.String, java.util.Collection):void");
    }
}
