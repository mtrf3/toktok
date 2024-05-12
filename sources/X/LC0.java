package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LC0 extends FrameLayout {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public float LJLJI;
    public final LC1 LJLJJI;
    public HashMap LJLJJL;

    public final View LIZ() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new HashMap();
        }
        View view = (View) this.LJLJJL.get(Integer.valueOf(R.id.jw2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.jw2);
        this.LJLJJL.put(Integer.valueOf(R.id.jw2), findViewById);
        return findViewById;
    }

    public final AbstractC26257ASf getBottomSheetCallback() {
        return this.LJLJJI;
    }

    public final boolean getDragHandleForceFlat() {
        return this.LJLIL;
    }

    private final void setImageDrawable(Drawable drawable) {
        ((ImageView) LIZ()).setImageDrawable(drawable);
    }

    public final void LIZIZ(LC2 lc2) {
        int i;
        boolean z = this.LJLIL;
        int i2 = R.drawable.c5z;
        if (!z && (i = LC3.LIZ[lc2.ordinal()]) != 1 && i == 2) {
            i2 = R.drawable.c60;
        }
        Drawable LIZIZ = C04270Et.LIZIZ(getContext(), i2);
        if (LIZIZ != null) {
            setImageDrawable(LIZIZ);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        View sheet_handle_vector = LIZ();
        o.LJFF(sheet_handle_vector, "sheet_handle_vector");
        sheet_handle_vector.setAlpha(f);
    }

    public final void setDragHandleForceFlat(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LC0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIJ(context, "context");
        this.LJLJJI = new LC1(this);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cnh, this, true);
        LIZIZ(LC2.DEFAULT);
    }
}
