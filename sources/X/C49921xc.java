package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49921xc extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C22160tw> {
    public static final C49921xc LJLIL = new C49921xc();

    public C49921xc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C22160tw invoke(Object it) {
        C23520w8 c23520w8;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        C1HY c1hy = C0VC.LJIILL;
        Boolean bool = Boolean.FALSE;
        C23520w8 c23520w82 = null;
        if (o.LJ(obj, bool) || obj == null) {
            c23520w8 = null;
        } else {
            c23520w8 = (C23520w8) c1hy.LIZIZ.invoke(obj);
        }
        o.LJI(c23520w8);
        long j = c23520w8.LIZ;
        Object obj2 = ListProtector.get(list, 1);
        if (!o.LJ(obj2, bool) && obj2 != null) {
            c23520w82 = (C23520w8) c1hy.LIZIZ.invoke(obj2);
        }
        o.LJI(c23520w82);
        return new C22160tw(j, c23520w82.LIZ);
    }
}
