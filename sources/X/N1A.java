package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1A extends AbstractC65781Prl implements InterfaceC88472Yns<Class<?>, Boolean> {
    public static final N1A LJLIL = new N1A();

    public N1A() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Class<?> cls) {
        Class<?> it = cls;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(Serializable.class.isAssignableFrom(it));
    }
}
