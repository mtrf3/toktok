package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BvI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30328BvI extends TBS implements InterfaceC88472Yns<OSZ<? extends Boolean, ? extends Long>, C76800UCe> {
    public C30328BvI(Object obj) {
        super(1, obj, LiveBroadcastPreviewFragment.class, "onStartLive", "onStartLive(Lkotlin/Pair;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(OSZ<? extends Boolean, ? extends Long> osz) {
        OSZ<? extends Boolean, ? extends Long> p0 = osz;
        o.LJIIIZ(p0, "p0");
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) this.receiver;
        liveBroadcastPreviewFragment.getClass();
        if (p0.getFirst().booleanValue()) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).destroyEffectPalletHandler();
            DataChannel dataChannel = liveBroadcastPreviewFragment.LJLILLLLZI;
            if (dataChannel != null) {
                if (C78685UuP.LJIJ(dataChannel)) {
                    C30351Bvf c30351Bvf = liveBroadcastPreviewFragment.LJLJI;
                    if (c30351Bvf != null) {
                        C1Q2.LIZ.LJ(true);
                        C30355Bvj.LJIIIZ().LJ(c30351Bvf.LLFFF);
                        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).BT();
                        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).releaseGalleryModule();
                        C7N.LJII().releasePanelResource(false);
                        ((C1KU) C7N.LJII().getLiveEffectRestoreManager()).LIZ(c30351Bvf.LJLJI);
                        c30351Bvf.LJLL.release();
                        C30355Bvj.LIZLLL().release();
                        C30355Bvj.LJIIIIZZ();
                        C32021Nm.LIZLLL(false);
                        C30355Bvj.LJIIJ();
                        C32041No.LJIIIZ(true);
                    }
                } else {
                    C30350Bve c30350Bve = liveBroadcastPreviewFragment.LJLJJI;
                    if (c30350Bve != null) {
                        C1Q2.LIZ.LJ(true);
                        C30355Bvj.LJIIIZ().LJ(c30350Bve.LLFFF);
                        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).BT();
                        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).releaseGalleryModule();
                        C7N.LJII().releasePanelResource(false);
                        ((C1KU) C7N.LJII().getLiveEffectRestoreManager()).LIZ(c30350Bve.LJLJI);
                        c30350Bve.LJLL.release();
                        C30355Bvj.LIZLLL().release();
                        C30355Bvj.LJIIIIZZ();
                        C32021Nm.LIZLLL(false);
                        C30355Bvj.LJIIJ();
                        C32041No.LJIIIZ(true);
                    }
                }
                C40625Fwz.LIZIZ();
                C15610jN.LIZLLL(null);
                B73.LIZJ(null);
                C38.LIZ(false, C37.PREVIEW);
                if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
                    C31691Mf.LIZJ = null;
                }
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
