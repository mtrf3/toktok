package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SY3 {
    public final TextView LIZ;
    public int LIZIZ;
    public int LIZJ;
    public Integer LIZLLL;
    public float LJ;
    public float LJFF;
    public SY9 LJI;
    public SY9 LJII;

    public SY3(TextView tv) {
        o.LJIIIZ(tv, "tv");
        this.LIZ = tv;
    }

    public final SY9 LIZIZ(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        if (num.intValue() <= 0) {
            return null;
        }
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "tv.context");
        return new SY9(context, num.intValue());
    }

    public final void LIZJ(int i) {
        int i2;
        int i3;
        SY9 sy9;
        SY9 sy92;
        int i4;
        TextView textView = this.LIZ;
        SY9 sy93 = this.LJI;
        Integer num = this.LIZLLL;
        if (num == null) {
            if (sy93 != null) {
                sy93.LJIILJJIL = null;
                Drawable drawable = sy93.LIZ;
                if (drawable != null) {
                    drawable.setColorFilter(null);
                    drawable.setAlpha(255);
                    sy93.invalidateSelf();
                }
            }
        } else if (sy93 != null) {
            sy93.LJ(num.intValue());
        }
        SY9 sy94 = this.LJII;
        Integer num2 = this.LIZLLL;
        if (num2 == null) {
            if (sy94 != null) {
                sy94.LJIILJJIL = null;
                Drawable drawable2 = sy94.LIZ;
                if (drawable2 != null) {
                    drawable2.setColorFilter(null);
                    drawable2.setAlpha(255);
                    sy94.invalidateSelf();
                }
            }
        } else if (sy94 != null) {
            sy94.LJ(num2.intValue());
        }
        float width = ((textView.getWidth() - textView.getPaint().measureText(textView.getText().toString())) - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (textView.getCompoundDrawablePadding() != i) {
            textView.setCompoundDrawablePadding(i);
        }
        if (this.LJI != null) {
            i2 = this.LIZJ + i;
        } else {
            i2 = 0;
        }
        if (this.LJII != null) {
            i3 = this.LIZJ + i;
        } else {
            i3 = 0;
        }
        float f = (width - i2) - i3;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = f / 2.0f;
        if (C26338AVi.LIZLLL(textView)) {
            sy9 = this.LJII;
            sy92 = this.LJI;
        } else {
            sy9 = this.LJI;
            sy92 = this.LJII;
        }
        int LJJIIZ = O6R.LJJIIZ(f2);
        if (sy9 != null && sy9.LIZLLL && sy9.LJ) {
            i4 = -LJJIIZ;
        } else {
            i4 = LJJIIZ;
        }
        if (sy92 == null || !sy92.LIZLLL || !sy92.LJ) {
            LJJIIZ = -LJJIIZ;
        }
        if (sy9 != null) {
            sy9.setBounds(i4, 0, this.LIZJ + i4, this.LIZIZ);
        }
        if (sy92 != null) {
            sy92.setBounds(LJJIIZ, 0, this.LIZJ + LJJIIZ, this.LIZIZ);
        }
        textView.setCompoundDrawables(sy9, null, sy92, null);
    }

    public final void LIZ(AttributeSet attributeSet, int i) {
        Context context = this.LIZ.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.brm, R.attr.bro, R.attr.brp, R.attr.bs0, R.attr.bs2, R.attr.bue}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "ctx.obtainStyledAttribut…defStyleAttr, 0\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId < 0) {
            resourceId = obtainStyledAttributes.getResourceId(3, -1);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        this.LJ = obtainStyledAttributes.getDimension(4, -1.0f);
        this.LJFF = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(5)) {
            this.LIZLLL = Integer.valueOf(obtainStyledAttributes.getColor(5, 0));
        }
        obtainStyledAttributes.recycle();
        if (resourceId > 0) {
            this.LJI = new SY9(context, resourceId);
        }
        if (resourceId2 > 0) {
            this.LJII = new SY9(context, resourceId2);
        }
    }
}
