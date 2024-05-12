package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.3GB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GB extends C84773Uj {
    public View LJLILLLLZI;

    @Override // X.C84773Uj
    public final void LIZ() {
        getTitleTextView().setText(LIZIZ(0));
        View view = new View(getContext());
        C110614Vt c110614Vt = new C110614Vt();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        c110614Vt.LIZ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.e2, context));
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(8));
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "context");
        view.setBackground(c110614Vt.LIZ(context2));
        this.LJLILLLLZI = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        layoutParams.gravity = 8388629;
        addView(this.LJLILLLLZI, layoutParams);
    }

    public final String LIZIZ(int i) {
        String quantityString = getContext().getResources().getQuantityString(R.plurals.fq, i, Integer.valueOf(i));
        o.LJIIIIZZ(quantityString, "context.resources.getQua…tegoryName, count, count)");
        return quantityString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
