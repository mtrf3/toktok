package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.AbsECLiveExplanationCardWidget$onOecInitDataReady$2$1$1$1", f = "AbsECLiveExplanationCardWidget.kt", l = {342}, m = "invokeSuspend")
/* renamed from: X.Rwp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71191Rwp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC68342mE<BaseResponse<PopProductResp>> LJLILLLLZI;
    public final /* synthetic */ AbstractC71187Rwl LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71191Rwp(InterfaceC68342mE<BaseResponse<PopProductResp>> interfaceC68342mE, AbstractC71187Rwl abstractC71187Rwl, long j, boolean z, long j2, InterfaceC67352kd<? super C71191Rwp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC68342mE;
        this.LJLJI = abstractC71187Rwl;
        this.LJLJJI = j;
        this.LJLJJL = z;
        this.LJLJJLL = j2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71191Rwp(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
            InterfaceC68342mE<BaseResponse<PopProductResp>> interfaceC68342mE = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse == null) {
            return C76800UCe.LIZ;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLJI.LJLL.LJI(currentTimeMillis, "api_end_time");
        this.LJLJI.LJLL.LJII("isFirst", CardStruct.IStatusCode.DEFAULT, false);
        PopProductResp popProductResp = (PopProductResp) baseResponse.getData();
        String str = null;
        if (popProductResp != null) {
            AbstractC71187Rwl abstractC71187Rwl = this.LJLJI;
            boolean z2 = this.LJLJJL;
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C71204Rx2(abstractC71187Rwl, this.LJLJJLL, popProductResp, null), 3);
            AbstractC71187Rwl.LJJI(abstractC71187Rwl, popProductResp, z2, true, 8);
        }
        String LJIILLIIL = AbstractC71187Rwl.LJIILLIIL();
        Room room = this.LJLJI.LJLLI;
        if (room != null) {
            str = new Long(room.getId()).toString();
        }
        PopProductResp popProductResp2 = (PopProductResp) baseResponse.getData();
        if (popProductResp2 != null && popProductResp2.product != null) {
            z = true;
        } else {
            z = false;
        }
        C71162RwM.LIZLLL(LJIILLIIL, str, z, currentTimeMillis - this.LJLJJI, baseResponse.getCode(), baseResponse.getMessage(), false, this.LJLJI.LJIJ(), true);
        PopProductResp popProductResp3 = (PopProductResp) baseResponse.getData();
        if (popProductResp3 != null && popProductResp3.product != null) {
            this.LJLJI.LJIILJJIL(true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
