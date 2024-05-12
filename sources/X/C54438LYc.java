package X;

import com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LYc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C54438LYc implements InterfaceC88472Yns {
    public final /* synthetic */ int LJLIL = 0;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    public /* synthetic */ C54438LYc(C54437LYb c54437LYb, PublishFailureReason publishFailureReason, String str) {
        this.LJLJI = c54437LYb;
        this.LJLJJI = publishFailureReason;
        this.LJLILLLLZI = str;
    }

    public /* synthetic */ C54438LYc(DeepLinkHandlerActivity deepLinkHandlerActivity, String str, String str2) {
        this.LJLJI = deepLinkHandlerActivity;
        this.LJLILLLLZI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.LJLIL) {
            case 0:
                C54437LYb c54437LYb = (C54437LYb) this.LJLJI;
                PublishFailureReason publishFailureReason = (PublishFailureReason) this.LJLJJI;
                String str = this.LJLILLLLZI;
                c54437LYb.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    c54437LYb.LIZ(publishFailureReason, c54437LYb.LIZ.getActivity(), null, str);
                } else if (c54437LYb.LIZIZ.canAutoRetry()) {
                    c54437LYb.LIZIZ.checkAndAutoRetryIfNeed(c54437LYb.LIZ.getActivity());
                }
                return null;
            default:
                DeepLinkHandlerActivity deepLinkHandlerActivity = (DeepLinkHandlerActivity) this.LJLJI;
                String str2 = this.LJLILLLLZI;
                String str3 = (String) this.LJLJJI;
                deepLinkHandlerActivity.getClass();
                String valueOf = String.valueOf(R.string.pjj);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("rule_id", deepLinkHandlerActivity.LJLJJL);
                c188727au.LJIIIZ("push_label", deepLinkHandlerActivity.LJLLLL);
                c188727au.LJIIIZ("anchor_id", str2);
                c188727au.LJIIIZ("room_id", str3);
                FMX.LJIIL(valueOf, c188727au.LIZ);
                C56235M5f.LIZLLL(2010, deepLinkHandlerActivity.LJLILLLLZI, "live_dialog");
                return C76800UCe.LIZ;
        }
    }
}
