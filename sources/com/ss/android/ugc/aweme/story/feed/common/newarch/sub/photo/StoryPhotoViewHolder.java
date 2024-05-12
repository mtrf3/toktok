package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.photo;

import X.C213018Xp;
import X.C221138m5;
import X.C222588oQ;
import X.C55096Ljo;
import X.C59542Vi;
import X.C78555UsJ;
import X.IPG;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC55100Ljs;
import X.KR8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StorySharedPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedSubViewHolderScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPhotoViewHolder extends BaseStoryViewHolder<StoryPhotoViewHolder, VideoItemParams> implements CommonCellAbility {
    public final C222588oQ LLFFF;
    public final C221138m5 LLFII;
    public final C221138m5 LLFZ;
    public final C221138m5 LLI;

    @Override // X.InterfaceC222598oR
    public final String gR() {
        return "cell_story_photo";
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(FeedSubViewHolderScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final InterfaceC55100Ljs mi0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final InterfaceC222698ob LLJJIJIL() {
        StorySharedPlayerViewAbility storySharedPlayerViewAbility = (StorySharedPlayerViewAbility) this.LLFII.getValue();
        if (storySharedPlayerViewAbility != null) {
            return storySharedPlayerViewAbility.FW();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC222708oc
    public final void F5() {
        InterfaceC222708oc interfaceC222708oc;
        if (!C59542Vi.LIZ() && (interfaceC222708oc = (InterfaceC222708oc) this.LLI.getValue()) != null) {
            interfaceC222708oc.F5();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC222708oc
    public final void n() {
        InterfaceC222708oc interfaceC222708oc;
        if (!C59542Vi.LIZ() && (interfaceC222708oc = (InterfaceC222708oc) this.LLI.getValue()) != null) {
            interfaceC222708oc.n();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        C55096Ljo.LJIILL(C55096Ljo.LJIJ(this), CommonCellAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder
    public final VideoItemParams LJLIIL(Aweme aweme) {
        VideoItemParams LJFF = C78555UsJ.LJFF(this.LLFFF);
        LJFF.setAweme(aweme);
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        if (!C59542Vi.LIZ() && (onUIPlayListener = (OnUIPlayListener) this.LLI.getValue()) != null) {
            onUIPlayListener.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        OnUIPlayListener onUIPlayListener;
        if (!C59542Vi.LIZ() && (onUIPlayListener = (OnUIPlayListener) this.LLI.getValue()) != null) {
            onUIPlayListener.onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        if (!C59542Vi.LIZ() && (onUIPlayListener = (OnUIPlayListener) this.LLI.getValue()) != null) {
            onUIPlayListener.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final void t70(InterfaceC222698ob baseFeedPlayerView) {
        o.LJIIIZ(baseFeedPlayerView, "baseFeedPlayerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPhotoViewHolder(C222588oQ params, C213018Xp c213018Xp) {
        super(params, c213018Xp);
        o.LJIIIZ(params, "params");
        this.LLFFF = params;
        this.LLFII = KR8.LJIIJJI(new AqS153S0100000_3(this, 1524));
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 1522));
        this.LLI = KR8.LJIIJJI(new AqS153S0100000_3(this, 1523));
        C55096Ljo.LJIIJJI(C55096Ljo.LJIJ(this), this, CommonCellAbility.class, null);
    }
}
