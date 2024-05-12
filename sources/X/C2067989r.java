package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.89r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2067989r implements InterfaceC2068089s {
    public final View LIZ;
    public final View LIZIZ;
    public final FrameLayout LIZJ;

    @Override // X.InterfaceC2068089s
    public final void show(boolean z) {
        int i;
        int i2;
        int childCount = this.LIZJ.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View child = this.LIZJ.getChildAt(i3);
            if (child == this.LIZ) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                child.setVisibility(i2);
            } else {
                o.LJIIIIZZ(child, "child");
                if (!z) {
                    i = 0;
                } else {
                    i = 4;
                }
                child.setVisibility(i);
            }
        }
    }

    public C2067989r(FrameLayout frameLayout, InterfaceC88472Yns<? super ViewGroup, ? extends OSZ<? extends View, ? extends View>> interfaceC88472Yns) {
        OSZ<? extends View, ? extends View> osz;
        this.LIZJ = frameLayout;
        if (interfaceC88472Yns == null || (osz = interfaceC88472Yns.invoke(frameLayout)) == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout.getContext(), null);
            appCompatTextView.setText(R.string.g5t);
            appCompatTextView.setTextColor(-1);
            appCompatTextView.setGravity(17);
            osz = new OSZ<>(appCompatTextView, appCompatTextView);
        }
        frameLayout.addView((View) osz.getFirst(), -1, -1);
        View view = (View) osz.getFirst();
        View view2 = (View) osz.getSecond();
        this.LIZ = view;
        this.LIZIZ = view2;
    }
}
