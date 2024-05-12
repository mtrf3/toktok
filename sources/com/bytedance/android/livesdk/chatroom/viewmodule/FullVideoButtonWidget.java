package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.BCN;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C28430BDu;
import X.C28431BDv;
import X.C29232Bdc;
import X.C30922CBq;
import X.C32537Cpp;
import X.C74740TUy;
import X.CN1;
import X.FT5;
import X.InterfaceC28471BFj;
import X.X1D;
import Y.ACListenerS30S0101000_13;
import Y.AObjectS42S0101000_5;
import Y.AObjectS44S0101000_8;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.dataChannel.AudienceDefinitionSwitchTipsChannel;
import com.bytedance.android.livesdk.dataChannel.IsVideoViewChangeForHostChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLinkMicBlockOrientSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveEntranceOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class FullVideoButtonWidget extends RoomWidget {
    public long LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public LiveIconView LJLJJI;
    public boolean LJLJJL;
    public EnterRoomConfig LJLJJLL;
    public boolean LJLJL;
    public final C28431BDv LJLJLJ = new InterfaceC28471BFj() { // from class: X.BDv
        @Override // X.InterfaceC28471BFj
        public final void onChanged(Object obj) {
            FullVideoButtonWidget fullVideoButtonWidget = FullVideoButtonWidget.this;
            Integer num = (Integer) obj;
            fullVideoButtonWidget.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("linkStateObserver state = ");
            LIZ.append(num);
            C0NB.LJIIIZ("DebugFullVideoButton", X1D.LIZIZ(LIZ));
            if (num == null || !GameLinkMicBlockOrientSetting.INSTANCE.isDefault() || fullVideoButtonWidget.LJLJJI == null) {
                return;
            }
            if (num.intValue() == 1 || num.intValue() == 2) {
                fullVideoButtonWidget.LJLJI = true;
                fullVideoButtonWidget.LJLJJI.setAlpha(0.5f);
            } else {
                fullVideoButtonWidget.LJLJI = false;
                fullVideoButtonWidget.LJLJJI.setAlpha(1.0f);
            }
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dbz;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LJLZ() {
        if (this.LJLILLLLZI || (LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && this.LJLJJL)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        boolean z;
        boolean z2;
        DataChannel dataChannel = this.dataChannel;
        boolean z3 = false;
        if (dataChannel == null) {
            return false;
        }
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        LiveMtMockLandscapeSetting liveMtMockLandscapeSetting = LiveMtMockLandscapeSetting.INSTANCE;
        if (liveMtMockLandscapeSetting.getValue() || (room != null && !room.isStar() && (room.isThirdParty || room.isScreenshot))) {
            z = true;
        } else {
            z = false;
        }
        if (room != null) {
            if (room.multiStreamScene == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLJJL = z2;
        }
        if (!z && C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("shouldAttach false. mock=");
            LIZ.append(liveMtMockLandscapeSetting.getValue());
            LIZ.append("; room not null=");
            if (room != null) {
                z3 = true;
            }
            LIZ.append(z3);
            LIZ.append("; room.is not Star=");
            LIZ.append(!room.isStar());
            LIZ.append("; room.isThirdParty=");
            LIZ.append(room.isThirdParty);
            LIZ.append("; room.isScreenshot=");
            FT5.LJ(LIZ, room.isScreenshot, LIZ, "DebugFullVideoButton");
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C29232Bdc.LJFF(this.dataChannel)) {
            return;
        }
        if (this.LJLJL) {
            if (C30922CBq.LIZIZ) {
                C0NB.LIZIZ("DebugFullVideoButton", "isInCoHost");
            }
        } else {
            super.show();
            ((C32537Cpp) this.dataChannel.gv0(C28430BDu.class)).LIZ = Boolean.TRUE;
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("DebugFullVideoButton", "show()");
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("DebugFullVideoButton", "hide()");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        int i;
        super.onCreate();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("DebugFullVideoButton", "FullVideoButtonWidget, onCreate()");
        }
        if (getView() != null) {
            this.LJLJJI = (LiveIconView) getView().findViewById(R.id.ei7);
        }
        if (this.LJLJJI != null) {
            int LIZ = C15380j0.LIZ(8.0f);
            this.LJLJJI.setPadding(LIZ, LIZ, LIZ, LIZ);
            this.LJLJJI.setBackgroundResource(R.drawable.d7v);
            LandscapeWatchLiveEntranceOpt landscapeWatchLiveEntranceOpt = LandscapeWatchLiveEntranceOpt.INSTANCE;
            if (landscapeWatchLiveEntranceOpt.enable()) {
                LiveIconView liveIconView = this.LJLJJI;
                int group = landscapeWatchLiveEntranceOpt.getGroup();
                if (group == 1 || group == 2 || (group != 3 && group != 4)) {
                    i = R.attr.ati;
                } else {
                    i = R.attr.ask;
                }
                liveIconView.setIconAttr(i);
                LiveIconView liveIconView2 = this.LJLJJI;
                liveIconView2.setIconTint(C259910h.LIZJ(R.attr.dj, liveIconView2));
            } else {
                this.LJLJJI.setIcon(R.drawable.d22);
            }
            this.LJLJJI.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.LJLJJI.setVisibility(0);
        }
        this.LJLIL = ((Long) this.dataChannel.kv0(BCN.class)).longValue();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.ov0(this, VideoOrientationChangeChannel.class, new AObjectS42S0101000_5(2, this, 23));
        dataChannel.lv0(this, AudienceDefinitionSwitchTipsChannel.class, new AObjectS44S0101000_8(1, this, 0));
        dataChannel.ov0(this, SubOnlyLiveAudienceStatusChannel.class, new AObjectS42S0101000_5(1, this, 8));
        dataChannel.ov0(this, LinkCrossRoomStateChangeEvent.class, new AObjectS42S0101000_5(1, this, 9));
        dataChannel.ov0(this, IsVideoViewChangeForHostChannel.class, new AObjectS44S0101000_8(0, this, 1));
        C74740TUy.LIZLLL().LIZ(this.LJLJLJ);
        C16880lQ.LJIIJ(new ACListenerS30S0101000_13(0, this, 3), getView());
        String valueOf = String.valueOf(this.LJLIL);
        IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.V90(this.LJLJJLL, String.valueOf(valueOf));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C74740TUy.LIZLLL().LIZJ(this.LJLJLJ);
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
    }
}
