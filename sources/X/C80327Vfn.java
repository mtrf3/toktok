package X;

import android.widget.EditText;

/* renamed from: X.Vfn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80327Vfn implements InterfaceC80337Vfx {
    public final /* synthetic */ C80326Vfm LIZ;

    public C80327Vfn(C80326Vfm c80326Vfm) {
        this.LIZ = c80326Vfm;
    }

    @Override // X.InterfaceC80337Vfx
    public final void LIZ(C80315Vfb c80315Vfb) {
        EditText editText = c80315Vfb.getEditText();
        c80315Vfb.setEndIconVisible(true);
        c80315Vfb.setEndIconCheckable(true);
        this.LIZ.LIZJ.setChecked(!r0.LIZLLL());
        editText.removeTextChangedListener(this.LIZ.LIZLLL);
        editText.addTextChangedListener(this.LIZ.LIZLLL);
    }
}
