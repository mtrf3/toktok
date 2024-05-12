package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ac5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26589Ac5 extends AbstractC26779Af9<Object> {
    public final LifecycleOwner LJLJJLL;

    @Override // X.AbstractC26779Af9
    public final IComponentStrategyService LLD() {
        return new DefaultAddressSelectStrategyService();
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26589Ac5(AddressSelectFragment parent, Integer num) {
        super(parent, null, "logistics_address", num, null, C26744Aea.LIZ().template, 82);
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = parent;
    }
}
