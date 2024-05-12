package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ac1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26585Ac1 extends AbstractC26779Af9<Object> {
    public final Fragment LJLJJLL;

    @Override // X.AbstractC26779Af9
    public final IComponentStrategyService<?> LLD() {
        return new DefaultOspStrategyService();
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26585Ac1(OrderSubmitFragment fragment, Integer num) {
        super(fragment, new C26578Abu(), "order_submit", num, null, null, 112);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJLL = fragment;
    }
}
