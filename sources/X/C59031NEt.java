package X;

import Y.IDfS25S0200000_10;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1$1$7", f = "AdFollowUpAceSurveyView.kt", l = {448}, m = "invokeSuspend")
/* renamed from: X.NEt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59031NEt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLILLLLZI;
    public final /* synthetic */ NFB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59031NEt(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, NFB nfb, InterfaceC67352kd<? super C59031NEt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = adFollowUpAceSurveyVM;
        this.LJLJI = nfb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59031NEt(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = this.LJLILLLLZI;
            C79883Bo c79883Bo = adFollowUpAceSurveyVM.LJLJJLL;
            IDfS25S0200000_10 iDfS25S0200000_10 = new IDfS25S0200000_10(this.LJLJI, adFollowUpAceSurveyVM, 10);
            this.LJLIL = 1;
            if (c79883Bo.collect(iDfS25S0200000_10, this) == enumC58928NAu) {
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
