package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.64E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64E extends FrameLayout implements C64U {
    public final TuxTextView LJLIL;

    @Override // X.C64U
    public final boolean LIZIZ(C64N c64n, float f) {
        return false;
    }

    @Override // X.C64U
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C64U
    public final void LJFF() {
    }

    @Override // X.C64U
    public final void LJI(C64N c64n) {
    }

    public final void LJIIIIZZ() {
        this.LJLIL.setVisibility(8);
        this.LJLIL.setText("");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64E(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LJLIL = tuxTextView;
        tuxTextView.setTextColor(context.getResources().getColor(R.color.bc));
        tuxTextView.setTuxFont(51);
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -2;
        }
        tuxTextView.setLayoutParams(layoutParams2);
        addView(tuxTextView);
    }

    @Override // X.C64U
    public final boolean LJ(C64N c64n, float f) {
        LJIIIIZZ();
        return false;
    }

    @Override // X.C64U
    public final void LIZ(C64N c64n, float f, float f2) {
        LJIIIIZZ();
    }

    @Override // X.C64U
    public final boolean LIZJ(C64N c64n, float f, float f2) {
        LJIIIIZZ();
        return false;
    }

    @Override // X.C64U
    public final void LJII(C64N c64n, float f, float f2) {
        LJIIIIZZ();
    }
}
