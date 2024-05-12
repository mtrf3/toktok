package X;

import android.widget.EditText;

/* renamed from: X.Vg9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80349Vg9 implements InterfaceC80338Vfy {
    public final /* synthetic */ C80343Vg3 LIZ;

    public C80349Vg9(C80343Vg3 c80343Vg3) {
        this.LIZ = c80343Vg3;
    }

    @Override // X.InterfaceC80338Vfy
    public final void LIZ(C80315Vfb c80315Vfb, int i) {
        EditText editText = c80315Vfb.getEditText();
        if (editText != null && i == 2) {
            editText.post(new RunnableC80350VgA(this, editText));
            if (editText.getOnFocusChangeListener() == this.LIZ.LJ) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }
}
