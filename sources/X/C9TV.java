package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.api.FeedBubbleAckApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.9TV, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class C9TV implements C90W {
    public final /* synthetic */ VideoViewCell LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    public /* synthetic */ C9TV(VideoViewCell videoViewCell, Aweme aweme) {
        this.LIZ = videoViewCell;
        this.LIZIZ = aweme;
    }

    public final void LIZ() {
        VideoViewCell videoViewCell = this.LIZ;
        Aweme aweme = this.LIZIZ;
        videoViewCell.getClass();
        if (aweme.getBubbleInfo() == null) {
            return;
        }
        int biz = aweme.getBubbleInfo().getBiz();
        int type = aweme.getBubbleInfo().getType();
        if (biz == 0 || type == 0 || type == 3) {
            return;
        }
        C2043280e.LIZ = true;
        C2043280e.LIZIZ = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("promote_guide_shown_history_");
        String LJ = UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
        KUN LJIILIIL = C1A7.LJIILIIL();
        LJIILIIL.LIZLLL().putLong(LJ, System.currentTimeMillis()).apply();
        C73318Sq2 c73318Sq2 = videoViewCell.LLLZZ;
        FeedBubbleAckApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        C73451SsB LJII = ((FeedBubbleAckApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(FeedBubbleAckApi.class)).sendBubbleAck(biz, type).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ());
        AbstractC73437Srx abstractC73437Srx = new AbstractC73437Srx() { // from class: X.9TX
            @Override // X.InterfaceC73442Ss2
            public final void onComplete() {
            }

            @Override // X.InterfaceC73442Ss2
            public final void onError(Throwable th) {
            }
        };
        LJII.LIZ(abstractC73437Srx);
        c73318Sq2.LIZ(abstractC73437Srx);
        FMX.LJIIL("Promote_bubble_show", C2043280e.LIZ(aweme).LIZ);
    }
}
