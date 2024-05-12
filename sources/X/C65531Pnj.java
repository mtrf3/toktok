package X;

import android.content.Context;
import android.os.Bundle;
import defpackage.a1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* renamed from: X.Pnj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65531Pnj {
    public static final C0MA<String, Class<?>> LIZ = new C0MA<>();

    public static boolean LIZJ(WM7 wm7) {
        Class<?> cls = wm7.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return false;
        }
        int modifiers = cls.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            return false;
        }
        if (cls.isMemberClass() && !Modifier.isStatic(modifiers)) {
            return false;
        }
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length > 0) {
                return false;
            }
        }
        return true;
    }

    public static WM7 LIZ(Bundle bundle, Class cls) {
        try {
            WM7 wm7 = (WM7) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(wm7.getClass().getClassLoader());
                wm7.mArguments = bundle;
            }
            return wm7;
        } catch (IllegalAccessException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unable to instantiate scene ");
            LIZ2.append(cls);
            LIZ2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C65532Pnk(X1D.LIZIZ(LIZ2), e);
        } catch (InstantiationException e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Unable to instantiate scene ");
            LIZ3.append(cls);
            LIZ3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C65532Pnk(X1D.LIZIZ(LIZ3), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Unable to instantiate scene ");
            LIZ4.append(cls);
            LIZ4.append(": could not find Scene constructor");
            throw new C65532Pnk(X1D.LIZIZ(LIZ4), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Unable to instantiate scene ");
            LIZ5.append(cls);
            LIZ5.append(": calling Scene constructor caused an exception");
            throw new C65532Pnk(X1D.LIZIZ(LIZ5), e4);
        }
    }

    public static WM7 LIZIZ(Context context, String str, Bundle bundle) {
        C0MA<String, Class<?>> c0ma = LIZ;
        Class<?> orDefault = c0ma.getOrDefault(str, null);
        if (orDefault == null) {
            try {
                orDefault = context.getClassLoader().loadClass(str);
                c0ma.put(str, orDefault);
            } catch (ClassNotFoundException e) {
                throw new C65532Pnk(a1.LJ("Unable to instantiate scene ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            }
        }
        return LIZ(bundle, orDefault);
    }
}
