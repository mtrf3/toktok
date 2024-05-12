package X;

import Y.AUListenerS92S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.LandscapeDescAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.LandscapeVideoDescVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.859, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass859 extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeDescAssem, C85Z, C76800UCe> {
    public static final AnonymousClass859 LJLIL = new AnonymousClass859();

    public AnonymousClass859() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeDescAssem landscapeDescAssem, C85Z c85z) {
        ValueAnimator ofInt;
        C85C c85c;
        final LandscapeDescAssem selectSubscribe = landscapeDescAssem;
        C85Z c85z2 = c85z;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c85z2 != null) {
            C85C c85c2 = selectSubscribe.LLFZ;
            if (c85c2 != null) {
                c85c2.LJIIZILJ(c85z2.LIZJ);
            }
            LandscapeVideoDescVM q4 = selectSubscribe.q4();
            final boolean z = c85z2.LIZJ;
            q4.LJLLJ = z;
            int i = c85z2.LIZ;
            int i2 = c85z2.LIZIZ;
            if (!selectSubscribe.q4().LJLZ && selectSubscribe.q4().LJLLI == 0) {
                selectSubscribe.q4().LJLLI = selectSubscribe.p4().getHeight();
            }
            if (z) {
                ofInt = ValueAnimator.ofInt(i2, i);
            } else {
                ofInt = ValueAnimator.ofInt(i, i2);
            }
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.85A
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
                    if (intValue > 0) {
                        Object value = LandscapeDescAssem.this.LLIFFJFJJ.getValue();
                        o.LJIIIIZZ(value, "<get-descContainer>(...)");
                        ((View) value).getLayoutParams().height = intValue;
                        C2055184t c2055184t = LandscapeDescAssem.this.LLII;
                        if (c2055184t != null) {
                            TuxTextLayoutView tuxTextLayoutView = c2055184t.LJIIJJI;
                            if (tuxTextLayoutView != null) {
                                tuxTextLayoutView.getLayoutParams().height = intValue;
                                TuxTextLayoutView tuxTextLayoutView2 = c2055184t.LJIIJJI;
                                if (tuxTextLayoutView2 != null) {
                                    tuxTextLayoutView2.requestLayout();
                                } else {
                                    o.LJIJI("descView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("descView");
                                throw null;
                            }
                        }
                        C85C c85c3 = LandscapeDescAssem.this.LLFZ;
                        if (c85c3 != null) {
                            c85c3.LJIIZILJ(z);
                        }
                    }
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: X.858
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    C2055184t c2055184t = LandscapeDescAssem.this.LLII;
                    if (c2055184t != null && !z) {
                        c2055184t.LIZLLL(false);
                    }
                    if (!LandscapeDescAssem.this.q4().LJLZ) {
                        LandscapeDescAssem.this.p4().setVisibility(0);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    C2055184t c2055184t = LandscapeDescAssem.this.LLII;
                    if (c2055184t != null && z) {
                        c2055184t.LIZLLL(true);
                    }
                    if (LandscapeDescAssem.this.q4().LJLZ) {
                        return;
                    }
                    if (z) {
                        LandscapeDescAssem.this.p4().setText(R.string.gdq);
                    } else {
                        LandscapeDescAssem.this.p4().setText(R.string.gdr);
                    }
                    LandscapeDescAssem.this.p4().setVisibility(4);
                }
            });
            if (!selectSubscribe.q4().LJLZ && selectSubscribe.q4().LJLLI == 0) {
                selectSubscribe.q4().LJLLI = selectSubscribe.p4().getHeight();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (!selectSubscribe.q4().LJLZ) {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, selectSubscribe.q4().LJLLI);
                ofInt2.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 38));
                ofInt2.setDuration(100L);
                animatorSet.playTogether(ofInt, ofInt2);
            } else {
                animatorSet.playTogether(ofInt);
            }
            animatorSet.start();
            if (C8F2.LIZ() == 0 && (c85c = selectSubscribe.LLFZ) != null) {
                c85c.LJIIZILJ(z);
            }
            if (z) {
                if (!selectSubscribe.q4().LJLZ) {
                    TuxTextView descToggle = selectSubscribe.p4();
                    o.LJIIIIZZ(descToggle, "descToggle");
                    C26338AVi.LJI(descToggle, 0, 0, 0, 0, false, 16);
                }
                if (C217628gQ.LIZIZ.LJFF()) {
                    C26338AVi.LJI(selectSubscribe.Y3(), 0, 0, 0, 0, false, 16);
                } else {
                    C26338AVi.LJI(selectSubscribe.Y3(), 0, 0, 0, Integer.valueOf(selectSubscribe.LLIIIILZ), false, 16);
                }
                selectSubscribe.q4().lv0("spread", C113554cx.LJJJLIIL());
            } else {
                if (!selectSubscribe.q4().LJLZ) {
                    TuxTextView descToggle2 = selectSubscribe.p4();
                    o.LJIIIIZZ(descToggle2, "descToggle");
                    selectSubscribe.q4().getClass();
                    C26338AVi.LJI(descToggle2, 0, 0, 0, 0, false, 16);
                }
                if (C217628gQ.LIZIZ.LJFF()) {
                    C26338AVi.LJI(selectSubscribe.Y3(), 0, 0, 0, 0, false, 16);
                } else {
                    C26338AVi.LJI(selectSubscribe.Y3(), 0, 0, 0, Integer.valueOf(selectSubscribe.LLIIII), false, 16);
                }
                selectSubscribe.q4().lv0("fold", C51029K0z.LJJIIZI(new OSZ("enter_method", selectSubscribe.q4().LJLLILLLL)));
                LandscapeVideoDescVM q42 = selectSubscribe.q4();
                q42.getClass();
                q42.LJLLILLLL = "click_hide";
            }
        }
        return C76800UCe.LIZ;
    }
}
