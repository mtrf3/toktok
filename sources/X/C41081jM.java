package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* renamed from: X.1jM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41081jM extends C1K5 {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C41081jM(Context context) {
        super(context);
        LIZ(null, 0);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        Drawable background = getBackground();
        if (background != null) {
            background.mutate();
            C07810Sj.LJ(background, true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        boolean LIZIZ = C0TT.LIZ.LIZIZ(i, true);
        Drawable background = getBackground();
        if (background != null) {
            background.mutate();
            C07810Sj.LJ(background, LIZIZ);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            drawable2.mutate();
            C07810Sj.LJ(drawable2, true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        boolean LIZIZ = C0TT.LIZ.LIZIZ(i, true);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.mutate();
            C07810Sj.LJ(drawable, LIZIZ);
        }
    }

    public C41081jM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(attributeSet, 0);
    }

    public final void LIZ(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.background, R.attr.src, com.zhiliaoapp.musically.R.attr.bca}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId == -1) {
            resourceId = obtainStyledAttributes.getResourceId(2, -1);
        }
        C0TU c0tu = C0TT.LIZ;
        boolean LIZIZ = c0tu.LIZIZ(resourceId, true);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.mutate();
            C07810Sj.LJ(drawable, LIZIZ);
        }
        boolean LIZIZ2 = c0tu.LIZIZ(obtainStyledAttributes.getResourceId(0, -1), true);
        Drawable background = getBackground();
        if (background != null) {
            background.mutate();
            C07810Sj.LJ(background, LIZIZ2);
        }
        obtainStyledAttributes.recycle();
    }
}
