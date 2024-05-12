package X;

import Y.ARunnableS39S0100000_3;
import android.animation.Animator;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203427yc extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFavoriteAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C203427yc LJLIL = new C203427yc();

    public C203427yc() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.7yd] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.7yd] */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFavoriteAssem videoFavoriteAssem, C43I<? extends Boolean> c43i) {
        VideoFavoriteAssem selectSubscribe = videoFavoriteAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                if (C204147zm.LIZLLL) {
                    C202297wn.LIZ(selectSubscribe.Y3().findViewById(R.id.d56));
                } else {
                    final C203417yb c203417yb = (C203417yb) selectSubscribe.Y3().findViewById(R.id.d56);
                    c203417yb.setAnimation("icon_home_favorite.json");
                    if (c203417yb.isSelected()) {
                        c203417yb.LIZJ();
                        c203417yb.setAnimation(c203417yb.LJLJJL);
                        if (c203417yb.LJLJI == null) {
                            c203417yb.LJLJI = new Animator.AnimatorListener() { // from class: X.7yd
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C203417yb.this.LIZ(false);
                                    C203417yb.this.LIZIZ();
                                    C203417yb.this.removeAnimatorListener(this);
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C203417yb.this.LIZ(false);
                                    C203417yb.this.LIZIZ();
                                    C203417yb.this.removeAnimatorListener(this);
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C203417yb.this.LIZ(true);
                                }
                            };
                        }
                        if (!C202677xP.LIZIZ()) {
                            c203417yb.setMinFrame(0);
                            c203417yb.setMaxFrame(60);
                        }
                        c203417yb.removeAnimatorListener(c203417yb.LJLJI);
                        c203417yb.addAnimatorListener(c203417yb.LJLJI);
                        c203417yb.playAnimation();
                    } else {
                        c203417yb.LIZJ();
                        c203417yb.setAnimation(c203417yb.LJLJJLL);
                        if (c203417yb.LJLJJI == null) {
                            c203417yb.LJLJJI = new Animator.AnimatorListener() { // from class: X.7yd
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C203417yb.this.LIZ(false);
                                    C203417yb.this.LIZIZ();
                                    C203417yb.this.removeAnimatorListener(this);
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C203417yb.this.LIZ(false);
                                    C203417yb.this.LIZIZ();
                                    C203417yb.this.removeAnimatorListener(this);
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C203417yb.this.LIZ(true);
                                }
                            };
                        }
                        if (!C202677xP.LIZIZ()) {
                            c203417yb.setMinFrame(61);
                            c203417yb.setMaxFrame(81);
                        }
                        c203417yb.removeAnimatorListener(c203417yb.LJLJJI);
                        c203417yb.addAnimatorListener(c203417yb.LJLJJI);
                        c203417yb.playAnimation();
                    }
                }
                if (JA9.LIZIZ()) {
                    C37179EiV.LIZ().post(new ARunnableS39S0100000_3(selectSubscribe, 196));
                }
            }
            selectSubscribe.q4().setState(C203617yv.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
