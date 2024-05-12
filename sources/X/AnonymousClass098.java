package X;

import androidx.fragment.app.Fragment;
import defpackage.a1;

/* renamed from: X.098, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass098 {
    public static final C0MA<String, Class<?>> LIZ = new C0MA<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Fragment> LIZ(ClassLoader classLoader, String str) {
        try {
            C0MA<String, Class<?>> c0ma = LIZ;
            Class<? extends Fragment> cls = (Class) c0ma.getOrDefault(str, null);
            if (cls == null) {
                Class cls2 = Class.forName(str, false, classLoader);
                c0ma.put(str, cls2);
                return cls2;
            }
            return cls;
        } catch (ClassCastException e) {
            throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
