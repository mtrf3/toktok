package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.DefaultAddressEditDetailStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ac6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26590Ac6 extends AbstractC26779Af9<Object> {
    public final AddressEditDetailActivity LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;

    @Override // X.AbstractC26779Af9
    public final IComponentStrategyService LLD() {
        return new DefaultAddressEditDetailStrategyService();
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26590Ac6(AddressEditDetailActivity parent, String str, AqS154S0100000_4 aqS154S0100000_4) {
        super(parent, new C26591Ac7(), "add_address_and_detail", null, str, null, 104);
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = parent;
        this.LJLJL = aqS154S0100000_4;
    }
}
