package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import defpackage.a1;

/* renamed from: X.5F0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F0 extends HorizontalScrollView {
    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if (C90193gN.LIZ()) {
            return 20.0f;
        }
        return 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if (C90193gN.LIZ()) {
            return 0.0f;
        }
        return 20.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
