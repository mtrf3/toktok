package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class AR7 implements InterfaceC06750Oh {
    public final ConstraintLayout LJLIL;
    public final FrameLayout LJLILLLLZI;

    @Override // X.InterfaceC06750Oh
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LJLIL;
    }

    public AR7(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.LJLIL = constraintLayout;
        this.LJLILLLLZI = frameLayout;
    }

    public static AR7 LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dr1, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.mtc);
        if (frameLayout != null) {
            return new AR7((ConstraintLayout) LLLLIILL, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(R.id.mtc)));
    }
}
