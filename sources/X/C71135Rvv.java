package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.NewUserPopUp;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.common.room.PreviewBagHelper$previewBag$2$1$2", f = "PreviewBagHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rvv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71135Rvv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71139Rvz LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;
    public final /* synthetic */ NewUserPopUp LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71135Rvv(C71139Rvz c71139Rvz, Room room, NewUserPopUp newUserPopUp, long j, InterfaceC67352kd<? super C71135Rvv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71139Rvz;
        this.LJLILLLLZI = room;
        this.LJLJI = newUserPopUp;
        this.LJLJJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71135Rvv(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LIZ.get()) {
            C36746EbW.LIZ(5, "cancel 2");
            return C76800UCe.LIZ;
        }
        if (!this.LJLIL.LIZIZ) {
            C36746EbW.LIZ(4, "get coupon card success");
            XKQ xkq = this.LJLIL.LIZJ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            C71109RvV.LJ(3, String.valueOf(this.LJLILLLLZI.getOwnerUserId()), String.valueOf(this.LJLILLLLZI.getId()), EnumC71217RxF.AUDIENCE.toString());
            C71144Rw4.LIZ(String.valueOf(this.LJLILLLLZI.getId()), this.LJLJI);
        } else {
            C36746EbW.LIZ(5, "out time, don't show new user coupon card");
            C71144Rw4.LIZ(String.valueOf(this.LJLILLLLZI.getId()), null);
            C71109RvV.LJFF(String.valueOf(this.LJLILLLLZI.getOwnerUserId()), String.valueOf(this.LJLILLLLZI.getId()), new Long(System.currentTimeMillis() - this.LJLJJI), "1", EnumC71217RxF.AUDIENCE.getRoleStr());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
