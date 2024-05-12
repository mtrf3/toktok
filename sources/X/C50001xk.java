package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50001xk extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C23520w8> {
    public static final C50001xk LJLIL = new C50001xk();

    public C50001xk() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C23520w8 invoke(Object it) {
        Float f;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        C23540wA c23540wA = null;
        if (obj != null) {
            f = (Float) obj;
        } else {
            f = null;
        }
        o.LJI(f);
        float floatValue = f.floatValue();
        Object obj2 = ListProtector.get(list, 1);
        if (obj2 != null) {
            c23540wA = (C23540wA) obj2;
        }
        o.LJI(c23540wA);
        return new C23520w8(C79043V0l.LJIJ(floatValue, c23540wA.LIZ));
    }
}
