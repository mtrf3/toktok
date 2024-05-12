package com.ss.android.ugc.aweme.feed.adapter;

import X.AbstractC65781Prl;
import X.AnonymousClass799;
import X.C174046sK;
import X.C175046tw;
import X.C178646zk;
import X.C183887Jo;
import X.C193097hx;
import X.C1IZ;
import X.C227678wd;
import X.C2MC;
import X.C31633CbF;
import X.C33Q;
import X.C46276IEe;
import X.C46361IHl;
import X.C50420Jqa;
import X.C55008LiO;
import X.C56222Io;
import X.C56252Ir;
import X.C56332Iz;
import X.C57292Mr;
import X.C70502pi;
import X.C7JS;
import X.C7YQ;
import X.C8UB;
import X.C8UI;
import X.C8UO;
import X.C8UR;
import X.QD3;
import X.SU3;
import Y.AObjectS42S0101000_5;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.UserInfoUpdateEvent;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class VideoEventDispatchViewModel extends FeedBaseHolderViewModel<C8UB> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final boolean LJLJI;
    public AObjectS42S0101000_5 LJLJJI;
    public AbstractC65781Prl LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C8UB(0);
    }

    public VideoEventDispatchViewModel() {
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLJI = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LJLJI;
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onAdCardShowEvent(C8UO event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 151));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onAwesomeSplashEvent(C55008LiO event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 153));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onBlockUserEvent(C175046tw event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 154));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectAwemeEvent(C70502pi event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 155));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectAwemeFakeEvent(C57292Mr event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 157));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCommentEvent(C174046sK c174046sK) {
        setState(new AqS169S0100000_3(c174046sK, 158));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onEventDiggCountUpdate(AnonymousClass799 event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 159));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onEventDiggStart(C7JS c7js) {
        setState(new AqS169S0100000_3(c7js, 160));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onEventDiggUpdate(C183887Jo c183887Jo) {
        setState(new AqS169S0100000_3(c183887Jo, 161));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        setState(new AqS169S0100000_3(followStatusEvent, 162));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onInteractionTagInfo(InteractionTagInfoEvent interactionTagInfoEvent) {
        Aweme aweme;
        AObjectS42S0101000_5 aObjectS42S0101000_5;
        setState(new AqS169S0100000_3(interactionTagInfoEvent, 163));
        if (interactionTagInfoEvent != null && (aweme = interactionTagInfoEvent.aweme) != null && (aObjectS42S0101000_5 = this.LJLJJI) != null) {
            aObjectS42S0101000_5.invoke(aweme);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Yns, X.Prl] */
    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onInteractionTagLabel(InteractionTagLabelEvent interactionTagLabelEvent) {
        Aweme aweme;
        ?? r0;
        if (interactionTagLabelEvent != null && (aweme = interactionTagLabelEvent.aweme) != null && (r0 = this.LJLJJL) != 0) {
            r0.invoke(aweme);
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onLiveStatusEvent(C1IZ event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 164));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onLongPressEvent(C56332Iz event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 165));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onPlayerControllerVideoPlayProgressEvent(C46361IHl event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 166));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onProfileFollowEvent(C31633CbF c31633CbF) {
        setState(new AqS169S0100000_3(c31633CbF, 167));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onQuickCommentEvent(C178646zk event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 168));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveAnchorUpdateEvent(C227678wd event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 169));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveMusic2DspAuthEvent(C8UI event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 170));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveMusic2DspLinkChangeEvent(C8UR event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 171));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveMusic2DspPreCheckedEvent(SU3 event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 172));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveUserInfoUpdateEvent(UserInfoUpdateEvent event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 173));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onShareAwemeEvent(C56222Io c56222Io) {
        setState(new AqS169S0100000_3(c56222Io, 174));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onShareEndEvent(C2MC c2mc) {
        setState(new AqS169S0100000_3(c2mc, 175));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onTopViewLiveEndEvent(C56252Ir event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 176));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onUnBlockUserEvent(C7YQ event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 149));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onVideoEvent(C50420Jqa c50420Jqa) {
        setState(new AqS169S0100000_3(c50420Jqa, 150));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onVideoPlayerEvent(C46276IEe status) {
        o.LJIIIZ(status, "status");
        setState(new AqS169S0100000_3(status, 152));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectAwemeFakeEvent(C193097hx event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 156));
    }
}
