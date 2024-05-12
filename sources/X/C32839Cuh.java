package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.guide.LiveGiftGuideViewModel$reportGiftGuideShown$1", f = "LiveGiftGuideViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cuh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32839Cuh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ GiftGuideMessage LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32839Cuh(long j, GiftGuideMessage giftGuideMessage, InterfaceC67352kd<? super C32839Cuh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = giftGuideMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32839Cuh(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        long j = this.LJLIL;
        GiftGuideMessage giftGuideMessage = this.LJLILLLLZI;
        try {
            C65814PsI.LIZ().getClass();
            C3C5.m7constructorimpl(((GiftRetrofitApi) C65814PsI.LIZJ(GiftRetrofitApi.class)).reportGiftGuide(j, giftGuideMessage.guideType, 1));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
