package X;

import Y.ARunnableS7S0101000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.84B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84B extends LinearLayout implements C7FF {
    public static final long LJLLILLLL;
    public SafeHandler LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final ArrayList<ImageView> LJLJL;
    public boolean LJLJLJ;
    public AnimatorSet LJLJLLL;
    public int LJLL;
    public final Paint LJLLI;

    @Override // X.C7FF
    public final void LIZ() {
        this.LJLJLJ = true;
    }

    static {
        long j;
        if (((Boolean) C84C.LIZ.getValue()).booleanValue()) {
            j = 100;
        } else {
            j = 200;
        }
        LJLLILLLL = j;
    }

    private final int getLastRealPos() {
        return this.LJLJJLL - 1;
    }

    private final int getLeftBoundPos() {
        return this.LJLJJI - this.LJLJJL;
    }

    public Rect getContentRect() {
        if (this.LJLJJLL <= 4) {
            int measuredWidth = ((int) (getMeasuredWidth() - C74275TDb.LIZ(72.0f))) / 2;
            return new Rect(measuredWidth, getPaddingTop(), getMeasuredWidth() - measuredWidth, getMeasuredHeight() - getPaddingBottom());
        }
        return new Rect(getPaddingStart(), getPaddingTop(), getMeasuredWidth() - getPaddingEnd(), getMeasuredHeight() - getPaddingBottom());
    }

    private final int getRightBoundPos() {
        return (getLeftBoundPos() + 6) - 1;
    }

    public final void LJ() {
        if (getLeftBoundPos() == 0) {
            LIZIZ(0);
        } else {
            LJFF(getLeftBoundPos(), LJLLILLLL);
        }
        if (getRightBoundPos() == getLastRealPos()) {
            LIZIZ(getLastRealPos());
        } else {
            LJFF(getRightBoundPos(), LJLLILLLL);
        }
    }

    public final void LIZIZ(int i) {
        if (i < this.LJLJL.size()) {
            ((ImageView) ListProtector.get(this.LJLJL, i)).setImageResource(R.drawable.aj9);
            ((View) ListProtector.get(this.LJLJL, i)).setAlpha(0.6f);
        }
    }

    public final ImageView LIZJ(int i) {
        if (i >= 0 && i < this.LJLJL.size()) {
            return (ImageView) ListProtector.get(this.LJLJL, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[LOOP:1: B:29:0x00a9->B:30:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r9) {
        /*
            r8 = this;
            int r0 = r8.LJLJJI
            if (r9 != r0) goto L5
            return
        L5:
            r5 = 0
            if (r9 < 0) goto Lc3
            int r0 = r8.LJLJJLL
            if (r9 >= r0) goto Lc3
            int r3 = r8.LJLJJLL
            r0 = 6
            r1 = 0
            if (r3 > r0) goto L31
            r8.LJLJJL = r9
        L15:
            int r0 = r8.LJLJJI
            android.widget.ImageView r3 = r8.LIZJ(r0)
            if (r3 == 0) goto L25
            LJI(r3, r1)
            long r0 = X.C84B.LJLLILLLL
            LJII(r3, r0)
        L25:
            android.widget.ImageView r2 = r8.LIZJ(r9)
            long r0 = X.C84B.LJLLILLLL
            LJI(r2, r0)
            r8.LJLJJI = r9
            return
        L31:
            r0 = 4
            if (r9 < 0) goto L74
            if (r9 >= r0) goto L42
            r8.LJLJJL = r9
            r3 = 0
        L39:
            r8.LIZIZ(r3)
            int r3 = r3 + 1
            r0 = 5
            if (r3 >= r0) goto L97
            goto L39
        L42:
            int r0 = r3 + (-3)
            if (r9 > r0) goto L74
            r0 = 3
            r8.LJLJJL = r0
            int r7 = r9 + (-3)
            int r6 = r8.LJLILLLLZI
            int r0 = r8.LJLJI
            int r6 = r6 + r0
            int r6 = r6 * r7
            long r3 = X.C84B.LJLLILLLL
            r8.LJFF(r7, r3)
            int r3 = r8.LJLJJLL
            int r0 = r3 + (-4)
            if (r9 > r0) goto L61
            int r3 = r9 + 2
            r8.LJFF(r3, r1)
        L61:
            r0 = r9
        L62:
            if (r0 >= r3) goto L6a
            r8.LIZIZ(r0)
            int r0 = r0 + 1
            goto L62
        L6a:
            int r0 = r7 + 1
        L6c:
            if (r0 >= r9) goto L9b
            r8.LIZIZ(r0)
            int r0 = r0 + 1
            goto L6c
        L74:
            int r0 = r3 + (-2)
            if (r9 >= r3) goto L9a
            if (r0 > r9) goto L9a
            int r7 = r3 + (-6)
            int r6 = r8.LJLILLLLZI
            int r0 = r8.LJLJI
            int r6 = r6 + r0
            int r6 = r6 * r7
            int r0 = r9 - r7
            r8.LJLJJL = r0
            long r3 = X.C84B.LJLLILLLL
            r8.LJFF(r7, r3)
            int r3 = r8.LJLJJLL
            int r0 = r3 + (-5)
        L8f:
            if (r0 >= r3) goto L9b
            r8.LIZIZ(r0)
            int r0 = r0 + 1
            goto L8f
        L97:
            r8.LJFF(r0, r1)
        L9a:
            r6 = 0
        L9b:
            android.content.Context r0 = r8.getContext()
            boolean r0 = X.C90193gN.LIZIZ(r0)
            if (r0 == 0) goto Lc1
        La5:
            r8.LJLL = r6
            int r4 = r8.LJLJJLL
        La9:
            if (r5 >= r4) goto L15
            java.util.ArrayList<android.widget.ImageView> r0 = r8.LJLJL
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            java.lang.String r0 = "dotArray[i]"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            android.view.View r3 = (android.view.View) r3
            int r0 = r8.LJLL
            float r0 = (float) r0
            r3.setTranslationX(r0)
            int r5 = r5 + 1
            goto La9
        Lc1:
            int r6 = -r6
            goto La5
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84B.LIZLLL(int):void");
    }

    public final void LJIIIIZZ(boolean z) {
        AnimatorSet animatorSet = this.LJLJLLL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLJLLL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int i = this.LJLJJLL;
            for (int i2 = 0; i2 < i; i2++) {
                ((View) ListProtector.get(this.LJLJL, i2)).setTranslationX(this.LJLL);
            }
        }
        this.LJLJLLL = new AnimatorSet();
        int i3 = this.LJLJI + this.LJLILLLLZI;
        if (z) {
            i3 = -i3;
        }
        if (C90193gN.LIZ()) {
            i3 = -i3;
        }
        this.LJLL += i3;
        int i4 = this.LJLJJLL;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = ListProtector.get(this.LJLJL, i5);
            o.LJIIIIZZ(obj, "dotArray[i]");
            View view = (View) obj;
            AnimatorSet animatorSet3 = this.LJLJLLL;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), this.LJLL));
            }
        }
        AnimatorSet animatorSet4 = this.LJLJLLL;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(LJLLILLLL);
        }
        AnimatorSet animatorSet5 = this.LJLJLLL;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLJLJ && Build.VERSION.SDK_INT >= 28 && canvas != null) {
            canvas.drawRect(getContentRect(), this.LJLLI);
        }
    }

    @Override // X.C7FF
    public void setCount(int i) {
        int i2;
        int i3;
        if (i <= 1) {
            return;
        }
        SafeHandler safeHandler = this.LJLIL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
        this.LJLJJL = 0;
        this.LJLJJLL = i;
        if (i >= 6) {
            i2 = this.LJLILLLLZI * 6;
            i3 = this.LJLJI * 5;
        } else {
            i2 = this.LJLILLLLZI * i;
            i3 = (i - 1) * this.LJLJI;
        }
        int i4 = i3 + i2;
        if (this.LJLJLJ) {
            int LIZ = (int) C74275TDb.LIZ(49.0f);
            int LIZ2 = (int) C74275TDb.LIZ(66.0f);
            setPadding(LIZ2, LIZ, LIZ2, LIZ);
        } else {
            setPadding(0, 0, 0, 0);
        }
        getLayoutParams().width = getPaddingEnd() + getPaddingStart() + i4;
        getLayoutParams().height = getPaddingBottom() + getPaddingTop() + this.LJLILLLLZI;
        if (this.LJLJL.size() < i) {
            int size = this.LJLJL.size();
            for (int i5 = 0; i5 < size; i5++) {
                LIZIZ(i5);
            }
            for (int size2 = this.LJLJL.size(); size2 < i; size2++) {
                int i6 = this.LJLILLLLZI;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
                if (size2 > 0) {
                    if (C90193gN.LIZIZ(getContext())) {
                        layoutParams.setMargins(0, 0, this.LJLJI, 0);
                    } else {
                        layoutParams.setMargins(this.LJLJI, 0, 0, 0);
                    }
                }
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(R.drawable.aj9);
                imageView.setAlpha(0.6f);
                imageView.setLayoutParams(layoutParams);
                addView(imageView);
                this.LJLJL.add(imageView);
            }
        } else {
            int size3 = this.LJLJL.size();
            for (int i7 = i; i7 < size3; i7++) {
                ImageView LIZJ = LIZJ(i7);
                if (C78996UzQ.LJJIIJZLJL(LIZJ)) {
                    C78996UzQ.LJI();
                }
                removeView(LIZJ);
                C65777Prh.LIZ(this.LJLJL).remove(LIZJ);
            }
            int size4 = this.LJLJL.size();
            for (int i8 = 0; i8 < size4; i8++) {
                LIZIZ(i8);
            }
        }
        int i9 = this.LJLJJI;
        if (i9 != 0) {
            LJII(LIZJ(i9), 0L);
        }
        this.LJLJJI = 0;
        LJI(LIZJ(0), 0L);
        if (i > 6) {
            LJFF(5, 0L);
        }
    }

    @Override // X.C7FF
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (this.LJLIL == null) {
            this.LJLIL = new SafeHandler(lifecycleOwner);
        }
    }

    @Override // X.C7FF
    public void setSelectedIndex(int i) {
        boolean z;
        int i2 = this.LJLJJI;
        if (i == i2) {
            return;
        }
        boolean z2 = false;
        if (i >= 0 && i < this.LJLJJLL) {
            if (this.LJLJJLL <= 6) {
                if (Math.abs(i - i2) == 1) {
                    if (i > this.LJLJJI) {
                        ImageView LIZJ = LIZJ(this.LJLJJL);
                        long j = LJLLILLLL;
                        LJII(LIZJ, j);
                        LJI(LIZJ(this.LJLJJI + 1), j);
                        this.LJLJJI++;
                        this.LJLJJL++;
                        return;
                    }
                    ImageView LIZJ2 = LIZJ(this.LJLJJL);
                    long j2 = LJLLILLLL;
                    LJII(LIZJ2, j2);
                    LJI(LIZJ(this.LJLJJI - 1), j2);
                    this.LJLJJI--;
                    this.LJLJJL--;
                    return;
                }
                LIZLLL(i);
                return;
            }
            if (Math.abs(i - i2) == 1) {
                if (i > this.LJLJJI) {
                    if (getLastRealPos() - getRightBoundPos() > 0) {
                        z2 = true;
                    }
                    ImageView LIZJ3 = LIZJ(this.LJLJJI);
                    long j3 = LJLLILLLL;
                    LJII(LIZJ3, j3);
                    this.LJLJJI++;
                    int i3 = this.LJLJJL;
                    if (i3 >= 4 && z2) {
                        LJIIIIZZ(true);
                        LJ();
                    } else {
                        this.LJLJJL = i3 + 1;
                    }
                    LJI(LIZJ(this.LJLJJI), j3);
                    return;
                }
                if (getLeftBoundPos() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                ImageView LIZJ4 = LIZJ(this.LJLJJI);
                long j4 = LJLLILLLL;
                LJII(LIZJ4, j4);
                this.LJLJJI--;
                int i4 = this.LJLJJL;
                if (i4 <= 1 && z) {
                    LJIIIIZZ(false);
                    LJ();
                } else {
                    this.LJLJJL = i4 - 1;
                }
                LJI(LIZJ(this.LJLJJI), j4);
                return;
            }
            LIZLLL(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLJL = new ArrayList<>();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        paint.setAlpha(178);
        paint.setMaskFilter(new BlurMaskFilter(Float.valueOf(C74275TDb.LIZIZ(context, 48.0f)).floatValue(), BlurMaskFilter.Blur.NORMAL));
        this.LJLLI = paint;
        this.LJLILLLLZI = C17N.LJIILL(6.0d);
        this.LJLJI = C17N.LJIILL(6.0d);
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public static void LJI(ImageView imageView, long j) {
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(R.drawable.aj9);
        if (((Boolean) C84C.LIZ.getValue()).booleanValue()) {
            imageView.setAlpha(1.0f);
            return;
        }
        imageView.setAlpha(0.6f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", 0.6f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    public static void LJII(ImageView imageView, long j) {
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(R.drawable.aj9);
        if (((Boolean) C84C.LIZ.getValue()).booleanValue()) {
            imageView.setAlpha(0.6f);
            return;
        }
        imageView.setAlpha(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.6f);
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    public final void LJFF(int i, long j) {
        if (j <= 0) {
            if (i < this.LJLJL.size()) {
                ((View) ListProtector.get(this.LJLJL, i)).setAlpha(1.0f);
                ((ImageView) ListProtector.get(this.LJLJL, i)).setImageResource(R.drawable.aj_);
                return;
            }
            return;
        }
        SafeHandler safeHandler = this.LJLIL;
        if (safeHandler == null) {
            return;
        }
        safeHandler.postDelayed(new ARunnableS7S0101000_3(i, this, 7), j);
    }
}
