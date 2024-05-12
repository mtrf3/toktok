package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1", f = "AdFollowUpAceSurveyView.kt", l = {233}, m = "invokeSuspend")
/* renamed from: X.NEv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59033NEv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NFB LJLILLLLZI;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59033NEv(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, NFB nfb, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = nfb;
        this.LJLJI = adFollowUpAceSurveyVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59033NEv(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
            NFB nfb = this.LJLILLLLZI;
            ActivityC45651qj activityC45651qj = nfb.LJZL;
            if (activityC45651qj != null) {
                Lifecycle.State state = Lifecycle.State.STARTED;
                C59034NEw c59034NEw = new C59034NEw(this.LJLJI, nfb, null);
                this.LJLIL = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC45651qj, state, c59034NEw, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
