package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.4mH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119334mH extends FrameLayout {
    public C81309Vvd LJLIL;

    public static /* synthetic */ void getSlider$annotations() {
    }

    public final C81309Vvd getSlider() {
        C81309Vvd c81309Vvd = this.LJLIL;
        if (c81309Vvd != null) {
            return c81309Vvd;
        }
        "VerticalTextSizeSliderWrapper must include a TextSizeSlider as its child.".toString();
        throw new IllegalArgumentException("VerticalTextSizeSliderWrapper must include a TextSizeSlider as its child.");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        float f;
        super.onViewAdded(view);
        if (this.LJLIL == null && (view instanceof C81309Vvd)) {
            C81309Vvd c81309Vvd = (C81309Vvd) view;
            if (C90193gN.LIZ()) {
                f = 90.0f;
            } else {
                f = 270.0f;
            }
            c81309Vvd.setRotation(f);
            this.LJLIL = c81309Vvd;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119334mH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getSlider().getVisibility() != 8) {
            int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int LJJIIZ = O6R.LJJIIZ((paddingLeft - paddingTop) * 0.5f) + getPaddingLeft();
            int LJJIIZ2 = O6R.LJJIIZ((paddingTop - paddingLeft) * 0.5f) + getPaddingTop();
            getSlider().layout(LJJIIZ, LJJIIZ2, paddingTop + LJJIIZ, paddingLeft + LJJIIZ2);
        }
    }
}
