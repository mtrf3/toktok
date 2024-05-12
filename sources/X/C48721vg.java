package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48721vg extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends C08440Uu>, List<? extends C08440Uu>, List<? extends C08440Uu>> {
    public static final C48721vg LJLIL = new C48721vg();

    public C48721vg() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends C08440Uu> invoke(List<? extends C08440Uu> list, List<? extends C08440Uu> list2) {
        List<? extends C08440Uu> list3 = list;
        List<? extends C08440Uu> childValue = list2;
        o.LJIIIZ(childValue, "childValue");
        if (list3 != null) {
            List<? extends C08440Uu> LLJILJILJ = ORZ.LLJILJILJ(list3);
            ((ArrayList) LLJILJILJ).addAll(childValue);
            return LLJILJILJ;
        }
        return childValue;
    }
}
