package Y;

import X.C264612c;
import X.C32151Nz;
import X.C7MY;
import X.O6R;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public class AUListenerS94S0200000_2 implements ValueAnimator.AnimatorUpdateListener {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationUpdate$0(Y.AUListenerS94S0200000_2 r5, android.animation.ValueAnimator r6) {
        /*
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.2zl r4 = new X.2zl
            r4.<init>()
            float r3 = r6.getAnimatedFraction()
            java.lang.Object r0 = r5.l0
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            long r1 = r0.getDuration()
            float r0 = (float) r1
            float r3 = r3 * r0
            int r3 = (int) r3
            if (r3 < 0) goto L49
            r0 = 6001(0x1771, float:8.409E-42)
            if (r3 >= r0) goto L36
            int r0 = r3 / 100
            r4.element = r0
        L23:
            java.lang.Object r3 = r5.l1
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r3 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r3
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r2 = r3.LLIFFJFJJ
            if (r2 == 0) goto L52
            Y.ARunnableS21S0200000_2 r1 = new Y.ARunnableS21S0200000_2
            r0 = 15
            r1.<init>(r4, r3, r0)
            r2.post(r1)
            return
        L36:
            r2 = 6000(0x1770, float:8.408E-42)
            if (r2 > r3) goto L49
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r3 >= r0) goto L49
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 60
            int r0 = X.AnonymousClass030.LIZJ(r3, r2, r1, r0)
            r4.element = r0
            goto L23
        L49:
            int r0 = r3 + (-10000)
            int r0 = r0 / 300
            int r0 = r0 + 80
            r4.element = r0
            goto L23
        L52:
            java.lang.String r0 = "mTipsHandler"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS94S0200000_2.onAnimationUpdate$0(Y.AUListenerS94S0200000_2, android.animation.ValueAnimator):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationUpdate$1(Y.AUListenerS94S0200000_2 r5, android.animation.ValueAnimator r6) {
        /*
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.2zl r4 = new X.2zl
            r4.<init>()
            float r3 = r6.getAnimatedFraction()
            java.lang.Object r0 = r5.l0
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            long r1 = r0.getDuration()
            float r0 = (float) r1
            float r3 = r3 * r0
            int r3 = (int) r3
            if (r3 < 0) goto L51
            r0 = 6001(0x1771, float:8.409E-42)
            if (r3 >= r0) goto L40
            int r0 = r3 / 100
        L21:
            r4.element = r0
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment r0 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment) r0
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L3f
            java.lang.Object r3 = r5.l1
            com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment r3 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment) r3
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r2 = r3.LLILZ
            if (r2 == 0) goto L58
            Y.ARunnableS21S0200000_2 r1 = new Y.ARunnableS21S0200000_2
            r0 = 31
            r1.<init>(r4, r3, r0)
            r2.post(r1)
        L3f:
            return
        L40:
            r2 = 6000(0x1770, float:8.408E-42)
            if (r2 > r3) goto L51
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r3 >= r0) goto L51
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 60
            int r0 = X.AnonymousClass030.LIZJ(r3, r2, r1, r0)
            goto L21
        L51:
            int r0 = r3 + (-10000)
            int r0 = r0 / 300
            int r0 = r0 + 80
            goto L21
        L58:
            java.lang.String r0 = "mTipsHandler"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS94S0200000_2.onAnimationUpdate$1(Y.AUListenerS94S0200000_2, android.animation.ValueAnimator):void");
    }

    public static final void onAnimationUpdate$2(AUListenerS94S0200000_2 aUListenerS94S0200000_2, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS94S0200000_2.l0;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aUListenerS94S0200000_2.l1;
            layoutParams.bottomMargin = intValue;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS94S0200000_2 aUListenerS94S0200000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ImageView imageView = (ImageView) aUListenerS94S0200000_2.l0;
        imageView.setTranslationX(C7MY.LIZIZ(53) * floatValue);
        imageView.setTranslationY(O6R.LJJIIZ(C32151Nz.LJIIZILJ(-4)) * floatValue);
        float f = 1 - (0.24444443f * floatValue);
        imageView.setScaleX(f);
        imageView.setScaleY(f);
        ((ImageView) aUListenerS94S0200000_2.l1).setAlpha(floatValue);
    }

    public AUListenerS94S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
