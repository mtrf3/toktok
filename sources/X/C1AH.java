package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.1AH, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AH extends AbstractC019505v {
    @Override // X.AbstractC019505v, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyLayoutFeatures();
    }

    public C1AH(Context context) {
        super(context);
    }

    @Override // X.AbstractC019505v
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // X.AbstractC019505v
    public final void updatePostLayout(ConstraintLayout constraintLayout) {
        C018905p c018905p = (C018905p) getLayoutParams();
        c018905p.widget.setWidth(0);
        c018905p.widget.setHeight(0);
    }

    public C1AH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
