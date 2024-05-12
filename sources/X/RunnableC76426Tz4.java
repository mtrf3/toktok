package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS2S0101000_13;
import Y.ALAdapterS4S0110000_13;
import Y.ALAdapterS5S0000000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tz4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76426Tz4 implements Runnable {
    public final /* synthetic */ MatchCountDownAssem LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC76426Tz4(MatchCountDownAssem matchCountDownAssem, int i, boolean z, C76732zl c76732zl, String str) {
        this.LJLIL = matchCountDownAssem;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = c76732zl;
        this.LJLJJL = str;
    }

    public final void LIZ() {
        MatchCountDownAssem matchCountDownAssem = this.LJLIL;
        ConstraintLayout constraintLayout = matchCountDownAssem.LJLJLJ;
        if (constraintLayout != null) {
            int measuredWidth = constraintLayout.getMeasuredWidth() + this.LJLILLLLZI;
            ConstraintLayout constraintLayout2 = this.LJLIL.LJLJLJ;
            if (constraintLayout2 != null) {
                int measuredWidth2 = constraintLayout2.getMeasuredWidth();
                boolean z = this.LJLJI;
                int i = this.LJLJJI.element;
                String tipContent = this.LJLJJL;
                o.LJIIIIZZ(tipContent, "tipContent");
                matchCountDownAssem.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("buildAnimator oldWidth = ");
                LIZ.append(measuredWidth2);
                C0NB.LIZIZ("MatchCountDownAssem", X1D.LIZIZ(LIZ));
                CMV cmv = matchCountDownAssem.LJLJL;
                if (cmv != null) {
                    cmv.LJJIL();
                    CMV cmv2 = matchCountDownAssem.LJLJL;
                    if (cmv2 != null) {
                        cmv2.setText(tipContent);
                        CMV cmv3 = matchCountDownAssem.LJLJL;
                        if (cmv3 != null) {
                            cmv3.setVisibility(0);
                            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                            ConstraintLayout constraintLayout3 = matchCountDownAssem.LJLJLJ;
                            if (constraintLayout3 != null) {
                                anonymousClass064.LJII(constraintLayout3);
                                anonymousClass064.LJIIL(R.id.mcp, i);
                                ConstraintLayout constraintLayout4 = matchCountDownAssem.LJLJLJ;
                                if (constraintLayout4 != null) {
                                    anonymousClass064.LIZIZ(constraintLayout4);
                                    float f = measuredWidth2;
                                    float f2 = measuredWidth;
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                                    ofFloat.setDuration(300L);
                                    ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.35f, 1.0f));
                                    ofFloat.addUpdateListener(new AUListenerS100S0100000_13(matchCountDownAssem, 89));
                                    C47121t6 c47121t6 = matchCountDownAssem.LJLJJLL;
                                    if (c47121t6 != null) {
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.ALPHA, 1.0f, 0.0f);
                                        ofFloat2.setDuration(200L);
                                        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
                                        C47121t6 c47121t62 = matchCountDownAssem.LJLJJL;
                                        if (c47121t62 != null) {
                                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c47121t62, (Property<C47121t6, Float>) View.ALPHA, 1.0f, 0.0f);
                                            ofFloat3.setDuration(200L);
                                            ofFloat3.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
                                            CMV cmv4 = matchCountDownAssem.LJLJL;
                                            if (cmv4 != null) {
                                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cmv4, (Property<CMV, Float>) View.ALPHA, 0.0f, 1.0f);
                                                ofFloat4.setDuration(200L);
                                                ofFloat4.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
                                                ValueAnimator ofInt = ValueAnimator.ofInt(0, 5000);
                                                ofInt.setDuration(5000L);
                                                ofInt.addListener(new ALAdapterS5S0000000_13(3));
                                                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                ofFloat5.setDuration(1000L);
                                                ofFloat5.addListener(new ALAdapterS4S0110000_13(z, matchCountDownAssem, 1));
                                                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f2, f);
                                                ofFloat6.setDuration(300L);
                                                ofFloat6.setInterpolator(C18950ol.LIZIZ(0.64f, 0.0f, 0.67f, 1.0f));
                                                ofFloat6.addUpdateListener(new AUListenerS100S0100000_13(matchCountDownAssem, 90));
                                                ofFloat6.addListener(new ALAdapterS10S0100000_13(matchCountDownAssem, 48));
                                                CMV cmv5 = matchCountDownAssem.LJLJL;
                                                if (cmv5 != null) {
                                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(cmv5, (Property<CMV, Float>) View.ALPHA, 1.0f, 0.0f);
                                                    ofFloat7.setDuration(200L);
                                                    ofFloat7.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
                                                    C47121t6 c47121t63 = matchCountDownAssem.LJLJJLL;
                                                    if (c47121t63 != null) {
                                                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c47121t63, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f);
                                                        ofFloat8.setDuration(200L);
                                                        ofFloat8.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
                                                        C47121t6 c47121t64 = matchCountDownAssem.LJLJJL;
                                                        if (c47121t64 != null) {
                                                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(c47121t64, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f);
                                                            ofFloat9.setDuration(200L);
                                                            ofFloat9.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
                                                            AnimatorSet animatorSet = new AnimatorSet();
                                                            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                            ofFloat10.setDuration(100L);
                                                            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                            ofFloat11.setDuration(100L);
                                                            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat10).before(ofInt);
                                                            animatorSet.play(ofFloat10).before(ofFloat4);
                                                            animatorSet.play(ofInt).with(ofFloat5).before(ofFloat6);
                                                            animatorSet.play(ofFloat7).with(ofFloat6).with(ofFloat11);
                                                            animatorSet.play(ofFloat8).with(ofFloat9).after(ofFloat11);
                                                            animatorSet.addListener(new ALAdapterS2S0101000_13(matchCountDownAssem, measuredWidth2, 2));
                                                            animatorSet.start();
                                                            matchCountDownAssem.LJLL = animatorSet;
                                                            return;
                                                        }
                                                        o.LJIJI("tvPKOnlyGift");
                                                        throw null;
                                                    }
                                                    o.LJIJI("tvPKCountDownValue");
                                                    throw null;
                                                }
                                                o.LJIJI("tvPKOnlyGiftTip");
                                                throw null;
                                            }
                                            o.LJIJI("tvPKOnlyGiftTip");
                                            throw null;
                                        }
                                        o.LJIJI("tvPKOnlyGift");
                                        throw null;
                                    }
                                    o.LJIJI("tvPKCountDownValue");
                                    throw null;
                                }
                                o.LJIJI("layoutPKCountDown");
                                throw null;
                            }
                            o.LJIJI("layoutPKCountDown");
                            throw null;
                        }
                        o.LJIJI("tvPKOnlyGiftTip");
                        throw null;
                    }
                    o.LJIJI("tvPKOnlyGiftTip");
                    throw null;
                }
                o.LJIJI("tvPKOnlyGiftTip");
                throw null;
            }
            o.LJIJI("layoutPKCountDown");
            throw null;
        }
        o.LJIJI("layoutPKCountDown");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
