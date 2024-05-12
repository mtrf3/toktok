package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HM9 implements InvocationHandler {
    public final /* synthetic */ HM5 LIZ;

    public HM9(HM5 hm5) {
        this.LIZ = hm5;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        Object stringSet;
        HM7 hm7 = (HM7) method.getAnnotation(HM7.class);
        HM8 hm8 = (HM8) method.getAnnotation(HM8.class);
        if (hm7 != null) {
            HM5 hm5 = this.LIZ;
            if (objArr != null && objArr.length == 1) {
                Class<?> parameterType = method.getParameterTypes()[0];
                String value = hm7.value();
                Object obj3 = objArr[0];
                o.LJFF(parameterType, "parameterType");
                if (obj3 == null && (parameterType.isAssignableFrom(Integer.TYPE) || parameterType.isAssignableFrom(Float.TYPE) || parameterType.isAssignableFrom(Boolean.TYPE) || parameterType.isAssignableFrom(Long.TYPE) || parameterType.isAssignableFrom(Long.class) || parameterType.isAssignableFrom(Integer.class) || parameterType.isAssignableFrom(Float.class) || parameterType.isAssignableFrom(Boolean.class) || parameterType.isAssignableFrom(Long.class))) {
                    hm5.remove(value);
                    return null;
                }
                if (parameterType.isAssignableFrom(Integer.TYPE) || parameterType.isAssignableFrom(Integer.class)) {
                    if (obj3 != null) {
                        hm5.LJ(((Integer) obj3).intValue(), value);
                        return null;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                }
                if (parameterType.isAssignableFrom(Float.TYPE) || parameterType.isAssignableFrom(Float.class)) {
                    if (obj3 != null) {
                        hm5.LJII(((Float) obj3).floatValue(), value);
                        return null;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Float");
                }
                if (parameterType.isAssignableFrom(Boolean.TYPE) || parameterType.isAssignableFrom(Boolean.class)) {
                    if (obj3 != null) {
                        hm5.LIZIZ(value, ((Boolean) obj3).booleanValue());
                        return null;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                }
                if (parameterType.isAssignableFrom(Long.TYPE) || parameterType.isAssignableFrom(Long.class)) {
                    if (obj3 != null) {
                        hm5.LIZ(((Long) obj3).longValue(), value);
                        return null;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
                }
                if (parameterType.isAssignableFrom(String.class)) {
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    hm5.LIZJ(value, (String) obj3);
                    return null;
                }
                if (parameterType.isAssignableFrom(byte[].class)) {
                    if (!(obj3 instanceof byte[])) {
                        obj3 = null;
                    }
                    hm5.LJFF(value, (byte[]) obj3);
                    return null;
                }
                if (parameterType.isAssignableFrom(java.util.Set.class)) {
                    if (!(obj3 instanceof java.util.Set)) {
                        obj3 = null;
                    }
                    hm5.LIZLLL(value, (java.util.Set) obj3);
                    return null;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Method ");
                LIZ.append(method.getName());
                LIZ.append(" with @In annotation has incompatible parameter type ");
                LIZ.append(C16880lQ.LJLLILLLL(parameterType));
                LIZ.append('.');
                throw new HMA(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Method ");
            LIZ2.append(method.getName());
            LIZ2.append(" with @In annotation should have at least and only One parameter.");
            throw new HMA(X1D.LIZIZ(LIZ2));
        }
        if (hm8 == null) {
            return null;
        }
        HM5 hm52 = this.LIZ;
        if (objArr != null) {
            if (objArr.length == 0 || objArr.length == 1) {
                obj2 = ORY.LJJJJI(0, objArr);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Method ");
                LIZ3.append(method.getName());
                LIZ3.append(" with @Out annotation should have One or Zero parameter.");
                throw new HMA(X1D.LIZIZ(LIZ3));
            }
        } else {
            obj2 = null;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType.isAssignableFrom(Integer.TYPE) || returnType.isAssignableFrom(Integer.class)) {
            if (obj2 != null) {
                return Integer.valueOf(hm52.getInt(hm8.value(), ((Integer) obj2).intValue()));
            }
            return Integer.valueOf(hm52.getInt(hm8.value(), 0));
        }
        if (returnType.isAssignableFrom(Float.TYPE) || returnType.isAssignableFrom(Float.class)) {
            if (obj2 != null) {
                return Float.valueOf(hm52.getFloat(hm8.value(), ((Float) obj2).floatValue()));
            }
            return Float.valueOf(hm52.getFloat(hm8.value(), 0.0f));
        }
        if (returnType.isAssignableFrom(Boolean.TYPE) || returnType.isAssignableFrom(Boolean.class)) {
            if (obj2 != null) {
                return Boolean.valueOf(hm52.getBoolean(hm8.value(), ((Boolean) obj2).booleanValue()));
            }
            return Boolean.valueOf(hm52.getBoolean(hm8.value(), false));
        }
        if (returnType.isAssignableFrom(Long.TYPE) || returnType.isAssignableFrom(Long.class)) {
            if (obj2 != null) {
                return Long.valueOf(hm52.getLong(hm8.value(), ((Long) obj2).longValue()));
            }
            return Long.valueOf(hm52.getLong(hm8.value(), 0L));
        }
        if (returnType.isAssignableFrom(String.class)) {
            if (obj2 == null || (stringSet = hm52.getString(hm8.value(), (String) obj2)) == null) {
                return hm52.getString(hm8.value(), null);
            }
        } else if (returnType.isAssignableFrom(byte[].class)) {
            if (obj2 == null || (stringSet = hm52.LJI(hm8.value(), (byte[]) obj2)) == null) {
                return hm52.LJI(hm8.value(), null);
            }
        } else if (returnType.isAssignableFrom(java.util.Set.class)) {
            if (obj2 == null || (stringSet = hm52.getStringSet(hm8.value(), (java.util.Set) obj2)) == null) {
                return hm52.getStringSet(hm8.value(), null);
            }
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Method ");
            LIZ4.append(method.getName());
            LIZ4.append(" with @Out annotation has incompatible return type ");
            LIZ4.append(C16880lQ.LJLLILLLL(returnType));
            LIZ4.append('.');
            throw new HMA(X1D.LIZIZ(LIZ4));
        }
        return stringSet;
    }
}
