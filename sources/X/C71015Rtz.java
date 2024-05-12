package X;

import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceApi;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.slot.ECExplanationWatcherCardSlotV4$onClick$2$1", f = "ECExplanationWatcherCardSlotV4.kt", l = {312}, m = "invokeSuspend")
/* renamed from: X.Rtz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71015Rtz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71124Rvk LJLILLLLZI;
    public final /* synthetic */ PopupCardVO LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71015Rtz(C71124Rvk c71124Rvk, PopupCardVO popupCardVO, InterfaceC67352kd<? super C71015Rtz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71124Rvk;
        this.LJLJI = popupCardVO;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71015Rtz(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            C71017Ru1 c71017Ru1 = AudienceApi.LIZ;
            C48502J1u c48502J1u = this.LJLILLLLZI.LJLJJLL;
            String str2 = null;
            if (c48502J1u != null) {
                str = c48502J1u.LIZJ("room_id");
            } else {
                str = null;
            }
            C48502J1u c48502J1u2 = this.LJLILLLLZI.LJLJJLL;
            if (c48502J1u2 != null) {
                str2 = c48502J1u2.LIZJ("author_id");
            }
            String valueOf = String.valueOf(this.LJLJI.getProductId());
            this.LJLIL = 1;
            if (c71017Ru1.LIZ(str, str2, valueOf, 1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
