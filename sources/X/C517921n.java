package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.21n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C517921n extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C15010iP> {
    public static final C517921n LJLIL = new C517921n();

    public C517921n() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C15010iP invoke(Object it) {
        C08440Uu c08440Uu;
        C08350Ul c08350Ul;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        C1HY c1hy = C0VC.LIZ;
        Boolean bool = Boolean.FALSE;
        if (o.LJ(obj, bool) || obj == null) {
            c08440Uu = null;
        } else {
            c08440Uu = (C08440Uu) c1hy.LIZIZ.invoke(obj);
        }
        o.LJI(c08440Uu);
        Object obj2 = ListProtector.get(list, 1);
        C1HY c1hy2 = C0VC.LJIIL;
        if (o.LJ(obj2, bool) || obj2 == null) {
            c08350Ul = null;
        } else {
            c08350Ul = (C08350Ul) c1hy2.LIZIZ.invoke(obj2);
        }
        o.LJI(c08350Ul);
        return new C15010iP(c08440Uu, c08350Ul.LIZ, (C08350Ul) null);
    }
}
