package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50101xu extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C33861Uo, Object> {
    public static final C50101xu LJLIL = new C50101xu();

    public C50101xu() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0MK c0mk, C33861Uo c33861Uo) {
        C0MK Saver = c0mk;
        C33861Uo it = c33861Uo;
        o.LJIIIZ(Saver, "$this$Saver");
        o.LJIIIZ(it, "it");
        List<C16030k3> list = it.LJLIL;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C0VC.LIZ(ListProtector.get(list, i), C0VC.LJIJ, Saver));
        }
        return arrayList;
    }
}
