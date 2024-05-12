package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1y1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50171y1 extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C0V2> {
    public static final C50171y1 LJLIL = new C50171y1();

    public C50171y1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C0V2 invoke(Object it) {
        C22060tm c22060tm;
        C22100tq c22100tq;
        C23520w8 c23520w8;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        C22160tw c22160tw = null;
        if (obj != null) {
            c22060tm = (C22060tm) obj;
        } else {
            c22060tm = null;
        }
        Object obj2 = ListProtector.get(list, 1);
        if (obj2 != null) {
            c22100tq = (C22100tq) obj2;
        } else {
            c22100tq = null;
        }
        Object obj3 = ListProtector.get(list, 2);
        C1HY c1hy = C0VC.LJIILL;
        Boolean bool = Boolean.FALSE;
        if (o.LJ(obj3, bool) || obj3 == null) {
            c23520w8 = null;
        } else {
            c23520w8 = (C23520w8) c1hy.LIZIZ.invoke(obj3);
        }
        o.LJI(c23520w8);
        long j = c23520w8.LIZ;
        Object obj4 = ListProtector.get(list, 3);
        C1HY c1hy2 = C0VC.LJIIIZ;
        if (!o.LJ(obj4, bool) && obj4 != null) {
            c22160tw = (C22160tw) c1hy2.LIZIZ.invoke(obj4);
        }
        return new C0V2(c22060tm, c22100tq, j, c22160tw, null, null, null, null);
    }
}
