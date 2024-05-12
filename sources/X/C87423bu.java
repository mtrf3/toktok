package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87423bu extends AbstractC65781Prl implements InterfaceC88472Yns<C87453bx, C76800UCe> {
    public static final C87423bu LJLIL = new C87423bu();

    public C87423bu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C87453bx c87453bx) {
        int i;
        int i2;
        C87453bx it = c87453bx;
        o.LJIIIZ(it, "it");
        if (!it.LJLJJI) {
            List<C87063bK> list = it.getListState().LJLJJI;
            boolean z = false;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            int i3 = it.LJLJI;
            int size = it.LJLILLLLZI.size();
            int size2 = it.LJLILLLLZI.size();
            List<C87063bK> list2 = it.getListState().LJLJJI;
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = 0;
            }
            if (size2 == i2) {
                z = true;
            }
            C87043bI.LIZ(i, i3, "1", size, z);
        }
        return C76800UCe.LIZ;
    }
}
