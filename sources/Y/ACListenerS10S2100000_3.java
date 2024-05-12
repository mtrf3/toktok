package Y;

import X.C174076sN;
import X.C174596tD;
import X.C176356w3;
import X.C176996x5;
import X.C177326xc;
import X.C188727au;
import X.C55096Ljo;
import X.C7HV;
import X.FMX;
import X.InterfaceC177046xA;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRepostCardAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS10S2100000_3 implements View.OnClickListener {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS10S2100000_3 aCListenerS10S2100000_3, View view) {
        C176996x5 c176996x5 = (C176996x5) aCListenerS10S2100000_3.l2;
        String str = aCListenerS10S2100000_3.s0;
        String str2 = aCListenerS10S2100000_3.s1;
        c176996x5.LLILLIZIL = 1;
        c176996x5.LJJJJLL(view, str, str2);
    }

    public static final void onClick$1(ACListenerS10S2100000_3 aCListenerS10S2100000_3, View view) {
        ((C177326xc) aCListenerS10S2100000_3.l2).LIZIZ();
        String str = aCListenerS10S2100000_3.s0;
        if (str != null) {
            C177326xc c177326xc = (C177326xc) aCListenerS10S2100000_3.l2;
            String str2 = aCListenerS10S2100000_3.s1;
            c177326xc.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("group_id", str2);
            FMX.LJIIL("add_recommendation_cancel", c188727au.LIZ);
        }
        C7HV.LIZIZ.LJIL().LIZLLL(aCListenerS10S2100000_3.s1);
    }

    public static final void onClick$2(ACListenerS10S2100000_3 aCListenerS10S2100000_3, View view) {
        ViewGroup viewGroup;
        InterfaceC177046xA interfaceC177046xA;
        C174076sN.LIZ();
        C174596tD c174596tD = (C174596tD) aCListenerS10S2100000_3.l2;
        if (c174596tD.LJII && (viewGroup = c174596tD.LJFF) != null) {
            int i = viewGroup.getLayoutParams().height;
            ValueAnimator ofInt = ValueAnimator.ofInt(viewGroup.getHeight(), 0);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(viewGroup, 1));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
            o.LJIIIIZZ(ofFloat, "ofFloat(panel, View.ALPHA, 1f, 0f)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c174596tD.LJI, (Property<SmartImageView, Float>) View.ALPHA, 1.0f, 0.0f);
            o.LJIIIIZZ(ofFloat2, "ofFloat(upvoteIcon, View.ALPHA, 1f, 0f)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
            animatorSet.addListener(new ALAdapterS1S0201000_3(c174596tD, viewGroup, i, 0));
            animatorSet.setDuration(100L);
            animatorSet.start();
        }
        String str = aCListenerS10S2100000_3.s0;
        if (str != null) {
            C174596tD c174596tD2 = (C174596tD) aCListenerS10S2100000_3.l2;
            String str2 = aCListenerS10S2100000_3.s1;
            c174596tD2.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("group_id", str2);
            FMX.LJIIL("add_recommendation_cancel", c188727au.LIZ);
        }
        C176996x5 c176996x5 = ((C174596tD) aCListenerS10S2100000_3.l2).LIZ;
        if (c176996x5 != null && (interfaceC177046xA = c176996x5.LJLJJI) != null) {
            interfaceC177046xA.onClickCloseUpvotePanel();
        }
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbility = ((C174596tD) aCListenerS10S2100000_3.l2).LIZIZ;
        if (iKeyboardInputPanelAssemAbility != null) {
            iKeyboardInputPanelAssemAbility.onClickCloseUpvotePanel();
        }
        C7HV.LIZIZ.LJIL().LIZLLL(aCListenerS10S2100000_3.s1);
    }

    public static final void onClick$3(ACListenerS10S2100000_3 aCListenerS10S2100000_3, View view) {
        final CommentRepostCardAssem commentRepostCardAssem = (CommentRepostCardAssem) aCListenerS10S2100000_3.l2;
        ViewGroup viewGroup = commentRepostCardAssem.LJLJJL;
        if (viewGroup != null) {
            final int i = viewGroup.getLayoutParams().height;
            int[] iArr = new int[2];
            ViewGroup viewGroup2 = commentRepostCardAssem.LJLJJL;
            if (viewGroup2 != null) {
                iArr[0] = viewGroup2.getHeight();
                iArr[1] = 0;
                ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                ofInt.addUpdateListener(new AUListenerS92S0100000_3(commentRepostCardAssem, 23));
                ViewGroup viewGroup3 = commentRepostCardAssem.LJLJJL;
                if (viewGroup3 != null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                    o.LJIIIIZZ(ofFloat, "ofFloat(upvoteCommentCard, View.ALPHA, 1f, 0f)");
                    SmartImageView smartImageView = commentRepostCardAssem.LJLJJI;
                    if (smartImageView != null) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(smartImageView, (Property<SmartImageView, Float>) View.ALPHA, 1.0f, 0.0f);
                        o.LJIIIIZZ(ofFloat2, "ofFloat(upvoteIcon, View.ALPHA, 1f, 0f)");
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.6xU
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationEnd(animation);
                                TextView textView = CommentRepostCardAssem.this.LJLIL;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                    View view2 = CommentRepostCardAssem.this.LJLILLLLZI;
                                    if (view2 != null) {
                                        view2.setVisibility(8);
                                        View view3 = CommentRepostCardAssem.this.LJLJI;
                                        if (view3 != null) {
                                            view3.setVisibility(8);
                                            SmartImageView smartImageView2 = CommentRepostCardAssem.this.LJLJJI;
                                            if (smartImageView2 != null) {
                                                smartImageView2.setVisibility(8);
                                                ViewGroup viewGroup4 = CommentRepostCardAssem.this.LJLJJL;
                                                if (viewGroup4 != null) {
                                                    ViewGroup.LayoutParams layoutParams = viewGroup4.getLayoutParams();
                                                    layoutParams.height = i;
                                                    ViewGroup viewGroup5 = CommentRepostCardAssem.this.LJLJJL;
                                                    if (viewGroup5 != null) {
                                                        viewGroup5.setLayoutParams(layoutParams);
                                                        ViewGroup viewGroup6 = CommentRepostCardAssem.this.LJLJJL;
                                                        if (viewGroup6 != null) {
                                                            viewGroup6.setAlpha(1.0f);
                                                            SmartImageView smartImageView3 = CommentRepostCardAssem.this.LJLJJI;
                                                            if (smartImageView3 != null) {
                                                                smartImageView3.setAlpha(1.0f);
                                                                return;
                                                            } else {
                                                                o.LJIJI("upvoteIcon");
                                                                throw null;
                                                            }
                                                        }
                                                        o.LJIJI("upvoteCommentCard");
                                                        throw null;
                                                    }
                                                    o.LJIJI("upvoteCommentCard");
                                                    throw null;
                                                }
                                                o.LJIJI("upvoteCommentCard");
                                                throw null;
                                            }
                                            o.LJIJI("upvoteIcon");
                                            throw null;
                                        }
                                        o.LJIJI("cancelIcon");
                                        throw null;
                                    }
                                    o.LJIJI("divider");
                                    throw null;
                                }
                                o.LJIJI("upvoteCommentText");
                                throw null;
                            }
                        });
                        animatorSet.setDuration(100L);
                        animatorSet.start();
                        String str = aCListenerS10S2100000_3.s0;
                        if (str != null) {
                            CommentRepostCardAssem commentRepostCardAssem2 = (CommentRepostCardAssem) aCListenerS10S2100000_3.l2;
                            String str2 = aCListenerS10S2100000_3.s1;
                            commentRepostCardAssem2.getClass();
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", str);
                            c188727au.LJIIIZ("group_id", str2);
                            FMX.LJIIL("add_recommendation_cancel", c188727au.LIZ);
                        }
                        C7HV.LIZIZ.LJIL().LIZLLL(aCListenerS10S2100000_3.s1);
                        IKeyboardInputPanelAssemAbility LIZ = C176356w3.LIZ(C55096Ljo.LJIIZILJ((CommentRepostCardAssem) aCListenerS10S2100000_3.l2));
                        if (LIZ != null) {
                            LIZ.Cl(null);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("upvoteIcon");
                    throw null;
                }
                o.LJIJI("upvoteCommentCard");
                throw null;
            }
            o.LJIJI("upvoteCommentCard");
            throw null;
        }
        o.LJIJI("upvoteCommentCard");
        throw null;
    }

    public ACListenerS10S2100000_3(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
