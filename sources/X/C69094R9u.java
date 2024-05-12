package X;

import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.R9u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69094R9u<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC69056R8i LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ EnumC69113RAn LJLJJL;
    public final /* synthetic */ Fragment LJLJJLL;

    public C69094R9u(int i, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, EnumC69113RAn enumC69113RAn, Fragment fragment) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC69056R8i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = enumC69113RAn;
        this.LJLJJLL = fragment;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C69099R9z.LIZIZ(0, this.LJLIL, 0, "", null);
        C68972R5c.LJIIJ(this.LJLILLLLZI.q9().LJJLIIIJJI(), this.LJLILLLLZI.q9().LJJLIIIJLLLLLLLZ(), this.LJLILLLLZI.q9().LLZZ(), 0, this.LJLJI, this.LJLIL, "voice", null, this.LJLJJI, null, null, null, null, C69093R9t.LJIJ(this.LJLJJL), 15872);
        ActivityC45651qj mo49getActivity = this.LJLJJLL.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.isFinishing();
        }
        Fragment fragment = this.LJLJJLL;
        String str = this.LJLJJI;
        ActivityC45651qj mo49getActivity2 = fragment.mo49getActivity();
        if (mo49getActivity2 != null) {
            C26227ARb c26227ARb = new C26227ARb(mo49getActivity2);
            c26227ARb.LIZIZ(mo49getActivity2.getString(R.string.dqq, str));
            UC0.LIZJ(c26227ARb, RA1.LJLIL);
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
        }
    }
}
