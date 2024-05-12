package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6H extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC10180ac, Integer, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ V7H LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6H(List list, V7H v7h, int i) {
        super(4);
        this.LJLIL = list;
        this.LJLILLLLZI = v7h;
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
        if ((i2 & 112) == 0) {
            if (interfaceC24520xk.LJIIIZ(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !interfaceC24520xk.LIZ()) {
            int i6 = i3 & 112;
            A4Y a4y = (A4Y) ListProtector.get(this.LJLIL, i);
            if (((i6 | (i3 & 14)) & 641) != 128 || !interfaceC24520xk.LIZ()) {
                V5R.LIZ(a4y, this.LJLILLLLZI, null, interfaceC24520xk, (this.LJLJI >> 21) & 112, 4);
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
