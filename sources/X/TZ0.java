package X;

import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MuteMicViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorActivityBannerChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3AnchorDestroyChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorActivityInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptAnchorConnectOverReportSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZ0 implements InterfaceC75414Tik<DestroyChannelResult> {
    public final /* synthetic */ TZJ LJLIL;
    public final /* synthetic */ C74842TYw LJLILLLLZI;
    public final /* synthetic */ EnumC74778TWk LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(DestroyChannelResult value) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        o.LJIIIZ(value, "value");
        if (this.LJLIL.finishReason == 10001) {
            C30868C9o.LIZJ(R.string.ne_);
        }
        C0NB.LIZIZ("MultiGuestV3AnchorPresenter", "destroy channel succ");
        TYQ.LIZJ("LinkIn_finish_Success");
        TZJ tzj = this.LJLIL;
        boolean z = true;
        if (tzj == TZJ.USER_CLICK) {
            EnumC74827TYh enumC74827TYh = EnumC74827TYh.CLOSE_MODE;
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LJLILLLLZI.getMultiGuestDataHolder().LJIIJ;
            if (multiLiveAnchorPanelSettings == null || multiLiveAnchorPanelSettings.allowViewerReq != 3) {
                z = false;
            }
            C74824TYe.LJLIIL(enumC74827TYh, z, false);
            C75457TjR.LJIIIZ("manual_close", this.LJLJI);
        } else if (tzj == TZJ.INTERRUPT_BY_CO_HOST) {
            EnumC74827TYh enumC74827TYh2 = EnumC74827TYh.CLOSE_MODE;
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LJLILLLLZI.getMultiGuestDataHolder().LJIIJ;
            if (multiLiveAnchorPanelSettings2 == null || multiLiveAnchorPanelSettings2.allowViewerReq != 3) {
                z = false;
            }
            C74824TYe.LJLIIL(enumC74827TYh2, z, false);
            C75457TjR.LJIIIZ("accept_anchor_invite", this.LJLJI);
        }
        C74842TYw c74842TYw = this.LJLILLLLZI;
        c74842TYw.LJLJJL = false;
        TZK tzk = c74842TYw.LJLJL;
        if (tzk != null) {
            tzk.LJIJJ();
        }
        C74740TUy.LIZLLL().LJI(0);
        DataChannel dataChannel3 = this.LJLILLLLZI.LJLJJI;
        if (dataChannel3 != null) {
            dataChannel3.qv0(InteractStateChangeEvent.class, new TW6(8));
        }
        DataChannel dataChannel4 = this.LJLILLLLZI.LJLJJI;
        if (dataChannel4 != null) {
            dataChannel4.pv0(MultiGuestV3AnchorDestroyChannel.class);
        }
        this.LJLILLLLZI.getMultiGuestDataHolder().LJIILL("destroy_channel");
        if (C74838TYs.LJ().LJJJI && (dataChannel2 = this.LJLILLLLZI.LJLJJI) != null) {
            dataChannel2.qv0(MuteMicViewStateChangeEvent.class, Boolean.TRUE);
        }
        if (MultiGuestFetchAnchorActivityInfoSetting.INSTANCE.isEnable() && (dataChannel = this.LJLILLLLZI.LJLJJI) != null) {
            dataChannel.rv0(AnchorActivityBannerChannel.class, new C74860TZo(false, "", ""));
        }
        if (MultiGuestOptAnchorConnectOverReportSetting.INSTANCE.isEnable()) {
            C29556Biq.LIZ().getClass();
            C74830TYk.LJFF(C74983Tbn.LIZJ());
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        String logTAG = this.LJLILLLLZI.logTAG(1738);
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C32014ChO.LIZJ(logTAG, "destroy channel failed", str);
        if (th != null) {
            this.LJLILLLLZI.logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mUnrecoverableErrorHappened:");
        LIZ.append(this.LJLILLLLZI.LJLJLJ);
        LIZ.append("; throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_finish_Failed", X1D.LIZIZ(LIZ));
        C74842TYw c74842TYw = this.LJLILLLLZI;
        c74842TYw.LJLJJL = false;
        if (!c74842TYw.LJLJLJ) {
            TZK tzk = c74842TYw.LJLJL;
            if (tzk != null) {
                tzk.LJIJ(th);
                return;
            }
            return;
        }
        TZK tzk2 = c74842TYw.LJLJL;
        if (tzk2 != null) {
            tzk2.LJIJJ();
        }
        C74740TUy.LIZLLL().LJI(0);
        DataChannel dataChannel = this.LJLILLLLZI.LJLJJI;
        if (dataChannel != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(8));
        }
        DataChannel dataChannel2 = this.LJLILLLLZI.LJLJJI;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.pv0(MultiGuestV3AnchorDestroyChannel.class);
    }

    public TZ0(TZJ tzj, C74842TYw c74842TYw, EnumC74778TWk enumC74778TWk) {
        this.LJLIL = tzj;
        this.LJLILLLLZI = c74842TYw;
        this.LJLJI = enumC74778TWk;
    }
}
