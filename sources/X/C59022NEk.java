package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$moreFeedbackBtnClick$1", f = "AdFollowUpAceSurveyVM.kt", l = {64}, m = "invokeSuspend")
/* renamed from: X.NEk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59022NEk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59022NEk(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, InterfaceC67352kd<? super C59022NEk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = adFollowUpAceSurveyVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59022NEk(this.LJLILLLLZI, interfaceC67352kd);
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
            IAdExperienceEventLogger iAdExperienceEventLogger = this.LJLILLLLZI.LJLILLLLZI;
            if (iAdExperienceEventLogger != null) {
                N12.LIZ.getClass();
                iAdExperienceEventLogger.LJIILIIL(N12.LJI);
            }
            XLL xll = this.LJLILLLLZI.LJLJJL;
            Boolean bool = Boolean.TRUE;
            this.LJLIL = 1;
            if (xll.emit(bool, this) == enumC58928NAu) {
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
