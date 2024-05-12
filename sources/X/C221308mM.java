package X;

import Y.ALAdapterS1S0201000_3;
import Y.ALAdapterS2S0100000_3;
import Y.AUListenerS92S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221308mM extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C221308mM LJLIL = new C221308mM();

    public C221308mM() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, C43I<? extends Boolean> c43i) {
        long j;
        final VideoExposeSharerInformationAssem selectSubscribe = videoExposeSharerInformationAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            boolean booleanValue = ((Boolean) c43i2.LIZ).booleanValue();
            long j2 = 300;
            if (((C221298mL) selectSubscribe.q4().getState()).LJLL) {
                if (booleanValue) {
                    if (((Boolean) C221558ml.LIZ.getValue()).booleanValue()) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(selectSubscribe.Y3().findViewById(R.id.il5), "alpha", 0.0f, 1.0f);
                        ofFloat.setDuration(300L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.8mY
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationStart(animation);
                                InterfaceC221448ma quickReplyAnalytics = VideoExposeSharerInformationAssem.this.q4().mv0().getQuickReplyAnalytics();
                                String str = VideoExposeSharerInformationAssem.this.q4().LJLJI;
                                if (str == null) {
                                    str = "";
                                }
                                quickReplyAnalytics.LIZIZ(str, VideoExposeSharerInformationAssem.this.q4().ov0());
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.il5).setVisibility(0);
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25).setAlpha(0.0f);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation, boolean z) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationEnd(animation, z);
                                VideoExposeSharerInformationVM q4 = VideoExposeSharerInformationAssem.this.q4();
                                q4.getClass();
                                q4.setStateImmediate(new AqS8S0010000_3(34));
                                View findViewById = VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25);
                                o.LJIIIIZZ(findViewById, "contentView.expose_sharer_information");
                                VideoExposeSharerInformationAssem.r4(findViewById);
                            }
                        });
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(selectSubscribe.Y3().findViewById(R.id.d25), "alpha", 1.0f, 0.0f);
                        ofFloat2.setDuration(300L);
                        ofFloat2.setInterpolator(new LinearInterpolator());
                        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: X.8mP
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationStart(animation);
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25).setVisibility(0);
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25).setAlpha(1.0f);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation, boolean z) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationEnd(animation, z);
                            }
                        });
                        selectSubscribe.Y3().findViewById(R.id.d25).setClickable(false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.start();
                    } else {
                        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.4f, 0.0f, 0.2f, 1.0f);
                        o.LJIIIIZZ(LIZIZ, "create(0.4f, 0f, 0.2f, 1f)");
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(selectSubscribe.Y3().findViewById(R.id.il5), "alpha", 0.0f, 1.0f);
                        ofFloat3.setDuration(400L);
                        ofFloat3.setInterpolator(LIZIZ);
                        ofFloat3.setStartDelay(700L);
                        ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: X.8mZ
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationStart(animation);
                                InterfaceC221448ma quickReplyAnalytics = VideoExposeSharerInformationAssem.this.q4().mv0().getQuickReplyAnalytics();
                                String str = VideoExposeSharerInformationAssem.this.q4().LJLJI;
                                if (str == null) {
                                    str = "";
                                }
                                quickReplyAnalytics.LIZIZ(str, VideoExposeSharerInformationAssem.this.q4().ov0());
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.il5).setVisibility(0);
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25).setAlpha(0.0f);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation, boolean z) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationEnd(animation, z);
                                VideoExposeSharerInformationVM q4 = VideoExposeSharerInformationAssem.this.q4();
                                q4.getClass();
                                q4.setStateImmediate(new AqS8S0010000_3(34));
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25).setAlpha(1.0f);
                            }
                        });
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(selectSubscribe.Y3().findViewById(R.id.d25), "alpha", 1.0f, 0.0f);
                        ofFloat4.setDuration(200L);
                        ofFloat4.setInterpolator(LIZIZ);
                        ofFloat4.setStartDelay(600L);
                        ofFloat4.addListener(new AnimatorListenerAdapter() { // from class: X.8mO
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationStart(animation);
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25).setVisibility(0);
                                VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25).setAlpha(1.0f);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation, boolean z) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationEnd(animation, z);
                            }
                        });
                        ValueAnimator ofInt = ValueAnimator.ofInt(selectSubscribe.Y3().getHeight(), C47135Ieh.LIZ(26, selectSubscribe.Y3().getHeight()));
                        ofInt.setDuration(400L);
                        ofInt.setInterpolator(LIZIZ);
                        ofInt.setStartDelay(700L);
                        ofInt.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 28));
                        ofInt.addListener(new AnimatorListenerAdapter() { // from class: X.8mN
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationCancel(animation);
                                View findViewById = VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25);
                                VideoExposeSharerInformationAssem videoExposeSharerInformationAssem2 = VideoExposeSharerInformationAssem.this;
                                findViewById.setVisibility(8);
                                videoExposeSharerInformationAssem2.getClass();
                                VideoExposeSharerInformationAssem.r4(findViewById);
                                View Y3 = VideoExposeSharerInformationAssem.this.Y3();
                                ViewGroup.LayoutParams layoutParams = VideoExposeSharerInformationAssem.this.Y3().getLayoutParams();
                                layoutParams.height = -2;
                                Y3.setLayoutParams(layoutParams);
                                VideoExposeSharerInformationAssem.r4(VideoExposeSharerInformationAssem.this.Y3());
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationStart(animation);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation, boolean z) {
                                o.LJIIIZ(animation, "animation");
                                super.onAnimationEnd(animation, z);
                                View findViewById = VideoExposeSharerInformationAssem.this.Y3().findViewById(R.id.d25);
                                VideoExposeSharerInformationAssem videoExposeSharerInformationAssem2 = VideoExposeSharerInformationAssem.this;
                                findViewById.setVisibility(8);
                                videoExposeSharerInformationAssem2.getClass();
                                VideoExposeSharerInformationAssem.r4(findViewById);
                                View Y3 = VideoExposeSharerInformationAssem.this.Y3();
                                ViewGroup.LayoutParams layoutParams = VideoExposeSharerInformationAssem.this.Y3().getLayoutParams();
                                layoutParams.height = -2;
                                Y3.setLayoutParams(layoutParams);
                                VideoExposeSharerInformationAssem.r4(VideoExposeSharerInformationAssem.this.Y3());
                            }
                        });
                        selectSubscribe.Y3().findViewById(R.id.d25).setClickable(false);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(ofFloat3).with(ofFloat4).with(ofInt);
                        animatorSet2.start();
                    }
                } else {
                    selectSubscribe.Y3().findViewById(R.id.d25).setVisibility(8);
                    selectSubscribe.Y3().findViewById(R.id.il5).setVisibility(0);
                    selectSubscribe.Y3().findViewById(R.id.d25).setAlpha(1.0f);
                    selectSubscribe.Y3().findViewById(R.id.il5).setAlpha(1.0f);
                }
            } else {
                int LIZIZ2 = C7MY.LIZIZ(30);
                if (booleanValue) {
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(selectSubscribe.Y3().findViewById(R.id.gvf), "alpha", 0.0f, 1.0f);
                    C62822Ol8 c62822Ol8 = C221538mj.LIZ;
                    if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
                        j = 300;
                    } else {
                        j = 150;
                    }
                    ofFloat5.setDuration(j);
                    ofFloat5.setRepeatCount(0);
                    ofFloat5.addListener(new ALAdapterS2S0100000_3(selectSubscribe, 1));
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(selectSubscribe.Y3().findViewById(R.id.m71), "alpha", 1.0f, 0.0f);
                    if (!((Boolean) c62822Ol8.getValue()).booleanValue()) {
                        j2 = 150;
                    }
                    ofFloat6.setDuration(j2);
                    ofFloat6.addListener(new ALAdapterS1S0201000_3(selectSubscribe, ofFloat5, LIZIZ2, 1));
                    ofFloat6.start();
                } else {
                    selectSubscribe.Y3().findViewById(R.id.m71).setVisibility(8);
                    selectSubscribe.Y3().findViewById(R.id.gvf).setAlpha(1.0f);
                    selectSubscribe.u4(LIZIZ2, true);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
