package X;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;

/* renamed from: X.PmU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65454PmU {
    public static final java.util.Map<Field, C65454PmU> LIZLLL = new WeakHashMap();
    public final boolean LIZ;
    public final Field LIZIZ;
    public final String LIZJ;

    public static C65454PmU LIZIZ(Field field) {
        String str = null;
        if (field == null) {
            return null;
        }
        java.util.Map<Field, C65454PmU> map = LIZLLL;
        synchronized (map) {
            C65454PmU c65454PmU = (C65454PmU) ((WeakHashMap) map).get(field);
            boolean isEnumConstant = field.isEnumConstant();
            if (c65454PmU == null) {
                if (!isEnumConstant) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        InterfaceC65461Pmb interfaceC65461Pmb = (InterfaceC65461Pmb) field.getAnnotation(InterfaceC65461Pmb.class);
                        if (interfaceC65461Pmb == null) {
                            return null;
                        }
                        str = interfaceC65461Pmb.value();
                        field.setAccessible(true);
                    }
                } else {
                    InterfaceC65462Pmc interfaceC65462Pmc = (InterfaceC65462Pmc) field.getAnnotation(InterfaceC65462Pmc.class);
                    if (interfaceC65462Pmc != null) {
                        str = interfaceC65462Pmc.value();
                    } else if (((InterfaceC65463Pmd) field.getAnnotation(InterfaceC65463Pmd.class)) == null) {
                        return null;
                    }
                }
                if ("##default".equals(str)) {
                    str = field.getName();
                }
                c65454PmU = new C65454PmU(field, str);
                ((WeakHashMap) map).put(field, c65454PmU);
            }
            return c65454PmU;
        }
    }

    public final Object LIZ(Object obj) {
        try {
            return this.LIZIZ.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C65454PmU(Field field, String str) {
        String intern;
        this.LIZIZ = field;
        if (str == null) {
            intern = null;
        } else {
            intern = str.intern();
        }
        this.LIZJ = intern;
        this.LIZ = C65444PmK.LIZJ(field.getType());
    }

    public final void LIZLLL(Object obj, Object obj2) {
        LIZJ(obj, this.LIZIZ, obj2);
    }

    public static void LIZJ(Object obj, Field field, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            try {
                Object obj3 = field.get(obj);
                if (obj2 == null) {
                    if (obj3 == null) {
                        return;
                    }
                } else if (obj2.equals(obj3)) {
                    return;
                }
                String valueOf = String.valueOf(obj3);
                String valueOf2 = String.valueOf(obj2);
                String valueOf3 = String.valueOf(field.getName());
                String name = obj.getClass().getName();
                StringBuilder sb = new StringBuilder(name.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 48);
                YE1.LIZLLL(sb, "expected final value <", valueOf, "> but was <", valueOf2);
                sb.append("> on ");
                sb.append(valueOf3);
                sb.append(" field in ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString());
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        } catch (SecurityException e3) {
            throw new IllegalArgumentException(e3);
        }
    }
}
