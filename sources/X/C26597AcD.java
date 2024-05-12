package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import kotlin.jvm.internal.o;

/* renamed from: X.AcD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26597AcD extends AbstractC26779Af9<Object> {
    public final LifecycleOwner LJLJJLL;
    public final EnterParams LJLJL;

    @Override // X.AbstractC26779Af9
    public final IComponentStrategyService<?> LLD() {
        return new DefaultPaymentStrategyService();
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26597AcD(PaymentFragment parent, EnterParams enterParams) {
        super(parent, new C28090B0s(), "payment_method", null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(enterParams, "enterParams");
        this.LJLJJLL = parent;
        this.LJLJL = enterParams;
    }
}
