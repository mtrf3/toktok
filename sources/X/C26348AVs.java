package X;

import android.widget.LinearLayout;

/* renamed from: X.AVs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26348AVs implements InterfaceC26353AVx {
    public static final int LIZ;

    static {
        KL2.LIZJ(EF7.LIZIZ(), 20.0f);
        LIZ = (int) KL2.LIZJ(EF7.LIZIZ(), 4.0f);
        KL2.LIZJ(EF7.LIZIZ(), 5.0f);
    }

    public C26348AVs(LinearLayout linearLayout, int i) {
        linearLayout.getContext();
        if (i < Integer.MAX_VALUE) {
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC26349AVt(linearLayout, i));
            C90193gN.LIZIZ(linearLayout.getContext());
        }
    }
}
