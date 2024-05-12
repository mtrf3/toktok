package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.2Nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57392Nb extends C62828OlE {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public Integer LJLZ;

    public final void LJIIJJI() {
        int i = 0;
        measure(0, 0);
        getMeasuredHeight();
        Integer num = this.LJLZ;
        if (num == null || num.intValue() != 1) {
            C57092Lx.LIZ.getClass();
            i = C61447O9r.LIZ();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int LJJIFFI = getDownloadProgressHelper().LJJIFFI(i);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = LJJIFFI;
        setLayoutParams(layoutParams);
        View bottomGapView = getBottomGapView();
        if (bottomGapView != null) {
            bottomGapView.getLayoutParams().height = LJJIFFI;
        }
        requestLayout();
    }

    private final View getBottomGapView() {
        return (View) this.LJLLLLLL.getValue();
    }

    private final C2LI getDownloadProgressHelper() {
        return (C2LI) this.LJLLLL.getValue();
    }

    public final void setType(int i) {
        this.LJLZ = Integer.valueOf(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57392Nb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 685));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 684));
    }

    @Override // X.C62828OlE
    public final void LJIIIIZZ(int i, Integer num, EnumC62412cf type) {
        o.LJIIIZ(type, "type");
        super.LJIIIIZZ(i, num, type);
        View bottomGapView = getBottomGapView();
        if (bottomGapView != null) {
            bottomGapView.setVisibility(i);
            if (num != null) {
                num.intValue();
                bottomGapView.setBackgroundColor(num.intValue());
            }
            if (bottomGapView.getHeight() == 0) {
                LJIIJJI();
            }
        }
    }
}
