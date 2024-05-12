package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter", f = "DeliveryPanelStarter.kt", l = {45}, m = "openDeliveryPage")
/* renamed from: X.Aig, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26998Aig extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ DeliveryPanelStarter LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26998Aig(DeliveryPanelStarter deliveryPanelStarter, InterfaceC67352kd<? super C26998Aig> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = deliveryPanelStarter;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, null, false, null, this);
    }
}
