package Y;

import X.C170666ms;
import X.C42843Grf;
import X.InterfaceC42219Ghb;
import X.InterfaceC64592gB;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.model.Error;
import com.ss.android.ugc.aweme.shortvideo.model.Loading;
import com.ss.android.ugc.aweme.shortvideo.model.State;
import com.ss.android.ugc.aweme.shortvideo.model.Success;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.MatchDonationText;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationResponse;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultResponse;
import com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AfS26S0110000_7 implements InterfaceC64592gB {
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
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS26S0110000_7(InterfaceC42219Ghb interfaceC42219Ghb, int i) {
        this.$t = i;
        this.l0 = interfaceC42219Ghb;
        this.z1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS26S0110000_7 afS26S0110000_7, Object obj) {
        State state = (State) obj;
        if (state instanceof Loading) {
            ((InterfaceC42219Ghb) afS26S0110000_7.l0).LIZIZ(((Number) state.resource).floatValue(), afS26S0110000_7.z1);
            afS26S0110000_7.z1 = false;
            return;
        }
        if (state instanceof Error) {
            ((InterfaceC42219Ghb) afS26S0110000_7.l0).LIZ();
        } else {
            if (!(state instanceof Success)) {
                return;
            }
            ((InterfaceC42219Ghb) afS26S0110000_7.l0).LIZJ();
        }
    }

    public static final void accept$1(AfS26S0110000_7 afS26S0110000_7, Object obj) {
        boolean z;
        boolean z2;
        OrganizationResponse organizationResponse = (OrganizationResponse) obj;
        if (organizationResponse.error_code == 0) {
            OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS26S0110000_7.l0;
            organizationListViewModel.LJLJI = organizationResponse.cursor;
            organizationListViewModel.LJLJJI = organizationResponse.hasMore;
            List<OrganizationModel> list = organizationResponse.orgList;
            if (list != null) {
                ((ArrayList) organizationListViewModel.LJLJJL).addAll(list);
            }
            OrganizationListViewModel organizationListViewModel2 = (OrganizationListViewModel) afS26S0110000_7.l0;
            MutableLiveData<C42843Grf> mutableLiveData = organizationListViewModel2.LJLIL;
            List<OrganizationModel> list2 = organizationListViewModel2.LJLJJL;
            String str = organizationResponse.poweredBy;
            MatchDonationText matchDonationText = organizationResponse.matchDonationText;
            if (organizationListViewModel2.LJLJJI == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mutableLiveData.setValue(new C42843Grf(null, false, null, list2, str, matchDonationText, false, true, afS26S0110000_7.z1, z2, 4));
            return;
        }
        OrganizationListViewModel organizationListViewModel3 = (OrganizationListViewModel) afS26S0110000_7.l0;
        MutableLiveData<C42843Grf> mutableLiveData2 = organizationListViewModel3.LJLIL;
        List<OrganizationModel> list3 = organizationListViewModel3.LJLJJL;
        if (organizationListViewModel3.LJLJJI == 1) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData2.setValue(new C42843Grf(null, false, null, list3, null, null, false, false, afS26S0110000_7.z1, z, 180));
    }

    public static final void accept$2(AfS26S0110000_7 afS26S0110000_7, Object obj) {
        boolean z;
        C170666ms.LIZJ((Throwable) obj);
        OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS26S0110000_7.l0;
        MutableLiveData<C42843Grf> mutableLiveData = organizationListViewModel.LJLIL;
        List<OrganizationModel> list = organizationListViewModel.LJLJJL;
        if (organizationListViewModel.LJLJJI == 1) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(new C42843Grf(null, false, null, list, null, null, false, false, afS26S0110000_7.z1, z, 180));
    }

    public static final void accept$3(AfS26S0110000_7 afS26S0110000_7, Object obj) {
        boolean z;
        int intValue;
        int i;
        boolean z2;
        OrganizationSearchResultResponse organizationSearchResultResponse = (OrganizationSearchResultResponse) obj;
        if (organizationSearchResultResponse.error_code == 0) {
            OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS26S0110000_7.l0;
            Integer num = organizationSearchResultResponse.cursor;
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            organizationListViewModel.LJLJI = intValue;
            OrganizationListViewModel organizationListViewModel2 = (OrganizationListViewModel) afS26S0110000_7.l0;
            Boolean bool = organizationSearchResultResponse.hasMore;
            if (bool == null || o.LJ(bool, Boolean.FALSE)) {
                i = 0;
            } else {
                i = 1;
            }
            organizationListViewModel2.LJLJJI = i;
            List<OrganizationSearchResultModel> list = organizationSearchResultResponse.orgList;
            if (list != null) {
                ((ArrayList) ((OrganizationListViewModel) afS26S0110000_7.l0).LJLJL).addAll(list);
            }
            OrganizationListViewModel organizationListViewModel3 = (OrganizationListViewModel) afS26S0110000_7.l0;
            MutableLiveData<C42843Grf> mutableLiveData = organizationListViewModel3.LJLIL;
            List<OrganizationSearchResultModel> list2 = organizationListViewModel3.LJLJL;
            String str = organizationListViewModel3.LJLJJLL;
            if (organizationListViewModel3.LJLJJI == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mutableLiveData.setValue(new C42843Grf(str, true, list2, null, null, null, false, true, afS26S0110000_7.z1, z2, 56));
            return;
        }
        OrganizationListViewModel organizationListViewModel4 = (OrganizationListViewModel) afS26S0110000_7.l0;
        MutableLiveData<C42843Grf> mutableLiveData2 = organizationListViewModel4.LJLIL;
        List<OrganizationSearchResultModel> list3 = organizationListViewModel4.LJLJL;
        String str2 = organizationListViewModel4.LJLJJLL;
        if (organizationListViewModel4.LJLJJI == 1) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData2.setValue(new C42843Grf(str2, true, list3, null, null, null, false, false, afS26S0110000_7.z1, z, 184));
    }

    public static final void accept$4(AfS26S0110000_7 afS26S0110000_7, Object obj) {
        boolean z;
        C170666ms.LIZJ((Throwable) obj);
        OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS26S0110000_7.l0;
        MutableLiveData<C42843Grf> mutableLiveData = organizationListViewModel.LJLIL;
        List<OrganizationSearchResultModel> list = organizationListViewModel.LJLJL;
        String str = organizationListViewModel.LJLJJLL;
        if (organizationListViewModel.LJLJJI == 1) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(new C42843Grf(str, true, list, null, null, null, false, false, afS26S0110000_7.z1, z, 184));
    }

    public AfS26S0110000_7(OrganizationListViewModel organizationListViewModel, boolean z, int i) {
        this.$t = i;
        this.l0 = organizationListViewModel;
        this.z1 = z;
    }
}
