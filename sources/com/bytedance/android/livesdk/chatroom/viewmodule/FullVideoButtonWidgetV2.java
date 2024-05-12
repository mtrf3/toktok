package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.BCN;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C28428BDs;
import X.C28430BDu;
import X.C29232Bdc;
import X.C30922CBq;
import X.C32537Cpp;
import X.C74740TUy;
import X.CN1;
import X.FT5;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.dataChannel.AudienceDefinitionSwitchTipsChannel;
import com.bytedance.android.livesdk.dataChannel.IsVideoViewChangeForHostChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveEntranceOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class FullVideoButtonWidgetV2 extends LiveRecyclableWidget {
    public long LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public LiveIconView LJLJJI;
    public boolean LJLJJL;
    public EnterRoomConfig LJLJJLL;
    public boolean LJLJL;
    public final C28428BDs LJLJLJ = new C28428BDs(this);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dbz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLIL = 0L;
        C74740TUy.LIZLLL().LIZJ(this.LJLJLJ);
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
            if (room != null) {
                LIZ.append(!room.isStar());
                LIZ.append("; room.isThirdParty=");
                LIZ.append(room.isThirdParty);
                LIZ.append("; room.isScreenshot=");
                FT5.LJ(LIZ, room.isScreenshot, LIZ, "DebugFullVideoButton");
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C29232Bdc.LJFF(this.dataChannel) || this.LJLJL) {
            return;
        }
        super.show();
        ((C32537Cpp) this.dataChannel.gv0(C28430BDu.class)).LIZ = Boolean.TRUE;
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("DebugFullVideoButton", "show()");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("DebugFullVideoButton", "hide()");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LiveIconView liveIconView;
        int i;
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("DebugFullVideoButton", "FullVideoButtonWidgetV2, onInit()");
        }
        View view = getView();
        if (view != null) {
            liveIconView = (LiveIconView) view.findViewById(R.id.ei7);
        } else {
            liveIconView = null;
        }
        this.LJLJJI = liveIconView;
        if (liveIconView != null) {
            int LIZ = C15380j0.LIZ(8.0f);
            liveIconView.setPadding(LIZ, LIZ, LIZ, LIZ);
            liveIconView.setBackgroundResource(R.drawable.d7v);
            LandscapeWatchLiveEntranceOpt landscapeWatchLiveEntranceOpt = LandscapeWatchLiveEntranceOpt.INSTANCE;
            if (landscapeWatchLiveEntranceOpt.enable()) {
                int group = landscapeWatchLiveEntranceOpt.getGroup();
                if (group == 1 || group == 2 || (group != 3 && group != 4)) {
                    i = R.attr.ati;
                } else {
                    i = R.attr.ask;
                }
                liveIconView.setIconAttr(i);
                liveIconView.setIconTint(C259910h.LIZIZ(R.attr.dj, liveIconView.getContext()));
            } else {
                liveIconView.setIcon(R.drawable.d22);
            }
            liveIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            liveIconView.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long j;
        Long l = (Long) this.dataChannel.kv0(BCN.class);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL = j;
        DataChannel dataChannel = this.dataChannel;
        dataChannel.ov0(this, VideoOrientationChangeChannel.class, new AqS171S0100000_5(this, 321));
        dataChannel.lv0(this, AudienceDefinitionSwitchTipsChannel.class, new AqS171S0100000_5(this, 322));
        dataChannel.ov0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS171S0100000_5(this, 323));
        dataChannel.ov0(this, LinkCrossRoomStateChangeEvent.class, new AqS171S0100000_5(this, 324));
        dataChannel.ov0(this, IsVideoViewChangeForHostChannel.class, new AqS171S0100000_5(this, 325));
        C74740TUy.LIZLLL().LIZ(this.LJLJLJ);
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 136), view);
        }
        String valueOf = String.valueOf(this.LJLIL);
        IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.V90(this.LJLJJLL, valueOf);
        }
    }
}
