package com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import X.AbstractC73672Svk;
import X.C42843Grf;
import X.C42850Grm;
import X.C42853Grp;
import X.C42854Grq;
import X.C42869Gs5;
import X.C42870Gs6;
import X.C73969T1h;
import X.T16;
import Y.AfS26S0110000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.services.external.IDonationVendorService;
import com.ss.android.ugc.gamora.editor.sticker.donation.DonationUtils;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OrganizationListViewModel extends ViewModel {
    public final MutableLiveData<C42843Grf> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final List<OrganizationModel> LJLJJL;
    public String LJLJJLL;
    public final List<OrganizationSearchResultModel> LJLJL;

    public final void iv0() {
        ((ArrayList) this.LJLJJL).clear();
        this.LJLJI = 0;
        this.LJLJJI = 1;
        this.LJLJJLL = null;
        ((ArrayList) this.LJLJL).clear();
    }

    public OrganizationListViewModel() {
        MutableLiveData<C42843Grf> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJJI = 1;
        this.LJLJJL = new ArrayList();
        this.LJLJL = new ArrayList();
    }

    public final void gv0(boolean z) {
        boolean z2;
        Boolean bool;
        AbstractC73672Svk LIZ;
        MutableLiveData<C42843Grf> mutableLiveData = this.LJLIL;
        List<OrganizationModel> list = this.LJLJJL;
        if (this.LJLJJI == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        mutableLiveData.setValue(new C42843Grf(null, false, null, list, null, null, true, false, z, z2, 181));
        IDonationVendorService LIZ2 = DonationUtils.LIZ();
        if (LIZ2 != null) {
            bool = Boolean.valueOf(LIZ2.enableDonationPercentService());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            LIZ = C42870Gs6.LIZ(new C42869Gs5(this.LJLJI, "PERCENT"));
        } else {
            LIZ = C42870Gs6.LIZ(new C42869Gs5(this.LJLJI, "TILTIFY"));
        }
        LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS26S0110000_7(this, z, 1), new AfS26S0110000_7(this, z, 2));
    }

    public final void hv0(boolean z) {
        boolean z2;
        MutableLiveData<C42843Grf> mutableLiveData = this.LJLIL;
        List<OrganizationSearchResultModel> list = this.LJLJL;
        String str = this.LJLJJLL;
        if (this.LJLJJI == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        mutableLiveData.setValue(new C42843Grf(str, true, list, null, null, null, true, false, z, z2, 184));
        C42854Grq c42854Grq = new C42854Grq();
        if (z) {
            c42854Grq.LIZ = this.LJLJI;
        }
        c42854Grq.LIZIZ = this.LJLJJLL;
        IDonationVendorService LIZ = DonationUtils.LIZ();
        if (LIZ != null && LIZ.enableDonationPercentService()) {
            c42854Grq.LIZJ = "PERCENT";
        }
        C42853Grp c42853Grp = new C42853Grp();
        c42853Grp.LIZ = c42854Grq.LIZ;
        c42853Grp.LIZIZ = 11;
        c42853Grp.LIZJ = c42854Grq.LIZIZ;
        c42853Grp.LIZLLL = c42854Grq.LIZJ;
        C42850Grm.LIZ(c42853Grp).LJJIIJ(T16.LIZ).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS26S0110000_7(this, z, 3), new AfS26S0110000_7(this, z, 4));
    }
}
