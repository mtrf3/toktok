package X;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

/* renamed from: X.Vfo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80328Vfo implements InterfaceC80338Vfy {
    public final /* synthetic */ C80326Vfm LIZ;

    public C80328Vfo(C80326Vfm c80326Vfm) {
        this.LIZ = c80326Vfm;
    }

    @Override // X.InterfaceC80338Vfy
    public final void LIZ(C80315Vfb c80315Vfb, int i) {
        EditText editText = c80315Vfb.getEditText();
        if (editText != null && i == 1) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new RunnableC80329Vfp(this, editText));
        }
    }
}
