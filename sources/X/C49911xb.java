package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49911xb extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, List<? extends C08410Ur<? extends Object>>, Object> {
    public static final C49911xb LJLIL = new C49911xb();

    public C49911xb() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0MK c0mk, List<? extends C08410Ur<? extends Object>> list) {
        C0MK Saver = c0mk;
        List<? extends C08410Ur<? extends Object>> it = list;
        o.LJIIIZ(Saver, "$this$Saver");
        o.LJIIIZ(it, "it");
        ArrayList arrayList = new ArrayList(it.size());
        int size = it.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C0VC.LIZ(ListProtector.get(it, i), C0VC.LIZJ, Saver));
        }
        return arrayList;
    }
}
