package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.api.FeedEcCardApi;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.manager.FeedEcCardManager$fetchFeedEcCardData$1$response$1", f = "FeedEcCardManager.kt", l = {299}, m = "invokeSuspend")
/* renamed from: X.ECt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36047ECt extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<FeedEcCardResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36047ECt(String str, String str2, InterfaceC67352kd<? super C36047ECt> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36047ECt(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<FeedEcCardResponse>>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C36046ECs c36046ECs = ((C36049ECv) C36049ECv.LIZIZ.getValue()).LIZ;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            this.LJLIL = 1;
            c36046ECs.getClass();
            FeedEcCardApi.LIZ.getClass();
            obj = ((FeedEcCardApi) C36050ECw.LIZIZ.getValue()).fetchFeedEcCardData(new FeedEcCardRequest(null, str, str2, 1, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
