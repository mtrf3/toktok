package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: X.Nqo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60626Nqo implements InterfaceC60636Nqy {
    public final String LIZ;
    public HashMap<Class<? extends InterfaceC60410NnK>, InterfaceC60410NnK> LIZIZ = new HashMap<>();

    public C60626Nqo(String str) {
        this.LIZ = str;
    }

    public static <T> T LIZIZ(Class<? extends T> cls) {
        Constructor<?> constructor;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (true) {
            if (i < length) {
                constructor = declaredConstructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i++;
            } else {
                constructor = null;
                break;
            }
        }
        if (constructor != null) {
            try {
                try {
                    constructor.setAccessible(true);
                    return (T) constructor.newInstance(new Object[0]);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(e3);
            }
        }
        throw new RuntimeException();
    }

    @Override // X.InterfaceC60636Nqy
    public final <T extends InterfaceC60410NnK> T LIZ(Class<T> cls) {
        T t = (T) this.LIZIZ.get(cls);
        if (t == null) {
            synchronized (C60632Nqu.class) {
                t = (T) this.LIZIZ.get(cls);
                if (t == null) {
                    C60625Nqn LIZ = C60625Nqn.LIZ(cls, this.LIZ);
                    if (LIZ != null) {
                        t = (T) LIZIZ(LIZ.LIZ);
                        if (!(t instanceof InterfaceC60638Nr0)) {
                            t = null;
                        } else {
                            InterfaceC60638Nr0 interfaceC60638Nr0 = (InterfaceC60638Nr0) t;
                            interfaceC60638Nr0.LIZLLL(LIZ);
                            interfaceC60638Nr0.getExtendableContext().LIZ(LIZ.LIZIZ);
                        }
                        HashMap<Class<? extends InterfaceC60410NnK>, InterfaceC60410NnK> hashMap = new HashMap<>(this.LIZIZ);
                        hashMap.put(cls, t);
                        this.LIZIZ = hashMap;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("nameSpace ");
                        LIZ2.append(this.LIZ);
                        LIZ2.append("& class ");
                        LIZ2.append(C16880lQ.LJLLILLLL(cls));
                        LIZ2.append(" 's env is null");
                        throw new Error(X1D.LIZIZ(LIZ2));
                    }
                }
            }
        }
        return t;
    }
}
