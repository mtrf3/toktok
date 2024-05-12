package X;

import Y.IDAListenerS72S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7w3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201837w3 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C43I<? extends String>, C76800UCe> {
    public static final C201837w3 LJLIL = new C201837w3();

    public C201837w3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C43I<? extends String> c43i) {
        String LIZ;
        C201847w4 c201847w4;
        AnimatorSet animatorSet;
        VideoCommentAssem selectSubscribe = videoCommentAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (LIZ = c43i2.LIZ()) != null && (c201847w4 = selectSubscribe.LLIL) != null && ((Keva) c201847w4.LIZLLL.getValue()).getInt(C201847w4.LIZ(), 0) < 3 && LIZ.length() > 0) {
            TuxTextView tuxTextView = selectSubscribe.LLIILII;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = selectSubscribe.LLIILII;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(LIZ);
                    final C201847w4 c201847w42 = selectSubscribe.LLIL;
                    if (c201847w42 != null) {
                        final View view = selectSubscribe.LLIILZL;
                        if (view != null) {
                            final TuxTextView tuxTextView3 = selectSubscribe.LLIILII;
                            if (tuxTextView3 != null) {
                                final AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(selectSubscribe, 1561);
                                AnimatorSet animatorSet2 = c201847w42.LIZ;
                                if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = c201847w42.LIZ) != null) {
                                    animatorSet.cancel();
                                }
                                view.setScaleX(1.0f);
                                view.setScaleY(1.0f);
                                tuxTextView3.setScaleX(0.0f);
                                tuxTextView3.setScaleY(0.0f);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.0f);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.0f);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tuxTextView3, (Property<TuxTextView, Float>) View.SCALE_X, 1.0f);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tuxTextView3, (Property<TuxTextView, Float>) View.SCALE_Y, 1.0f);
                                AnimatorSet animatorSet3 = new AnimatorSet();
                                animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                                animatorSet3.setInterpolator((TimeInterpolator) c201847w42.LIZJ.getValue());
                                animatorSet3.setDuration(496L);
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
                                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
                                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tuxTextView3, (Property<TuxTextView, Float>) View.SCALE_X, 0.0f);
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tuxTextView3, (Property<TuxTextView, Float>) View.SCALE_Y, 0.0f);
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                animatorSet4.playTogether(ofFloat5, ofFloat6, ofFloat7, ofFloat8);
                                animatorSet4.setInterpolator((TimeInterpolator) c201847w42.LIZJ.getValue());
                                animatorSet4.setDuration(496L);
                                animatorSet4.setStartDelay(2000L);
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                animatorSet5.playSequentially(animatorSet3, animatorSet4);
                                animatorSet5.addListener(new IDAListenerS72S0100000_3(c201847w42, 49));
                                animatorSet5.addListener(new Animator.AnimatorListener() { // from class: X.7w7
                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        o.LJIIIZ(animator, "animator");
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationRepeat(Animator animator) {
                                        o.LJIIIZ(animator, "animator");
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        o.LJIIIZ(animator, "animator");
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public final void onAnimationCancel(Animator animator) {
                                        o.LJIIIZ(animator, "animator");
                                        C201847w4 c201847w43 = C201847w4.this;
                                        View view2 = view;
                                        View view3 = tuxTextView3;
                                        c201847w43.getClass();
                                        view2.setScaleX(1.0f);
                                        view2.setScaleY(1.0f);
                                        view3.setScaleX(0.0f);
                                        view3.setScaleY(0.0f);
                                        aqS153S0100000_3.invoke();
                                    }
                                });
                                animatorSet5.addListener(new IDAListenerS72S0100000_3(aqS153S0100000_3, 48));
                                c201847w42.LIZ = animatorSet5;
                                animatorSet5.start();
                            } else {
                                o.LJIJI("commentEmojiView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("commentInnerLayout");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("commentEmojiView");
                    throw null;
                }
            } else {
                o.LJIJI("commentEmojiView");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
