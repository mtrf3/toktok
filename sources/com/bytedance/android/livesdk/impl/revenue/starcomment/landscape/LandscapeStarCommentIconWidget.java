package com.bytedance.android.livesdk.impl.revenue.starcomment.landscape;

import X.BZI;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.CN1;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentEntranceVisibleEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LandscapeStarCommentIconWidget extends RoomRecycleWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dmk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static void LJLZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_guidance_show");
        LIZ.LJIILLIIL(dataChannel);
        if (o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.FALSE)) {
            LIZ.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).dK()), "user_rank");
        }
        LIZ.LJIJJ("landscape_live_room", "position");
        if (C15380j0.LJIILLIIL()) {
            LIZ.LJIJJ("portrait", "room_orientation");
        } else {
            LIZ.LJIJJ("landscape", "room_orientation");
        }
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool = (Boolean) this.dataChannel.kv0(StarCommentEntranceVisibleEvent.class);
        if (bool == null || !bool.booleanValue()) {
            if (bool == null) {
                C0NB.LJ("LandscapeStarCommentIconWidget", "StarCommentEntranceVisibleEvent is null.");
            } else {
                C0NB.LJ("LandscapeStarCommentIconWidget", "StarCommentEntranceVisibleEvent is false.");
            }
            View view = this.contentView;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            View view2 = this.contentView;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            LJLZ(this.dataChannel);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, StarCommentEntranceVisibleEvent.class, new AqS171S0100000_5(this, 792));
        }
        View view3 = this.contentView;
        if (view3 != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 381), view3);
        }
    }
}
