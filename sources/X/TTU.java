package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes14.dex */
public final class TTU extends AbstractC31497CXt<InterfaceC31336CRo> implements TQG {
    public final TTZ LJLIL;
    public final MultiGuestV3GuestPresenter LJLILLLLZI;

    @Override // X.TQG
    public final void LIZLLL() {
        long j;
        Room room;
        TTZ ttz = this.LJLIL;
        if (ttz != null && (room = ttz.LIZ) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        BizJoinChannelParams bizJoinChannelParams = new BizJoinChannelParams(j);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJLL(new TTS(bizJoinChannelParams));
        }
    }

    @Override // X.TQG
    public final C74690TTa LIZJ(long j) {
        int LIZIZ = TRK.LIZIZ(j);
        if (C78857UxB.LJJJ(LIZIZ)) {
            C74690TTa c74690TTa = new C74690TTa(this, new C74749TVh(MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportSilentMic(), false, null, null, false, false, false, false, false, 0, 4094));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideApplyDialogUICtrlCmd(audio only): ");
            LIZ.append(c74690TTa);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ));
            return c74690TTa;
        }
        if (C78857UxB.LJJJI(LIZIZ)) {
            C74690TTa c74690TTa2 = new C74690TTa(this, new C74749TVh(MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportSilentMic(), false, this, null, false, false, false, false, false, 0, 4078));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("provideApplyDialogUICtrlCmd(video): ");
            LIZ2.append(c74690TTa2);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ2));
            return c74690TTa2;
        }
        TYQ.LIZIZ("qiuyihao", "link type unknown");
        return null;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void attachView(InterfaceC2301691o interfaceC2301691o) {
        super.attachView((TTU) interfaceC2301691o);
    }

    @Override // X.AbstractC31497CXt
    public final void attachView(InterfaceC31336CRo interfaceC31336CRo) {
        super.attachView((TTU) interfaceC31336CRo);
    }

    public TTU(TTZ ttz, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter) {
        this.LJLIL = ttz;
        this.LJLILLLLZI = multiGuestV3GuestPresenter;
    }

    @Override // X.InterfaceC31831CeR
    public final void LIZIZ(int i, String str) {
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLILLLLZI;
        if (multiGuestV3GuestPresenter != null) {
            TQM.exitInteractInNormalWay$default(multiGuestV3GuestPresenter, str, false, i, 2, null);
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LJIIIIZZ = false;
    }

    @Override // X.TQG
    public final TQF LJJIII(long j, boolean z) {
        int LIZIZ = TRK.LIZIZ(j);
        Room room = null;
        if (C78857UxB.LJJJ(LIZIZ)) {
            MultiGuestV3GuestGoLivePreviewPanelOpt multiGuestV3GuestGoLivePreviewPanelOpt = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE;
            boolean isSupportSilentMic = multiGuestV3GuestGoLivePreviewPanelOpt.isSupportSilentMic();
            boolean isSupportCloseGoLive = multiGuestV3GuestGoLivePreviewPanelOpt.isSupportCloseGoLive();
            TTZ ttz = this.LJLIL;
            if (ttz != null) {
                room = ttz.LIZ;
            }
            C74749TVh c74749TVh = new C74749TVh(isSupportSilentMic, isSupportCloseGoLive, this, null, C78926UyI.LJJIJL(room), !z, false, z, false, 0, 3366);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideApplyConfirmDialogUICtrlCmd(audio only): ");
            LIZ.append(c74749TVh);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ));
            return c74749TVh;
        }
        if (C78857UxB.LJJJI(LIZIZ)) {
            MultiGuestV3GuestGoLivePreviewPanelOpt multiGuestV3GuestGoLivePreviewPanelOpt2 = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE;
            boolean isSupportSilentMic2 = multiGuestV3GuestGoLivePreviewPanelOpt2.isSupportSilentMic();
            boolean isSupportCloseGoLive2 = multiGuestV3GuestGoLivePreviewPanelOpt2.isSupportCloseGoLive();
            TTZ ttz2 = this.LJLIL;
            if (ttz2 != null) {
                room = ttz2.LIZ;
            }
            C74749TVh c74749TVh2 = new C74749TVh(isSupportSilentMic2, isSupportCloseGoLive2, this, null, C78926UyI.LJJIJLIJ(room), !z, false, z, false, 0, 3366);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("provideApplyConfirmDialogUICtrlCmd(video): ");
            LIZ2.append(c74749TVh2);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ2));
            return c74749TVh2;
        }
        TYQ.LIZIZ("qiuyihao", "link type unknown");
        return null;
    }
}
