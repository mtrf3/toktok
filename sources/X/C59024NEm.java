package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import fjb.a;
import kotlin.jvm.internal.AqS34S0001000_10;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$rateStarClick$1", f = "AdFollowUpAceSurveyVM.kt", l = {78, 80}, m = "invokeSuspend")
/* renamed from: X.NEm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59024NEm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59024NEm(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, int i, InterfaceC67352kd<? super C59024NEm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = adFollowUpAceSurveyVM;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59024NEm(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
        } else {
            C141335gf.LIZJ(obj);
            IAdExperienceEventLogger iAdExperienceEventLogger = this.LJLILLLLZI.LJLILLLLZI;
            if (iAdExperienceEventLogger != null) {
                N12.LIZ.getClass();
                iAdExperienceEventLogger.LJ(N12.LJFF, new AqS34S0001000_10(this.LJLJI, 6));
            }
            C59028NEq LIZ = C59027NEp.LIZ();
            String LJIJJ = C79057V0z.LJIJJ(this.LJLILLLLZI.LJLIL);
            int i2 = this.LJLJI;
            if (LJIJJ == null) {
                LIZ.getClass();
            } else {
                C0M6<String, C59030NEs> c0m6 = LIZ.LIZIZ;
                if (c0m6 != null) {
                    c0m6.LIZJ(LJIJJ, new C59030NEs(i2, false, 4));
                }
            }
            XLM xlm = this.LJLILLLLZI.LJLJI;
            NF7 LIZ2 = NF7.LIZ((NF7) xlm.getValue(), false, this.LJLJI, false, false, 239);
            this.LJLIL = 1;
            xlm.setValue(LIZ2);
            if (C76800UCe.LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XLL xll = this.LJLILLLLZI.LJLJJL;
        Boolean bool = Boolean.TRUE;
        this.LJLIL = 2;
        if (xll.emit(bool, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
