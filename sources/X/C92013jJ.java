package X;

import Y.ARunnableS37S0100000_1;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.3jJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92013jJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String title, TextView titleView, CharSequence charSequence, TextView subTitleView, boolean z, InterfaceC88474Ynu interfaceC88474Ynu) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(titleView, "titleView");
        o.LJIIIZ(subTitleView, "subTitleView");
        titleView.setText(title);
        if (charSequence == null || charSequence.length() == 0) {
            titleView.measure(0, 0);
            int measuredWidth = titleView.getMeasuredWidth();
            interfaceC88474Ynu.invoke(Integer.valueOf(measuredWidth), 0, Integer.valueOf(measuredWidth), 0);
            return;
        }
        subTitleView.setText(charSequence);
        subTitleView.setVisibility(0);
        subTitleView.measure(0, 0);
        titleView.measure(0, 0);
        C92003jI c92003jI = new C92003jI(z, subTitleView, titleView.getMeasuredWidth(), subTitleView.getMeasuredWidth(), titleView, interfaceC88474Ynu);
        if (z) {
            subTitleView.post(new ARunnableS37S0100000_1(c92003jI, 78));
        } else {
            c92003jI.invoke();
        }
    }
}
