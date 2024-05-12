package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cfy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31926Cfy {
    public static boolean LIZIZ;
    public final java.util.Map<Class<?>, InterfaceC31927Cfz<?>> LIZ = new LinkedHashMap();

    public final <T> T LIZ(Class<T> cls) {
        T t;
        InterfaceC31927Cfz interfaceC31927Cfz = (InterfaceC31927Cfz) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC31927Cfz == null || (t = (T) interfaceC31927Cfz.LIZIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void LIZIZ(Class<T> cls, InterfaceC31927Cfz<? extends T> interfaceC31927Cfz) {
        InterfaceC31927Cfz<? extends T> interfaceC31927Cfz2 = (InterfaceC31927Cfz) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC31927Cfz2 != null && interfaceC31927Cfz2 != interfaceC31927Cfz) {
            interfaceC31927Cfz2.release();
        }
        this.LIZ.put(cls, interfaceC31927Cfz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final <T> void LIZJ(Class<T> cls, T t) {
        if (LIZIZ && o.LJ(cls, Context.class)) {
            Object obj = null;
            if (t instanceof Context) {
                obj = t;
            }
            ?? r1 = (Context) obj;
            while (true) {
                if (r1 != 0) {
                    if (r1 instanceof Activity) {
                        t = r1;
                        break;
                    } else if (!(r1 instanceof ContextWrapper)) {
                        break;
                    } else {
                        r1 = ((ContextWrapper) r1).getBaseContext();
                    }
                } else {
                    break;
                }
            }
        }
        LIZIZ(cls, new C31925Cfx(t));
    }
}
