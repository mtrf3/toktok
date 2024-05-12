package X;

import android.app.Activity;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListEntity;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$2", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RxK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71222RxK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IMessage LJLIL;
    public final /* synthetic */ C71219RxH LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71222RxK(IMessage iMessage, C71219RxH c71219RxH, InterfaceC67352kd<? super C71222RxK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = iMessage;
        this.LJLILLLLZI = c71219RxH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71222RxK(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Activity LJIJJ;
        C141335gf.LIZJ(obj);
        EcTaskRefreshCouponListEntity ecTaskRefreshCouponListEntity = ((EcTaskRefreshCouponListMessage) this.LJLIL).entity;
        if (ecTaskRefreshCouponListEntity != null && (LJIJJ = C45804HyK.LJIJJ(this.LJLILLLLZI.LJLJJL)) != null) {
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LJIIIZ(ecTaskRefreshCouponListEntity.toastMsg);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
