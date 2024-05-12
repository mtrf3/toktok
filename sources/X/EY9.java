package X;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.common.utility.reflect.Reflect;
import java.lang.reflect.Constructor;

/* loaded from: classes7.dex */
public final class EY9 {
    public static Context LIZ(Context context) {
        Class<?>[] clsArr;
        Object[] objArr;
        Object obj = Reflect.on(context).field("mMainThread", new Class[0]).get();
        Object obj2 = Reflect.on(context).field("mUser", new Class[0]).get();
        Object obj3 = Reflect.on(context.getResources()).call("getCompatibilityInfo").get();
        Reflect on = Reflect.on(obj);
        Class<?> cls = Integer.TYPE;
        Object obj4 = on.call("getPackageInfo", new Class[]{String.class, obj3.getClass(), cls, cls}, "com.google.android.gms", obj3, 1073741824, Reflect.on(obj2).call("getIdentifier").get()).get();
        if (obj4 != null) {
            Class<?> cls2 = Class.forName("android.app.ContextImpl");
            int i = Build.VERSION.SDK_INT;
            if (i == 30) {
                Object obj5 = Reflect.on(context).field("mToken", new Class[0]).get();
                Object obj6 = Reflect.on(context).field("mAttributionTag", new Class[0]).get();
                clsArr = new Class[]{cls2, obj.getClass(), obj4.getClass(), String.class, String.class, IBinder.class, obj2.getClass(), cls, ClassLoader.class, String.class};
                objArr = new Object[]{context, obj, obj4, obj6, null, obj5, obj2, 0, null, null};
            } else if (i == 29) {
                Object obj7 = Reflect.on(context).field("mActivityToken", new Class[0]).get();
                clsArr = new Class[]{cls2, obj.getClass(), obj4.getClass(), String.class, IBinder.class, obj2.getClass(), cls, ClassLoader.class, String.class};
                objArr = new Object[]{context, obj, obj4, null, obj7, obj2, 0, null, null};
            } else if (i >= 26 && i < 29) {
                Object obj8 = Reflect.on(context).field("mActivityToken", new Class[0]).get();
                clsArr = new Class[]{cls2, obj.getClass(), obj4.getClass(), String.class, IBinder.class, obj2.getClass(), cls, ClassLoader.class};
                objArr = new Object[]{context, obj, obj4, null, obj8, obj2, 0, null};
            } else {
                return null;
            }
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return (Context) declaredConstructor.newInstance(objArr);
        }
        return null;
    }
}
