package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49931xd extends AbstractC65781Prl implements InterfaceC88472Yns<Object, List<? extends C08410Ur<? extends Object>>> {
    public static final C49931xd LJLIL = new C49931xd();

    public C49931xd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final List<? extends C08410Ur<? extends Object>> invoke(Object it) {
        Object invoke;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            C1HY c1hy = C0VC.LIZJ;
            if (o.LJ(obj, Boolean.FALSE) || obj == null) {
                invoke = null;
            } else {
                invoke = c1hy.LIZIZ.invoke(obj);
            }
            o.LJI(invoke);
            arrayList.add(invoke);
        }
        return arrayList;
    }
}
