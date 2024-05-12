package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Zyq, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91700Zyq {
    public static final java.util.Map<Class<?>, String> LIZIZ = new LinkedHashMap();
    public final java.util.Map<String, AbstractC91695Zyl<? extends C91720ZzA>> LIZ = new LinkedHashMap();

    public final void LIZ(AbstractC91695Zyl navigator) {
        boolean z;
        o.LJIIIZ(navigator, "navigator");
        String LIZ = C91699Zyp.LIZ(navigator.getClass());
        if (C91699Zyp.LIZIZ(LIZ)) {
            AbstractC91695Zyl abstractC91695Zyl = (AbstractC91695Zyl) ((LinkedHashMap) this.LIZ).get(LIZ);
            if (o.LJ(abstractC91695Zyl, navigator)) {
                return;
            }
            if (abstractC91695Zyl == null || !abstractC91695Zyl.LIZIZ) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (!navigator.LIZIZ) {
                    this.LIZ.put(LIZ, navigator);
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Navigator ");
                LIZ2.append(navigator);
                LIZ2.append(" is already attached to another NavController");
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                LIZIZ2.toString();
                throw new IllegalStateException(LIZIZ2);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Navigator ");
            LIZ3.append(navigator);
            LIZ3.append(" is replacing an already attached ");
            LIZ3.append(abstractC91695Zyl);
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            LIZIZ3.toString();
            throw new IllegalStateException(LIZIZ3);
        }
        "navigator name cannot be an empty string".toString();
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final <T extends AbstractC91695Zyl<?>> T LIZIZ(String name) {
        o.LJIIIZ(name, "name");
        if (C91699Zyp.LIZIZ(name)) {
            T t = (T) ((LinkedHashMap) this.LIZ).get(name);
            if (t != null) {
                return t;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Could not find Navigator with name \"");
            LIZ.append(name);
            LIZ.append("\". You must call NavController.addNavigator() for each navigation type.");
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        "navigator name cannot be an empty string".toString();
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
