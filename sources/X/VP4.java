package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class VP4 {
    public static final java.util.Map<Class, java.util.Map<String, AbstractC79677VOv>> LIZ = new ConcurrentHashMap();
    public static final java.util.Map<String, AbstractC79677VOv> LIZIZ = new HashMap();

    public static java.util.Map<String, AbstractC79677VOv> LIZJ(Class<? extends LynxBaseUI> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return LIZIZ;
        }
        java.util.Map<String, AbstractC79677VOv> map = (java.util.Map) ((ConcurrentHashMap) LIZ).get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        if (cls == LynxBaseUI.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        hashMap.putAll(LIZJ(superclass));
        for (Method method : cls.getDeclaredMethods()) {
            VPD vpd = (VPD) method.getAnnotation(VPD.class);
            if (vpd != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    hashMap.put(vpd.name(), LIZ(vpd, method, parameterTypes[0]));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Wrong number of args for prop setter: ");
                    LIZ2.append(cls.getName());
                    LIZ2.append("#");
                    LIZ2.append(method.getName());
                    throw new RuntimeException(X1D.LIZIZ(LIZ2));
                }
            }
            VPE vpe = (VPE) method.getAnnotation(VPE.class);
            if (vpe != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2) {
                    if (parameterTypes2[0] == Integer.TYPE) {
                        LIZIZ(vpe, method, parameterTypes2[1], hashMap);
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Second argument should be property index: ");
                        LIZ3.append(cls.getName());
                        LIZ3.append("#");
                        LIZ3.append(method.getName());
                        throw new RuntimeException(X1D.LIZIZ(LIZ3));
                    }
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Wrong number of args for group prop setter: ");
                    LIZ4.append(cls.getName());
                    LIZ4.append("#");
                    LIZ4.append(method.getName());
                    throw new RuntimeException(X1D.LIZIZ(LIZ4));
                }
            }
        }
        ((ConcurrentHashMap) LIZ).put(cls, hashMap);
        return hashMap;
    }

    public static java.util.Map<String, AbstractC79677VOv> LIZLLL(Class<? extends ShadowNode> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return LIZIZ;
        }
        java.util.Map<String, AbstractC79677VOv> map = (java.util.Map) ((ConcurrentHashMap) LIZ).get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        if (cls == ShadowNode.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        hashMap.putAll(LIZLLL(superclass));
        for (Method method : cls.getDeclaredMethods()) {
            VPD vpd = (VPD) method.getAnnotation(VPD.class);
            if (vpd != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    hashMap.put(vpd.name(), LIZ(vpd, method, parameterTypes[0]));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Wrong number of args for prop setter: ");
                    LIZ2.append(cls.getName());
                    LIZ2.append("#");
                    LIZ2.append(method.getName());
                    throw new RuntimeException(X1D.LIZIZ(LIZ2));
                }
            }
            VPE vpe = (VPE) method.getAnnotation(VPE.class);
            if (vpe != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2) {
                    if (parameterTypes2[0] == Integer.TYPE) {
                        LIZIZ(vpe, method, parameterTypes2[1], hashMap);
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Second argument should be property index: ");
                        LIZ3.append(cls.getName());
                        LIZ3.append("#");
                        LIZ3.append(method.getName());
                        throw new RuntimeException(X1D.LIZIZ(LIZ3));
                    }
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Wrong number of args for group prop setter: ");
                    LIZ4.append(cls.getName());
                    LIZ4.append("#");
                    LIZ4.append(method.getName());
                    throw new RuntimeException(X1D.LIZIZ(LIZ4));
                }
            }
        }
        ((ConcurrentHashMap) LIZ).put(cls, hashMap);
        return hashMap;
    }

    public static AbstractC79677VOv LIZ(VPD vpd, Method method, Class<?> cls) {
        if (cls == F5B.class) {
            return new VP8(vpd, method);
        }
        if (cls == Boolean.TYPE) {
            return new VPB(vpd, method, vpd.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new VP0(vpd, method, vpd.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new VP7(vpd, method, vpd.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new VP6(vpd, method, vpd.defaultDouble());
        }
        if (cls == String.class) {
            return new VP3(vpd, method);
        }
        if (cls == Boolean.class) {
            return new VP9(vpd, method);
        }
        if (cls == Integer.class) {
            return new VP5(vpd, method);
        }
        if (cls == ReadableArray.class) {
            return new VP1(vpd, method);
        }
        if (cls == ReadableMap.class) {
            return new VPC(vpd, method);
        }
        StringBuilder LIZIZ2 = C770830u.LIZIZ("Unrecognized type: ", cls, " for method: ");
        LIZIZ2.append(method.getDeclaringClass().getName());
        LIZIZ2.append("#");
        LIZIZ2.append(method.getName());
        throw new RuntimeException(X1D.LIZIZ(LIZIZ2));
    }

    public static void LIZIZ(VPE vpe, Method method, Class<?> cls, java.util.Map<String, AbstractC79677VOv> map) {
        String[] names = vpe.names();
        int i = 0;
        if (cls == F5B.class) {
            while (i < names.length) {
                ((HashMap) map).put(names[i], new VP8(vpe, method, i));
                i++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i < names.length) {
                ((HashMap) map).put(names[i], new VP0(vpe, method, i, vpe.defaultInt()));
                i++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i < names.length) {
                ((HashMap) map).put(names[i], new VP7(vpe, method, i, vpe.defaultFloat()));
                i++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i < names.length) {
                ((HashMap) map).put(names[i], new VP6(vpe, method, i, vpe.defaultDouble()));
                i++;
            }
            return;
        }
        if (cls == Integer.class) {
            while (i < names.length) {
                ((HashMap) map).put(names[i], new VP5(vpe, method, i));
                i++;
            }
            return;
        }
        if (cls == String.class) {
            while (i < names.length) {
                ((HashMap) map).put(names[i], new VP3(vpe, method, i));
                i++;
            }
            return;
        }
        if (cls == ReadableArray.class) {
            while (i < names.length) {
                ((HashMap) map).put(names[i], new VP1(vpe, method, i));
                i++;
            }
            return;
        }
        StringBuilder LIZIZ2 = C770830u.LIZIZ("Unrecognized type: ", cls, " for method: ");
        LIZIZ2.append(method.getDeclaringClass().getName());
        LIZIZ2.append("#");
        LIZIZ2.append(method.getName());
        throw new RuntimeException(X1D.LIZIZ(LIZIZ2));
    }
}
