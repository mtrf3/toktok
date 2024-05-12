package X;

import Y.IDCListenerS166S0100000_15;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XsM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86202XsM extends C78915Uy7 {
    public final /* synthetic */ ProfileEditFragment LJLILLLLZI;

    @Override // X.C78915Uy7
    public final void LJJII() {
    }

    public C86202XsM(ProfileEditFragment profileEditFragment) {
        this.LJLILLLLZI = profileEditFragment;
    }

    @Override // X.C78915Uy7
    public final void LJJIII(VerificationResponse verificationResponse) {
        o.LJIIIZ(verificationResponse, "verificationResponse");
        if (verificationResponse.isEmpty()) {
            this.LJLILLLLZI.fm();
            return;
        }
        if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(this.LJLILLLLZI.getString(R.string.q58));
            c5s1.LJ();
            return;
        }
        if (verificationResponse.isCerted()) {
            try {
                Boolean enableChangeHandleNotice = C2YJ.LIZIZ.LIZ.getMtcertSettings().getEnableChangeHandleNotice();
                o.LJIIIIZZ(enableChangeHandleNotice, "{\n                Settin…andleNotice\n            }");
                if (enableChangeHandleNotice.booleanValue()) {
                    String string = this.LJLILLLLZI.getString(R.string.q53);
                    String string2 = this.LJLILLLLZI.getString(R.string.q52);
                    if (string != null && string2 != null) {
                        ActivityC45651qj requireActivity = this.LJLILLLLZI.requireActivity();
                        o.LJIIIIZZ(requireActivity, "requireActivity()");
                        C62905OmT c62905OmT = new C62905OmT(requireActivity);
                        c62905OmT.LIZJ = string2;
                        c62905OmT.LIZIZ = string;
                        c62905OmT.LJIIJJI(R.string.q57, new IDCListenerS166S0100000_15(this.LJLILLLLZI, 0), false);
                        c62905OmT.LJII(R.string.cg_, null);
                        new C62906OmU(c62905OmT).LIZLLL();
                        return;
                    }
                }
            } catch (C158056If unused) {
            }
            this.LJLILLLLZI.fm();
            return;
        }
        if (!verificationResponse.isUpdating()) {
            return;
        }
        C5S1 c5s12 = new C5S1(EF7.LIZIZ());
        c5s12.LIZLLL(this.LJLILLLLZI.getString(R.string.q59));
        c5s12.LJ();
    }
}
