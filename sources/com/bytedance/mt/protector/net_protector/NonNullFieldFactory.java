package com.bytedance.mt.protector.net_protector;

import X.C16880lQ;
import X.InterfaceC65346Pkk;
import X.X1D;
import com.google.gson.f;
import com.google.gson.internal.a;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class NonNullFieldFactory implements u {
    public static final Map<Type, List<Field>> LJLIL;
    public static final Map<Class<? extends f>, f> LJLILLLLZI;

    static {
        C16880lQ.LJLLJ(InterfaceC65346Pkk.class);
        LJLIL = new ConcurrentHashMap();
        LJLILLLLZI = new ConcurrentHashMap();
    }

    public static Object LIZ(Type type, Field field) {
        f fVar;
        Class<? extends f> value = ((InterfaceC65346Pkk) field.getAnnotation(InterfaceC65346Pkk.class)).value();
        synchronized (NonNullFieldFactory.class) {
            Map<Class<? extends f>, f> map = LJLILLLLZI;
            fVar = (f) ((ConcurrentHashMap) map).get(value);
            if (fVar == null) {
                try {
                    fVar = value.newInstance();
                    ((ConcurrentHashMap) map).put(value, fVar);
                } catch (IllegalAccessException | InstantiationException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("InstanceCreator ");
                    LIZ.append(value);
                    LIZ.append(" create failure");
                    throw new RuntimeException(X1D.LIZIZ(LIZ), e);
                }
            }
        }
        Object LIZ2 = fVar.LIZ();
        LIZIZ(TypeToken.get(type), LIZ2);
        return LIZ2;
    }

    public static void LIZIZ(TypeToken typeToken, Object obj) {
        List<Field> list;
        if (obj == null || (list = (List) ((ConcurrentHashMap) LJLIL).get(typeToken.getType())) == null || list.isEmpty()) {
            return;
        }
        for (Field field : list) {
            try {
                if (field.get(obj) == null) {
                    Object LIZ = LIZ(a.LJII(typeToken.getType(), typeToken.getRawType(), field.getGenericType(), new HashSet()), field);
                    if (LIZ != null) {
                        field.set(obj, LIZ);
                    } else {
                        throw new RuntimeException(C16880lQ.LLLZ("Create field %s for type %s failure", new Object[]{field.getName(), typeToken.getType()}));
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0023, code lost:
    
        r4 = java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.google.gson.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r11, final com.google.gson.reflect.TypeToken<T> r12) {
        /*
            r10 = this;
            java.lang.Class r5 = r12.getRawType()
            r9 = 0
            r8 = r12
            r4 = r9
        L7:
            r7 = 0
            r6 = 1
            if (r5 == 0) goto L21
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r5 == r0) goto L21
            boolean r0 = r5.isPrimitive()
            if (r0 != 0) goto L21
            boolean r0 = r5.isEnum()
            if (r0 != 0) goto L21
            boolean r0 = r5.isArray()
            if (r0 == 0) goto L42
        L21:
            if (r4 != 0) goto L25
            java.util.List r4 = java.util.Collections.EMPTY_LIST
        L25:
            java.lang.reflect.Type r1 = r12.getType()
            if (r4 == 0) goto L9d
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L9d
            java.util.Map<java.lang.reflect.Type, java.util.List<java.lang.reflect.Field>> r0 = com.bytedance.mt.protector.net_protector.NonNullFieldFactory.LJLIL
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r1, r4)
            com.google.gson.TypeAdapter r1 = r11.LJIIJJI(r10, r12)
            com.bytedance.mt.protector.net_protector.NonNullFieldFactory$1 r0 = new com.bytedance.mt.protector.net_protector.NonNullFieldFactory$1
            r0.<init>()
            return r0
        L42:
            java.lang.Package r0 = r5.getPackage()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "java"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L21
            java.lang.String r0 = "android"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L5b
            goto L21
        L5b:
            java.lang.reflect.Field[] r3 = r5.getDeclaredFields()
            int r2 = r3.length
        L60:
            if (r7 >= r2) goto L7c
            r1 = r3[r7]
            r1.setAccessible(r6)
            java.lang.Class<X.Pkk> r0 = X.InterfaceC65346Pkk.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L79
            if (r4 != 0) goto L76
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L76:
            r4.add(r1)
        L79:
            int r7 = r7 + 1
            goto L60
        L7c:
            java.lang.reflect.Type r3 = r8.getType()
            java.lang.Class r2 = r8.getRawType()
            java.lang.reflect.Type r1 = r5.getGenericSuperclass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.reflect.Type r0 = com.google.gson.internal.a.LJII(r3, r2, r1, r0)
            if (r0 == 0) goto L97
            com.google.gson.reflect.TypeToken r8 = com.google.gson.reflect.TypeToken.get(r0)
        L97:
            java.lang.Class r5 = r8.getRawType()
            goto L7
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.mt.protector.net_protector.NonNullFieldFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }
}
