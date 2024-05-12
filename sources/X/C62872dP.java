package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.repo.HighLightReportEvent;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.repo.ReportPinCardClickRequest;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.repo.UserClickInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl.EcommerceInfluencerServiceImpl$reportPinCardClickEvent$1", f = "EcommerceInfluencerServiceImpl.kt", l = {46}, m = "invokeSuspend")
/* renamed from: X.2dP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62872dP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C88743e2 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62872dP(C88743e2 c88743e2, String str, String str2, InterfaceC67352kd<? super C62872dP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c88743e2;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62872dP(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C88753e3 c88753e3 = this.LJLILLLLZI.LIZIZ;
                String str = this.LJLJI;
                HighLightReportEvent highLightReportEvent = new HighLightReportEvent(new UserClickInfo(this.LJLJJI));
                this.LJLIL = 1;
                if (c88753e3.LJLIL.LIZ.reportPinCardClick(new ReportPinCardClickRequest(str, 1, highLightReportEvent), this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
