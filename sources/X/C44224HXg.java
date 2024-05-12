package X;

import Y.IDRunnableS6S0101000;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

/* renamed from: X.HXg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44224HXg implements InterfaceC30078BrG, InterfaceC55031Lil, InterfaceC43591H8x {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        ((AbsAudienceInteractionFragment) this.LJLIL).lambda$loadWidgetWithFirstFrameP2$51(interfaceC29879Bo3);
    }

    @Override // X.InterfaceC55031Lil
    public final void LIZ() {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) this.LJLIL;
        C80796VnM c80796VnM = detailFragmentPanel.mViewPager;
        if (c80796VnM == null || detailFragmentPanel.LLILII == null) {
            return;
        }
        c80796VnM.post(new IDRunnableS6S0101000(4, detailFragmentPanel, 36));
    }

    public /* synthetic */ C44224HXg(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC43591H8x
    public final void LIZIZ(HBR hbr, String str) {
        BaseShortVideoContext baseShortVideoContext = (BaseShortVideoContext) this.LJLIL;
        switch (HBQ.LIZ[hbr.ordinal()]) {
            case 1:
                baseShortVideoContext.setMainBusinessData(str);
                return;
            case 2:
                baseShortVideoContext.socialData = str;
                return;
            case 3:
                baseShortVideoContext.commerceData = str;
                return;
            case 4:
                baseShortVideoContext.ugData = str;
                return;
            case 5:
                baseShortVideoContext.techData = str;
                return;
            case 6:
                baseShortVideoContext.globalData = str;
                return;
            default:
                return;
        }
    }
}
