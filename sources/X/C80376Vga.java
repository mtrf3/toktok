package X;

import android.content.res.ColorStateList;

/* renamed from: X.Vga, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80376Vga extends C80400Vgy implements C06B {
    @Override // X.C06B
    public C06C<C80376Vga> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    static {
        new C80378Vgc(Float.class);
        new C80379Vgd(Float.class);
        new C80375VgZ(Float.class);
        new C80377Vgb(Float.class);
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public C80246VeU getExtendMotionSpec() {
        throw null;
    }

    public C80246VeU getHideMotionSpec() {
        throw null;
    }

    public C80246VeU getShowMotionSpec() {
        throw null;
    }

    public C80246VeU getShrinkMotionSpec() {
        throw null;
    }

    @Override // X.C80400Vgy, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(C80246VeU c80246VeU) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C80246VeU.LIZ(i, getContext()));
    }

    public void setExtended(boolean z) {
        if (!z) {
        } else {
            throw null;
        }
    }

    public void setHideMotionSpec(C80246VeU c80246VeU) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C80246VeU.LIZ(i, getContext()));
    }

    public void setShowMotionSpec(C80246VeU c80246VeU) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C80246VeU.LIZ(i, getContext()));
    }

    public void setShrinkMotionSpec(C80246VeU c80246VeU) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C80246VeU.LIZ(i, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }
}
