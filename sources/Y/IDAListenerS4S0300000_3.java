package Y;

import X.AbstractC183947Ju;
import X.C43I;
import X.C8YN;
import X.InterfaceC88471Ynr;
import android.animation.Animator;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDAListenerS4S0300000_3 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "animator");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
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
                o.LJIIIZ(animator, "animator");
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
                onAnimationStart$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                o.LJIIIZ(animator, "animator");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$2(IDAListenerS4S0300000_3 iDAListenerS4S0300000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l0).setAlpha(1.0f);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l1).setAlpha(1.0f);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l2).setAlpha(1.0f);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l1).setVisibility(8);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l2).setVisibility(8);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l0).setTranslationZ(0.0f);
    }

    public static final void onAnimationEnd$0(IDAListenerS4S0300000_3 iDAListenerS4S0300000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).Z3().mv0();
        ((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).n4((Aweme) iDAListenerS4S0300000_3.l1, (FollowStatus) iDAListenerS4S0300000_3.l2);
        FeedAvatarDefaultVM Z3 = ((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).Z3();
        C43I c43i = new C43I(1);
        Z3.getClass();
        Z3.setState(new AqS169S0100000_3(c43i, (C43I<Integer>) 186));
        C8YN.LJIJI(((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).b4(), new AqS169S0100000_3((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0, 184));
    }

    public static final void onAnimationEnd$3(IDAListenerS4S0300000_3 iDAListenerS4S0300000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l0).setAlpha(1.0f);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l1).setAlpha(1.0f);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l2).setAlpha(1.0f);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l1).setVisibility(8);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l2).setVisibility(8);
        ((SmartAvatarImageView) iDAListenerS4S0300000_3.l0).setTranslationZ(0.0f);
    }

    public static final void onAnimationEnd$4(IDAListenerS4S0300000_3 iDAListenerS4S0300000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).Z3().mv0();
        ((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).n4((Aweme) iDAListenerS4S0300000_3.l1, (FollowStatus) iDAListenerS4S0300000_3.l2);
        FeedAvatarDefaultVM Z3 = ((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).Z3();
        C43I c43i = new C43I(1);
        Z3.getClass();
        Z3.setState(new AqS169S0100000_3(c43i, (C43I<Integer>) 186));
        C8YN.LJIJI(((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0).b4(), new AqS169S0100000_3((FeedAvatarDefaultAssem) iDAListenerS4S0300000_3.l0, 848));
    }

    public static final void onAnimationStart$1(IDAListenerS4S0300000_3 iDAListenerS4S0300000_3, Animator animator) {
        Integer num;
        Object obj;
        o.LJIIIZ(animator, "animator");
        AbstractC183947Ju abstractC183947Ju = (AbstractC183947Ju) iDAListenerS4S0300000_3.l0;
        if (abstractC183947Ju != null) {
            abstractC183947Ju.setVisibility(0);
        }
        Runnable runnable = (Runnable) iDAListenerS4S0300000_3.l1;
        if (runnable != null) {
            runnable.run();
        }
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDAListenerS4S0300000_3.l2;
        if (interfaceC88471Ynr != null) {
            AbstractC183947Ju abstractC183947Ju2 = (AbstractC183947Ju) iDAListenerS4S0300000_3.l0;
            Object obj2 = null;
            if (abstractC183947Ju2 != null) {
                num = Integer.valueOf(abstractC183947Ju2.getWhiteBarStyle());
            } else {
                num = null;
            }
            AbstractC183947Ju abstractC183947Ju3 = (AbstractC183947Ju) iDAListenerS4S0300000_3.l0;
            if (abstractC183947Ju3 != null) {
                obj = abstractC183947Ju3.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof UpvoteStruct) {
                obj2 = obj;
            }
            interfaceC88471Ynr.invoke(num, obj2);
        }
    }

    public IDAListenerS4S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
