package X;

import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5L extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC10180ac, Integer, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5L(List list, Aweme aweme) {
        super(4);
        this.LJLIL = list;
        this.LJLILLLLZI = aweme;
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
            V5G.LIZ((ServiceInfo) ListProtector.get(this.LJLIL, i), this.LJLILLLLZI, interfaceC24520xk, 72);
        } else {
            interfaceC24520xk.LIZLLL();
        }
    }

    @Override // X.InterfaceC88474Ynu
    public /* bridge */ /* synthetic */ C76800UCe invoke(InterfaceC10180ac interfaceC10180ac, Integer num, InterfaceC24520xk interfaceC24520xk, Integer num2) {
        invoke(interfaceC10180ac, num.intValue(), interfaceC24520xk, num2.intValue());
        return C76800UCe.LIZ;
    }
}
