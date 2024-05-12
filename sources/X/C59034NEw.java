package X;

import Y.IDeS362S0100000_10;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1$1", f = "AdFollowUpAceSurveyView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.NEw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59034NEw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLILLLLZI;
    public final /* synthetic */ NFB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59034NEw(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, NFB nfb, InterfaceC67352kd<? super C59034NEw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = adFollowUpAceSurveyVM;
        this.LJLJI = nfb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C59034NEw c59034NEw = new C59034NEw(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c59034NEw.LJLIL = obj;
        return c59034NEw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        InterfaceC65462ha LJIIJJI = V1M.LJIIJJI(new IDeS362S0100000_10(this.LJLILLLLZI.LJLJJI, 1));
        XKX.LIZLLL(interfaceC70422pa, null, null, new C59036NEy(LJIIJJI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new C59035NEx(LJIIJJI, this.LJLJI, this.LJLILLLLZI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new NF4(LJIIJJI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new NF0(LJIIJJI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new NF3(LJIIJJI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new NF2(LJIIJJI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new C59031NEt(this.LJLILLLLZI, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
