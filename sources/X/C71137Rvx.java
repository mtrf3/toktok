package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.common.room.PreviewBagHelper$previewBag$1", f = "PreviewBagHelper.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "invokeSuspend")
/* renamed from: X.Rvx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71137Rvx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71139Rvz LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71137Rvx(C71139Rvz c71139Rvz, Room room, InterfaceC67352kd<? super C71137Rvx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71139Rvz;
        this.LJLJI = room;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71137Rvx(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long LIZIZ = J9A.LIZIZ("ec_live_pop_product_wait_voucher_max_duration", 3000L);
            this.LJLIL = 1;
            if (C1JD.LIZJ(LIZIZ, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C36746EbW.LIZ(4, "out wait time, show init data");
        this.LJLILLLLZI.LIZIZ = true;
        C71144Rw4.LIZ(String.valueOf(this.LJLJI.getId()), null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
