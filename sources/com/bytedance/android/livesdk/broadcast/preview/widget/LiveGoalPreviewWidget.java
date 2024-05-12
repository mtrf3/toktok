package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.B83;
import X.BCD;
import X.BCN;
import X.BCX;
import X.BHD;
import X.BII;
import X.BZI;
import X.C06510Nj;
import X.C15380j0;
import X.C199097rd;
import X.C221108m2;
import X.C26338AVi;
import X.C28472BFk;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C62822Ol8;
import X.C72818Shy;
import X.CN1;
import X.EnumC12540eQ;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import Y.AObserverS73S0100000_5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.LiveGoalPreviewViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalAnchorV2Setting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS48S0110000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGoalPreviewWidget extends PreviewWidget implements InterfaceC72822Si2 {
    public TextView LJLJJI;
    public View LJLJJL;
    public String LJLJI = "";
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 132));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dau;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        String str;
        LiveMode liveMode;
        long j;
        DataChannel dataChannel = this.dataChannel;
        String str2 = "";
        if (dataChannel == null || (str = (String) dataChannel.kv0(C28472BFk.class)) == null) {
            str = "";
        }
        this.LJLJI = str;
        super.LJZL();
        ((IGiftService) CN1.LIZ(IGiftService.class)).syncGiftList(1);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        if (LIZJ != null) {
            str2 = LIZJ;
        }
        this.LJLJJI = (TextView) this.contentView.findViewById(R.id.lvz);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            liveMode = (LiveMode) dataChannel2.kv0(BCX.class);
        } else {
            liveMode = null;
        }
        if (liveMode != null && C28509BGv.LJI(liveMode)) {
            LivePreviewComponentsSimplifyTypeSetting livePreviewComponentsSimplifyTypeSetting = LivePreviewComponentsSimplifyTypeSetting.INSTANCE;
            if (livePreviewComponentsSimplifyTypeSetting.inExperiment()) {
                this.LJLJJL = this.contentView.findViewById(R.id.fx3);
                TextView textView = this.LJLJJI;
                if (textView != null) {
                    textView.setTextSize(1, 15.0f);
                }
                TextView textView2 = this.LJLJJI;
                if (textView2 != null) {
                    textView2.setTextColor(C15380j0.LIZIZ(R.color.a16));
                }
                if (livePreviewComponentsSimplifyTypeSetting.showFullLiveGoalBtn()) {
                    this.contentView.setBackgroundResource(R.drawable.cav);
                    View view = this.LJLJJL;
                    if (view != null) {
                        C26338AVi.LJI(view, Integer.valueOf(C15380j0.LIZ(12.0f)), Integer.valueOf(C15380j0.LIZ(6.0f)), 0, Integer.valueOf(C15380j0.LIZ(6.0f)), false, 16);
                    }
                }
                View view2 = this.LJLJJL;
                if (view2 != null) {
                    view2.setBackgroundResource(R.drawable.cz2);
                }
            }
        }
        if (LiveGiftGoalAnchorV2Setting.INSTANCE.getValue()) {
            C72818Shy.LIZLLL("live_goal_update_event", this);
            ((LiveGoalPreviewViewModel) this.LJLJJLL.getValue()).LJLILLLLZI.observe(this, new AObserverS73S0100000_5(this, 17));
            LiveGoalPreviewViewModel liveGoalPreviewViewModel = (LiveGoalPreviewViewModel) this.LJLJJLL.getValue();
            Long l = (Long) this.dataChannel.kv0(BCN.class);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            liveGoalPreviewViewModel.gv0(j, str2);
            return;
        }
        LLF(false);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_golive_add_stream_goal_show")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_golive_add_stream_goal_show");
            LIZ.LJIIZILJ();
            LL(LIZ);
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (BCD.LIZJ(this.dataChannel, BHD.LJLIL, null) == EnumC12540eQ.ON) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        if (BCD.LIZJ(this.dataChannel, BHD.LJLIL, null) == EnumC12540eQ.ON) {
            if (!C29306Beo.LJJIIJ(getView())) {
                show();
            }
        } else {
            if (!C29306Beo.LJJIIJ(getView())) {
                return;
            }
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("live_goal_update_event", this);
    }

    public final void LL(BZI bzi) {
        String str;
        LiveMode liveMode;
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), bzi, "anchor_id");
        bzi.LJIJJ(this.LJLJI, "enter_from");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            str = liveMode.logStreamingType;
        } else {
            str = null;
        }
        bzi.LJIJ(str);
    }

    public final void LLF(boolean z) {
        if (z) {
            TextView textView = this.LJLJJI;
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.mgb));
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_golive_edit_live_goal_show");
            LL(LIZ);
            LIZ.LJJIIJZLJL();
        } else {
            TextView textView2 = this.LJLJJI;
            if (textView2 != null) {
                textView2.setText(C15380j0.LJIILJJIL(R.string.lq6));
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_golive_add_live_goal_show");
            LL(LIZ2);
            LIZ2.LJJIIJZLJL();
        }
        View view = this.contentView;
        if (view != null) {
            C29306Beo.LJJJLL(view, 1000L, new AqS48S0110000_5(this, z, 0));
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Integer num;
        if (o.LJ("live_goal_update_event", c199097rd.LJLIL)) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                num = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns, "goalStatus", 0));
            } else {
                num = null;
            }
            int code = BII.ONGOING.getCode();
            if (num == null || num.intValue() != code) {
                int code2 = BII.DELETED.getCode();
                if (num == null || num.intValue() != code2) {
                    return;
                }
                LLF(false);
                return;
            }
            LLF(true);
        }
    }
}
