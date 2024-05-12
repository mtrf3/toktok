package X;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class QD1 {
    public final List<QD4> LIZ = new ArrayList();
    public final java.util.Map<Class, Object> LIZIZ = new HashMap();
    public final java.util.Map<String, Class> LIZJ = new HashMap();
    public final StringBuilder LIZLLL = new StringBuilder(128);
    public Class<?> LJ;
    public boolean LJFF;

    public final void LIZIZ() {
        if (this.LJFF) {
            this.LJ = null;
            return;
        }
        Class<? super Object> superclass = this.LJ.getSuperclass();
        this.LJ = superclass;
        String name = superclass.getName();
        if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
            return;
        }
        this.LJ = null;
    }

    public final boolean LIZ(Method method, Class<?> cls) {
        this.LIZLLL.setLength(0);
        this.LIZLLL.append(method.getName());
        StringBuilder sb = this.LIZLLL;
        sb.append('>');
        sb.append(cls.getName());
        String sb2 = this.LIZLLL.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        Class cls2 = (Class) ((HashMap) this.LIZJ).put(sb2, declaringClass);
        if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
            return true;
        }
        ((HashMap) this.LIZJ).put(sb2, cls2);
        return false;
    }
}
