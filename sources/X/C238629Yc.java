package X;

import Y.IDAListenerS38S0200000_4;
import Y.IDAListenerS5S0300000_4;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Animatable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS12S1400000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9Yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238629Yc {
    public static void LIZ(Context context, final LifecycleCoroutineScope lifecycleCoroutineScope, View view, View view2, ViewGroup viewGroup, final AqS12S1400000_4 aqS12S1400000_4) {
        float f;
        C238659Yf.LIZ.getClass();
        if (C238659Yf.LIZ()) {
            EComLiveDegradeExperiment.LIZ.getClass();
            if (EComLiveDegradeExperiment.LIZ().getEntranceAnimDegrade()) {
                aqS12S1400000_4.invoke(Boolean.FALSE);
                return;
            }
        }
        if (view == null || view2 == null || viewGroup == null) {
            return;
        }
        final ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ag8);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        viewGroup.addView(imageView, new ViewGroup.LayoutParams((int) C45804HyK.LJJ(64.0f), (int) C45804HyK.LJJ(64.0f)));
        viewGroup.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        if (iArr[1] < 0) {
            iArr[1] = 0;
        }
        float width = ((view.getWidth() / 2.0f) + (r7[0] - r2[0])) - ((int) C45804HyK.LJJ(31.0f));
        float height = ((view.getHeight() / 2.0f) + (r7[1] - r2[1])) - ((int) C45804HyK.LJJ(31.0f));
        float width2 = ((view2.getWidth() / 2.0f) + (iArr[0] - r2[0])) - ((int) C45804HyK.LJJ(31.0f));
        float height2 = ((view2.getHeight() / 2.0f) + (iArr[1] - r2[1])) - ((int) C45804HyK.LJJ(31.0f));
        Path path = new Path();
        path.moveTo(width, height);
        path.quadTo(width, height2, width2, height2);
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final float length = pathMeasure.getLength();
        float abs = Math.abs(height2 - height);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            f = displayMetrics.density;
        } else {
            f = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        ofFloat.setDuration((abs / f) * 0.99f);
        ofFloat.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
        final C56K c56k = new C56K();
        c56k.element = 1.0f;
        final C34K c34k = new C34K();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9WU
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float[] fArr = new float[2];
                pathMeasure.getPosTan(floatValue, fArr, null);
                imageView.setTranslationX(fArr[0]);
                imageView.setTranslationY(fArr[1]);
                C56K c56k2 = c56k;
                float f2 = length;
                float f3 = (f2 - ((2 * floatValue) / 3)) / (f2 * 1.0f);
                c56k2.element = f3;
                imageView.setScaleX(f3);
                imageView.setScaleY(c56k.element);
                LifecycleCoroutineScope lifecycleCoroutineScope2 = lifecycleCoroutineScope;
                if (lifecycleCoroutineScope2 != null && !C48841JEv.LJIILLIIL(lifecycleCoroutineScope2)) {
                    ofFloat.cancel();
                }
                if (floatValue / length > 0.7d) {
                    C34K c34k2 = c34k;
                    if (!c34k2.element) {
                        c34k2.element = true;
                        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = aqS12S1400000_4;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(Boolean.TRUE);
                        }
                    }
                }
            }
        });
        ofFloat.start();
        ofFloat.addListener(new IDAListenerS38S0200000_4(viewGroup, imageView, 5));
    }

    public static void LIZIZ(final Context context, final LifecycleCoroutineScope lifecycleCoroutineScope, String str, final boolean z, final Integer num, final View view, ViewGroup viewGroup, final ViewGroup viewGroup2, final InterfaceC88472Yns interfaceC88472Yns) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        C238659Yf.LIZ.getClass();
        if (C238659Yf.LIZ()) {
            EComLiveDegradeExperiment.LIZ.getClass();
            if (EComLiveDegradeExperiment.LIZ().getEntranceAnimDegrade()) {
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        if (context == null || view == null || viewGroup2 == null || viewGroup == null) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (!view.isShown() || !viewGroup.isShown()) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        final int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        final int[] iArr2 = new int[2];
        viewGroup2.getLocationOnScreen(iArr2);
        int i2 = iArr[0] - iArr2[0];
        int i3 = iArr[1] - iArr2[1];
        final int width = viewGroup.getWidth();
        final SmartImageView smartImageView = new SmartImageView(context);
        W5F LIZLLL = C70759Rpr.LIZLLL(str);
        LIZLLL.LJJIIJ = smartImageView;
        S3I s3i = new S3I();
        s3i.LIZIZ = 0.0f;
        s3i.LIZLLL = width / 2;
        LIZLLL.LJIJJLI = new S3L(s3i);
        LIZLLL.LIZLLL(new InterfaceC70769Rq1() { // from class: X.9WQ
            @Override // X.InterfaceC70769Rq1
            public final void D1(android.net.Uri uri, C2047581v c2047581v) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void LJLLLLLL(android.net.Uri uri) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void T1(android.net.Uri uri, SmartImageView smartImageView2) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view2, Throwable th) {
                C16880lQ.LJLLL(SmartImageView.this, viewGroup2);
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view2, C2047581v c2047581v, Animatable animatable) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(SmartImageView.this, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(SmartImageView.this, "scaleX", 1.0f, 0.2f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(SmartImageView.this, "scaleY", 1.0f, 0.2f);
                AnimatorSet animatorSet = new AnimatorSet();
                final View view3 = view;
                final int[] iArr3 = iArr;
                final int i4 = width;
                final Context context2 = context;
                final boolean z2 = z;
                final int[] iArr4 = iArr2;
                final ViewGroup viewGroup3 = viewGroup2;
                final Integer num2 = num;
                final SmartImageView smartImageView2 = SmartImageView.this;
                final LifecycleCoroutineScope lifecycleCoroutineScope2 = lifecycleCoroutineScope;
                final InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                animatorSet.setDuration(560L);
                animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.9WS
                    public final /* synthetic */ float LJLL = 0.2f;

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        float f;
                        int intValue;
                        float f2;
                        o.LJIIIZ(animation, "animation");
                        int[] iArr5 = new int[2];
                        view3.getLocationOnScreen(iArr5);
                        if (iArr5[1] < 0) {
                            iArr5[1] = 0;
                        }
                        int i5 = iArr5[0];
                        int[] iArr6 = iArr3;
                        float f3 = i5 - iArr6[0];
                        int i6 = i4;
                        float f4 = f3 - (i6 / 2.0f);
                        boolean z3 = z2;
                        int[] iArr7 = iArr4;
                        ViewGroup viewGroup4 = viewGroup3;
                        View view4 = view3;
                        Integer num3 = num2;
                        if (z3) {
                            f = iArr7[1];
                            i6 = viewGroup4.getHeight();
                        } else {
                            f = iArr6[1];
                        }
                        float height = ((view4.getHeight() / 2.0f) + iArr5[1]) - ((i6 / 2.0f) + f);
                        if (z3 || num3 == null) {
                            intValue = 0;
                        } else {
                            intValue = num3.intValue();
                        }
                        float f5 = height - intValue;
                        Path path = new Path();
                        path.moveTo(0.0f, 0.0f);
                        path.quadTo(0.0f, f5, f4, f5);
                        final PathMeasure pathMeasure = new PathMeasure(path, false);
                        final float length = pathMeasure.getLength();
                        float abs = Math.abs(f5 - 0.0f);
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            f2 = displayMetrics.density;
                        } else {
                            f2 = 1.0f;
                        }
                        final ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
                        ofFloat4.setDuration((abs / f2) * 2.0f);
                        ofFloat4.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
                        final C34K c34k = new C34K();
                        final SmartImageView smartImageView3 = smartImageView2;
                        final float f6 = this.LJLL;
                        final LifecycleCoroutineScope lifecycleCoroutineScope3 = lifecycleCoroutineScope2;
                        final InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9WT
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) C264612c.LIZ(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                                float[] fArr = new float[2];
                                pathMeasure.getPosTan(floatValue, fArr, null);
                                float f7 = length;
                                float f8 = (f7 - ((2 * floatValue) / 3)) / (f7 * 1.0f);
                                smartImageView3.setTranslationX(fArr[0]);
                                smartImageView3.setTranslationY(fArr[1]);
                                smartImageView3.setScaleX(f6 * f8);
                                smartImageView3.setScaleY(f8 * f6);
                                LifecycleCoroutineScope lifecycleCoroutineScope4 = lifecycleCoroutineScope3;
                                if (lifecycleCoroutineScope4 != null && !C48841JEv.LJIILLIIL(lifecycleCoroutineScope4)) {
                                    ofFloat4.cancel();
                                }
                                if (floatValue / length > 0.7d) {
                                    C34K c34k2 = c34k;
                                    if (!c34k2.element) {
                                        c34k2.element = true;
                                        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns3;
                                        if (interfaceC88472Yns4 != null) {
                                            interfaceC88472Yns4.invoke(Boolean.TRUE);
                                        }
                                    }
                                }
                            }
                        });
                        ofFloat4.addListener(new IDAListenerS5S0300000_4(viewGroup3, smartImageView2, ofFloat4, 2));
                        ofFloat4.start();
                    }
                });
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                animatorSet.start();
            }
        });
        smartImageView.setAlpha(0.0f);
        if (z || i3 < 0) {
            if (viewGroup2 instanceof ConstraintLayout) {
                C018905p c018905p = new C018905p(width, width);
                c018905p.startToStart = 0;
                c018905p.endToEnd = 0;
                c018905p.topToTop = 0;
                c018905p.bottomToBottom = 0;
                layoutParams = c018905p;
            } else if (viewGroup2 instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(width, width);
                layoutParams2.gravity = 17;
                layoutParams = layoutParams2;
            } else if (viewGroup2 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(width, width);
                layoutParams3.addRule(13, -1);
                layoutParams = layoutParams3;
            } else {
                layoutParams = new ViewGroup.LayoutParams(width, width);
            }
            viewGroup2.addView(smartImageView, layoutParams);
            return;
        }
        if (viewGroup2 instanceof ConstraintLayout) {
            C018905p c018905p2 = new C018905p(width, width);
            c018905p2.startToStart = 0;
            c018905p2.topToTop = 0;
            marginLayoutParams = c018905p2;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(width, width);
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        marginLayoutParams.topMargin = i3 + i;
        marginLayoutParams.setMarginStart(i2);
        viewGroup2.addView(smartImageView, marginLayoutParams);
    }
}
