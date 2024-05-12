package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49891xZ extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C08440Uu> {
    public static final C49891xZ LJLIL = new C49891xZ();

    public C49891xZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C08440Uu invoke(Object it) {
        String str;
        List list;
        List list2;
        o.LJIIIZ(it, "it");
        List list3 = (List) it;
        Object obj = ListProtector.get(list3, 0);
        List list4 = null;
        if (obj != null) {
            str = (String) obj;
        } else {
            str = null;
        }
        o.LJI(str);
        Object obj2 = ListProtector.get(list3, 1);
        C1HY c1hy = C0VC.LIZIZ;
        Boolean bool = Boolean.FALSE;
        if (o.LJ(obj2, bool) || obj2 == null) {
            list = null;
        } else {
            list = (List) c1hy.LIZIZ.invoke(obj2);
        }
        o.LJI(list);
        Object obj3 = ListProtector.get(list3, 2);
        if (o.LJ(obj3, bool) || obj3 == null) {
            list2 = null;
        } else {
            list2 = (List) c1hy.LIZIZ.invoke(obj3);
        }
        o.LJI(list2);
        Object obj4 = ListProtector.get(list3, 3);
        if (!o.LJ(obj4, bool) && obj4 != null) {
            list4 = (List) c1hy.LIZIZ.invoke(obj4);
        }
        o.LJI(list4);
        return new C08440Uu(str, list, list2, list4);
    }
}
