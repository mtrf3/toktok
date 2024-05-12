package Y;

import X.C64797Pbt;
import X.EPU;
import X.InterfaceC36621EYv;
import X.InterfaceC37276Ek4;
import X.InterfaceC43919HLn;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.InferenceCategory;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.viewmodel.InferenceCategoryVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ClearHistory;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.CommercialComplianceSettings;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.TherePartyDataControlModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDdS379S0100000_7 implements InterfaceC36621EYv {
    public final int $t;
    public Object l0;

    public static final void LIZJ$1(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<InferenceCategory> interfaceC37276Ek4, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, interfaceC37276Ek4, th);
                return;
            case 1:
                LIZJ$1(this, interfaceC37276Ek4, th);
                return;
            case 2:
                LIZJ$2(this, interfaceC37276Ek4, th);
                return;
            case 3:
                LIZJ$3(this, interfaceC37276Ek4, th);
                return;
            case 4:
                LIZJ$4(this, interfaceC37276Ek4, th);
                return;
            case 5:
                LIZJ$5(this, interfaceC37276Ek4, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<InferenceCategory> interfaceC37276Ek4, C64797Pbt<InferenceCategory> c64797Pbt) {
        switch (this.$t) {
            case 0:
                LJII$0(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 1:
                LJII$1(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 2:
                LJII$2(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 3:
                LJII$3(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 4:
                LJII$4(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 5:
                LJII$5(this, interfaceC37276Ek4, c64797Pbt);
                return;
            default:
                return;
        }
    }

    public IDdS379S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        int i = InferenceCategoryVM.LJLJJI;
        if (i > 0) {
            InferenceCategoryVM.LJLJJI = i - 1;
            ((InferenceCategoryVM) iDdS379S0100000_7.l0).gv0();
        }
    }

    public static final void LIZJ$2(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        ((InterfaceC43919HLn) iDdS379S0100000_7.l0).LJJ(t);
    }

    public static final void LIZJ$3(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        ((ComplianceVM) iDdS379S0100000_7.l0).LJLJJI.setValue(Boolean.FALSE);
    }

    public static final void LIZJ$4(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        ((ComplianceVM) iDdS379S0100000_7.l0).LJLJI.setValue(Boolean.FALSE);
    }

    public static final void LIZJ$5(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        ((InterfaceC43919HLn) iDdS379S0100000_7.l0).LJJ(t);
    }

    public static final void LJII$0(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
            ((InferenceCategoryVM) iDdS379S0100000_7.l0).LJLIL.setValue(c64797Pbt.LIZIZ);
            InferenceCategoryVM.LJLJJI = 3;
            return;
        }
        int i = InferenceCategoryVM.LJLJJI;
        if (i <= 0) {
            return;
        }
        InferenceCategoryVM.LJLJJI = i - 1;
        ((InferenceCategoryVM) iDdS379S0100000_7.l0).gv0();
    }

    public static final void LJII$1(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
            ((AdvertiserVM) iDdS379S0100000_7.l0).LJLILLLLZI.setValue(c64797Pbt.LIZIZ);
        }
    }

    public static final void LJII$2(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, C64797Pbt response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        if (response.LIZIZ()) {
            InterfaceC43919HLn interfaceC43919HLn = (InterfaceC43919HLn) iDdS379S0100000_7.l0;
            T t = response.LIZIZ;
            o.LJIIIIZZ(t, "response.body()");
            interfaceC43919HLn.LJ(t);
            return;
        }
        ((InterfaceC43919HLn) iDdS379S0100000_7.l0).LJJ(new EPU(response));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII$3(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, C64797Pbt response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        if (response.LIZIZ()) {
            MutableLiveData<TherePartyDataControlModel> mutableLiveData = ((ComplianceVM) iDdS379S0100000_7.l0).LJLILLLLZI;
            Boolean bool = Boolean.TRUE;
            mutableLiveData.setValue(new TherePartyDataControlModel(bool, bool, ((ClearHistory) response.LIZIZ).getSubmittedTime()));
            ((ComplianceVM) iDdS379S0100000_7.l0).LJLJJI.setValue(bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII$4(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, C64797Pbt response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        if (response.LIZIZ()) {
            ((ComplianceVM) iDdS379S0100000_7.l0).LJLILLLLZI.setValue(((CommercialComplianceSettings) response.LIZIZ).getTherePartyData());
            ((ComplianceVM) iDdS379S0100000_7.l0).LJLJI.setValue(Boolean.TRUE);
        }
    }

    public static final void LJII$5(IDdS379S0100000_7 iDdS379S0100000_7, InterfaceC37276Ek4 call, C64797Pbt response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        if (response.LIZIZ()) {
            ((InterfaceC43919HLn) iDdS379S0100000_7.l0).LJ(response.LIZIZ);
        } else {
            ((InterfaceC43919HLn) iDdS379S0100000_7.l0).LJJ(new EPU(response));
        }
    }
}
