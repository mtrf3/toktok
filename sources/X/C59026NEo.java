package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$onRateDetailPageClose$1", f = "AdFollowUpAceSurveyVM.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.NEo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59026NEo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59026NEo(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, InterfaceC67352kd<? super C59026NEo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = adFollowUpAceSurveyVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59026NEo(this.LJLILLLLZI, interfaceC67352kd);
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
            XLM xlm = adFollowUpAceSurveyVM.LJLJI;
            NF7 LIZ = NF7.LIZ((NF7) xlm.getValue(), false, 0, true, C59027NEp.LIZ().LIZIZ(C79057V0z.LJIJJ(adFollowUpAceSurveyVM.LJLIL)), 63);
            this.LJLIL = 1;
            xlm.setValue(LIZ);
            if (C76800UCe.LIZ == enumC58928NAu) {
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
