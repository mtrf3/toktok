package X;

import Y.AfS62S0100000_10;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.ad.network.ScoreApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$sendScoreRequest$1", f = "AdFollowUpAceSurveyVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NFI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NFG LJLIL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFI(NFG nfg, AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, InterfaceC67352kd<? super NFI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nfg;
        this.LJLILLLLZI = adFollowUpAceSurveyVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NFI(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ScoreApi.LIZ.getClass();
        ScoreApi LIZ = C35986EAk.LIZ();
        String itemId = this.LJLIL.LIZ.getItemId();
        String advId = this.LJLIL.LIZ.getAdvId();
        String adId = this.LJLIL.LIZ.getAdId();
        String cid = this.LJLIL.LIZ.getCid();
        NFG nfg = this.LJLIL;
        LIZ.sendScoreOption(itemId, advId, adId, cid, nfg.LIZIZ, nfg.LIZJ, nfg.LIZLLL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C59023NEl.LJLIL, new AfS62S0100000_10(this.LJLILLLLZI, 45));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
