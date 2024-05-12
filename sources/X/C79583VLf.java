package X;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.VLf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79583VLf<T> {
    public Method LIZ;
    public WeakReference<Object> LIZIZ;
    public final Class<T> LIZJ;
    public final String LIZLLL;
    public final Class<?>[] LJ;

    public final Method LIZ() {
        if (this.LIZ == null) {
            try {
                Class<T> cls = this.LIZJ;
                String str = this.LIZLLL;
                Class<?>[] clsArr = this.LJ;
                this.LIZ = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        return this.LIZ;
    }

    public final Object LIZIZ(Object... objArr) {
        boolean z;
        Object obj;
        if (LIZ() != null) {
            z = true;
        } else {
            z = false;
        }
        Object obj2 = null;
        if (!z) {
            return null;
        }
        try {
            Method LIZ = LIZ();
            if (LIZ == null) {
                return null;
            }
            WeakReference<Object> weakReference = this.LIZIZ;
            if (weakReference != null) {
                obj = weakReference.get();
            } else {
                obj = null;
            }
            obj2 = LIZ.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            return obj2;
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
            return obj2;
        }
    }

    public C79583VLf(Class<T> clazz, String str, Class<?>[] paramTypes, Object obj) {
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(paramTypes, "paramTypes");
        this.LIZJ = clazz;
        this.LIZLLL = str;
        this.LJ = paramTypes;
        this.LIZIZ = new WeakReference<>(obj);
    }
}
