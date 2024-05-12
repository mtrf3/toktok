package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.86x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2060786x extends FrameLayout {
    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.5f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2060786x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setWillNotDraw(false);
        setFadingEdgeLength(C15380j0.LIZ(64.0f));
    }
}
