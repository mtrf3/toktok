package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATW implements View.OnLayoutChangeListener {
    public final /* synthetic */ ATX LJLIL;

    public ATW(ATX atx) {
        this.LJLIL = atx;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(v, "v");
        ATX atx = this.LJLIL;
        int measuredHeight = v.getMeasuredHeight();
        atx.getClass();
        try {
            Object parent = ((RelativeLayout) atx.findViewById(R.id.hm3)).getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
            if (from != null) {
                from.setPeekHeight(measuredHeight);
            }
        } catch (Exception unused) {
        }
        v.removeOnLayoutChangeListener(this);
    }
}
