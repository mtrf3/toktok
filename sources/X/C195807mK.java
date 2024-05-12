package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.7mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195807mK extends LinearLayout {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final ArrayList<ImageView> LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;
    public AnimatorSet LJLJLLL;
    public int LJLL;

    public final void LJ() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        removeAllViews();
        this.LJLJJI = -1;
        this.LJLJJL = 0;
        this.LJLJJLL.clear();
        this.LJLJL = 0;
        this.LJLL = 0;
        AnimatorSet animatorSet = this.LJLJLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void LIZ(int i) {
        if (i >= 0 && i < this.LJLJJL) {
            ((ImageView) ListProtector.get(this.LJLJJLL, i)).setImageResource(R.drawable.bu4);
        }
    }

    public final void LIZIZ(int i) {
        if (i >= 0 && i < this.LJLJJL && this.LJLJJL >= this.LJLJLJ) {
            ((ImageView) ListProtector.get(this.LJLJJLL, i)).setImageResource(R.drawable.bu6);
        }
    }

    public final TransitionDrawable LIZJ(int i) {
        if (i >= 0 && i < this.LJLJJL) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LJLJJLL, i)).getDrawable();
            if (drawable instanceof TransitionDrawable) {
                return (TransitionDrawable) drawable;
            }
            ((ImageView) ListProtector.get(this.LJLJJLL, i)).setImageResource(R.drawable.bu4);
            Drawable drawable2 = ((ImageView) ListProtector.get(this.LJLJJLL, i)).getDrawable();
            o.LJII(drawable2, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
            return (TransitionDrawable) drawable2;
        }
        return null;
    }

    public final void LIZLLL(int i) {
        int i2;
        int i3 = this.LJLJJI;
        if (i == i3) {
            return;
        }
        int i4 = 1;
        if (i >= 0 && i < this.LJLJJL) {
            TransitionDrawable LIZJ = LIZJ(i3);
            if (LIZJ != null) {
                LIZJ.reverseTransition(200);
            }
            int i5 = this.LJLJJL;
            int i6 = this.LJLJLJ;
            if (i5 <= i6) {
                this.LJLJL = i;
            } else {
                int i7 = i6 / 2;
                int i8 = (i5 - i7) - 1;
                if (i >= 0 && i <= i7) {
                    this.LJLJL = i;
                    if (i7 >= 0) {
                        int i9 = 0;
                        while (true) {
                            LIZ(i9);
                            if (i9 == i7) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                    if (i != 0) {
                        LIZIZ(0);
                    }
                    LIZIZ(this.LJLJLJ - 1);
                    i2 = 0;
                } else if (i >= i8) {
                    this.LJLJL = i6 - (i5 - i);
                    i2 = (this.LJLILLLLZI + this.LJLJI) * (i5 - i6);
                    while (i8 < i5) {
                        LIZ(i8);
                        i8++;
                    }
                    int i10 = this.LJLJJL;
                    if (i != i10 - 1) {
                        LIZIZ(i10 - 1);
                    }
                    LIZIZ(this.LJLJJL - this.LJLJLJ);
                } else {
                    this.LJLJL = 2;
                    int i11 = i - i7;
                    i2 = (this.LJLILLLLZI + this.LJLJI) * i11;
                    int i12 = i7 + i;
                    LIZIZ(i11);
                    LIZIZ(i12);
                    for (int i13 = i11 + 1; i13 < i12; i13++) {
                        LIZ(i13);
                    }
                }
                if (!C90193gN.LIZIZ(getContext())) {
                    i4 = -1;
                }
                float x = ((View) ListProtector.get(this.LJLJJLL, 0)).getX() - getPaddingStart();
                int i14 = this.LJLJJL;
                for (int i15 = 0; i15 < i14; i15++) {
                    Object obj = ListProtector.get(this.LJLJJLL, i15);
                    o.LJIIIIZZ(obj, "dotArray[i]");
                    View view = (View) obj;
                    view.setX((view.getX() - x) + (i4 * i2));
                    this.LJLL = (int) view.getTranslationX();
                }
            }
            TransitionDrawable LIZJ2 = LIZJ(i);
            if (LIZJ2 != null) {
                LIZJ2.startTransition(200);
            }
            this.LJLJJI = i;
        }
    }

    public final void LJFF(boolean z) {
        AnimatorSet animatorSet = this.LJLJLLL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLJLLL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int i = this.LJLJJL;
            for (int i2 = 0; i2 < i; i2++) {
                ((View) ListProtector.get(this.LJLJJLL, i2)).setTranslationX(this.LJLL);
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
        int i4 = this.LJLJJL;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = ListProtector.get(this.LJLJJLL, i5);
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

    public final void setSelectedIndex(int i) {
        int i2;
        if (this.LJLIL) {
            i = (this.LJLJJL - i) - 1;
        }
        int i3 = this.LJLJJI;
        if (i != i3 && (i2 = this.LJLJJL) > 0 && i >= 0 && i < i2) {
            if (i2 <= this.LJLJLJ) {
                if (Math.abs(i - i3) == 1) {
                    if (i > this.LJLJJI) {
                        TransitionDrawable LIZJ = LIZJ(this.LJLJL);
                        if (LIZJ != null) {
                            LIZJ.reverseTransition(200);
                        }
                        TransitionDrawable LIZJ2 = LIZJ(this.LJLJJI + 1);
                        if (LIZJ2 != null) {
                            LIZJ2.startTransition(200);
                        }
                        this.LJLJJI++;
                        this.LJLJL++;
                        return;
                    }
                    TransitionDrawable LIZJ3 = LIZJ(this.LJLJL);
                    if (LIZJ3 != null) {
                        LIZJ3.reverseTransition(200);
                    }
                    TransitionDrawable LIZJ4 = LIZJ(this.LJLJJI - 1);
                    if (LIZJ4 != null) {
                        LIZJ4.startTransition(200);
                    }
                    this.LJLJJI--;
                    this.LJLJL--;
                    return;
                }
                LIZLLL(i);
                return;
            }
            if (Math.abs(i - i3) == 1) {
                int i4 = this.LJLJJI;
                if (i > i4) {
                    int i5 = this.LJLJLJ / 2;
                    if (this.LJLJL == i5 && i4 != (this.LJLJJL - i5) - 1) {
                        LJFF(true);
                        LIZIZ(this.LJLJJI + i5 + 1);
                        LIZ(this.LJLJJI + i5);
                        TransitionDrawable LIZJ5 = LIZJ(this.LJLJJI);
                        if (LIZJ5 != null) {
                            LIZJ5.reverseTransition(200);
                        }
                        TransitionDrawable LIZJ6 = LIZJ(this.LJLJJI + 1);
                        if (LIZJ6 != null) {
                            LIZJ6.startTransition(200);
                        }
                        LIZIZ(this.LJLJJI - 1);
                    } else {
                        TransitionDrawable LIZJ7 = LIZJ(i4);
                        if (LIZJ7 != null) {
                            LIZJ7.reverseTransition(200);
                        }
                        TransitionDrawable LIZJ8 = LIZJ(this.LJLJJI + 1);
                        if (LIZJ8 != null) {
                            LIZJ8.startTransition(200);
                        }
                        if (this.LJLJJI < i5) {
                            LIZIZ(0);
                        }
                        this.LJLJL++;
                    }
                    this.LJLJJI++;
                    return;
                }
                int i6 = this.LJLJLJ / 2;
                if (this.LJLJL == i6 && i4 != i6) {
                    LJFF(false);
                    LIZIZ((this.LJLJJI - i6) - 1);
                    LIZ(this.LJLJJI - i6);
                    TransitionDrawable LIZJ9 = LIZJ(this.LJLJJI);
                    if (LIZJ9 != null) {
                        LIZJ9.reverseTransition(200);
                    }
                    TransitionDrawable LIZJ10 = LIZJ(this.LJLJJI - 1);
                    if (LIZJ10 != null) {
                        LIZJ10.startTransition(200);
                    }
                    LIZIZ((this.LJLJJI + i6) - 1);
                } else {
                    TransitionDrawable LIZJ11 = LIZJ(i4);
                    if (LIZJ11 != null) {
                        LIZJ11.reverseTransition(200);
                    }
                    TransitionDrawable LIZJ12 = LIZJ(this.LJLJJI - 1);
                    if (LIZJ12 != null) {
                        LIZJ12.startTransition(200);
                    }
                    int i7 = this.LJLJJI + i6;
                    int i8 = this.LJLJJL;
                    if (i7 >= i8) {
                        LIZIZ(i8 - 1);
                    }
                    this.LJLJL--;
                }
                this.LJLJJI--;
                return;
            }
            LIZLLL(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C195807mK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = true;
        this.LJLJJLL = new ArrayList<>();
        this.LJLJLJ = 5;
        this.LJLILLLLZI = C17N.LJIILL(7.0d);
        this.LJLJI = C17N.LJIILL(7.0d);
        setWillNotDraw(false);
        setLayerType(1, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahh, R.attr.ahl, R.attr.ahn, R.attr.b7s, R.attr.bvt}, 0, 0);
        this.LJLIL = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
    }
}
