package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2xM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75242xM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C75242xM(InterfaceC67352kd<? super C75242xM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75242xM(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "live_ec_task_refresh_coupon_list"));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C75242xM(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}