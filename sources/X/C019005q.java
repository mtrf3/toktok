package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.05q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C019005q extends View {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public C019005q(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i) {
        C018905p c018905p = (C018905p) getLayoutParams();
        c018905p.guideBegin = i;
        setLayoutParams(c018905p);
    }

    public void setGuidelineEnd(int i) {
        C018905p c018905p = (C018905p) getLayoutParams();
        c018905p.guideEnd = i;
        setLayoutParams(c018905p);
    }

    public void setGuidelinePercent(float f) {
        C018905p c018905p = (C018905p) getLayoutParams();
        c018905p.guidePercent = f;
        setLayoutParams(c018905p);
    }

    public C019005q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
