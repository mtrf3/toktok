package X;

import Y.ARunnableS25S0200000_6;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.EWo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36562EWo {
    public final String LIZ = "RealIDLXBridgeRegistryCache";
    public final java.util.Map<Class<? extends InterfaceC37666EqM>, String> LIZIZ = new LinkedHashMap();
    public final ConcurrentHashMap<Class<? extends InterfaceC37666EqM>, C36550EWc> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, Class<?>> LIZLLL = new ConcurrentHashMap<>();

    public final String LIZ(Class<? extends InterfaceC37666EqM> clazz) {
        o.LJIIJ(clazz, "clazz");
        try {
            String str = (String) ((LinkedHashMap) this.LIZIZ).get(clazz);
            if (str == null) {
                ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(clazz, this, 59);
                if (C36567EWt.LIZ == null) {
                    int availableProcessors = Runtime.getRuntime().availableProcessors() / 2;
                    if (availableProcessors == 0) {
                        availableProcessors = 1;
                    }
                    C36567EWt.LIZ = C16880lQ.LLLLZ(availableProcessors);
                }
                ExecutorService executorService = C36567EWt.LIZ;
                if (executorService != null) {
                    executorService.submit(aRunnableS25S0200000_6);
                    this.LIZIZ.put(clazz, clazz.newInstance().getName());
                    str = (String) ((LinkedHashMap) this.LIZIZ).get(clazz);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            if (str != null) {
                return str;
            }
        } catch (Throwable th) {
            String str2 = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IDLXBridgeRegistryCache.find failed,clazz == ");
            LIZ.append(clazz.getName());
            LIZ.append(", e == ");
            LIZ.append(th.getMessage());
            C37887Etv.LIZIZ(str2, X1D.LIZIZ(LIZ));
        }
        return "";
    }

    public static EWZ LIZJ(Class cls, HashMap hashMap) {
        List list;
        List list2;
        int[] option;
        String[] option2;
        Method[] methods = cls.getDeclaredMethods();
        o.LJFF(methods, "methods");
        EWZ ewz = new EWZ(null);
        for (Method method : methods) {
            InterfaceC36563EWp interfaceC36563EWp = (InterfaceC36563EWp) method.getAnnotation(InterfaceC36563EWp.class);
            if (interfaceC36563EWp != null) {
                InterfaceC36566EWs defaultValue = interfaceC36563EWp.defaultValue();
                ED7 ed7 = (ED7) method.getAnnotation(ED7.class);
                ED6 ed6 = (ED6) method.getAnnotation(ED6.class);
                C65776Prg LIZ = C65352Pkq.LIZ(interfaceC36563EWp.nestedClassType());
                String keyPath = interfaceC36563EWp.keyPath();
                if ((!o.LJ(LIZ, C65352Pkq.LIZ(C35771E2d.class))) && !hashMap.containsKey(C39557Ffl.LIZ(LIZ)) && !ewz.LJLILLLLZI.containsKey(keyPath)) {
                    hashMap.put(C39557Ffl.LIZ(LIZ), LIZJ(C39557Ffl.LIZ(LIZ), hashMap));
                }
                boolean required = interfaceC36563EWp.required();
                C65776Prg LIZ2 = C65352Pkq.LIZ(interfaceC36563EWp.primitiveClassType());
                boolean isEnum = interfaceC36563EWp.isEnum();
                boolean isGetter = interfaceC36563EWp.isGetter();
                C36561EWn c36561EWn = new C36561EWn(defaultValue.type(), defaultValue.doubleValue(), defaultValue.stringValue(), defaultValue.intValue(), defaultValue.boolValue(), defaultValue.longValue());
                Class<?> returnType = method.getReturnType();
                o.LJFF(returnType, "method.returnType");
                if (ed7 == null || (option2 = ed7.option()) == null || (list = ORY.LJJZZIII(option2)) == null) {
                    list = C61878OQg.INSTANCE;
                }
                if (ed6 == null || (option = ed6.option()) == null || (list2 = ORY.LJJZ(option)) == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                C36548EWa c36548EWa = new C36548EWa(required, keyPath, LIZ, LIZ2, isEnum, isGetter, c36561EWn, returnType, list, list2);
                ewz.LJLIL.put(method, c36548EWa);
                if (interfaceC36563EWp.isGetter()) {
                    ewz.LJLILLLLZI.put(keyPath, c36548EWa);
                }
            }
        }
        return ewz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        r3 = r7.getDeclaredClasses();
        kotlin.jvm.internal.o.LJFF(r3, "clazz.declaredClasses");
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r1 >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r4 = r3[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r4.getAnnotation(r8) == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class<?> LIZIZ(java.lang.Class<? extends X.InterfaceC37666EqM> r7, java.lang.Class<? extends java.lang.annotation.Annotation> r8) {
        /*
            r6 = this;
            r5 = 0
            java.lang.Class r1 = r7.getSuperclass()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "clazz.superclass"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class[] r3 = r1.getDeclaredClasses()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "clazz.superclass.declaredClasses"
            kotlin.jvm.internal.o.LJFF(r3, r0)     // Catch: java.lang.Throwable -> L3e
            int r2 = r3.length     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            goto L18
        L16:
            int r1 = r1 + 1
        L18:
            if (r1 >= r2) goto L23
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L3e
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r8)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L16
            goto L3c
        L23:
            java.lang.Class[] r3 = r7.getDeclaredClasses()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "clazz.declaredClasses"
            kotlin.jvm.internal.o.LJFF(r3, r0)     // Catch: java.lang.Throwable -> L3e
            int r2 = r3.length     // Catch: java.lang.Throwable -> L3e
            r1 = 0
        L2e:
            if (r1 >= r2) goto L64
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L3e
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r8)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L2e
        L3c:
            r5 = r4
            goto L64
        L3e:
            r3 = move-exception
            java.lang.String r2 = r6.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "findModelClassByAnnotation failed, class == "
            r1.append(r0)
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = ", e == "
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C37887Etv.LIZIZ(r2, r0)
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36562EWo.LIZIZ(java.lang.Class, java.lang.Class):java.lang.Class");
    }
}
