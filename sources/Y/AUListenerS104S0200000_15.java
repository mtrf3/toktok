package Y;

import X.C06420Na;
import X.C264612c;
import X.C65232Piu;
import X.YK3;
import X.YK4;
import X.YKA;
import X.YKB;
import X.YKD;
import X.YKE;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AUListenerS104S0200000_15 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS104S0200000_15 aUListenerS104S0200000_15, ValueAnimator valueAnimator) {
        Float f = (Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float");
        YK4 yk4 = (YK4) aUListenerS104S0200000_15.l1;
        float floatValue = f.floatValue();
        RectF rectF = yk4.LJII;
        int i = YK3.LJLJJLL;
        float f2 = yk4.LJIIIZ;
        float f3 = 2;
        float f4 = floatValue - ((i * f2) / f3);
        rectF.left = f4;
        rectF.right = (i * f2) + f4;
        RectF rectF2 = yk4.LJIIIIZZ;
        int i2 = YK3.LJLJJL;
        float f5 = yk4.LJIIJ;
        float LIZIZ = C65232Piu.LIZIZ(i2, f5, f3, floatValue);
        rectF2.left = LIZIZ;
        rectF2.right = (i2 * f5) + LIZIZ;
        ((YK3) aUListenerS104S0200000_15.l0).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS104S0200000_15 aUListenerS104S0200000_15, ValueAnimator valueAnimator) {
        Float f = (Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float");
        YK4 yk4 = (YK4) aUListenerS104S0200000_15.l1;
        float floatValue = f.floatValue();
        RectF rectF = yk4.LJII;
        int i = YK3.LJLJJLL;
        float f2 = yk4.LJIIIZ;
        float f3 = 2;
        float f4 = floatValue - ((i * f2) / f3);
        rectF.top = f4;
        rectF.bottom = (i * f2) + f4;
        RectF rectF2 = yk4.LJIIIIZZ;
        int i2 = YK3.LJLJJL;
        float f5 = yk4.LJIIJ;
        float LIZIZ = C65232Piu.LIZIZ(i2, f5, f3, floatValue);
        rectF2.top = LIZIZ;
        rectF2.bottom = (i2 * f5) + LIZIZ;
        ((YK3) aUListenerS104S0200000_15.l0).invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS104S0200000_15 aUListenerS104S0200000_15, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        YKB ykb = (YKB) aUListenerS104S0200000_15.l0;
        ykb.getClass();
        int i = 1;
        if (LiveLikeAnimationOptConfig.enableDynamicAdjustAnimation()) {
            int i2 = ykb.LJIIIIZZ;
            if (i2 != -1 && intValue - i2 > 1) {
                if (ykb.LJIIIZ) {
                    intValue = i2 + 1;
                    ykb.LJIIIIZZ = intValue;
                    ykb.LJIIIZ = false;
                } else {
                    intValue = i2;
                }
            } else {
                ykb.LJIIIIZZ = intValue;
            }
        }
        YKB ykb2 = (YKB) aUListenerS104S0200000_15.l0;
        if (ykb2.LJIIJ) {
            YKD ykd = ykb2.LJIIL;
            if (ykd != null) {
                float f = ykb2.LJ;
                float f2 = ykb2.LJFF;
                RectF selfRectF = ykb2.LIZJ;
                RectF iconRectF = ykb2.LIZLLL;
                o.LJIIIZ(selfRectF, "selfRectF");
                o.LJIIIZ(iconRectF, "iconRectF");
                if (intValue < ykd.LIZLLL) {
                    int i3 = ykd.LJIIL;
                    if (i3 < intValue) {
                        float f3 = 2;
                        float f4 = (YKA.LLIIIILZ * f) / f3;
                        float f5 = (YKA.LLIIII * f2) / f3;
                        int i4 = i3 + 1;
                        if (i4 <= intValue) {
                            while (true) {
                                float f6 = i4 / ykd.LIZLLL;
                                float f7 = i - f6;
                                double d = f7;
                                float f8 = f3 * f6 * f7;
                                float f9 = f6 * f6;
                                float pow = (float) ((Math.pow(d, 2.0d) * ykd.LIZ.x) + (ykd.LIZJ.x * f8) + (ykd.LIZIZ.x * f9));
                                float pow2 = (float) ((Math.pow(d, 2.0d) * ykd.LIZ.y) + (f8 * ykd.LIZJ.y) + (f9 * ykd.LIZIZ.y));
                                ykd.LJ[i4] = pow - f4;
                                ykd.LJFF[i4] = pow2 - f4;
                                ykd.LJI[i4] = pow + f4;
                                ykd.LJII[i4] = pow2 + f4;
                                ykd.LJIIIIZZ[i4] = pow - f5;
                                ykd.LJIIIZ[i4] = pow2 - f5;
                                ykd.LJIIJ[i4] = pow + f5;
                                ykd.LJIIJJI[i4] = pow2 + f5;
                                if (i4 == intValue) {
                                    break;
                                }
                                i4++;
                                i = 1;
                            }
                        }
                        ykd.LJIIL = intValue;
                    }
                    selfRectF.left = ykd.LJ[intValue];
                    selfRectF.top = ykd.LJFF[intValue];
                    selfRectF.right = ykd.LJI[intValue];
                    selfRectF.bottom = ykd.LJII[intValue];
                    iconRectF.left = ykd.LJIIIIZZ[intValue];
                    iconRectF.top = ykd.LJIIIZ[intValue];
                    iconRectF.right = ykd.LJIIJ[intValue];
                    iconRectF.bottom = ykd.LJIIJJI[intValue];
                }
            }
        } else {
            YKE yke = ykb2.LJIILIIL;
            if (yke != null) {
                float f10 = ykb2.LJ;
                float f11 = ykb2.LJFF;
                RectF selfRectF2 = ykb2.LIZJ;
                RectF iconRectF2 = ykb2.LIZLLL;
                o.LJIIIZ(selfRectF2, "selfRectF");
                o.LJIIIZ(iconRectF2, "iconRectF");
                int i5 = yke.LJIIJJI;
                if (i5 < intValue) {
                    float f12 = YKA.LLIIIILZ * f10;
                    float f13 = 2;
                    float f14 = f12 / f13;
                    float f15 = (YKA.LLIIII * f11) / f13;
                    int i6 = i5 + 1;
                    if (i6 <= intValue) {
                        while (true) {
                            float f16 = i6 / yke.LIZJ;
                            PointF pointF = yke.LIZIZ;
                            float f17 = pointF.x;
                            PointF pointF2 = yke.LIZ;
                            float f18 = pointF2.x;
                            float LIZIZ = C06420Na.LIZIZ(f17, f18, f16, f18);
                            float f19 = pointF.y;
                            float f20 = pointF2.y;
                            float LIZIZ2 = C06420Na.LIZIZ(f19, f20, f16, f20);
                            yke.LIZLLL[i6] = LIZIZ - f14;
                            yke.LJ[i6] = LIZIZ2 - f14;
                            yke.LJFF[i6] = LIZIZ + f14;
                            yke.LJI[i6] = LIZIZ2 + f14;
                            yke.LJII[i6] = LIZIZ - f15;
                            yke.LJIIIIZZ[i6] = LIZIZ2 - f15;
                            yke.LJIIIZ[i6] = LIZIZ + f15;
                            yke.LJIIJ[i6] = LIZIZ2 + f15;
                            if (i6 == intValue) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                    yke.LJIIJJI = intValue;
                }
                selfRectF2.left = yke.LIZLLL[intValue];
                selfRectF2.top = yke.LJ[intValue];
                selfRectF2.right = yke.LJFF[intValue];
                selfRectF2.bottom = yke.LJI[intValue];
                iconRectF2.left = yke.LJII[intValue];
                iconRectF2.top = yke.LJIIIIZZ[intValue];
                iconRectF2.right = yke.LJIIIZ[intValue];
                iconRectF2.bottom = yke.LJIIJ[intValue];
            }
        }
        if (!LiveLikeAnimationOptConfig.likeAnimationFluencyOpt()) {
            ((YKA) aUListenerS104S0200000_15.l1).invalidate();
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS104S0200000_15 aUListenerS104S0200000_15, ValueAnimator valueAnimator) {
        PointF pointF = (PointF) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type android.graphics.PointF");
        YKB ykb = (YKB) aUListenerS104S0200000_15.l1;
        RectF rectF = ykb.LIZJ;
        float f = pointF.x;
        int i = YKA.LLIIIILZ;
        float f2 = ykb.LJ;
        float f3 = 2;
        float f4 = f - ((i * f2) / f3);
        rectF.left = f4;
        float f5 = pointF.y;
        float LIZIZ = C65232Piu.LIZIZ(i, f2, f3, f5);
        rectF.top = LIZIZ;
        rectF.right = (i * f2) + f4;
        rectF.bottom = (i * f2) + LIZIZ;
        RectF rectF2 = ykb.LIZLLL;
        int i2 = YKA.LLIIII;
        float f6 = ykb.LJFF;
        float LIZIZ2 = C65232Piu.LIZIZ(i2, f6, f3, f);
        rectF2.left = LIZIZ2;
        float LIZIZ3 = C65232Piu.LIZIZ(i2, f6, f3, f5);
        rectF2.top = LIZIZ3;
        rectF2.right = (i2 * f6) + LIZIZ2;
        rectF2.bottom = (i2 * f6) + LIZIZ3;
        if (!LiveLikeAnimationOptConfig.likeAnimationFluencyOpt()) {
            ((YKA) aUListenerS104S0200000_15.l0).invalidate();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS104S0200000_15(X.YKB r2, X.YKA r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS104S0200000_15.<init>(X.YKB, X.YKA, int):void");
    }

    public AUListenerS104S0200000_15(YK3 yk3, YK4 yk4, int i) {
        this.$t = i;
        this.l0 = yk3;
        this.l1 = yk4;
    }
}
