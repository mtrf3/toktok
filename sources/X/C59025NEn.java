package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$surveyVisible$1", f = "AdFollowUpAceSurveyVM.kt", l = {100, 107}, m = "invokeSuspend")
/* renamed from: X.NEn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59025NEn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59025NEn(boolean z, AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, InterfaceC67352kd<? super C59025NEn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = adFollowUpAceSurveyVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59025NEn(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        IAdExperienceEventLogger iAdExperienceEventLogger;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
            return C76800UCe.LIZ;
        }
        C141335gf.LIZJ(obj);
        if (this.LJLILLLLZI && (iAdExperienceEventLogger = this.LJLJI.LJLILLLLZI) != null) {
            N12.LIZ.getClass();
            iAdExperienceEventLogger.LJIILIIL(N12.LIZLLL);
        }
        if (C59027NEp.LIZ().LIZ(C79057V0z.LJIJJ(this.LJLJI.LJLIL)) != 0) {
            XLM xlm = this.LJLJI.LJLJI;
            NF7 LIZ = NF7.LIZ((NF7) xlm.getValue(), this.LJLILLLLZI, 0, true, false, 183);
            this.LJLIL = 1;
            xlm.setValue(LIZ);
            if (C76800UCe.LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        XLM xlm2 = this.LJLJI.LJLJI;
        NF7 LIZ2 = NF7.LIZ((NF7) xlm2.getValue(), this.LJLILLLLZI, 0, false, false, 247);
        this.LJLIL = 2;
        xlm2.setValue(LIZ2);
        if (C76800UCe.LIZ == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
