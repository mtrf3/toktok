package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158246Iy extends ConstraintLayout {
    public InterfaceC65784Pro<C76800UCe> LJLIL;

    private final int getBottomMargin() {
        if (AnonymousClass668.LIZ()) {
            return C1549666i.LIZ(C157226Fa.LIZ.LJIILIIL());
        }
        if (!C47261Igj.LJJIJIIJI(1, 4, 2, 5).contains(Integer.valueOf(C157236Fb.LIZ.LJIIIZ()))) {
            return 0;
        }
        return SFS.LJI(33.0d);
    }

    public final void setConfirmCallBack(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158246Iy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextView textView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SY4 sy4;
        TextView textView2;
        new LinkedHashMap();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.i7, C16880lQ.LLZIL(context), this);
        int LIZ = (int) (C152345yQ.LIZ() / 60000);
        View findViewById = LLLZIIL.findViewById(R.id.e0b);
        ViewGroup.LayoutParams layoutParams = null;
        if (findViewById instanceof TuxTextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(context.getResources().getQuantityString(R.plurals.j8, LIZ, Integer.valueOf(LIZ)));
        }
        View findViewById2 = LLLZIIL.findViewById(R.id.e0a);
        if ((findViewById2 instanceof TuxTextView) && (textView2 = (TextView) findViewById2) != null) {
            textView2.setText(context.getResources().getQuantityString(R.plurals.j7, LIZ, Integer.valueOf(LIZ)));
        }
        View findViewById3 = LLLZIIL.findViewById(R.id.e07);
        if ((findViewById3 instanceof SY4) && (sy4 = (SY4) findViewById3) != null) {
            C58B.LIZ();
            C16880lQ.LJJIZ(sy4, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 45));
        }
        View findViewById4 = LLLZIIL.findViewById(R.id.bst);
        if (findViewById4 instanceof ConstraintLayout) {
            if (findViewById4 != null) {
                layoutParams = findViewById4.getLayoutParams();
            }
        } else {
            findViewById4 = null;
        }
        if ((layoutParams instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin += getBottomMargin();
            findViewById4.setLayoutParams(marginLayoutParams);
        }
    }
}
