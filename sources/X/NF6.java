package X;

import Y.IDfS131S0100000_10;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1$1$3$invokeSuspend$$inlined$map$1$2", f = "AdFollowUpAceSurveyView.kt", l = {136}, m = "emit")
/* loaded from: classes11.dex */
public final class NF6 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS131S0100000_10 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NF6(IDfS131S0100000_10 iDfS131S0100000_10, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS131S0100000_10;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
