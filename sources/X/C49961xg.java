package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49961xg extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C08350Ul> {
    public static final C49961xg LJLIL = new C49961xg();

    public C49961xg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C08350Ul invoke(Object it) {
        Integer num;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        Integer num2 = null;
        if (obj != null) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        o.LJI(num);
        int intValue = num.intValue();
        Object obj2 = ListProtector.get(list, 1);
        if (obj2 != null) {
            num2 = (Integer) obj2;
        }
        o.LJI(num2);
        return new C08350Ul(C17N.LIZLLL(intValue, num2.intValue()));
    }
}
