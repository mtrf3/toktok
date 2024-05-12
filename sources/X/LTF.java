package X;

import Y.IDObjectS330S0100000_9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LTF extends LinearLayout {
    public float LJLIL;
    public int LJLILLLLZI;
    public Integer LJLJI;
    public int LJLJJI;

    public final float getRate() {
        return this.LJLIL;
    }

    public final int getStarSize() {
        return this.LJLJJI;
    }

    public final void setNoneTypeStarTintColor(int i) {
        this.LJLJI = Integer.valueOf(i);
    }

    public final void setRate(float f) {
        int i;
        boolean z;
        this.LJLIL = f;
        int i2 = (int) f;
        float f2 = f - i2;
        if (f2 >= 0.25f && f2 < 0.75d) {
            i = (i2 * 2) + 1;
        } else {
            i = i2 * 2;
            if (f2 >= 0.75d) {
                i += 2;
            }
        }
        int min = Math.min(i, 10);
        int i3 = min / 2;
        if (min % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            View childAt = getChildAt(i5);
            o.LJII(childAt, "null cannot be cast to non-null type android.widget.ImageView");
            LIZ(2, (ImageView) childAt);
            i4++;
            i5++;
        }
        if (z) {
            View childAt2 = getChildAt(i5);
            o.LJII(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
            LIZ(1, (ImageView) childAt2);
            i5++;
        }
        while (i5 < 5) {
            View childAt3 = getChildAt(i5);
            o.LJII(childAt3, "null cannot be cast to non-null type android.widget.ImageView");
            LIZ(0, (ImageView) childAt3);
            i5++;
        }
    }

    public final void setStarSize(int i) {
        int i2;
        this.LJLJJI = C7MY.LIZIZ(i);
        if (i <= 12) {
            this.LJLILLLLZI = C7MY.LIZIZ(2);
        } else if (i >= 16) {
            this.LJLILLLLZI = C7MY.LIZIZ(4);
        }
        Iterator it = new IDObjectS330S0100000_9(this, 0).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            ViewGroup.LayoutParams layoutParams = null;
            if (i3 >= 0) {
                View view = (View) next;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    layoutParams = layoutParams2;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    int i5 = this.LJLJJI;
                    marginLayoutParams.width = i5;
                    marginLayoutParams.height = i5;
                    if (i3 == 0) {
                        i2 = C7MY.LIZIZ(0);
                    } else {
                        i2 = this.LJLILLLLZI;
                    }
                    marginLayoutParams.setMarginStart(i2);
                    view.setLayoutParams(marginLayoutParams);
                }
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LTF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        int i = 0;
        this.LJLILLLLZI = C7MY.LIZIZ(2);
        this.LJLJJI = C7MY.LIZIZ(12);
        do {
            View imageView = new ImageView(context);
            int i2 = this.LJLJJI;
            imageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
            if (getChildCount() != 0) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(this.LJLILLLLZI);
                    imageView.setLayoutParams(marginLayoutParams);
                }
            }
            addView(imageView);
            i++;
        } while (i < 5);
        if (isInEditMode()) {
            setRate((float) ((Math.random() * 10) / 2));
        }
    }

    public final void LIZ(int i, ImageView imageView) {
        int i2;
        if (i == 2) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_star_fill;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c2068389v.LIZLLL = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.c6, context));
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            imageView.setImageDrawable(c2068389v.LIZ(context2));
            return;
        }
        if (i == 0) {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_star_fill;
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            Integer num = this.LJLJI;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = R.attr.dc;
            }
            c2068389v2.LIZLLL = C79045V0n.LJI(i2, context3);
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            imageView.setImageDrawable(c2068389v2.LIZ(context4));
            return;
        }
        if (i != 1) {
            return;
        }
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        if (AnonymousClass636.LJIILJJIL(context5)) {
            imageView.setImageResource(R.drawable.aft);
        } else {
            imageView.setImageResource(R.drawable.afs);
        }
    }
}
