package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aIF, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92903aIF extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC10180ac, Integer, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92903aIF(List list, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(4);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = i;
    }

    public final void invoke(InterfaceC10180ac items, int i, InterfaceC24520xk interfaceC24520xk, int i2) {
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(items, "$this$items");
        if ((i2 & 14) == 0) {
            if (interfaceC24520xk.LJIJJ(items)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        int i6 = 32;
        if ((i2 & 112) == 0) {
            if (interfaceC24520xk.LJIIIZ(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !interfaceC24520xk.LIZ()) {
            int i7 = i3 & 14;
            InterfaceC91996a3c interfaceC91996a3c = (InterfaceC91996a3c) ListProtector.get(this.LJLIL, i);
            if ((i7 & 112) == 0) {
                if (!interfaceC24520xk.LJIJJ(interfaceC91996a3c)) {
                    i6 = 16;
                }
                i7 |= i6;
            }
            if (((i7 & 721) ^ 144) != 0 || !interfaceC24520xk.LIZ()) {
                C91998a3e.LIZIZ(interfaceC91996a3c, this.LJLILLLLZI, false, interfaceC24520xk, ((i7 >> 3) & 14) | ((this.LJLJI >> 12) & 112), 4);
                return;
            } else {
                interfaceC24520xk.LIZLLL();
                return;
            }
        }
        interfaceC24520xk.LIZLLL();
    }

    @Override // X.InterfaceC88474Ynu
    public /* bridge */ /* synthetic */ C76800UCe invoke(InterfaceC10180ac interfaceC10180ac, Integer num, InterfaceC24520xk interfaceC24520xk, Integer num2) {
        invoke(interfaceC10180ac, num.intValue(), interfaceC24520xk, num2.intValue());
        return C76800UCe.LIZ;
    }
}
