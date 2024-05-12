package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.ObsBroadcastGuideWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCommercialWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioTipsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameGpppaPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollEnableChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bvc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30348Bvc extends C0N0 {
    public final C25260yw LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C0N0
    public final void LIZ() {
        C25260yw c25260yw = this.LJLILLLLZI;
        if (c25260yw != null) {
            c25260yw.LIZJ.clear();
            c25260yw.LIZLLL.clear();
            c25260yw.LJI = true;
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveStudioTipsWidget.class), (C31809Ce5) LJFF(R.id.fzl), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(LiveStudioTagShowChannel.class)}, true);
        C65776Prg n70 = ((IGameService) CN1.LIZ(IGameService.class)).n70();
        if ((n70 instanceof InterfaceC65350Pko) && n70 != null) {
            C0N9.LIZ(n70, (C31809Ce5) LJFF(R.id.dqp), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewReplayWidget.class), (C31809Ce5) LJFF(R.id.ivy), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(ReplayEnableChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(ObsBroadcastGuideWidget.class), (C31809Ce5) LJFF(R.id.h9b), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(GameGpppaPreviewBanner.class), (C31809Ce5) LJFF(R.id.dy1), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        if (GameLivePartnershipDropsSetting.INSTANCE.getConfig().enable) {
            C0N9.LIZ(C65352Pkq.LIZ(GameDropsPreviewBanner.class), (C31809Ce5) LJFF(R.id.iew), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        if (!C35001Yy.LIZJ(getContext())) {
            C65776Prg sj = C7N.LIZJ().sj();
            if ((sj instanceof InterfaceC65350Pko) && sj != null) {
                C0N9.LIZ(sj, (C31809Ce5) LJFF(R.id.agf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
            }
        }
    }

    @Override // X.C0N0
    public final void LIZIZ() {
        C25260yw c25260yw = this.LJLILLLLZI;
        if (c25260yw != null) {
            c25260yw.LJI = false;
        }
    }

    @Override // X.C0N0
    public final void LIZJ() {
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCoverWidget.class), (C31809Ce5) LJFF(R.id.byb), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCloseWidget.class), (C31809Ce5) LJFF(R.id.bg2), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewTitleWidget.class), (C31809Ce5) LJFF(R.id.lau), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCommonNotifyWidget.class), (C31809Ce5) LJFF(R.id.h64), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveCenterWidget.class), (C31809Ce5) LJFF(R.id.fws), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSettingWidget.class), (C31809Ce5) LJFF(R.id.jr7), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewPartnershipWidget.class), (C31809Ce5) LJFF(R.id.hih), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewGameDropsWidget.class), (C31809Ce5) LJFF(R.id.dqe), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class), (C31809Ce5) LJFF(R.id.kd6), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSubscriptionWidget.class), (C31809Ce5) LJFF(R.id.kq8), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCustomPollWidget.class), (C31809Ce5) LJFF(R.id.c2n), new InterfaceC65350Pko[]{C65352Pkq.LIZ(CustomPollEnableChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewApplyWidget.class), (C31809Ce5) LJFF(R.id.a6x), new InterfaceC65350Pko[0], true);
        PreviewApplyWidget previewApplyWidget = (PreviewApplyWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewApplyWidget.class));
        if (previewApplyWidget != null) {
            previewApplyWidget.LJLJL = (C119774mz) LJFF(R.id.dj8);
        }
        C0N9.LIZ(C65352Pkq.LIZ(LiveAccessRecallWidget.class), (C31809Ce5) LJFF(R.id.h9a), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        C65776Prg nk = C7N.LJIIJ().nk();
        if (!(nk instanceof InterfaceC65350Pko)) {
            nk = null;
        }
        if (nk != null) {
            C0N9.LIZ(nk, (C31809Ce5) LJFF(R.id.e2q), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCommercialWidget.class), (C31809Ce5) LJFF(R.id.b1g), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewPromoteWidget.class), (C31809Ce5) LJFF(R.id.ibt), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
    }

    @Override // X.C0N0
    public final void LIZLLL() {
        C25260yw c25260yw = this.LJLILLLLZI;
        if (c25260yw != null) {
            c25260yw.LIZIZ();
        }
    }

    public C30348Bvc(Context context, C61 c61) {
        super(context, R.layout.dgf);
        C25260yw c25260yw;
        View findViewById;
        if (c61 != null) {
            c25260yw = c61.LIZ;
        } else {
            c25260yw = null;
        }
        this.LJLILLLLZI = c25260yw;
        if (!C259710f.LIZ.LJIIIZ() && (findViewById = findViewById(R.id.i3g)) != null) {
            findViewById.setOnTouchListener(ViewOnTouchListenerC30344BvY.LJLIL);
        }
        C47061t0 radio_cover = (C47061t0) LJFF(R.id.ils);
        o.LJIIIIZZ(radio_cover, "radio_cover");
        C22960vE.LIZ(context, radio_cover);
        C30368Bvw.LIZ();
    }
}
