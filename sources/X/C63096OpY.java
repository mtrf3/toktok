package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;

/* renamed from: X.OpY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63096OpY implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C71897SJp LJLIL;
    public final /* synthetic */ C71897SJp LJLILLLLZI;
    public final /* synthetic */ C71897SJp LJLJI;
    public final /* synthetic */ TermsConditionsAssem LJLJJI;

    public C63096OpY(C71897SJp c71897SJp, C71897SJp c71897SJp2, C71897SJp c71897SJp3, TermsConditionsAssem termsConditionsAssem) {
        this.LJLIL = c71897SJp;
        this.LJLILLLLZI = c71897SJp2;
        this.LJLJI = c71897SJp3;
        this.LJLJJI = termsConditionsAssem;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns;
        boolean isChecked = this.LJLIL.isChecked();
        boolean isChecked2 = this.LJLILLLLZI.isChecked();
        C71897SJp c71897SJp = this.LJLJI;
        if (z && this.LJLIL.isChecked() && this.LJLILLLLZI.isChecked()) {
            z2 = true;
        } else {
            z2 = false;
        }
        c71897SJp.setChecked(z2);
        this.LJLIL.setChecked(isChecked);
        this.LJLILLLLZI.setChecked(isChecked2);
        C63093OpV H3 = this.LJLJJI.H3();
        if (H3 != null && (interfaceC88472Yns = H3.LJLJJL) != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }
}
