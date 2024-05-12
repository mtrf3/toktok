package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.PmK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65444PmK {
    public static final ConcurrentHashMap<Class<?>, Object> LIZ;

    static {
        Boolean bool = new Boolean(true);
        String str = new String();
        Character ch = new Character((char) 0);
        Byte b = new Byte((byte) 0);
        Short sh = new Short((short) 0);
        Integer num = new Integer(0);
        Float f = new Float(0.0f);
        Long l = new Long(0L);
        Double d = new Double(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        BigInteger bigInteger = new BigInteger(CardStruct.IStatusCode.DEFAULT);
        BigDecimal bigDecimal = new BigDecimal(CardStruct.IStatusCode.DEFAULT);
        C61705OJp c61705OJp = new C61705OJp(0L);
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(C61705OJp.class, c61705OJp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T LIZ(T t) {
        T t2;
        if (t == 0 || LIZJ(t.getClass())) {
            return t;
        }
        if (t instanceof C65445PmL) {
            return (T) ((C65445PmL) t).clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof C65446PmM) {
            t2 = (T) ((C65446PmM) t).clone();
        } else {
            if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t).toArray();
                LIZIZ(array, array);
                return (T) Arrays.asList(array);
            }
            t2 = (T) C65321PkL.LJFF(cls);
        }
        LIZIZ(t, t2);
        return t2;
    }

    public static boolean LIZJ(Type type) {
        if (type instanceof WildcardType) {
            type = C65321PkL.LIZ((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive() && cls != Character.class && cls != String.class && cls != Integer.class && cls != Long.class && cls != Short.class && cls != Byte.class && cls != Float.class && cls != Double.class && cls != BigInteger.class && cls != BigDecimal.class && cls != C61705OJp.class && cls != Boolean.class) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Class cls) {
        Object LJFF;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(cls) == null) {
            synchronized (concurrentHashMap) {
                if (concurrentHashMap.get(cls) == null) {
                    int i = 0;
                    if (cls.isArray()) {
                        Class cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        LJFF = Array.newInstance((Class<?>) cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        C65454PmU LIZ2 = C65453PmT.LIZIZ(cls, false).LIZ(null);
                        Object[] objArr = {cls};
                        if (LIZ2 != null) {
                            LJFF = V0N.LJJJ(LIZ2.LIZIZ.getDeclaringClass(), LIZ2.LIZIZ.getName());
                        } else {
                            throw new NullPointerException(C45804HyK.LJIJI("enum missing constant with @NullValue annotation: %s", objArr));
                        }
                    } else {
                        LJFF = C65321PkL.LJFF(cls);
                    }
                    LIZ.put(cls, LJFF);
                }
            }
        }
    }

    public static void LIZIZ(Object obj, Object obj2) {
        boolean z;
        C65453PmT c65453PmT;
        Object obj3;
        int i;
        Class<?> cls = obj.getClass();
        boolean z2 = true;
        int i2 = 0;
        if (cls == obj2.getClass()) {
            z = true;
        } else {
            z = false;
        }
        C77357UXp.LJFF(z);
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z2 = false;
            }
            C77357UXp.LJFF(z2);
            Iterator it = C65321PkL.LJ(obj).iterator();
            while (it.hasNext()) {
                Array.set(obj2, i2, LIZ(it.next()));
                i2++;
            }
            return;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            Collection collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                collection2.add(LIZ(it2.next()));
            }
            return;
        }
        boolean isAssignableFrom = C65445PmL.class.isAssignableFrom(cls);
        if (!isAssignableFrom) {
            if (!java.util.Map.class.isAssignableFrom(cls)) {
                c65453PmT = C65453PmT.LIZIZ(cls, false);
            } else {
                if (C65446PmM.class.isAssignableFrom(cls)) {
                    C65446PmM c65446PmM = (C65446PmM) obj2;
                    C65446PmM c65446PmM2 = (C65446PmM) obj;
                    int i3 = c65446PmM2.LJLIL;
                    while (i2 < i3) {
                        if (i2 < 0 || i2 >= c65446PmM2.LJLIL || (i = (i2 << 1) + 1) < 0) {
                            obj3 = null;
                        } else {
                            obj3 = c65446PmM2.LJLILLLLZI[i];
                        }
                        Object LIZ2 = LIZ(obj3);
                        int i4 = c65446PmM.LJLIL;
                        if (i2 >= 0 && i2 < i4) {
                            c65446PmM.LJLILLLLZI[(i2 << 1) + 1] = LIZ2;
                            i2++;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    }
                    return;
                }
                java.util.Map map = (java.util.Map) obj2;
                for (Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                    map.put(entry.getKey(), LIZ(entry.getValue()));
                }
                return;
            }
        } else {
            c65453PmT = ((C65445PmL) obj).LJLILLLLZI;
        }
        Iterator<String> it3 = c65453PmT.LIZLLL.iterator();
        while (it3.hasNext()) {
            C65454PmU LIZ3 = c65453PmT.LIZ(it3.next());
            if (!Modifier.isFinal(LIZ3.LIZIZ.getModifiers()) && (!isAssignableFrom || !LIZ3.LIZ)) {
                Object LIZ4 = LIZ3.LIZ(obj);
                if (LIZ4 != null) {
                    LIZ3.LIZLLL(obj2, LIZ(LIZ4));
                }
            }
        }
    }

    public static Type LJ(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C65321PkL.LIZ((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type LJI = C65321PkL.LJI(list, (TypeVariable) type);
            if (LJI != null) {
                type = LJI;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
