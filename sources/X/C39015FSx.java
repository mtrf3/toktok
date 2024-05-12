package X;

import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

/* renamed from: X.FSx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39015FSx {
    public static volatile Field LIZ;
    public static volatile Field LIZIZ;

    public static Object LIZ(Object obj) {
        try {
            if (LIZ == null) {
                synchronized (C39015FSx.class) {
                    if (LIZ == null) {
                        LIZ = obj.getClass().getDeclaredField("callable");
                        LIZ.setAccessible(true);
                    }
                }
            }
            return LIZ.get(obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static String LIZIZ(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!className.contains("libcore.io") && !className.contains("java.io") && !className.contains("android.database.sqlite") && !className.contains("android.database.AbstractCursor") && !className.contains("dalvik.system") && !className.contains("android.os") && !className.contains("com.ss.android.ugc.conan") && !className.contains("com.lody.whale")) {
                        String methodName = stackTraceElement.getMethodName();
                        if (!methodName.equals("getThreadStackTrace") && !methodName.equals("getStackTrace")) {
                            sb.append("\tat ");
                            sb.append(stackTraceElement.getClassName());
                            sb.append(".");
                            sb.append(stackTraceElement.getMethodName());
                            sb.append("(");
                            sb.append(stackTraceElement.getFileName());
                            sb.append(":");
                            sb.append(stackTraceElement.getLineNumber());
                            sb.append(")\n");
                        }
                    }
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String LIZJ(Object obj) {
        Object obj2;
        Object LIZ2;
        if ((obj instanceof FutureTask) && (LIZ2 = LIZ(obj)) != null) {
            obj = LIZ2;
        }
        if ("java.util.concurrent.Executors$RunnableAdapter".equals(obj.getClass().getName())) {
            try {
                if (LIZIZ == null) {
                    synchronized (C39015FSx.class) {
                        if (LIZIZ == null) {
                            LIZIZ = obj.getClass().getDeclaredField("task");
                            LIZIZ.setAccessible(true);
                        }
                    }
                }
                obj2 = LIZIZ.get(obj);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                obj2 = null;
            }
            if (obj2 != null) {
                obj = obj2;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!LIZLLL(obj.getClass())) {
            String obj3 = obj.toString();
            int indexOf = obj3.indexOf("@");
            if (indexOf > 0) {
                obj3 = obj3.substring(0, indexOf);
            }
            sb.append(obj3);
            sb.append(",");
        }
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object obj4 = field.get(obj);
                if (obj4 != null) {
                    Class<?> cls = obj4.getClass();
                    if (!LIZLLL(cls)) {
                        String name = cls.getName();
                        int indexOf2 = name.indexOf("@");
                        if (indexOf2 > 0) {
                            name = name.substring(0, indexOf2);
                        }
                        sb.append(name);
                        sb.append(",");
                    }
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return sb.toString().replaceAll("class ", "");
    }

    public static boolean LIZLLL(Class cls) {
        String name = cls.getName();
        if ("java.lang.Integer".equals(name) || "java.lang.Boolean".equals(name) || "java.lang.Long".equals(name) || "java.lang.Float".equals(name) || "java.lang.Double".equals(name) || "java.lang.String".equals(name) || "sun.misc.Unsafe".equals(name) || "v5.n".equals(name) || "java.util.ArrayList".equals(name) || name.contains("android.os.Handler") || name.contains("com.bytedance.common.utility.collection.WeakHandler") || name.contains("java.util.concurrent.Executors$RunnableAdapter") || name.contains("bolts.Task") || cls.isPrimitive()) {
            return true;
        }
        return false;
    }
}
