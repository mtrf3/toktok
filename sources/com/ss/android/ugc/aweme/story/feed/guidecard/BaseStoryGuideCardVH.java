package com.ss.android.ugc.aweme.story.feed.guidecard;

import X.C210408No;
import X.C221138m5;
import X.C222588oQ;
import X.C222688oa;
import X.C2K9;
import X.C2MA;
import X.C50420Jqa;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C78555UsJ;
import X.IPH;
import X.InterfaceC212878Xb;
import X.InterfaceC212998Xn;
import X.InterfaceC222408o8;
import X.InterfaceC222698ob;
import X.InterfaceC55100Ljs;
import X.KR8;
import X.ORZ;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseStoryGuideCardVH<R extends InterfaceC212998Xn<R, VideoItemParams>> extends BaseStoryViewHolder<R, VideoItemParams> implements CommonCellAbility, InterfaceC222408o8, C2K9 {
    public final C222588oQ LLFFF;
    public Aweme LLFII;
    public final C221138m5 LLFZ;

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final C2MA Y6() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final InterfaceC55100Ljs mi0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final InterfaceC222698ob LLJJIJIL() {
        StoryPlayerViewAbility storyPlayerViewAbility = (StoryPlayerViewAbility) this.LLFZ.getValue();
        if (storyPlayerViewAbility != null) {
            return storyPlayerViewAbility.LLJJIJIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        C55096Ljo.LJIILL(C55096Ljo.LJIJ(this), CommonCellAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final Aweme O1() {
        return this.LLFII;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        Aweme aweme2;
        if (aweme != null) {
            LJLIL(aweme);
        }
        if (aweme != null) {
            aweme2 = LJLIL(aweme);
        } else {
            aweme2 = null;
        }
        super.LIZLLL(aweme2);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder
    public final VideoItemParams LJLIIL(Aweme aweme) {
        VideoItemParams LJFF = C78555UsJ.LJFF(this.LLFFF);
        LJFF.setAweme(aweme);
        return LJFF;
    }

    public final Aweme LJLIL(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        String str;
        Aweme aweme3;
        UserStory userStory2;
        List<Aweme> stories2;
        if (C54838Lfe.LJJ(aweme)) {
            this.LLFII = aweme;
            Aweme LIZJ = C210408No.LIZJ(aweme);
            Fragment fragment = this.LLFFF.LIZJ;
            if (LIZJ != null) {
                str = LIZJ.getAid();
            } else {
                str = null;
            }
            StoryGuideCardViewModel LIZIZ = C210408No.LIZIZ(fragment, str);
            if (LIZIZ != null) {
                if (aweme != null) {
                    aweme3 = aweme.m114clone();
                    if (aweme3 != null && (userStory2 = aweme3.getUserStory()) != null) {
                        userStory2.setStoryGuideCard(false);
                    }
                } else {
                    aweme3 = null;
                }
                LIZIZ.LJLIL = aweme3;
            }
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 == null || (stories2 = userStory3.getStories()) == null) {
                return null;
            }
            return (Aweme) ORZ.LJLLLL(stories2);
        }
        Aweme aweme4 = this.LLFII;
        if (aweme4 == null || (userStory = aweme4.getUserStory()) == null || (stories = userStory.getStories()) == null || (aweme2 = (Aweme) ORZ.LJLLLL(stories)) == null) {
            return aweme;
        }
        return aweme2;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void c8(Aweme aweme) {
        Aweme aweme2;
        if (aweme != null) {
            LJLIL(aweme);
        }
        if (aweme != null) {
            aweme2 = LJLIL(aweme);
        } else {
            aweme2 = null;
        }
        super.c8(aweme2);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final C2MA getViewHolderByAwemeId(String str) {
        String str2;
        Aweme aweme = this.LJZ;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2) || str == null) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
        this.LLFFF.LIZIZ.onInternalEvent(new C50420Jqa(53, this.LJZ));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final void t70(InterfaceC222698ob baseFeedPlayerView) {
        o.LJIIIZ(baseFeedPlayerView, "baseFeedPlayerView");
        baseFeedPlayerView.N7(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStoryGuideCardVH(C222588oQ producerParams, InterfaceC212878Xb<R, VideoItemParams> interfaceC212878Xb) {
        super(producerParams, interfaceC212878Xb);
        o.LJIIIZ(producerParams, "producerParams");
        this.LLFFF = producerParams;
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3((BaseStoryGuideCardVH) this, 949));
        C55096Ljo.LJIIJJI(C55096Ljo.LJIJ(this), this, CommonCellAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void E8(int i, Aweme aweme) {
        Aweme aweme2;
        if (aweme != null) {
            LJLIL(aweme);
        }
        if (aweme != null) {
            aweme2 = LJLIL(aweme);
        } else {
            aweme2 = null;
        }
        super.E8(i, aweme2);
    }
}
