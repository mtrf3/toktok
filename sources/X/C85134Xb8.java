package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS20S2100000_15;

/* renamed from: X.Xb8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85134Xb8 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ TwoStepVerificationDetailFragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85134Xb8(boolean z, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, boolean z2, boolean z3, boolean z4, String str, String str2) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = twoStepVerificationDetailFragment;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
        this.LJLJJLL = str;
        this.LJLJL = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        if (this.LJLIL) {
            R41.LIZIZ().modifyMobile(this.LJLILLLLZI.mo49getActivity(), "", C01R.LIZ("show_success_toast", false), new C85187Xbz(this.LJLJJL, this.LJLILLLLZI));
        } else if (this.LJLJI) {
            R41.LIZIZ().changeEmail(this.LJLILLLLZI.mo49getActivity(), "", C01R.LIZ("show_success_toast", false), new C85188Xc0(this.LJLJJL, this.LJLILLLLZI));
        } else if (this.LJLJJI) {
            Context context = this.LJLILLLLZI.getContext();
            if (context != null) {
                C26227ARb c26227ARb = new C26227ARb(context);
                c26227ARb.LJFF(this.LJLILLLLZI.getString(R.string.she));
                c26227ARb.LIZIZ(this.LJLILLLLZI.getString(R.string.shd));
                UC0.LIZJ(c26227ARb, new AqS20S2100000_15(this.LJLJJLL, this.LJLJL, this.LJLILLLLZI, 0));
                c26227ARb.LJI().LIZLLL();
            }
        } else {
            PasswordService LJFF = R41.LJFF();
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            String enterFrom = this.LJLILLLLZI.getEnterFrom();
            Bundle arguments = this.LJLILLLLZI.getArguments();
            if (arguments == null || (str = arguments.getString("enter_method")) == null) {
                str = "normal";
            }
            LJFF.changePassword(mo49getActivity, enterFrom, str, C01R.LIZ("show_success_toast", false), null);
        }
        return C76800UCe.LIZ;
    }
}
