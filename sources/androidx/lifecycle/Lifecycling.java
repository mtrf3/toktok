package androidx.lifecycle;

import X.C16880lQ;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Lifecycling {
    public static Map<Class<?>, Integer> sCallbackCache = new HashMap();
    public static Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> sClassToAdapters = new HashMap();

    public static Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String LJLLILLLL = C16880lQ.LJLLILLLL(cls);
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                LJLLILLLL = LJLLILLLL.substring(str.length() + 1);
            }
            String adapterName = getAdapterName(LJLLILLLL);
            if (!str.isEmpty()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(".");
                LIZ.append(adapterName);
                adapterName = X1D.LIZIZ(LIZ);
            }
            Constructor declaredConstructor = Class.forName(adapterName).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getAdapterName(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str.replace(".", "_"));
        LIZ.append("_LifecycleAdapter");
        return X1D.LIZIZ(LIZ);
    }

    public static GenericLifecycleObserver getCallback(Object obj) {
        final LifecycleEventObserver lifecycleEventObserver = lifecycleEventObserver(obj);
        return new GenericLifecycleObserver() { // from class: androidx.lifecycle.Lifecycling.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleEventObserver.this.onStateChanged(lifecycleOwner, event);
            }
        };
    }

    public static int getObserverConstructorType(Class<?> cls) {
        Integer num = sCallbackCache.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        sCallbackCache.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    public static boolean isLifecycleParent(Class<?> cls) {
        if (cls != null && LifecycleObserver.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public static LifecycleEventObserver lifecycleEventObserver(Object obj) {
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof FullLifecycleObserver;
        if (z) {
            if (z2) {
                return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj, (LifecycleEventObserver) obj);
            }
        } else {
            if (z2) {
                return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj, null);
            }
            if (!z) {
                Class<?> cls = obj.getClass();
                if (getObserverConstructorType(cls) == 2) {
                    List<Constructor<? extends GeneratedAdapter>> list = sClassToAdapters.get(cls);
                    if (list.size() == 1) {
                        return new SingleGeneratedAdapterObserver(createGeneratedAdapter((Constructor) ListProtector.get(list, 0), obj));
                    }
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        generatedAdapterArr[i] = createGeneratedAdapter((Constructor) ListProtector.get(list, i), obj);
                    }
                    return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
                return new ReflectiveGenericLifecycleObserver(obj);
            }
        }
        return (LifecycleEventObserver) obj;
    }

    public static int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        if (C16880lQ.LJLLILLLL(cls) == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            sClassToAdapters.put(cls, Collections.singletonList(generatedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (isLifecycleParent(superclass)) {
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(sClassToAdapters.get(superclass));
        } else {
            arrayList = null;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (isLifecycleParent(cls2)) {
                if (getObserverConstructorType(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(sClassToAdapters.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        sClassToAdapters.put(cls, arrayList);
        return 2;
    }

    public static GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
