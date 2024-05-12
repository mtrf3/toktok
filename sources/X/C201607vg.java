package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201607vg extends ConstraintLayout {
    public Float LJLIL;
    public ValueAnimator LJLILLLLZI;
    public final int LJLJI;
    public final float LJLJJI;
    public EnumC201617vh LJLJJL;
    public Float LJLJJLL;
    public Float LJLJL;
    public final double LJLJLJ;
    public final double LJLJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLL;
    public final Object LJLLI;

    public final int getPatientLeftMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public final boolean LJJLJLI(boolean z) {
        int i;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i2 = iArr[0];
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            i2 = -i2;
        }
        if (z) {
            i = ((int) this.LJLJLJ) * 2;
        } else {
            i = 0;
        }
        if (i2 <= this.LJLJLLL + i) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C203007xw c203007xw = (C203007xw) findViewById(R.id.hp0);
        if (c203007xw == null || !c203007xw.LLJJJJ || c203007xw.getCurrentItem() == 0) {
            if (motionEvent != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 2) {
                        EnumC201617vh enumC201617vh = this.LJLJJL;
                        EnumC201617vh enumC201617vh2 = EnumC201617vh.HORIZONTAL;
                        if (enumC201617vh == enumC201617vh2) {
                            return true;
                        }
                        EnumC201617vh enumC201617vh3 = EnumC201617vh.VERTICAL;
                        if (enumC201617vh == enumC201617vh3) {
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                        Float f = this.LJLJJLL;
                        if (f != null) {
                            if (Math.abs(motionEvent.getRawX() - f.floatValue()) > this.LJLJI) {
                                this.LJLJJL = enumC201617vh2;
                                return super.onInterceptTouchEvent(motionEvent);
                            }
                        }
                        Float f2 = this.LJLJL;
                        if (f2 != null) {
                            if (Math.abs(motionEvent.getRawY() - f2.floatValue()) > this.LJLJI) {
                                this.LJLJJL = enumC201617vh3;
                                return super.onInterceptTouchEvent(motionEvent);
                            }
                        }
                    }
                } else {
                    this.LJLJJL = EnumC201617vh.NONE;
                    this.LJLJJLL = Float.valueOf(motionEvent.getRawX());
                    this.LJLJL = Float.valueOf(motionEvent.getRawY());
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Ld
            int r0 = r5.getAction()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L72
            if (r0 == r1) goto L12
        Ld:
            boolean r0 = super.onTouchEvent(r5)
            return r0
        L12:
            X.7vh r1 = r4.LJLJJL
            X.7vh r0 = X.EnumC201617vh.HORIZONTAL
            if (r1 != r0) goto Ld
            java.lang.Float r0 = r4.LJLIL
            if (r0 == 0) goto L67
            float r3 = r0.floatValue()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "PrevX:"
            r1.append(r0)
            int r0 = (int) r3
            r1.append(r0)
            java.lang.String r0 = " | CurrX:"
            r1.append(r0)
            float r0 = r5.getRawX()
            int r0 = (int) r0
            r1.append(r0)
            java.lang.String r0 = " | Diff:"
            r1.append(r0)
            float r0 = r5.getRawX()
            float r0 = r0 - r3
            int r0 = (int) r0
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            float r1 = r5.getRawX()
            float r1 = r1 - r3
            float r0 = r5.getRawX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.LJLIL = r0
            r4.LJJLL(r1, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Ld
        L67:
            float r0 = r5.getRawX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.LJLIL = r0
            goto Ld
        L72:
            r4.LJLIL = r3
            r0 = 0
            boolean r0 = r4.LJJLJLI(r0)
            if (r0 == 0) goto L91
            java.lang.Object r1 = r4.LJLLI
            monitor-enter(r1)
            X.Pro<X.UCe> r0 = r4.LJLL     // Catch: java.lang.Throwable -> Le1
            if (r0 == 0) goto L85
            r0.invoke()     // Catch: java.lang.Throwable -> Le1
        L85:
            r4.LJLL = r3     // Catch: java.lang.Throwable -> Le1
            android.animation.ValueAnimator r0 = r4.LJLILLLLZI     // Catch: java.lang.Throwable -> Le1
            if (r0 == 0) goto L8e
            r0.cancel()     // Catch: java.lang.Throwable -> Le1
        L8e:
            monitor-exit(r1)
            goto Ld
        L91:
            android.animation.ValueAnimator r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L98
            r0.cancel()
        L98:
            float[] r0 = new float[r1]
            r0 = {x00e4: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r4.LJLILLLLZI = r0
            int r3 = r4.getPatientLeftMargin()
            android.animation.ValueAnimator r2 = r4.LJLILLLLZI
            if (r2 != 0) goto Lda
        Lab:
            android.animation.ValueAnimator r1 = r4.LJLILLLLZI
            if (r1 != 0) goto Ld1
        Laf:
            android.animation.ValueAnimator r2 = r4.LJLILLLLZI
            if (r2 == 0) goto Lbc
            Y.AUListenerS67S0101000_3 r1 = new Y.AUListenerS67S0101000_3
            r0 = 6
            r1.<init>(r3, r4, r0)
            r2.addUpdateListener(r1)
        Lbc:
            android.animation.ValueAnimator r1 = r4.LJLILLLLZI
            if (r1 == 0) goto Lc8
            X.7vi r0 = new X.7vi
            r0.<init>()
            r1.addListener(r0)
        Lc8:
            android.animation.ValueAnimator r0 = r4.LJLILLLLZI
            if (r0 == 0) goto Ld
            r0.start()
            goto Ld
        Ld1:
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            goto Laf
        Lda:
            r0 = 200(0xc8, float:2.8E-43)
            long r0 = (long) r0
            r2.setDuration(r0)
            goto Lab
        Le1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201607vg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLeftCallback(InterfaceC65784Pro<C76800UCe> leftLambda) {
        o.LJIIIZ(leftLambda, "leftLambda");
        this.LJLL = leftLambda;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C201607vg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJI = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LJLJJI = 1.0f;
        this.LJLJJL = EnumC201617vh.NONE;
        double LJIIJJI = KL2.LJIIJJI(getContext()) * 0.08d;
        this.LJLJLJ = LJIIJJI;
        this.LJLJLLL = LJIIJJI;
        this.LJLLI = new Object();
    }

    public final void LJJLL(float f, boolean z) {
        int i;
        int i2 = (int) (f * this.LJLJJI);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            i = -i2;
        } else {
            i = i2;
        }
        if ((z && i < 0) || LJJLJLI(true)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.leftMargin + i2;
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.rightMargin = -i3;
        setLayoutParams(marginLayoutParams);
    }
}
