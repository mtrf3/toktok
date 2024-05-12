package com.bytedance.android.live.broadcast.game.partnership.widget;

import X.C15490jB;
import X.C29306Beo;
import X.C29701Eo;
import X.C2A8;
import X.C30588BzU;
import X.C30892CAm;
import X.CFX;
import X.CN1;
import X.InterfaceC31781Cdd;
import Y.IDAListenerS69S0100000;
import Y.IDRunnableS85S0100000;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.event.NotifyGamePartnershipIconVisible;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GamePartnershipAudienceEntranceWidget extends RoomRecycleWidget {
    public C29701Eo LJLIL;
    public C29701Eo LJLILLLLZI;
    public boolean LJLJI;
    public Room LJLJJI;
    public boolean LJLJJL;
    public ImageView LJLJJLL;
    public C2A8 LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        View view = this.contentView;
        if (view == null) {
            this.LJLJI = false;
        } else {
            view.setVisibility(8);
        }
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onHide(this);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(NotifyGamePartnershipIconVisible.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        View view = this.contentView;
        if (view == null) {
            this.LJLJI = true;
        } else {
            view.setVisibility(0);
        }
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onShow(this);
        }
        Room room = this.LJLJJI;
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        C30588BzU.LJFF(room, dataChannel);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(NotifyGamePartnershipIconVisible.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (ToolBarButtonWithTextExperiment.hasText()) {
            return R.layout.dmf;
        }
        return R.layout.dme;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C30892CAm Yd0;
        super.onUnload();
        C29701Eo c29701Eo = this.LJLIL;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
        }
        C29701Eo c29701Eo2 = this.LJLILLLLZI;
        if (c29701Eo2 != null) {
            c29701Eo2.removeAllAnimatorListeners();
        }
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C29701Eo c29701Eo;
        C29701Eo c29701Eo2;
        ImageView imageView;
        View view = this.contentView;
        if (view != null) {
            C29306Beo.LJJJLL(view, 500L, new IDqS416S0100000(this, 38));
        }
        View view2 = this.contentView;
        C2A8 c2a8 = null;
        if (view2 != null) {
            c29701Eo = (C29701Eo) view2.findViewById(R.id.dq7);
        } else {
            c29701Eo = null;
        }
        this.LJLIL = c29701Eo;
        View view3 = this.contentView;
        if (view3 != null) {
            c29701Eo2 = (C29701Eo) view3.findViewById(R.id.dq6);
        } else {
            c29701Eo2 = null;
        }
        this.LJLILLLLZI = c29701Eo2;
        View view4 = this.contentView;
        if (view4 != null) {
            imageView = (ImageView) view4.findViewById(R.id.e91);
        } else {
            imageView = null;
        }
        this.LJLJJLL = imageView;
        View view5 = this.contentView;
        if (view5 != null) {
            c2a8 = (C2A8) view5.findViewById(R.id.dq8);
        }
        this.LJLJL = c2a8;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        DataChannel dataChannel;
        super.onLoad(objArr);
        if (this.LJLJI) {
            show();
        } else {
            hide();
        }
        C15490jB.LJIIJ(this.LJLIL, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "gamelive_audience_gamepad_card_show_lottie.zip", false);
        C15490jB.LJIIJ(this.LJLILLLLZI, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "gamelive_audience_gamepad_card_hide_lottie.zip", false);
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        LifecycleOwner lifecycleOwner = null;
        if (interfaceC31781Cdd != null && interfaceC31781Cdd.getFragment() != null && (dataChannel = this.dataChannel) != null) {
            dataChannel.lv0(dataChannel.LJLJJI, PartnershipPromoteGameCardShowChannel.class, new IDqS416S0100000(this, 316));
            dataChannel.lv0(this, GamePartnershipEntranceHide.class, new IDqS416S0100000(this, 317));
        }
        C29701Eo c29701Eo = this.LJLIL;
        if (c29701Eo != null) {
            c29701Eo.addAnimatorListener(new IDAListenerS69S0100000(this, 10));
        }
        C29701Eo c29701Eo2 = this.LJLILLLLZI;
        if (c29701Eo2 != null) {
            c29701Eo2.addAnimatorListener(new IDAListenerS69S0100000(this, 11));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJI = room;
        C29701Eo c29701Eo3 = this.LJLIL;
        if (c29701Eo3 != null) {
            c29701Eo3.setVisibility(0);
        }
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
            ImageView imageView = this.LJLJJLL;
            if (imageView != null) {
                imageView.post(new IDRunnableS85S0100000(this, 51));
            }
            Object obj = this.context;
            if (obj instanceof LifecycleOwner) {
                o.LJII(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                lifecycleOwner = (LifecycleOwner) obj;
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new IDqS416S0100000(this, 39));
            }
        }
        if (ToolBarButtonWithTextExperiment.hasText()) {
            C2A8 c2a8 = this.LJLJL;
            if (c2a8 == null) {
                return;
            }
            c2a8.setVisibility(0);
            return;
        }
        C2A8 c2a82 = this.LJLJL;
        if (c2a82 == null) {
            return;
        }
        c2a82.setVisibility(8);
    }
}
