package com.ss.android.ugc.aweme.story.feed.guidecard;

import X.C221138m5;
import X.C222588oQ;
import X.C222688oa;
import X.IT4;
import X.InterfaceC212878Xb;
import X.KR8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardVideoVH extends BaseStoryGuideCardVH<StoryGuideCardVideoVH> {
    public final C221138m5 LLI;

    @Override // X.InterfaceC222598oR
    public final String gR() {
        return "cell_story_guide_card_video";
    }

    public final StoryVideoAbility LJLJI() {
        return (StoryVideoAbility) this.LLI.getValue();
    }

    @Override // X.InterfaceC222408o8
    public final void LJJJJLL() {
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.LJJJJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final boolean q7() {
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            return LJLJI.Lx();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void w1() {
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.w1();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void L5(String str) {
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.L5(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.Y2(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void b8(String str) {
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.b8(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        C222688oa.LJFF(this, z);
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        String str;
        C222688oa.LJJIL(this, it4);
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            if (it4 != null) {
                str = it4.getId();
            } else {
                str = null;
            }
            LJLJI.onRenderFirstFrame(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
        StoryVideoAbility LJLJI = LJLJI();
        if (LJLJI != null) {
            LJLJI.onResumePlay(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryGuideCardVideoVH(C222588oQ params, InterfaceC212878Xb<StoryGuideCardVideoVH, VideoItemParams> interfaceC212878Xb) {
        super(params, interfaceC212878Xb);
        o.LJIIIZ(params, "params");
        this.LLI = KR8.LJIIJJI(new AqS153S0100000_3(this, 950));
    }
}
