package X;

import Y.AObjectS146S0100000_8;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

/* loaded from: classes10.dex */
public final /* synthetic */ class LDB implements InterfaceC30078BrG, C2LF, InterfaceC53885LCv, InterfaceC43591H8x {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.C2LF
    public final void call() {
        BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) this.LJLILLLLZI;
        baseListFragmentPanel.tryToHideStayHomeGuide(baseListFragmentPanel.activity, baseListFragmentPanel.getCurrentAweme(), 0L, 1200L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r0.getUid().equals(r4.getUid()) != false) goto L27;
     */
    @Override // X.InterfaceC53885LCv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.LJLILLLLZI
            X.LCx r2 = (X.C53887LCx) r2
            r2.getClass()
            X.C77413UZt.LJIIZILJ()
            if (r4 != 0) goto L11
            boolean r0 = r2.LJIIIZ()
        L10:
            return r0
        L11:
            X.N5W r1 = X.N5W.LIZIZ
            int r0 = r2.LIZJ
            if (r0 != 0) goto L62
            X.LCy r0 = r2.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJIILJJIL
        L1b:
            boolean r0 = r1.LIZIZ(r0)
            if (r0 == 0) goto L23
        L21:
            r0 = 1
            goto L10
        L23:
            boolean r0 = r4.isLive()
            if (r0 != 0) goto L2b
        L29:
            r0 = 0
            goto L10
        L2b:
            boolean r0 = r4.isSecret()
            if (r0 == 0) goto L55
            boolean r0 = X.AV1.LJIILL(r4)
            if (r0 != 0) goto L55
            int r0 = r2.LIZJ
            if (r0 != 0) goto L50
            X.LCy r0 = r2.LIZ
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJI
        L3f:
            if (r0 == 0) goto L29
            java.lang.String r1 = r0.getUid()
            java.lang.String r0 = r4.getUid()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L55
            goto L29
        L50:
            X.LCt r0 = r2.LIZIZ
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJIILIIL
            goto L3f
        L55:
            boolean r0 = X.UC0.LJJLI()
            if (r0 == 0) goto L29
            boolean r0 = r4.isBlock()
            if (r0 != 0) goto L29
            goto L21
        L62:
            X.LCt r0 = r2.LIZIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJIIL
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LDB.LIZ(com.ss.android.ugc.aweme.profile.model.User):boolean");
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        switch (this.LJLIL) {
            case 0:
                ((AbsAudienceInteractionFragment) this.LJLILLLLZI).lambda$loadWidgetWithFirstFrameP2$55(interfaceC29879Bo3);
                return;
            default:
                Object obj = this.LJLILLLLZI;
                obj.getClass();
                ((IGiftService) CN1.LIZ(IGiftService.class)).resetPinCardStatus();
                DataChannelGlobal.LJLJJI.ov0(LiveGiftShowPinCardEvent.class, obj, new AObjectS146S0100000_8(interfaceC29879Bo3, 0));
                return;
        }
    }

    public /* synthetic */ LDB(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }

    @Override // X.InterfaceC43591H8x
    public final void LIZIZ(HBR hbr, String str) {
        AVDraftExtras aVDraftExtras = (AVDraftExtras) this.LJLILLLLZI;
        switch (HBQ.LIZ[hbr.ordinal()]) {
            case 1:
                aVDraftExtras.mainBusinessData = str;
                return;
            case 2:
                aVDraftExtras.socialData = str;
                return;
            case 3:
                aVDraftExtras.commerceData = str;
                return;
            case 4:
                aVDraftExtras.ugData = str;
                return;
            case 5:
                aVDraftExtras.techData = str;
                return;
            case 6:
                aVDraftExtras.globalData = str;
                return;
            default:
                return;
        }
    }
}
