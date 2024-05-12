package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.ActivityC45651qj;
import X.C201037ul;
import X.C220188kY;
import X.C77857Uh3;
import X.KRA;
import com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryImmersiveUserFeedComponent$userViewPagerAbilityImpl$1 implements StoryFeedUserViewPagerAbility {
    public final /* synthetic */ StoryImmersiveUserFeedComponent LJLIL;

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final boolean Bq() {
        if (this.LJLIL.c4().getCurrentItem() + 1 < this.LJLIL.c4().getViewItemOperator().getState().LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final boolean KA() {
        if (this.LJLIL.c4().getCurrentItem() > 0) {
            C77857Uh3.LIZJ(this.LJLIL.c4(), this.LJLIL.c4().getCurrentItem() - 1);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final void Nq() {
        if (1 == this.LJLIL.c4().getOffscreenPageLimit()) {
            return;
        }
        ((C220188kY) this.LJLIL.LLIFFJFJJ.getValue()).LIZ = 1;
        this.LJLIL.c4().getViewItemOperator().LIZIZ((C220188kY) this.LJLIL.LLIFFJFJJ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final boolean scrollToNext() {
        ActivityC45651qj LIZ;
        if (Bq()) {
            C77857Uh3.LIZJ(this.LJLIL.c4(), this.LJLIL.c4().getCurrentItem() + 1);
        } else {
            KRA LIZIZ = this.LJLIL.a1().LIZIZ();
            if (LIZIZ != null && (LIZ = LIZIZ.LIZ()) != null) {
                StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent = this.LJLIL;
                LIZ.finish();
                if (o.LJ("STORY_ENTRANCE_GUIDE_CARD", storyImmersiveUserFeedComponent.b4().LJ.param.getFrom())) {
                    C201037ul.LIZ(1, LIZ, false);
                } else {
                    C201037ul.LIZ(10, LIZ, false);
                }
            }
        }
        return true;
    }

    public StoryImmersiveUserFeedComponent$userViewPagerAbilityImpl$1(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent) {
        this.LJLIL = storyImmersiveUserFeedComponent;
    }
}
