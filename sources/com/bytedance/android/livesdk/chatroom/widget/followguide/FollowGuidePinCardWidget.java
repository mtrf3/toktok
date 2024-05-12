package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.B83;
import X.BKI;
import X.BKY;
import X.C05170If;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C29232Bdc;
import X.C2A7;
import X.C31665Cbl;
import X.C47061t0;
import X.C47121t6;
import X.C47261Igj;
import X.C78598Ut0;
import X.OSZ;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import Y.ARunnableS41S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.CustomPollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.watch.FollowGuidePinCardShow;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class FollowGuidePinCardWidget extends FollowGuideAbsWidget {
    public LiveIconView LJLJLLL;
    public C47061t0 LJLL;
    public C47121t6 LJLLI;
    public C2A7 LJLLILLLL;
    public final List<Class<? extends Channel<Boolean>>> LJLLJ = C47261Igj.LJJIJIIJI(KeyboardStatusChannel.class, FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, CustomPollVisibleChannel.class, LiveExploreDrawerShowChannel.class, FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, SubGoalCardVisibilityChannel.class, CustomPollCardVisibility.class, QuestionCardVisibilityEvent.class, PublicScreenNormalPollStateVisibilityChannel.class, PublicScreenGiftPollStateVisibilityChannel.class);
    public final List<Class<? extends Channel<Boolean>>> LJLLL = C47261Igj.LJJIJIIJI(GiftDialogVisibilityChannel.class, ToolBarShareVisibleChannel.class);

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final long LJZI() {
        return 2L;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.do8;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final OSZ<String, Boolean> LJLZ() {
        for (Class<? extends Channel<Boolean>> cls : this.LJLLJ) {
            if (C78598Ut0.LJIILJJIL((Boolean) this.dataChannel.kv0(cls))) {
                return new OSZ<>(C16880lQ.LJLLJ(cls), Boolean.TRUE);
            }
        }
        BKI bki = (BKI) this.dataChannel.kv0(SubOnlyLiveAudienceStatusChannel.class);
        if (bki != null && C29232Bdc.LJI(bki)) {
            return new OSZ<>("SubOnlyLiveAudienceStatusChannel", Boolean.TRUE);
        }
        for (Class<? extends Channel<Boolean>> cls2 : this.LJLLL) {
            if (C78598Ut0.LJIILJJIL((Boolean) this.dataChannel.kv0(cls2))) {
                return new OSZ<>(C16880lQ.LJLLJ(cls2), Boolean.FALSE);
            }
        }
        if (BKY.LIZIZ().LIZJ()) {
            return new OSZ<>("dialog", Boolean.FALSE);
        }
        if (C78598Ut0.LJIILJJIL((Boolean) DataChannelGlobal.LJLJJI.mv0(SparkOpenChannel.class))) {
            return new OSZ<>("spark", Boolean.FALSE);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void LLFFF() {
        C2A7 c2a7 = this.LJLLILLLL;
        if (c2a7 != null) {
            c2a7.setText(R.string.okr);
        }
        C2A7 c2a72 = this.LJLLILLLL;
        if (c2a72 != null) {
            c2a72.setIcon(C259910h.LJ(R.attr.avp, this.context));
        }
        this.LJLILLLLZI.removeCallbacks(this.LJLJLJ);
        this.LJLJL = false;
        this.LJLILLLLZI.postDelayed(new ARunnableS41S0100000_5(this, 148), 2000L);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void LLFII() {
        Iterator<Class<? extends Channel<Boolean>>> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            this.dataChannel.lv0(this, it.next(), new AqS171S0100000_5(this, 368));
        }
        Iterator<Class<? extends Channel<Boolean>>> it2 = this.LJLLL.iterator();
        while (it2.hasNext()) {
            this.dataChannel.lv0(this, it2.next(), new AqS171S0100000_5(this, 369));
        }
        BKY.LIZIZ().LIZLLL.observe(this, new AObserverS73S0100000_5(this, 23));
        DataChannelGlobal.LJLJJI.nv0(this, this, SparkOpenChannel.class, new AqS171S0100000_5(this, 370));
        this.dataChannel.lv0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS171S0100000_5(this, 371));
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationStart() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(FollowGuidePinCardShow.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(FollowGuidePinCardShow.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        BKY.LIZIZ().LIZLLL.removeObservers(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJLLL = (LiveIconView) findViewById(R.id.bf7);
        this.LJLL = (C47061t0) findViewById(R.id.abh);
        this.LJLLI = (C47121t6) findViewById(R.id.bug);
        this.LJLLILLLL = (C2A7) findViewById(R.id.djm);
        LiveIconView liveIconView = this.LJLJLLL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 145));
        }
        C2A7 c2a7 = this.LJLLILLLL;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 146));
        }
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(null, view);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ImageModel imageModel;
        User owner;
        super.onLoad(objArr);
        hide();
        C47061t0 c47061t0 = this.LJLL;
        Room room = this.LJLJI;
        if (room != null && (owner = room.getOwner()) != null) {
            imageModel = owner.getAvatarThumb();
        } else {
            imageModel = null;
        }
        C31665Cbl.LJIIIZ(c47061t0, imageModel, R.drawable.cuj);
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.l9l, C05170If.LIZ(B83.LIZ().LIZIZ().LJ())));
        }
        C2A7 c2a7 = this.LJLLILLLL;
        if (c2a7 != null) {
            c2a7.setText(R.string.sr2);
        }
        C2A7 c2a72 = this.LJLLILLLL;
        if (c2a72 != null) {
            c2a72.setIcon(C259910h.LJ(R.attr.av7, this.context));
        }
    }
}
