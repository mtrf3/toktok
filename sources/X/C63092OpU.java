package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;

/* renamed from: X.OpU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63092OpU implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C71897SJp LJLIL;
    public final /* synthetic */ C71897SJp LJLILLLLZI;
    public final /* synthetic */ C71897SJp LJLJI;
    public final /* synthetic */ TermsConditionsAssem LJLJJI;

    public C63092OpU(C71897SJp c71897SJp, C71897SJp c71897SJp2, C71897SJp c71897SJp3, TermsConditionsAssem termsConditionsAssem) {
        this.LJLIL = c71897SJp;
        this.LJLILLLLZI = c71897SJp2;
        this.LJLJI = c71897SJp3;
        this.LJLJJI = termsConditionsAssem;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns;
        this.LJLIL.setChecked(z);
        this.LJLILLLLZI.setChecked(z);
        this.LJLJI.setChecked(z);
        TermsConditionsAssem termsConditionsAssem = this.LJLJJI;
        if (this.LJLIL.isChecked() && this.LJLILLLLZI.isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        termsConditionsAssem.LLD = z2;
        TermsConditionsAssem termsConditionsAssem2 = this.LJLJJI;
        boolean z3 = termsConditionsAssem2.LLD;
        SY4 sy4 = termsConditionsAssem2.LL;
        if (sy4 != null) {
            sy4.setEnabled(z3);
        }
        C63093OpV H3 = this.LJLJJI.H3();
        if (H3 != null && (interfaceC88472Yns = H3.LJLILLLLZI) != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }
}
