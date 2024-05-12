package X;

import android.widget.EditText;

/* renamed from: X.1E6, reason: invalid class name */
/* loaded from: classes.dex */
public class C1E6 extends C0F4 {
    public final EditText LIZ;
    public final C0FE LIZIZ;

    public C1E6(EditText editText) {
        this.LIZ = editText;
        C0FE c0fe = new C0FE(editText);
        this.LIZIZ = c0fe;
        editText.addTextChangedListener(c0fe);
        if (C0F6.LIZIZ == null) {
            synchronized (C0F6.LIZ) {
                if (C0F6.LIZIZ == null) {
                    C0F6.LIZIZ = new C0F6();
                }
            }
        }
        editText.setEditableFactory(C0F6.LIZIZ);
    }
}
