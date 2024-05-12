package X;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EWC {
    public static final java.util.Map<String, Method> LIZ = new HashMap();
    public static final HashMap<Class<?>, Class<?>> LIZIZ;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        LIZIZ = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LIZ(Class<?> cls, String str, Class... clsArr) {
        Method method;
        Method[] declaredMethods;
        boolean isAssignableFrom;
        C73340SqO.LJIIL(cls, "The class must not be null");
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.toString());
            sb.append("#");
            sb.append(str);
            if (clsArr != null && clsArr.length > 0) {
                for (Class cls2 : clsArr) {
                    sb.append(cls2.toString());
                    sb.append("#");
                }
            } else {
                sb.append(Void.class.toString());
            }
            String sb2 = sb.toString();
            java.util.Map<String, Method> map = LIZ;
            synchronized (map) {
                method = (Method) ((HashMap) map).get(sb2);
            }
            if (method != null) {
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                return method;
            }
            while (cls != null) {
                try {
                    EWE.LIZ();
                    method = cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
                if (method == null && (declaredMethods = cls.getDeclaredMethods()) != null) {
                    for (Method method2 : declaredMethods) {
                        if (method2 != null && TextUtils.equals(method2.getName(), str)) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (clsArr != null && clsArr.length == parameterTypes.length) {
                                boolean z = true;
                                for (int i = 0; i < clsArr.length; i++) {
                                    Class cls3 = clsArr[i];
                                    Class<?> cls4 = parameterTypes[i];
                                    if (cls4 == null) {
                                        isAssignableFrom = false;
                                    } else if (cls3 == null) {
                                        isAssignableFrom = !cls4.isPrimitive();
                                    } else {
                                        if (cls3.isPrimitive() && !cls4.isPrimitive()) {
                                            cls3 = (Class) LIZIZ.get(cls3);
                                        }
                                        boolean isPrimitive = cls4.isPrimitive();
                                        Class cls5 = cls4;
                                        if (isPrimitive) {
                                            cls5 = cls4;
                                            if (!cls3.isPrimitive()) {
                                                cls5 = LIZIZ.get(cls4);
                                            }
                                        }
                                        isAssignableFrom = cls5.isAssignableFrom(cls3);
                                    }
                                    if (!isAssignableFrom) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    method = method2;
                                }
                            }
                        }
                    }
                }
                if (method != null) {
                    method.setAccessible(true);
                    java.util.Map<String, Method> map2 = LIZ;
                    synchronized (map2) {
                        ((HashMap) map2).put(sb2, method);
                    }
                    return method;
                }
                cls = cls.getSuperclass();
            }
            return null;
        }
        throw new IllegalArgumentException("The method name must not be blank");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r3.length != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r13 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r13.length == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r9 = LIZ(r11, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r9 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        r2 = new X.C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", r9, new java.lang.Object[]{null, r13}, "java.lang.Object", new X.C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "563377368818132739"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r2.LIZ == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r9.invoke(null, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r13 = X.EWD.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r3 = X.EWD.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0026, code lost:
    
        if (r3 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZIZ(java.lang.Class r11, java.lang.String r12, java.lang.Object... r13) {
        /*
            int r0 = r13.length
            if (r0 == 0) goto L21
        L4:
            r4 = 0
            r0 = 0
            if (r13 == 0) goto L24
            int r1 = r13.length
            if (r1 == 0) goto L24
            int r1 = r13.length
            java.lang.Class[] r3 = new java.lang.Class[r1]
            r2 = 0
        Lf:
            int r1 = r13.length
            if (r2 >= r1) goto L28
            r1 = r13[r2]
            if (r1 != 0) goto L1c
            r1 = r0
        L17:
            r3[r2] = r1
            int r2 = r2 + 1
            goto Lf
        L1c:
            java.lang.Class r1 = r1.getClass()
            goto L17
        L21:
            java.lang.Object[] r13 = X.EWD.LIZ
            goto L4
        L24:
            java.lang.Class<?>[] r3 = X.EWD.LIZIZ
            if (r3 == 0) goto L68
        L28:
            int r1 = r3.length
            if (r1 == 0) goto L68
        L2b:
            if (r13 == 0) goto L65
            int r1 = r13.length
            if (r1 == 0) goto L65
        L30:
            java.lang.reflect.Method r9 = LIZ(r11, r12, r3)
            if (r9 == 0) goto L5f
            X.0Dg r5 = new X.0Dg
            r1 = 2
            r5.<init>(r1)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r4] = r0
            r3 = 1
            r10[r3] = r13
            X.Pk0 r12 = new X.Pk0
            java.lang.String r2 = "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r1 = "563377368818132739"
            r12.<init>(r3, r2, r1)
            r6 = 110000(0x1adb0, float:1.54143E-40)
            java.lang.String r7 = "java/lang/reflect/Method"
            java.lang.String r8 = "invoke"
            java.lang.String r11 = "java.lang.Object"
            X.Ff9 r2 = r5.LIZJ(r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r2.LIZ
            if (r1 == 0) goto L60
            java.lang.Object r0 = r2.LIZIZ
        L5f:
            return r0
        L60:
            java.lang.Object r0 = r9.invoke(r0, r13)
            goto L5f
        L65:
            java.lang.Object[] r13 = X.EWD.LIZ
            goto L30
        L68:
            java.lang.Class<?>[] r3 = X.EWD.LIZIZ
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EWC.LIZIZ(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.Object");
    }
}
