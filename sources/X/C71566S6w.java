package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.UseLiveEffectHelper$setEffect$lastUseEffectRecord$1", f = "UseLiveEffectHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.S6w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71566S6w extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C71559S6p>, Object> {
    public final /* synthetic */ C71562S6s LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71566S6w(C71562S6s c71562S6s, InterfaceC67352kd<? super C71566S6w> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71562S6s;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71566S6w(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            return C71554S6k.LJJJIL();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C71559S6p> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
