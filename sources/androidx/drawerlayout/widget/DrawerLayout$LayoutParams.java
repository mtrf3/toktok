package androidx.drawerlayout.widget;

import X.C025107z;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class DrawerLayout$LayoutParams extends ViewGroup.MarginLayoutParams {
    public int gravity;
    public boolean isPeeking;
    public float onScreen;
    public int openState;

    public DrawerLayout$LayoutParams(DrawerLayout$LayoutParams drawerLayout$LayoutParams) {
        super((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams);
        this.gravity = drawerLayout$LayoutParams.gravity;
    }

    public DrawerLayout$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public DrawerLayout$LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public DrawerLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C025107z.LAYOUT_ATTRS);
        this.gravity = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public DrawerLayout$LayoutParams(int i, int i2) {
        super(i, i2);
    }

    public DrawerLayout$LayoutParams(int i, int i2, int i3) {
        this(i, i2);
        this.gravity = i3;
    }
}
