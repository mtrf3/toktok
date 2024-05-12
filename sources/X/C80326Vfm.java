package X;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vfm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80326Vfm extends AbstractC80331Vfr {
    public final C80334Vfu LIZLLL;
    public final C80327Vfn LJ;
    public final C80328Vfo LJFF;

    @Override // X.AbstractC80331Vfr
    public final void LIZ() {
        this.LIZ.setEndIconDrawable(C20110qd.LIZ(this.LIZIZ, R.drawable.am8));
        C80315Vfb c80315Vfb = this.LIZ;
        c80315Vfb.setEndIconContentDescription(c80315Vfb.getResources().getText(R.string.jfd));
        this.LIZ.setEndIconOnClickListener(new ViewOnClickListenerC80325Vfl(this));
        C80315Vfb c80315Vfb2 = this.LIZ;
        C80327Vfn c80327Vfn = this.LJ;
        c80315Vfb2.LLILZLL.add(c80327Vfn);
        if (c80315Vfb2.LJLJJL != null) {
            c80327Vfn.LIZ(c80315Vfb2);
        }
        C80315Vfb c80315Vfb3 = this.LIZ;
        c80315Vfb3.LLJI.add(this.LJFF);
        EditText editText = this.LIZ.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    public final boolean LIZLLL() {
        EditText editText = this.LIZ.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    public C80326Vfm(C80315Vfb c80315Vfb) {
        super(c80315Vfb);
        this.LIZLLL = new C80334Vfu(this);
        this.LJ = new C80327Vfn(this);
        this.LJFF = new C80328Vfo(this);
    }
}
