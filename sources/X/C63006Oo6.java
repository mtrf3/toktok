package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Oo6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63006Oo6 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C02Y LJLIL;
    public final /* synthetic */ C02Y LJLILLLLZI;
    public final /* synthetic */ KRExistingUserTermsConsentDialog LJLJI;
    public final /* synthetic */ C02Y LJLJJI;

    public C63006Oo6(C71897SJp c71897SJp, C71897SJp c71897SJp2, KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog, C71897SJp c71897SJp3) {
        this.LJLIL = c71897SJp;
        this.LJLILLLLZI = c71897SJp2;
        this.LJLJI = kRExistingUserTermsConsentDialog;
        this.LJLJJI = c71897SJp3;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        this.LJLIL.setChecked(z);
        this.LJLILLLLZI.setChecked(z);
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog = this.LJLJI;
        if (this.LJLJJI.isChecked() && this.LJLIL.isChecked() && this.LJLILLLLZI.isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        kRExistingUserTermsConsentDialog.LJLIL = z2;
        KRExistingUserTermsConsentDialog kRExistingUserTermsConsentDialog2 = this.LJLJI;
        ((SY4) kRExistingUserTermsConsentDialog2._$_findCachedViewById(R.id.azp)).setEnabled(kRExistingUserTermsConsentDialog2.LJLIL);
    }
}
