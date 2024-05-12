package Y;

import X.C2319898o;
import X.C2319998p;
import X.C2320098q;
import X.C2320698w;
import X.C250779sn;
import X.C250999t9;
import X.C25770A9m;
import X.C47121t6;
import X.C9TY;
import X.InterfaceC250789so;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.widgets.recommend.user.HomepageRecommendAssem;
import com.ss.android.ugc.aweme.profile.widgets.recommend.user.HomepageRecommendVM;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.HeaderRecommendUserCardMineComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDAListenerS2S0110000_4 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

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
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                o.LJIIIZ(animator, "animator");
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
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
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                o.LJIIIZ(animator, "animator");
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                o.LJIIIZ(animator, "animator");
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            case 5:
                onAnimationStart$5(this, animator);
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                onAnimationStart$7(this, animator);
                return;
            case 8:
                onAnimationStart$8(this, animator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$0(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        ((C250779sn) iDAListenerS2S0110000_4.l0).getClass();
    }

    public static final void onAnimationEnd$0(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        InterfaceC250789so interfaceC250789so = ((C250779sn) iDAListenerS2S0110000_4.l0).LJLJJI;
        if (interfaceC250789so != null) {
            if (iDAListenerS2S0110000_4.z1) {
                interfaceC250789so.LIZIZ();
            } else {
                interfaceC250789so.LIZ();
            }
        }
        ((C250779sn) iDAListenerS2S0110000_4.l0).getClass();
    }

    public static final void onAnimationEnd$2(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C250999t9) iDAListenerS2S0110000_4.l0).LJ(iDAListenerS2S0110000_4.z1);
    }

    public static final void onAnimationEnd$3(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C250999t9) iDAListenerS2S0110000_4.l0).LIZLLL(iDAListenerS2S0110000_4.z1);
    }

    public static final void onAnimationEnd$4(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (!iDAListenerS2S0110000_4.z1) {
            C25770A9m c25770A9m = ((HomepageRecommendAssem) iDAListenerS2S0110000_4.l0).LJLILLLLZI;
            if (c25770A9m != null) {
                c25770A9m.setVisibility(8);
                View view = ((HomepageRecommendAssem) iDAListenerS2S0110000_4.l0).LJLJI;
                if (view != null) {
                    view.setAlpha(1.0f);
                    View view2 = ((HomepageRecommendAssem) iDAListenerS2S0110000_4.l0).LJLJI;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = -2;
                            view2.setLayoutParams(layoutParams);
                            ((HomepageRecommendAssem) iDAListenerS2S0110000_4.l0).x3().setState(C2320098q.LJLIL);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    o.LJIJI("userInfoLayout");
                    throw null;
                }
                o.LJIJI("userInfoLayout");
                throw null;
            }
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
        HomepageRecommendVM x3 = ((HomepageRecommendAssem) iDAListenerS2S0110000_4.l0).x3();
        x3.withState(C2319898o.LJLIL);
        x3.LJLILLLLZI = false;
        C2320698w.LIZ().storeBoolean(C9TY.LIZ("has_show_recommend_card_today"), true);
        x3.setState(C2319998p.LJLIL);
    }

    public static final void onAnimationEnd$6(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (!iDAListenerS2S0110000_4.z1) {
            ((HeaderRecommendUserCardMineComponent) iDAListenerS2S0110000_4.l0).A3().setVisibility(8);
            ((HeaderRecommendUserCardMineComponent) iDAListenerS2S0110000_4.l0).F3(-2);
            ((HeaderRecommendUserCardMineComponent) iDAListenerS2S0110000_4.l0).C3(-2);
            ((HeaderRecommendUserCardMineComponent) iDAListenerS2S0110000_4.l0).E3(1.0f);
            ((HeaderRecommendUserCardMineComponent) iDAListenerS2S0110000_4.l0).H3().setState(C2320098q.LJLIL);
            return;
        }
        HomepageRecommendVM H3 = ((HeaderRecommendUserCardMineComponent) iDAListenerS2S0110000_4.l0).H3();
        H3.withState(C2319898o.LJLIL);
        H3.LJLILLLLZI = false;
        C2320698w.LIZ().storeBoolean(C9TY.LIZ("has_show_recommend_card_today"), true);
        H3.setState(C2319998p.LJLIL);
    }

    public static final void onAnimationRepeat$0(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        ((C250779sn) iDAListenerS2S0110000_4.l0).getClass();
    }

    public static final void onAnimationStart$0(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        ((C250779sn) iDAListenerS2S0110000_4.l0).getClass();
    }

    public static final void onAnimationStart$1(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((SmartAvatarImageView) iDAListenerS2S0110000_4.l0).setAlpha(0.0f);
        ((SmartAvatarImageView) iDAListenerS2S0110000_4.l0).setVisibility(0);
        if (iDAListenerS2S0110000_4.z1) {
            ((SmartAvatarImageView) iDAListenerS2S0110000_4.l0).setTranslationZ(3.0f);
        }
    }

    public static final void onAnimationStart$5(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (iDAListenerS2S0110000_4.z1) {
            C25770A9m c25770A9m = ((HomepageRecommendAssem) iDAListenerS2S0110000_4.l0).LJLILLLLZI;
            if (c25770A9m != null) {
                c25770A9m.setVisibility(0);
            } else {
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
        }
    }

    public static final void onAnimationStart$7(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (iDAListenerS2S0110000_4.z1) {
            ((HeaderRecommendUserCardMineComponent) iDAListenerS2S0110000_4.l0).A3().setVisibility(0);
        }
    }

    public static final void onAnimationStart$8(IDAListenerS2S0110000_4 iDAListenerS2S0110000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (iDAListenerS2S0110000_4.z1) {
            ((C47121t6) iDAListenerS2S0110000_4.l0).setPivotX(r1.getWidth());
            ((C47121t6) iDAListenerS2S0110000_4.l0).setPivotY(0.0f);
        } else {
            ((C47121t6) iDAListenerS2S0110000_4.l0).setPivotX(0.0f);
            ((C47121t6) iDAListenerS2S0110000_4.l0).setPivotY(0.0f);
        }
    }

    public IDAListenerS2S0110000_4(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
