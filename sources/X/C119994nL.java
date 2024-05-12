package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4nL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119994nL extends FrameLayout {
    public final View LJLIL;
    public final FrameLayout LJLILLLLZI;

    public final FrameLayout getContent() {
        return this.LJLILLLLZI;
    }

    public final View getRoot() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119994nL(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.avn, this, true);
        this.LJLIL = LLLLIILL;
        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.hla);
        this.LJLILLLLZI = frameLayout;
        if (C1DH.LJIL()) {
            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bnq, frameLayout, true);
            View findViewById = LLLLIILL2.findViewById(R.id.j5n);
            ImageView imageView = (ImageView) LLLLIILL2.findViewById(R.id.f51);
            TextView textView = (TextView) LLLLIILL2.findViewById(R.id.m2v);
            imageView.setVisibility(8);
            textView.setText(getContext().getString(R.string.img));
            findViewById.setBackgroundColor(C04330Ez.LIZIZ(getContext(), R.color.bn));
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            int LIZJ = (int) KL2.LIZJ(getContext(), 52.0f);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, C63081OpJ.LJJJJLI(context2) + LIZJ, 0, 0);
        }
    }
}
