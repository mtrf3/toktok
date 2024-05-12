package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84773Uj extends FrameLayout {
    public TuxTextView LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C84773Uj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public void LIZ() {
    }

    public final TuxTextView getTitleTextView() {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("titleTextView");
        throw null;
    }

    public final void setTitleText(int i) {
        getTitleTextView().setText(i);
    }

    public final void setTitleTextView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLIL = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84773Uj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.gv);
        setTitleTextView(tuxTextView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        addView(getTitleTextView(), layoutParams);
        C26338AVi.LJIIIZ(this, C1FJ.LIZIZ(16), AnonymousClass391.LIZJ(20), C1FJ.LIZIZ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), 16);
        LIZ();
    }

    public /* synthetic */ C84773Uj(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
