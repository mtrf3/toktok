package X;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class QD2 {
    public static final java.util.Map<Class<?>, List<QD4>> LIZ = new ConcurrentHashMap();
    public static final QD1[] LIZIZ = new QD1[4];

    public static QD1 LIZJ() {
        synchronized (LIZIZ) {
            int i = 0;
            do {
                QD1[] qd1Arr = LIZIZ;
                QD1 qd1 = qd1Arr[i];
                if (qd1 != null) {
                    qd1Arr[i] = null;
                    return qd1;
                }
                i++;
            } while (i < 4);
            return new QD1();
        }
    }

    public static final void LIZ(QD1 qd1) {
        Method[] methods;
        QD3 qd3;
        try {
            methods = qd1.LJ.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = qd1.LJ.getMethods();
            qd1.LJFF = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && (qd3 = (QD3) method.getAnnotation(QD3.class)) != null) {
                    Class<?> cls = parameterTypes[0];
                    Object put = ((HashMap) qd1.LIZIZ).put(cls, method);
                    if (put != null) {
                        if (put instanceof Method) {
                            if (qd1.LIZ((Method) put, cls)) {
                                ((HashMap) qd1.LIZIZ).put(cls, qd1);
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        if (!qd1.LIZ(method, cls)) {
                        }
                    }
                    ((ArrayList) qd1.LIZ).add(new QD4(method, cls, qd3.threadMode(), qd3.priority(), qd3.sticky()));
                }
            }
        }
    }

    public static List LIZIZ(QD1 qd1) {
        ArrayList arrayList = new ArrayList(qd1.LIZ);
        ((ArrayList) qd1.LIZ).clear();
        ((HashMap) qd1.LIZIZ).clear();
        ((HashMap) qd1.LIZJ).clear();
        int i = 0;
        qd1.LIZLLL.setLength(0);
        qd1.LJ = null;
        qd1.LJFF = false;
        synchronized (LIZIZ) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                QD1[] qd1Arr = LIZIZ;
                if (qd1Arr[i] == null) {
                    qd1Arr[i] = qd1;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
