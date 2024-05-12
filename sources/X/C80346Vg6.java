package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.Vg6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80346Vg6 implements InterfaceC80338Vfy {
    public final /* synthetic */ C80342Vg2 LIZ;

    public C80346Vg6(C80342Vg2 c80342Vg2) {
        this.LIZ = c80342Vg2;
    }

    @Override // X.InterfaceC80338Vfy
    public final void LIZ(C80315Vfb c80315Vfb, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) c80315Vfb.getEditText();
        if (autoCompleteTextView != null && i == 3) {
            autoCompleteTextView.post(new RunnableC80347Vg7(this, autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == this.LIZ.LJ) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }
}
