package X;

import Y.IDfS131S0100000_10;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1$1$1", f = "AdFollowUpAceSurveyView.kt", l = {448}, m = "invokeSuspend")
/* renamed from: X.NEy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59036NEy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65462ha<NF7> LJLILLLLZI;
    public final /* synthetic */ NFB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59036NEy(InterfaceC65462ha<NF7> interfaceC65462ha, NFB nfb, InterfaceC67352kd<? super C59036NEy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65462ha;
        this.LJLJI = nfb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59036NEy(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC65462ha<NF7> interfaceC65462ha = this.LJLILLLLZI;
            IDfS131S0100000_10 iDfS131S0100000_10 = new IDfS131S0100000_10(this.LJLJI, 18);
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(iDfS131S0100000_10, this) == enumC58928NAu) {
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