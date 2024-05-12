package X;

import Y.AUListenerS90S0100000_1;
import Y.AUListenerS91S0100000_2;
import Y.AfS61S0100000_9;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.McV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57191McV extends ConstraintLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;
    public C73411SrX LJLJLJ;
    public final PathInterpolator LJLJLLL;
    public String LJLL;
    public final C62822Ol8 LJLLI;

    private final java.util.Map<Integer, C131965Fw> getCircleMap() {
        return (java.util.Map) this.LJLLI.getValue();
    }

    public final C131965Fw getCircle0() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-circle0>(...)");
        return (C131965Fw) value;
    }

    public final C131965Fw getCircle1() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-circle1>(...)");
        return (C131965Fw) value;
    }

    public final C131965Fw getCircle2() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-circle2>(...)");
        return (C131965Fw) value;
    }

    public final C131965Fw getCircle3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-circle3>(...)");
        return (C131965Fw) value;
    }

    public final C131965Fw getCircle4() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-circle4>(...)");
        return (C131965Fw) value;
    }

    public final TextView getNumberText() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-numberText>(...)");
        return (TextView) value;
    }

    private final void setTextVisibility(int i) {
        if (i <= 5) {
            getNumberText().setVisibility(4);
            return;
        }
        getNumberText().setVisibility(0);
        C73411SrX c73411SrX = this.LJLJLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJLJ = (C73411SrX) AbstractC73672Svk.LJJIJIL("").LJIIL(3L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 25), C57190McU.LJLIL);
    }

    public final void LJJLJLI(C131965Fw c131965Fw) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.6f);
        ofFloat.setInterpolator(this.LJLJLLL);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(c131965Fw, 36));
        ofFloat.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57191McV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJZ(int i, C131965Fw c131965Fw) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c131965Fw, "translationY", 12 * C7MY.LIZIZ(i), 0.0f);
        ofFloat.setInterpolator(this.LJLJLLL);
        ofFloat.setDuration(200L);
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.6f);
        ofFloat2.setInterpolator(this.LJLJLLL);
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(c131965Fw, 37));
        ofFloat2.start();
    }

    public final void LJJZZIII(int i, C131965Fw c131965Fw) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.6f, 1.0f);
        ofFloat.setInterpolator(this.LJLJLLL);
        ofFloat.setDuration(200L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c131965Fw, "translationY", 12 * C7MY.LIZIZ(i), 0.0f);
        ofFloat2.setInterpolator(this.LJLJLLL);
        ofFloat2.setDuration(200L);
        ofFloat2.start();
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(c131965Fw, 38));
        ofFloat.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI(int r5, int r6) {
        /*
            r4 = this;
            X.5Fw r0 = r4.getCircle0()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r3)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r4.getCircle0()
            r2 = 1058642330(0x3f19999a, float:0.6)
            r0.setScaleX(r2)
            X.5Fw r0 = r4.getCircle0()
            r0.setScaleY(r2)
            X.5Fw r0 = r4.getCircle1()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            float r0 = X.C32151Nz.LJIIZILJ(r3)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r4.getCircle2()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = 22
            int r0 = X.C7MY.LIZIZ(r0)
            r1.height = r0
            X.5Fw r0 = r4.getCircle3()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            float r0 = X.C32151Nz.LJIIZILJ(r3)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r4.getCircle4()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            float r0 = X.C32151Nz.LJIIZILJ(r3)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r4.getCircle4()
            r0.setScaleX(r2)
            X.5Fw r0 = r4.getCircle4()
            r0.setScaleY(r2)
            r3 = 2
            if (r6 < r3) goto L89
            X.5Fw r1 = r4.getCircle2()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
        L89:
            r2 = 0
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r5 >= r3) goto Lc3
            X.5Fw r0 = r4.getCircle1()
            r0.setAlpha(r2)
        L95:
            X.5Fw r0 = r4.getCircle0()
            r0.setAlpha(r2)
        L9c:
            int r0 = r6 + (-2)
            if (r5 <= r0) goto Lbb
            X.5Fw r0 = r4.getCircle4()
            r0.setAlpha(r2)
        La7:
            int r0 = r6 + (-1)
            if (r5 <= r0) goto Lb3
            X.5Fw r0 = r4.getCircle3()
            r0.setAlpha(r2)
        Lb2:
            return
        Lb3:
            X.5Fw r0 = r4.getCircle3()
            r0.setAlpha(r1)
            goto Lb2
        Lbb:
            X.5Fw r0 = r4.getCircle4()
            r0.setAlpha(r1)
            goto La7
        Lc3:
            X.5Fw r0 = r4.getCircle1()
            r0.setAlpha(r1)
            r0 = 3
            if (r5 >= r0) goto Lce
            goto L95
        Lce:
            X.5Fw r0 = r4.getCircle0()
            r0.setAlpha(r1)
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57191McV.LJLI(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0099, code lost:
    
        r0.setAlpha(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a0, code lost:
    
        if (r2 != r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        r0 = getCircleMap().get(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b0, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        r0 = getCircleMap().get(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c0, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c2, code lost:
    
        r1 = r0.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cb, code lost:
    
        r1.height = X.C7MY.LIZIZ(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (r2 >= 6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0106, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        r0.setAlpha(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (r2 > r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        r1 = getCircleMap().get(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        r1.setAlpha(0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0082, code lost:
    
        if (r8 < 2) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        r0 = getCircleMap().get(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        r0.setAlpha(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0084, code lost:
    
        r0 = getCircleMap().get(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0092, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0094, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0096, code lost:
    
        if (r2 >= 6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(int r7, int r8) {
        /*
            r6 = this;
            X.5Fw r0 = r6.getCircle0()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r2)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r6.getCircle0()
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleX(r5)
            X.5Fw r0 = r6.getCircle0()
            r0.setScaleY(r5)
            X.5Fw r0 = r6.getCircle1()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            float r0 = X.C32151Nz.LJIIZILJ(r2)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r6.getCircle2()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            float r0 = X.C32151Nz.LJIIZILJ(r2)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r6.getCircle3()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            float r0 = X.C32151Nz.LJIIZILJ(r2)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r6.getCircle4()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            float r0 = X.C32151Nz.LJIIZILJ(r2)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.height = r0
            X.5Fw r0 = r6.getCircle4()
            r0.setScaleX(r5)
            X.5Fw r0 = r6.getCircle4()
            r0.setScaleY(r5)
            r0 = 2
            r4 = 0
            r3 = 6
            r2 = 1
            if (r8 >= r0) goto La0
        L84:
            java.util.Map r1 = r6.getCircleMap()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L99
        L94:
            int r2 = r2 + 1
            if (r2 >= r3) goto L9d
            goto L84
        L99:
            r0.setAlpha(r4)
            goto L94
        L9d:
            return
        L9e:
            if (r2 >= r3) goto L106
        La0:
            if (r2 != r7) goto Ld8
            java.util.Map r1 = r6.getCircleMap()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Ld4
        Lb2:
            java.util.Map r1 = r6.getCircleMap()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Lc8
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 != 0) goto Lcb
        Lc8:
            int r2 = r2 + 1
            goto L9e
        Lcb:
            r0 = 22
            int r0 = X.C7MY.LIZIZ(r0)
            r1.height = r0
            goto Lc8
        Ld4:
            r0.setAlpha(r5)
            goto Lb2
        Ld8:
            if (r2 > r8) goto Lf1
            java.util.Map r1 = r6.getCircleMap()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto Leb
            goto Lc8
        Leb:
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
            goto Lc8
        Lf1:
            java.util.Map r1 = r6.getCircleMap()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L102
            goto Lc8
        L102:
            r0.setAlpha(r4)
            goto Lc8
        L106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57191McV.LJLIIIL(int, int):void");
    }

    public final void LJLIIL(int i, int i2) {
        if (C90193gN.LIZ()) {
            TextView numberText = getNumberText();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i2);
            LIZ.append('/');
            LIZ.append(i);
            numberText.setText(X1D.LIZIZ(LIZ));
            return;
        }
        TextView numberText2 = getNumberText();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append('/');
        LIZ2.append(i2);
        numberText2.setText(X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57191McV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 674));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 675));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 676));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 677));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 678));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 680));
        this.LJLJL = 1;
        this.LJLJLLL = new PathInterpolator(0.25f, 0.0f, 0.25f, 1.0f);
        this.LJLL = "";
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 679));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ctt, this, true);
    }

    public final void LJJLL(int i, View view, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 12 * C7MY.LIZIZ(i), 0.0f);
        ofFloat.setInterpolator(this.LJLJLLL);
        ofFloat.setDuration(200L);
        if (z) {
            if (view != null) {
                view.setAlpha(1.0f);
            }
            ofFloat.start();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(C7MY.LIZIZ(12), C7MY.LIZIZ(22));
        ofInt.setInterpolator(this.LJLJLLL);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(view, 49));
        ofInt.start();
    }

    public final void LJJZZI(int i, View view, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 12 * C7MY.LIZIZ(i), 0.0f);
        ofFloat.setInterpolator(this.LJLJLLL);
        ofFloat.setDuration(200L);
        if (z) {
            if (view != null) {
                view.setAlpha(0.5f);
            }
            ofFloat.start();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(C7MY.LIZIZ(22), C7MY.LIZIZ(12));
        ofInt.setInterpolator(this.LJLJLLL);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(view, 50));
        ofInt.start();
    }

    public final void LJL(int i, int i2, String str) {
        boolean z;
        if (this.LJLL.length() == 0 || !o.LJ(this.LJLL, str)) {
            this.LJLL = str;
            z = true;
        } else {
            z = false;
        }
        int i3 = i - this.LJLJL;
        setTextVisibility(i2);
        LJLIIL(i, i2);
        if (i2 <= 5) {
            LJLIIIL(i, i2);
            if (!z && i3 != 0) {
                LJJLL(i3, getCircleMap().get(Integer.valueOf(i)), false);
                LJJZZI(i3, getCircleMap().get(Integer.valueOf(i - i3)), false);
            }
        } else {
            LJLI(i, i2);
            if (!z) {
                if (i3 > 0) {
                    LJJZ(i3, getCircle0());
                    LJJZZI(i3, getCircle1(), true);
                    LJJLL(i3, getCircle2(), true);
                    LJJZZIII(i3, getCircle3());
                    LJJLJLI(getCircle4());
                } else if (i3 < 0) {
                    LJJZ(i3, getCircle4());
                    LJJZZI(i3, getCircle3(), true);
                    LJJLL(i3, getCircle2(), true);
                    LJJZZIII(i3, getCircle1());
                    LJJLJLI(getCircle0());
                }
            }
        }
        this.LJLJL = i;
    }
}
