package X;

import Y.ARunnableS7S0101000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.84E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84E extends LinearLayout {
    public SafeHandler LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final int LJLJJLL;
    public int LJLJL;
    public final ArrayList<ImageView> LJLJLJ;
    public AnimatorSet LJLJLLL;
    public int LJLL;
    public final Paint LJLLI;

    private final Rect getContentRect() {
        if (this.LJLJL <= 4) {
            int measuredWidth = ((int) (getMeasuredWidth() - C74275TDb.LIZ(72.0f))) / 2;
            return new Rect(measuredWidth, getPaddingTop(), getMeasuredWidth() - measuredWidth, getMeasuredHeight() - getPaddingBottom());
        }
        return new Rect(getPaddingStart(), getPaddingTop(), getMeasuredWidth() - getPaddingEnd(), getMeasuredHeight() - getPaddingBottom());
    }

    public final void LIZ(int i) {
        ((ImageView) ListProtector.get(this.LJLJLJ, i)).setImageResource(R.drawable.uk);
    }

    public final TransitionDrawable LIZJ(int i) {
        if (i >= 0 && i < this.LJLJL) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LJLJLJ, i)).getDrawable();
            if (drawable instanceof TransitionDrawable) {
                return (TransitionDrawable) drawable;
            }
            ((ImageView) ListProtector.get(this.LJLJLJ, i)).setImageResource(R.drawable.uk);
            Drawable drawable2 = ((ImageView) ListProtector.get(this.LJLJLJ, i)).getDrawable();
            o.LJII(drawable2, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
            return (TransitionDrawable) drawable2;
        }
        return null;
    }

    public final void LIZLLL(int i) {
        boolean z;
        int i2;
        float x;
        int paddingStart;
        if (i == this.LJLJJI) {
            return;
        }
        if (i >= 0 && i < this.LJLJL) {
            int i3 = this.LJLJL;
            int i4 = this.LJLJJLL;
            if (i3 <= i4) {
                this.LJLJJL = i;
            } else {
                int i5 = i3 - (i4 - 1);
                if (i < i3 && i5 <= i) {
                    int i6 = i3 - i4;
                    i2 = (this.LJLILLLLZI + this.LJLJI) * i6;
                    this.LJLJJL = (i - i3) - i4;
                    LIZIZ(this, i6, true);
                    int i7 = this.LJLJL;
                    for (int i8 = i7 - (this.LJLJJLL - 1); i8 < i7; i8++) {
                        LIZ(i8);
                    }
                } else {
                    if (2 <= i) {
                        if (i < i5) {
                            z = true;
                        }
                        i2 = 0;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.LJLJJL = 1;
                        int i9 = i - 1;
                        i2 = (this.LJLILLLLZI + this.LJLJI) * i9;
                        int i10 = i4 + i9;
                        LIZIZ(this, i9, true);
                        SafeHandler safeHandler = this.LJLIL;
                        if (safeHandler != null) {
                            safeHandler.postDelayed(new ARunnableS7S0101000_3(i10, this, 14), 0L);
                        }
                        for (int i11 = i; i11 < i10; i11++) {
                            LIZ(i11);
                        }
                    } else {
                        if (i >= 0 && i < 2) {
                            this.LJLJJL = i;
                            this.LJLL = 0;
                            int i12 = i4 - 1;
                            for (int i13 = 0; i13 < i12; i13++) {
                                LIZ(i13);
                            }
                            int i14 = this.LJLJJLL - 1;
                            SafeHandler safeHandler2 = this.LJLIL;
                            if (safeHandler2 != null) {
                                safeHandler2.postDelayed(new ARunnableS7S0101000_3(i14, this, 14), 0L);
                            }
                        }
                        i2 = 0;
                    }
                }
                if (C90193gN.LIZIZ(getContext())) {
                    x = ((View) ListProtector.get(this.LJLJLJ, 0)).getX();
                    paddingStart = (getLayoutParams().width - this.LJLILLLLZI) - getPaddingEnd();
                } else {
                    x = ((View) ListProtector.get(this.LJLJLJ, 0)).getX();
                    paddingStart = getPaddingStart();
                }
                float f = x - paddingStart;
                int i15 = this.LJLJL;
                for (int i16 = 0; i16 < i15; i16++) {
                    Object obj = ListProtector.get(this.LJLJLJ, i16);
                    o.LJIIIIZZ(obj, "dotArray[i]");
                    View view = (View) obj;
                    view.setX((view.getX() - i2) - f);
                }
            }
            TransitionDrawable LIZJ = LIZJ(this.LJLJJI);
            if (LIZJ != null) {
                LIZJ.reverseTransition(200);
            }
            TransitionDrawable LIZJ2 = LIZJ(i);
            if (LIZJ2 != null) {
                LIZJ2.startTransition(200);
            }
            this.LJLJJI = i;
        }
    }

    public final void LJ(boolean z) {
        AnimatorSet animatorSet = this.LJLJLLL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLJLLL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int i = this.LJLJL;
            for (int i2 = 0; i2 < i; i2++) {
                ((View) ListProtector.get(this.LJLJLJ, i2)).setTranslationX(this.LJLL);
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
        int i4 = this.LJLJL;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = ListProtector.get(this.LJLJLJ, i5);
            o.LJIIIIZZ(obj, "dotArray[i]");
            View view = (View) obj;
            AnimatorSet animatorSet3 = this.LJLJLLL;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), this.LJLL));
            }
        }
        AnimatorSet animatorSet4 = this.LJLJLLL;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(200L);
        }
        AnimatorSet animatorSet5 = this.LJLJLLL;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawRect(getContentRect(), this.LJLLI);
        }
    }

    public void setCount(int i) {
        int i2;
        if (i <= 1) {
            return;
        }
        SafeHandler safeHandler = this.LJLIL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
        removeAllViews();
        this.LJLJLJ.clear();
        this.LJLJJL = 0;
        this.LJLJJI = 0;
        this.LJLJL = i;
        int i3 = this.LJLJJLL;
        if (i >= i3) {
            i2 = ((i3 - 1) * this.LJLJI) + (this.LJLILLLLZI * i3);
        } else {
            i2 = ((i - 1) * this.LJLJI) + (this.LJLILLLLZI * i);
        }
        getLayoutParams().width = getPaddingEnd() + getPaddingStart() + i2;
        getLayoutParams().height = getPaddingBottom() + getPaddingTop() + this.LJLILLLLZI;
        int i4 = 0;
        do {
            int i5 = this.LJLILLLLZI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
            if (i4 > 0) {
                if (C90193gN.LIZIZ(getContext())) {
                    layoutParams.setMargins(0, 0, this.LJLJI, 0);
                } else {
                    layoutParams.setMargins(this.LJLJI, 0, 0, 0);
                }
            }
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.uk);
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
            this.LJLJLJ.add(imageView);
            i4++;
        } while (i4 < i);
        TransitionDrawable LIZJ = LIZJ(0);
        if (LIZJ != null) {
            LIZJ.startTransition(0);
        }
        int i6 = this.LJLJJLL;
        if (i > i6) {
            LIZIZ(this, i6 - 1, false);
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (this.LJLIL == null) {
            this.LJLIL = new SafeHandler(lifecycleOwner);
        }
    }

    public final void setSelectedIndex(int i) {
        int i2 = this.LJLJJI;
        if (i != i2 && i >= 0 && i < this.LJLJL) {
            if (this.LJLJL <= this.LJLJJLL) {
                if (Math.abs(i - i2) == 1) {
                    if (i > this.LJLJJI) {
                        TransitionDrawable LIZJ = LIZJ(this.LJLJJL);
                        if (LIZJ != null) {
                            LIZJ.reverseTransition(200);
                        }
                        TransitionDrawable LIZJ2 = LIZJ(this.LJLJJI + 1);
                        if (LIZJ2 != null) {
                            LIZJ2.startTransition(200);
                        }
                        this.LJLJJI++;
                        this.LJLJJL++;
                        return;
                    }
                    TransitionDrawable LIZJ3 = LIZJ(this.LJLJJL);
                    if (LIZJ3 != null) {
                        LIZJ3.reverseTransition(200);
                    }
                    TransitionDrawable LIZJ4 = LIZJ(this.LJLJJI - 1);
                    if (LIZJ4 != null) {
                        LIZJ4.startTransition(200);
                    }
                    this.LJLJJI--;
                    this.LJLJJL--;
                    return;
                }
                LIZLLL(i);
                return;
            }
            if (Math.abs(i - i2) == 1) {
                int i3 = this.LJLJJI;
                if (i > i3) {
                    int i4 = this.LJLJJLL / 2;
                    int i5 = this.LJLJJL;
                    if (i5 == i4 && i3 != this.LJLJL - i4) {
                        LJ(true);
                        int i6 = this.LJLJJI;
                        if (i6 != (this.LJLJL - i4) - 1) {
                            LIZIZ(this, i6 + i4, false);
                        }
                        LIZ(((this.LJLJJLL - i4) - 1) + this.LJLJJI);
                        LIZIZ(this, this.LJLJJI - (i4 - 1), true);
                    } else {
                        this.LJLJJL = i5 + 1;
                    }
                    TransitionDrawable LIZJ5 = LIZJ(this.LJLJJI);
                    if (LIZJ5 != null) {
                        LIZJ5.reverseTransition(200);
                    }
                    TransitionDrawable LIZJ6 = LIZJ(this.LJLJJI + 1);
                    if (LIZJ6 != null) {
                        LIZJ6.startTransition(200);
                    }
                    this.LJLJJI++;
                    return;
                }
                int i7 = this.LJLJJLL / 2;
                int i8 = this.LJLJJL;
                if (i8 == i7 && i3 != i7) {
                    LJ(false);
                    if (this.LJLJJI != i7 + 1) {
                        LIZIZ(this, (r1 - i7) - 1, true);
                    }
                    LIZ(this.LJLJJI - i7);
                    LIZIZ(this, (this.LJLJJI + i7) - 2, false);
                } else {
                    this.LJLJJL = i8 - 1;
                }
                TransitionDrawable LIZJ7 = LIZJ(this.LJLJJI);
                if (LIZJ7 != null) {
                    LIZJ7.reverseTransition(200);
                }
                TransitionDrawable LIZJ8 = LIZJ(this.LJLJJI - 1);
                if (LIZJ8 != null) {
                    LIZJ8.startTransition(200);
                }
                this.LJLJJI--;
                return;
            }
            LIZLLL(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        this.LJLJJLL = 6;
        this.LJLJLJ = new ArrayList<>();
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setColor(ColorProtector.parseColor("#B2000000"));
        o.LJI(context);
        LIZIZ.setMaskFilter(new BlurMaskFilter(C74275TDb.LIZIZ(context, 48.0f), BlurMaskFilter.Blur.NORMAL));
        this.LJLLI = LIZIZ;
        this.LJLILLLLZI = C17N.LJIILL(6.0d);
        this.LJLJI = C17N.LJIILL(6.0d);
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    public static void LIZIZ(C84E c84e, int i, boolean z) {
        SafeHandler safeHandler = c84e.LJLIL;
        if (safeHandler != null) {
            safeHandler.postDelayed(new ARunnableS7S0101000_3(i, c84e, 14), 200L);
        }
    }
}
