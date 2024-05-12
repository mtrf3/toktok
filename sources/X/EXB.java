package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class EXB {
    public static Application LIZ;

    static {
        C16880lQ.LJLLJ(EXB.class);
    }

    public static Object LIZ(Context context, Class<?> cls) {
        try {
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            if (invoke == null && context != null) {
                Field field = context.getClass().getField("mLoadedApk");
                field.setAccessible(true);
                Object obj = field.get(context);
                Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            }
            return invoke;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void LIZJ(Context context, Application application, Application application2) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object LIZ2 = LIZ(context, cls);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            Application application3 = (Application) declaredField.get(LIZ2);
            if (application2 != null) {
                if (application3 == application) {
                    declaredField.set(LIZ2, application2);
                }
                Field declaredField2 = cls.getDeclaredField("mAllApplications");
                declaredField2.setAccessible(true);
                List list = (List) declaredField2.get(LIZ2);
                for (int i = 0; i < list.size(); i++) {
                    if (ListProtector.get(list, i) == application) {
                        ListProtector.set(list, i, application2);
                    }
                }
            }
            LIZIZ(application, application2, cls, LIZ2);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static void LIZIZ(Application application, Application application2, Class cls, Object obj) {
        Class<?> cls2;
        Field field;
        try {
            cls2 = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException unused) {
            cls2 = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls2.getDeclaredField("mApplication");
        declaredField.setAccessible(true);
        cls2.getDeclaredField("mResDir").setAccessible(true);
        try {
            field = Application.class.getDeclaredField("mLoadedApk");
        } catch (NoSuchFieldException unused2) {
            field = null;
        }
        String[] strArr = {"mPackages", "mResourcePackages"};
        int i = 0;
        do {
            Field declaredField2 = cls.getDeclaredField(strArr[i]);
            declaredField2.setAccessible(true);
            Iterator it = ((java.util.Map) declaredField2.get(obj)).entrySet().iterator();
            while (it.hasNext()) {
                Object obj2 = ((Reference) ((Map.Entry) it.next()).getValue()).get();
                if (obj2 != null && declaredField.get(obj2) == application && application2 != null) {
                    declaredField.set(obj2, application2);
                    if (field != null) {
                        field.set(application2, obj2);
                    }
                }
            }
            i++;
        } while (i < 2);
    }
}
