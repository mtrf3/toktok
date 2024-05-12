package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ElJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37353ElJ implements InterfaceC61864OPs {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C37354ElK.LJLIL);

    public final <T extends C61868OPw> T LIZ(Class<T> cls) {
        T t;
        if (((HashMap) this.LIZ.getValue()).containsKey(cls)) {
            return (T) ((HashMap) this.LIZ.getValue()).get(cls);
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(AbstractC37353ElJ.class);
                o.LJIIIIZZ(declaredConstructor, "cls.getDeclaredConstruct…parkBusiness::class.java)");
                declaredConstructor.setAccessible(true);
                T newInstance = declaredConstructor.newInstance(this);
                o.LJII(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.hybridkit.Business");
                t = newInstance;
            } catch (Exception e) {
                e = e;
                t = null;
            }
            try {
                ((HashMap) this.LIZ.getValue()).put(cls, t);
            } catch (Exception e2) {
                e = e2;
                C16880lQ.LLLLIIL(e);
                return t;
            }
            return t;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("can't use abstract class!");
        LIZ.append(C16880lQ.LJLLJ(cls));
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }
}
