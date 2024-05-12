package X;

import com.ss.android.ugc.aweme.rss.api.RssApi;
import com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.repo.RssRepoImpl$updateRss$resp$1", f = "RssRepo.kt", l = {65}, m = "invokeSuspend")
/* renamed from: X.RcH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69917RcH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super UpdateRssResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69917RcH(String str, InterfaceC67352kd<? super C69917RcH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69917RcH(this.LJLILLLLZI, interfaceC67352kd);
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
            RssApi.LIZ.getClass();
            RssApi rssApi = (RssApi) C69915RcF.LIZIZ.getValue();
            String str = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = rssApi.updateRss(str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super UpdateRssResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
