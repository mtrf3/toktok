package X;

import android.content.Context;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.service.IFrameCheckService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;

/* renamed from: X.K8f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C51217K8f implements InterfaceC30078BrG, K93, InterfaceC51078K2w, InterfaceC43592H8y, InterfaceC43755HFf, G7W {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.G7W
    public final void onSuccess() {
        ((VideoPublishContainerScene) this.LJLILLLLZI).LLLIIIL();
    }

    @Override // X.InterfaceC43592H8y
    public final String LIZIZ(HBR hbr) {
        BaseShortVideoContext baseShortVideoContext = (BaseShortVideoContext) this.LJLILLLLZI;
        switch (HBQ.LIZ[hbr.ordinal()]) {
            case 1:
                return baseShortVideoContext.getMainBusinessData();
            case 2:
                return baseShortVideoContext.socialData;
            case 3:
                return baseShortVideoContext.commerceData;
            case 4:
                return baseShortVideoContext.ugData;
            case 5:
                return baseShortVideoContext.techData;
            case 6:
                return baseShortVideoContext.globalData;
            default:
                return null;
        }
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(final InterfaceC29879Bo3 interfaceC29879Bo3) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) this.LJLILLLLZI;
        absAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.MODIFY_DECORATION.getIntType(), new OnMessageListener() { // from class: X.K8y
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                InterfaceC29879Bo3.this.invoke(iMessage);
            }
        });
        absAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.MODIFY_STICKER.getIntType(), new OnMessageListener() { // from class: X.K8z
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                InterfaceC29879Bo3.this.invoke(iMessage);
            }
        });
    }

    public /* synthetic */ C51217K8f(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }

    public final void LIZLLL(KEI kei, int i) {
        String str = null;
        switch (this.LJLIL) {
            case 1:
                ActivityC45651qj activityC45651qj = ((EcSearchContainerFragment) this.LJLILLLLZI).LJLJJLL.LJZ;
                if (activityC45651qj != null) {
                    if (i == C51214K8c.LJII()) {
                        str = activityC45651qj.getString(R.string.fdh);
                    } else if (i == C51214K8c.LJI()) {
                        str = activityC45651qj.getString(R.string.fdg);
                    } else if (i == C51214K8c.LIZLLL()) {
                        str = "LIVE";
                    }
                }
                kei.LIZIZ(str);
                return;
            default:
                ActivityC45651qj activityC45651qj2 = ((SearchContainerFragment) this.LJLILLLLZI).LJLJL.LJZ;
                if (activityC45651qj2 != null) {
                    if (i == C50605JtZ.LJIIJJI()) {
                        str = activityC45651qj2.getString(R.string.i6g);
                    } else if (i == C50605JtZ.LJIIL()) {
                        str = activityC45651qj2.getString(R.string.tjc);
                    } else if (i == C50605JtZ.LJIIIZ()) {
                        str = activityC45651qj2.getString(R.string.iiy);
                    } else if (i == C50605JtZ.LJIIIIZZ()) {
                        str = activityC45651qj2.getString(R.string.ra1);
                    } else if (i == C50605JtZ.LIZJ()) {
                        str = activityC45651qj2.getString(R.string.ck3);
                    } else if (i == C50605JtZ.LJIILIIL()) {
                        str = activityC45651qj2.getString(R.string.qc_);
                    } else if (i == C50605JtZ.LJ()) {
                        str = activityC45651qj2.getString(R.string.mx3);
                    } else if (i == C50605JtZ.LJI()) {
                        str = activityC45651qj2.getString(R.string.jsq);
                    }
                }
                kei.LIZIZ(str);
                return;
        }
    }

    @Override // X.InterfaceC43755HFf
    public final void LIZ(int i, String str, boolean z) {
        Context context = (Context) this.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        ((IFrameCheckService) ServiceManager.get().getService(IFrameCheckService.class)).LIZ(context, str);
    }
}
