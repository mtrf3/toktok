package X;

import Y.IDRunnableS85S0100000;
import Y.IDrS40S0100000;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29031Bz extends AbstractC030309z implements C0A5 {
    public static final int[] LLIFFJFJJ = {R.attr.state_pressed};
    public static final int[] LLII = new int[0];
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final StateListDrawable LJLJI;
    public final Drawable LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final StateListDrawable LJLJL;
    public final Drawable LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public RecyclerView LJZI;
    public boolean LJZL;
    public boolean LL;
    public int LLD;
    public int LLF;
    public final int[] LLFF = new int[2];
    public final int[] LLFFF = new int[2];
    public final ValueAnimator LLFII;
    public int LLFZ;
    public final IDRunnableS85S0100000 LLI;

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    public final void LJIIJ() {
        int i = this.LLFZ;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.LLFII.cancel();
            }
        }
        this.LLFZ = 1;
        ValueAnimator valueAnimator = this.LLFII;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.LLFII.setDuration(500L);
        this.LLFII.setStartDelay(0L);
        this.LLFII.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r5) {
        /*
            r4 = this;
            r2 = 2
            if (r5 != r2) goto L4e
            int r0 = r4.LLD
            if (r0 == r2) goto L15
            android.graphics.drawable.StateListDrawable r1 = r4.LJLJI
            int[] r0 = X.C29031Bz.LLIFFJFJJ
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.LJZI
            Y.IDRunnableS85S0100000 r0 = r4.LLI
            r1.removeCallbacks(r0)
        L15:
            r4.LJIIJ()
        L18:
            int r0 = r4.LLD
            if (r0 != r2) goto L39
            if (r5 == r2) goto L36
            android.graphics.drawable.StateListDrawable r1 = r4.LJLJI
            int[] r0 = X.C29031Bz.LLII
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.LJZI
            Y.IDRunnableS85S0100000 r0 = r4.LLI
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r4.LJZI
            Y.IDRunnableS85S0100000 r2 = r4.LLI
            r0 = 1200(0x4b0, float:1.682E-42)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L36:
            r4.LLD = r5
            return
        L39:
            r0 = 1
            if (r5 != r0) goto L36
            androidx.recyclerview.widget.RecyclerView r1 = r4.LJZI
            Y.IDRunnableS85S0100000 r0 = r4.LLI
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r4.LJZI
            Y.IDRunnableS85S0100000 r2 = r4.LLI
            r0 = 1500(0x5dc, float:2.102E-42)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L36
        L4e:
            if (r5 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r4.LJZI
            r0.invalidate()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29031Bz.LJIIIZ(int):void");
    }

    @Override // X.C0A5
    public final void LIZ(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.LLD == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean LJIIIIZZ = LJIIIIZZ(motionEvent.getX(), motionEvent.getY());
            boolean LJII = LJII(motionEvent.getX(), motionEvent.getY());
            if (!LJIIIIZZ) {
                if (!LJII) {
                    return;
                }
            } else if (!LJII) {
                if (LJIIIIZZ) {
                    this.LLF = 2;
                    this.LJLLJ = (int) motionEvent.getY();
                }
                LJIIIZ(2);
                return;
            }
            this.LLF = 1;
            this.LJLLLLLL = (int) motionEvent.getX();
            LJIIIZ(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.LLD == 2) {
            this.LJLLJ = 0.0f;
            this.LJLLLLLL = 0.0f;
            LJIIIZ(1);
            this.LLF = 0;
            return;
        }
        if (motionEvent.getAction() != 2 || this.LLD != 2) {
            return;
        }
        LJIIJ();
        if (this.LLF == 1) {
            float x = motionEvent.getX();
            int[] iArr = this.LLFFF;
            int i = this.LJLILLLLZI;
            iArr[0] = i;
            int i2 = this.LJLZ - i;
            iArr[1] = i2;
            float max = Math.max(i, Math.min(i2, x));
            if (Math.abs(this.LJLLLL - max) >= 2.0f) {
                float f = this.LJLLLLLL;
                int computeHorizontalScrollRange = this.LJZI.computeHorizontalScrollRange();
                int computeHorizontalScrollOffset = this.LJZI.computeHorizontalScrollOffset();
                int i3 = this.LJLZ;
                int i4 = iArr[1] - iArr[0];
                if (i4 != 0) {
                    int i5 = computeHorizontalScrollRange - i3;
                    int i6 = (int) (((max - f) / i4) * i5);
                    int i7 = computeHorizontalScrollOffset + i6;
                    if (i7 < i5 && i7 >= 0 && i6 != 0) {
                        this.LJZI.scrollBy(i6, 0);
                    }
                }
                this.LJLLLLLL = max;
            }
        }
        if (this.LLF != 2) {
            return;
        }
        float y = motionEvent.getY();
        int[] iArr2 = this.LLFF;
        int i8 = this.LJLILLLLZI;
        iArr2[0] = i8;
        int i9 = this.LJZ - i8;
        iArr2[1] = i9;
        float max2 = Math.max(i8, Math.min(i9, y));
        if (Math.abs(this.LJLLILLLL - max2) < 2.0f) {
            return;
        }
        float f2 = this.LJLLJ;
        int computeVerticalScrollRange = this.LJZI.computeVerticalScrollRange();
        int computeVerticalScrollOffset = this.LJZI.computeVerticalScrollOffset();
        int i10 = this.LJZ;
        int i11 = iArr2[1] - iArr2[0];
        if (i11 != 0) {
            int i12 = computeVerticalScrollRange - i10;
            int i13 = (int) (((max2 - f2) / i11) * i12);
            int i14 = computeVerticalScrollOffset + i13;
            if (i14 < i12 && i14 >= 0 && i13 != 0) {
                this.LJZI.scrollBy(0, i13);
            }
        }
        this.LJLLJ = max2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r1 != false) goto L8;
     */
    @Override // X.C0A5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(androidx.recyclerview.widget.RecyclerView r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r5.LLD
            r4 = 2
            r3 = 1
            if (r0 != r3) goto L46
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r2 = r5.LJIIIIZZ(r1, r0)
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r1 = r5.LJII(r1, r0)
            int r0 = r7.getAction()
            if (r0 != 0) goto L49
            if (r2 != 0) goto L36
            if (r1 == 0) goto L49
        L28:
            r5.LLF = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            r5.LJLLLLLL = r0
        L32:
            r5.LJIIIZ(r4)
        L35:
            return r3
        L36:
            if (r1 == 0) goto L39
            goto L28
        L39:
            if (r2 == 0) goto L32
            r5.LLF = r4
            float r0 = r7.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r5.LJLLJ = r0
            goto L32
        L46:
            if (r0 != r4) goto L49
            goto L35
        L49:
            r3 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29031Bz.LIZJ(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public final boolean LJII(float f, float f2) {
        if (f2 >= this.LJZ - this.LJLJLLL) {
            int i = this.LJLLLL;
            int i2 = this.LJLLL;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIIIZZ(float f, float f2) {
        if (C16310kV.LIZLLL(this.LJZI) == 1) {
            if (f > this.LJLJJL) {
                return false;
            }
        } else if (f < this.LJLZ - this.LJLJJL) {
            return false;
        }
        int i = this.LJLLILLLL;
        int i2 = this.LJLLI / 2;
        if (f2 < i - i2 || f2 > i2 + i) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC030309z
    public final void LJI(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        if (this.LJLZ != this.LJZI.getWidth() || this.LJZ != this.LJZI.getHeight()) {
            this.LJLZ = this.LJZI.getWidth();
            this.LJZ = this.LJZI.getHeight();
            LJIIIZ(0);
            return;
        }
        if (this.LLFZ != 0) {
            if (this.LJZL) {
                int i = this.LJLZ;
                int i2 = this.LJLJJL;
                int i3 = i - i2;
                int i4 = this.LJLLILLLL;
                int i5 = this.LJLLI;
                int i6 = i4 - (i5 / 2);
                this.LJLJI.setBounds(0, 0, i2, i5);
                this.LJLJJI.setBounds(0, 0, this.LJLJJLL, this.LJZ);
                if (C16310kV.LIZLLL(this.LJZI) == 1) {
                    this.LJLJJI.draw(canvas);
                    canvas.translate(this.LJLJJL, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.LJLJI.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.LJLJJL, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.LJLJJI.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.LJLJI.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.LL) {
                int i7 = this.LJZ;
                int i8 = this.LJLJLLL;
                int i9 = this.LJLLLL;
                int i10 = this.LJLLL;
                this.LJLJL.setBounds(0, 0, i10, i8);
                this.LJLJLJ.setBounds(0, 0, this.LJLZ, this.LJLL);
                canvas.translate(0.0f, i7 - i8);
                this.LJLJLJ.draw(canvas);
                canvas.translate(i9 - (i10 / 2), 0.0f);
                this.LJLJL.draw(canvas);
                canvas.translate(-r6, -r5);
            }
        }
    }

    public C29031Bz(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLFII = ofFloat;
        this.LLFZ = 0;
        IDRunnableS85S0100000 iDRunnableS85S0100000 = new IDRunnableS85S0100000(this, 27);
        this.LLI = iDRunnableS85S0100000;
        IDrS40S0100000 iDrS40S0100000 = new IDrS40S0100000(this, 0);
        this.LJLJI = stateListDrawable;
        this.LJLJJI = drawable;
        this.LJLJL = stateListDrawable2;
        this.LJLJLJ = drawable2;
        this.LJLJJL = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.LJLJJLL = Math.max(i, drawable.getIntrinsicWidth());
        this.LJLJLLL = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.LJLL = Math.max(i, drawable2.getIntrinsicWidth());
        this.LJLIL = i2;
        this.LJLILLLLZI = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0At
            public boolean LJLIL;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LJLIL = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (this.LJLIL) {
                    this.LJLIL = false;
                    return;
                }
                if (((Float) C29031Bz.this.LLFII.getAnimatedValue()).floatValue() == 0.0f) {
                    C29031Bz c29031Bz = C29031Bz.this;
                    c29031Bz.LLFZ = 0;
                    c29031Bz.LJIIIZ(0);
                } else {
                    C29031Bz c29031Bz2 = C29031Bz.this;
                    c29031Bz2.LLFZ = 2;
                    c29031Bz2.LJZI.invalidate();
                }
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Au
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C29031Bz.this.LJLJI.setAlpha(floatValue);
                C29031Bz.this.LJLJJI.setAlpha(floatValue);
                C29031Bz.this.LJZI.invalidate();
            }
        });
        RecyclerView recyclerView2 = this.LJZI;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.LJJLIL(this);
            this.LJZI.LJJLJLI(this);
            this.LJZI.LJJLL(iDrS40S0100000);
            this.LJZI.removeCallbacks(iDRunnableS85S0100000);
        }
        this.LJZI = recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.LJII(this, -1);
        this.LJZI.LJIIJ(this);
        this.LJZI.LJIIJJI(iDrS40S0100000);
    }
}
