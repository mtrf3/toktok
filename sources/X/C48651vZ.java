package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1vZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48651vZ extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends String>, List<? extends String>, List<? extends String>> {
    public static final C48651vZ LJLIL = new C48651vZ();

    public C48651vZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
        List<? extends String> list3 = list;
        List<? extends String> childValue = list2;
        o.LJIIIZ(childValue, "childValue");
        if (list3 != null) {
            List<? extends String> LLJILJILJ = ORZ.LLJILJILJ(list3);
            ((ArrayList) LLJILJILJ).addAll(childValue);
            return LLJILJILJ;
        }
        return childValue;
    }
}
