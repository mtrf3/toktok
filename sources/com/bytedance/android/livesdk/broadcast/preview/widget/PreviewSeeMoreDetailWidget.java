package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C15380j0;
import X.C16880lQ;
import X.C28956BYa;
import X.C29053Baj;
import X.C29180Bcm;
import X.C29306Beo;
import X.C2A7;
import X.CN1;
import Y.ACListenerS40S0200000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.AccessLiveStudioSucceedChannel;
import com.bytedance.android.livesdk.dataChannel.DeepLinkLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import webcast.api.game.CreateInfoResponse;

/* loaded from: classes6.dex */
public final class PreviewSeeMoreDetailWidget extends PreviewWidget {
    public static final /* synthetic */ int LJLJJLL = 0;
    public boolean LJLJI;
    public final C29180Bcm LJLJJI = (C29180Bcm) DataChannelGlobal.LJLJJI.mv0(C29053Baj.class);
    public C2A7 LJLJJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq4;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LL() {
        CreateInfoResponse.ResponseData DX;
        IGameService iGameService = (IGameService) CN1.LIZ(IGameService.class);
        if (iGameService != null && (DX = iGameService.DX()) != null && DX.hasLiveStudioLogin) {
            C2A7 c2a7 = this.LJLJJL;
            if (c2a7 != null) {
                c2a7.setText(C15380j0.LJIILJJIL(R.string.la3));
                C16880lQ.LJJIII(c2a7, new ACListenerS40S0200000_5(c2a7, this, 31));
            }
            C28956BYa.LIZ(this.dataChannel, "live_take_page_LS", false, o.LJ(DataChannelGlobal.LJLJJI.mv0(LiveCastStateChannel.class), Boolean.TRUE));
            return;
        }
        C2A7 c2a72 = this.LJLJJL;
        if (c2a72 == null) {
            return;
        }
        c2a72.setText(C15380j0.LJIILJJIL(R.string.muy));
        C16880lQ.LJJIII(c2a72, new ACListenerS40S0200000_5(c2a72, this, 32));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        C2A7 c2a7;
        Boolean bool;
        super.LJZL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, DeepLinkLiveModeChannel.class, new AqS171S0100000_5(this, 187));
        }
        View view = getView();
        Boolean bool2 = null;
        if (!(view instanceof C2A7) || (c2a7 = (C2A7) view) == null) {
            return;
        }
        this.LJLJJL = c2a7;
        C29180Bcm c29180Bcm = this.LJLJJI;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLJJL);
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            C2A7 c2a72 = this.LJLJJL;
            if (c2a72 != null) {
                c2a72.setText(C15380j0.LJIILJJIL(R.string.mvb));
                C16880lQ.LJJIII(c2a72, new ACListenerS40S0200000_5(c2a72, this, 8));
                return;
            }
            return;
        }
        C29180Bcm c29180Bcm2 = this.LJLJJI;
        if (c29180Bcm2 != null) {
            bool2 = Boolean.valueOf(c29180Bcm2.LJLJJI);
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            LL();
        } else {
            C2A7 c2a73 = this.LJLJJL;
            if (c2a73 != null) {
                c2a73.setText(C15380j0.LJIILJJIL(R.string.mua));
                C16880lQ.LJJIII(c2a73, new ACListenerS40S0200000_5(c2a73, this, 33));
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, AccessLiveStudioSucceedChannel.class, new AqS171S0100000_5(this, 188));
        }
    }
}
