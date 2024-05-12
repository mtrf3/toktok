package X;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes12.dex */
public abstract class PP5 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Context LIZ;

    public abstract PP6 LIZIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    static {
        C16880lQ.LJLLJ(PP5.class);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[class=");
        LIZ.append(getClass().getName());
        LIZ.append(", name=");
        LIZJ();
        LIZ.append("App-Packaged-Cronet-Provider");
        LIZ.append(", version=");
        LIZLLL();
        LIZ.append("107.0.5273.2");
        LIZ.append(", enabled=");
        LJ();
        return C19U.LIZ(LIZ, true, "]", LIZ);
    }

    public PP5(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public static void LIZ(Context context, String str, java.util.Set set) {
        try {
            set.add(context.getClassLoader().loadClass(str).asSubclass(PP5.class).getConstructor(Context.class).newInstance(context));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
