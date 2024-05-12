package Y;

import X.C61751OLj;
import X.C73411SrX;
import X.InterfaceC64592gB;
import X.OKJ;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCountResponse;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenCountResponse;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import yq4.a;

/* loaded from: classes11.dex */
public class AfS28S0110000_10 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS28S0110000_10 afS28S0110000_10, Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        BALeadsGenCountResponse bALeadsGenCountResponse = (BALeadsGenCountResponse) obj;
        if (bALeadsGenCountResponse.getCount() >= 1) {
            OKJ okj = (OKJ) afS28S0110000_10.l0;
            okj.LJLJLLL = true;
            IIconSlot.SlotViewModel slotViewModel = okj.LJLJJI;
            if (slotViewModel != null && (mutableLiveData3 = slotViewModel.LJLJJL) != null) {
                mutableLiveData3.setValue(Boolean.FALSE);
            }
            IIconSlot.SlotViewModel slotViewModel2 = ((OKJ) afS28S0110000_10.l0).LJLJJI;
            if (slotViewModel2 == null || (mutableLiveData2 = slotViewModel2.LJLJJI) == null) {
                return;
            }
            mutableLiveData2.setValue(String.valueOf(bALeadsGenCountResponse.getCount()));
            return;
        }
        OKJ okj2 = (OKJ) afS28S0110000_10.l0;
        okj2.LJLJLLL = false;
        IIconSlot.SlotViewModel slotViewModel3 = okj2.LJLJJI;
        if (slotViewModel3 == null || (mutableLiveData = slotViewModel3.LJLJJL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(!afS28S0110000_10.z1));
    }

    public static final void accept$1(AfS28S0110000_10 afS28S0110000_10, Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        BusinessLinksCountResponse businessLinksCountResponse = (BusinessLinksCountResponse) obj;
        if (businessLinksCountResponse.getTotal() >= 1) {
            IIconSlot.SlotViewModel slotViewModel = ((C61751OLj) afS28S0110000_10.l0).LJLJJL;
            if (slotViewModel != null && (mutableLiveData3 = slotViewModel.LJLJJL) != null) {
                mutableLiveData3.setValue(Boolean.FALSE);
            }
            IIconSlot.SlotViewModel slotViewModel2 = ((C61751OLj) afS28S0110000_10.l0).LJLJJL;
            if (slotViewModel2 == null || (mutableLiveData2 = slotViewModel2.LJLJJI) == null) {
                return;
            }
            mutableLiveData2.setValue(String.valueOf(businessLinksCountResponse.getTotal()));
            return;
        }
        IIconSlot.SlotViewModel slotViewModel3 = ((C61751OLj) afS28S0110000_10.l0).LJLJJL;
        if (slotViewModel3 == null || (mutableLiveData = slotViewModel3.LJLJJL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(!afS28S0110000_10.z1));
    }

    public static final void accept$2(AfS28S0110000_10 afS28S0110000_10, Object obj) {
        MixActivityContainer mixActivityContainer = (MixActivityContainer) afS28S0110000_10.l0;
        boolean z = afS28S0110000_10.z1;
        mixActivityContainer.getClass();
        ((ITpcConsentService) obj).LJFF();
        if (!z && a.LJIJJ().LJIIJJI(mixActivityContainer.LJLILLLLZI.LIZ.LIZJ)) {
            a.LJIJJ().LJIIJ(mixActivityContainer.LJLIL, "deeplink");
        }
        C73411SrX c73411SrX = mixActivityContainer.LJLLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public AfS28S0110000_10(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
