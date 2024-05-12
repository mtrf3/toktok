package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.google.gson.internal.b;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.repository.FeedReachApi;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$requestInterest$2", f = "EcVideoGuideAssem.kt", l = {LiveChatShowDelayForHotLiveSetting.DEFAULT}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECM extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<FeedReachResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ EcVideoGuideAssem LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECM(int i, int i2, EcVideoGuideAssem ecVideoGuideAssem, int i3, InterfaceC67352kd<? super ECM> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = ecVideoGuideAssem;
        this.LJLJJL = i3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<FeedReachResponse>>> interfaceC67352kd) {
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
            boolean LIZIZ = C53286Kvi.LIZIZ();
            m mVar = new m();
            mVar.LJJIIJ("interest_level", new Integer(this.LJLILLLLZI));
            b.LJJIIZ(mVar, "interest_types", new int[]{this.LJLJI});
            FeedReachGetParams feedReachGetParams = new FeedReachGetParams(null, ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLJJI)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLJJI)).getAweme().getAuthorUid(), LIZIZ ? 1 : 0, this.LJLJJL, mVar);
            FeedReachApi feedReachApi = (FeedReachApi) C67332kb.LIZ().create(FeedReachApi.class);
            this.LJLIL = 1;
            obj = feedReachApi.feedReachGet(feedReachGetParams, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
