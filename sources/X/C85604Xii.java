package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Xii, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85604Xii extends C08Z {
    public final /* synthetic */ PhoneEmailSignUpFragment LIZ;

    public C85604Xii(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
        this.LIZ = phoneEmailSignUpFragment;
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentResumed(fm, f);
        PhoneEmailSignUpFragment phoneEmailSignUpFragment = this.LIZ;
        C85599Xid c85599Xid = phoneEmailSignUpFragment.LJZL;
        if (c85599Xid != null) {
            InterfaceC36571c5 LJJIII = c85599Xid.LJJIII(phoneEmailSignUpFragment.LL);
            if ((LJJIII instanceof InterfaceC18010nF) && o.LJ(LJJIII, f)) {
                C12460eI.LJIIIIZZ((InterfaceC18010nF) LJJIII, this.LIZ.mo49getActivity());
                return;
            }
            return;
        }
        o.LJIJI("tabAdapter");
        throw null;
    }
}
