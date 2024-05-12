package Y;

import X.C183557Ih;
import X.C183907Jq;
import X.C34K;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDAListenerS37S0200000_3 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                onAnimationCancel$3(this, animator);
                return;
            case 4:
                onAnimationCancel$4(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$0(IDAListenerS37S0200000_3 iDAListenerS37S0200000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((StoryViewerListFragment) iDAListenerS37S0200000_3.l0).LJLJJI = false;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS37S0200000_3.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationCancel$3(IDAListenerS37S0200000_3 iDAListenerS37S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        CommentNestedLayout commentNestedLayout = (CommentNestedLayout) iDAListenerS37S0200000_3.l0;
        commentNestedLayout.LLILLJJLI = false;
        commentNestedLayout.LJIIIIZZ();
    }

    public static final void onAnimationCancel$4(IDAListenerS37S0200000_3 iDAListenerS37S0200000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((View) iDAListenerS37S0200000_3.l0).setAlpha(0.0f);
        View view = (View) iDAListenerS37S0200000_3.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = 0;
            view.setLayoutParams(layoutParams);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS37S0200000_3.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationEnd$1(IDAListenerS37S0200000_3 iDAListenerS37S0200000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((StoryViewerListFragment) iDAListenerS37S0200000_3.l0).LJLJJI = false;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS37S0200000_3.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$3(IDAListenerS37S0200000_3 iDAListenerS37S0200000_3, Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        CommentNestedLayout commentNestedLayout = (CommentNestedLayout) iDAListenerS37S0200000_3.l0;
        commentNestedLayout.LLILLJJLI = false;
        if (((C34K) iDAListenerS37S0200000_3.l1).element) {
            i = 3;
        } else {
            i = 4;
        }
        commentNestedLayout.LIZJ(i, commentNestedLayout);
        ((CommentNestedLayout) iDAListenerS37S0200000_3.l0).LJIIIIZZ();
    }

    public static final void onAnimationStart$2(IDAListenerS37S0200000_3 iDAListenerS37S0200000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C183557Ih c183557Ih = (C183557Ih) iDAListenerS37S0200000_3.l0;
        C183907Jq c183907Jq = c183557Ih.LIZLLL;
        if (c183907Jq != null) {
            c183557Ih.LIZ((UpvoteList) iDAListenerS37S0200000_3.l1, c183907Jq, true);
            ((C183557Ih) iDAListenerS37S0200000_3.l0).LJFF = c183907Jq.getWhiteBarStyle();
        }
    }

    public static final void onAnimationStart$3(IDAListenerS37S0200000_3 iDAListenerS37S0200000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((CommentNestedLayout) iDAListenerS37S0200000_3.l0).LLILLJJLI = true;
    }

    public IDAListenerS37S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
