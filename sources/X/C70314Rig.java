package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitStarter", f = "OrderSubmitStarter.kt", l = {339}, m = "openCombineActivity")
/* renamed from: X.Rig, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70314Rig extends C3CS {
    public C70313Rif LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public Object LJLJI;
    public DeliveryPanelStarter.PackedDeliverySelectResult LJLJJI;
    public ProductPackStruct LJLJJL;
    public SkuPanelState LJLJJLL;
    public IPdpStarter.PdpEnterParam LJLJL;
    public Object LJLJLJ;
    public Object LJLJLLL;
    public Object LJLL;
    public Object LJLLI;
    public Object LJLLILLLL;
    public Object LJLLJ;
    public BillInfoRequest LJLLL;
    public Object LJLLLL;
    public C34K LJLLLLLL;
    public int LJLZ;
    public /* synthetic */ Object LJZ;
    public final /* synthetic */ C70313Rif LJZI;
    public int LJZL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70314Rig(C70313Rif c70313Rif, InterfaceC67352kd<? super C70314Rig> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJZI = c70313Rif;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJZ = obj;
        this.LJZL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJZI.LIZIZ(null, null, null, null, null, null, null, false, null, null, null, null, null, this);
    }
}
