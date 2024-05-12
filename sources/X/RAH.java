package X;

import Y.IDCListenerS163S0100000_11;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public final class RAH extends AbstractC69088R9o {
    public final String LIZJ;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity == null) {
            return true;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", this.LIZIZ.q9().LJJLIIIJLLLLLLLZ());
        c35936E8m.LIZLLL("enter_from", this.LIZIZ.q9().LJJLIIIJJI());
        c35936E8m.LIZLLL("login_panel_type", this.LIZIZ.q9().LLZZ());
        FMX.LJIIL("create_new_phone_account_show", c35936E8m.LIZ);
        C62905OmT c62905OmT = new C62905OmT(mo49getActivity);
        c62905OmT.LIZJ = this.LIZ.getString(R.string.dpe);
        c62905OmT.LJIIIIZZ = new C62907OmV(new RAF(this), this.LIZ.getString(R.string.dpc), false);
        c62905OmT.LJIIIZ = new C62907OmV(new IDCListenerS163S0100000_11(this, 0), this.LIZ.getString(R.string.dpd), false);
        c62905OmT.LJII = false;
        C279017q.LIZLLL(c62905OmT);
        return true;
    }

    public final void LIZIZ(String str) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", this.LIZIZ.q9().LJJLIIIJLLLLLLLZ());
        c35936E8m.LIZLLL("enter_from", this.LIZIZ.q9().LJJLIIIJJI());
        c35936E8m.LIZLLL("exit_method", str);
        c35936E8m.LIZLLL("login_panel_type", this.LIZIZ.q9().LLZZ());
        FMX.LJIIL("create_new_phone_account_response", c35936E8m.LIZ);
    }

    public RAH(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = str;
    }
}
