package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimaEndEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.21g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C517221g extends AbstractC65781Prl implements InterfaceC88473Ynt<String, InterfaceC81599W0t, AnimatedDrawable2, C76800UCe> {
    public final /* synthetic */ C14520hc LJLIL;
    public final /* synthetic */ C2A4 LJLILLLLZI;
    public final /* synthetic */ C33611Tp LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517221g(C14520hc c14520hc, C2A4 c2a4, C33611Tp c33611Tp, float f, float f2) {
        super(3);
        this.LJLIL = c14520hc;
        this.LJLILLLLZI = c2a4;
        this.LJLJI = c33611Tp;
        this.LJLJJI = f;
        this.LJLJJL = f2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, InterfaceC81599W0t interfaceC81599W0t, AnimatedDrawable2 animatedDrawable2) {
        final AnimatedDrawable2 animatedDrawable22 = animatedDrawable2;
        final C14520hc c14520hc = this.LJLIL;
        if (c14520hc.LJI) {
            c14520hc.LIZIZ(this.LJLILLLLZI);
            C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath return for screen is cleared");
            C14480hY.LIZIZ(this.LJLJI, 0, 2, 2, false);
        } else {
            final C33611Tp c33611Tp = this.LJLJI;
            final C2A4 c2a4 = this.LJLILLLLZI;
            float f = this.LJLJJI;
            float f2 = this.LJLJJL;
            c14520hc.LJIIIIZZ = c33611Tp.LJLIL.LJ;
            Rect rect = new Rect();
            ViewGroup viewGroup = c14520hc.LIZIZ;
            if (viewGroup != null) {
                viewGroup.getGlobalVisibleRect(rect);
            }
            Path path = new Path();
            float f3 = c33611Tp.LJLILLLLZI.getSecond().x - rect.left;
            float f4 = c33611Tp.LJLILLLLZI.getSecond().y - rect.top;
            path.moveTo(f - rect.left, f2 - rect.top);
            path.lineTo(f3, f4);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("animationView rect is ");
            LIZ.append(rect);
            LIZ.append(", realStartX is ");
            LIZ.append(f);
            LIZ.append(", realStartY is ");
            LIZ.append(f2);
            LIZ.append(", toX is ");
            LIZ.append(c33611Tp.LJLILLLLZI.getSecond().x);
            LIZ.append(", toY is  ");
            C1DD.LJFF(LIZ, c33611Tp.LJLILLLLZI.getSecond().y, LIZ, "LiveLinkMicGiftFlyAnimationHelper");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c2a4, (Property<C2A4, Float>) View.X, (Property<C2A4, Float>) View.Y, path);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(700L);
            c14520hc.LJII = ofFloat;
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.0hd
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "fly small pathAnimator Animator onCancel");
                    AnimatedDrawable2 animatedDrawable23 = animatedDrawable22;
                    if (animatedDrawable23 != null) {
                        animatedDrawable23.stop();
                    }
                    AnimatedDrawable2 animatedDrawable24 = animatedDrawable22;
                    if (animatedDrawable24 != null) {
                        animatedDrawable24.setVisible(false, false);
                    }
                    c14520hc.LIZIZ(c2a4);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "fly small pathAnimator Animator onEnd");
                    AnimatedDrawable2 animatedDrawable23 = AnimatedDrawable2.this;
                    if (animatedDrawable23 != null) {
                        animatedDrawable23.stop();
                    }
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    C33611Tp c33611Tp2 = c33611Tp;
                    c33611Tp2.LJLJI = 1;
                    dataChannelGlobal.sv0(SmallFlyMicGiftAnimaEndEvent.class, c33611Tp2);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    final C14520hc c14520hc2 = c14520hc;
                    final AnimatedDrawable2 animatedDrawable23 = animatedDrawable22;
                    final C2A4 c2a42 = c2a4;
                    c14520hc2.getClass();
                    if (animatedDrawable23 != null) {
                        animatedDrawable23.stop();
                        animatedDrawable23.LJI(new InterfaceC81841WAb() { // from class: X.1Tr
                            @Override // X.InterfaceC81841WAb
                            public final void LIZ(AnimatedDrawable2 animatedDrawable24) {
                                C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath onAnimationStart");
                            }

                            @Override // X.InterfaceC81841WAb
                            public final void LIZIZ(AnimatedDrawable2 animatedDrawable24) {
                                C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath onAnimationRepeat");
                            }

                            @Override // X.InterfaceC81841WAb
                            public final void LIZJ(AnimatedDrawable2 animatedDrawable24) {
                                C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath onAnimationStop");
                                AnimatedDrawable2 animatedDrawable25 = AnimatedDrawable2.this;
                                if (animatedDrawable25 != null) {
                                    animatedDrawable25.setVisible(false, false);
                                }
                                c14520hc2.LIZIZ(c2a42);
                            }

                            @Override // X.InterfaceC81841WAb
                            public final void LIZLLL(AnimatedDrawable2 animatedDrawable24, int i) {
                                C012403c.LJ("startFlySmallGiftByPath onAnimationFrame:", i, "LiveLinkMicGiftFlyAnimationHelper");
                            }
                        });
                        animatedDrawable23.start();
                    }
                    C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "fly small pathAnimator Animator onStart");
                }
            });
            ofFloat.start();
        }
        return C76800UCe.LIZ;
    }
}
