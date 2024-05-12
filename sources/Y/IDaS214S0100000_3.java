package Y;

import X.AV1;
import X.AbstractC73547Stj;
import X.C1UE;
import X.C220808lY;
import X.C220828la;
import X.C222038nX;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.C7IZ;
import X.EnumC215438ct;
import X.InterfaceC29937Boz;
import X.InterfaceC65784Pro;
import X.ORZ;
import android.animation.Animator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerComponent;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StorySwipeComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDaS214S0100000_3 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS214S0100000_3 iDaS214S0100000_3) {
        String aid;
        OnUIPlayListener onUIPlayListener;
        String str;
        StoryFakePlayerComponent storyFakePlayerComponent = (StoryFakePlayerComponent) iDaS214S0100000_3.l0;
        int i = storyFakePlayerComponent.LLI + 1;
        storyFakePlayerComponent.LLI = i;
        String str2 = "";
        if (i == 1 && (onUIPlayListener = (OnUIPlayListener) storyFakePlayerComponent.LLFF.getValue()) != null) {
            Aweme aweme = ((StoryFakePlayerComponent) iDaS214S0100000_3.l0).LLFII;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
        OnUIPlayListener onUIPlayListener2 = (OnUIPlayListener) ((StoryFakePlayerComponent) iDaS214S0100000_3.l0).LLFF.getValue();
        if (onUIPlayListener2 != null) {
            Aweme aweme2 = ((StoryFakePlayerComponent) iDaS214S0100000_3.l0).LLFII;
            if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                str2 = aid;
            }
            onUIPlayListener2.onPlayCompleted(str2);
        }
        ((StoryFakePlayerComponent) iDaS214S0100000_3.l0).e4(0L);
    }

    public static final void run$1(IDaS214S0100000_3 iDaS214S0100000_3) {
        UserStory userStory;
        UserStoryCurrentInfo currentInfo;
        Integer currentIndex;
        IViewPagerAbility iViewPagerAbility;
        EnumC215438ct enumC215438ct;
        StorySwipeComponent storySwipeComponent;
        Aweme ct0;
        ViewGroup viewGroup;
        List<Aweme> stories;
        Aweme aweme;
        String groupId;
        Aweme ct02 = ((StorySwipeComponent) iDaS214S0100000_3.l0).ct0();
        if (ct02 == null || (userStory = ct02.getUserStory()) == null || (currentInfo = userStory.getCurrentInfo()) == null || (currentIndex = currentInfo.getCurrentIndex()) == null || currentIndex.intValue() != 0) {
            return;
        }
        StorySwipeComponent storySwipeComponent2 = (StorySwipeComponent) iDaS214S0100000_3.l0;
        C1UE c1ue = storySwipeComponent2.LLFF;
        Aweme ct03 = storySwipeComponent2.ct0();
        c1ue.getClass();
        if (!C1UE.LIZIZ(ct03) || (iViewPagerAbility = (IViewPagerAbility) ((StorySwipeComponent) iDaS214S0100000_3.l0).LLD.getValue()) == null || iViewPagerAbility.v8() != 0) {
            return;
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) ((StorySwipeComponent) iDaS214S0100000_3.l0).LL.getValue();
        String str = null;
        if (feedCollectionViewPagerAbility != null) {
            enumC215438ct = feedCollectionViewPagerAbility.R();
        } else {
            enumC215438ct = null;
        }
        if (enumC215438ct == EnumC215438ct.LOOP_CURRENT_VIDEO || (ct0 = (storySwipeComponent = (StorySwipeComponent) iDaS214S0100000_3.l0).ct0()) == null) {
            return;
        }
        C220828la.LIZ().storeBoolean("key_swipe_guide_shown", true);
        C1UE c1ue2 = storySwipeComponent.LLFF;
        Context context = storySwipeComponent.getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        User author = ct0.getAuthor();
        if (author != null) {
            str = author.getUniqueId();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        UserStory userStory2 = ct0.getUserStory();
        if (userStory2 != null && (stories = userStory2.getStories()) != null && (aweme = (Aweme) ListProtector.get(stories, 0)) != null && (groupId = aweme.getGroupId()) != null) {
            str2 = groupId;
        }
        c1ue2.getClass();
        c1ue2.LIZ = new C220808lY(context, str, str2);
        ViewParent parent = storySwipeComponent.getContainerView().getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        storySwipeComponent.LLFF.LIZJ(viewGroup);
        C78999UzT.LJFF(AbstractC73547Stj.LJIILJJIL(4500L, TimeUnit.MILLISECONDS).LJII(C73969T1h.LIZIZ()).LJIIIZ(new IDaS214S0100000_3(storySwipeComponent, 7)), (C73318Sq2) storySwipeComponent.LLFFF.getValue());
    }

    public static final void run$2(IDaS214S0100000_3 iDaS214S0100000_3) {
        boolean z;
        boolean z2;
        UpvoteList value;
        UpvoteStruct upvoteStruct;
        String text;
        Animator animator;
        C7IZ c7iz = (C7IZ) iDaS214S0100000_3.l0;
        c7iz.LJIIIZ = false;
        if (c7iz.LJ().LIZJ == Integer.MAX_VALUE && c7iz.LJ().LIZLLL == 0) {
            z = true;
        } else {
            z = false;
        }
        if (c7iz.LJ().LIZJ == 0 && c7iz.LJ().LIZLLL == Integer.MAX_VALUE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z && !z2) || (value = c7iz.LIZIZ.LIZJ().getValue()) == null || value.getTotal() != 1 || (upvoteStruct = (UpvoteStruct) ORZ.LJLLLLLL(0, c7iz.LIZIZ.LJLJJI)) == null || !AV1.LJIJ(upvoteStruct.getUser()) || (((text = upvoteStruct.getText()) != null && text.length() != 0) || !c7iz.LJFF())) {
            if (c7iz.LJIIL()) {
                animator = (Animator) c7iz.LJFF.getValue();
            } else {
                return;
            }
        } else {
            animator = (Animator) c7iz.LJII.getValue();
        }
        if (animator != null) {
            animator.start();
        }
    }

    public static final void run$3(IDaS214S0100000_3 iDaS214S0100000_3) {
        ((InterfaceC65784Pro) iDaS214S0100000_3.l0).invoke();
    }

    public static final void run$4(IDaS214S0100000_3 iDaS214S0100000_3) {
        ((InterfaceC65784Pro) iDaS214S0100000_3.l0).invoke();
    }

    public static final void run$5(IDaS214S0100000_3 iDaS214S0100000_3) {
        UserStory userStory;
        UserStoryCurrentInfo currentInfo;
        Integer currentIndex;
        Aweme aweme;
        ViewGroup viewGroup;
        List<Aweme> stories;
        Aweme aweme2;
        String groupId;
        Aweme aweme3 = ((C222038nX) iDaS214S0100000_3.l0).LJLJL;
        if (aweme3 == null || (userStory = aweme3.getUserStory()) == null || (currentInfo = userStory.getCurrentInfo()) == null || (currentIndex = currentInfo.getCurrentIndex()) == null || currentIndex.intValue() != 0) {
            return;
        }
        C222038nX c222038nX = (C222038nX) iDaS214S0100000_3.l0;
        C1UE c1ue = c222038nX.LLF;
        Aweme aweme4 = c222038nX.LJLJL;
        c1ue.getClass();
        if (!C1UE.LIZIZ(aweme4)) {
            return;
        }
        C222038nX c222038nX2 = (C222038nX) iDaS214S0100000_3.l0;
        if (c222038nX2.LLD != 0 || c222038nX2.LJLJI == EnumC215438ct.LOOP_CURRENT_VIDEO || (aweme = c222038nX2.LJLJL) == null) {
            return;
        }
        C220828la.LIZ().storeBoolean("key_swipe_guide_shown", true);
        C1UE c1ue2 = c222038nX2.LLF;
        Context context = c222038nX2.LJLLLLLL;
        o.LJIIIIZZ(context, "context");
        User author = aweme.getAuthor();
        String str = null;
        if (author != null) {
            str = author.getUniqueId();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        UserStory userStory2 = aweme.getUserStory();
        if (userStory2 != null && (stories = userStory2.getStories()) != null && (aweme2 = (Aweme) ListProtector.get(stories, 0)) != null && (groupId = aweme2.getGroupId()) != null) {
            str2 = groupId;
        }
        c1ue2.getClass();
        c1ue2.LIZ = new C220808lY(context, str, str2);
        ViewParent parent = c222038nX2.LJLZ.getParent();
        if (!(parent instanceof FrameLayout) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        c222038nX2.LLF.LIZJ(viewGroup);
        C78999UzT.LJFF(AbstractC73547Stj.LJIILJJIL(4500L, TimeUnit.MILLISECONDS).LJII(C73969T1h.LIZIZ()).LJIIIZ(new IDaS214S0100000_3(c222038nX2, 6)), (C73318Sq2) c222038nX2.LLFF.getValue());
    }

    public static final void run$6(IDaS214S0100000_3 iDaS214S0100000_3) {
        C220808lY c220808lY = (C220808lY) ((C222038nX) iDaS214S0100000_3.l0).LLF.LIZ;
        if (c220808lY == null) {
            return;
        }
        c220808lY.LIZ(true);
    }

    public static final void run$7(IDaS214S0100000_3 iDaS214S0100000_3) {
        C220808lY c220808lY = (C220808lY) ((StorySwipeComponent) iDaS214S0100000_3.l0).LLFF.LIZ;
        if (c220808lY == null) {
            return;
        }
        c220808lY.LIZ(true);
    }

    public IDaS214S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
