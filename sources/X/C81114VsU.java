package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateDefaultLowerFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateDefaultLowerViewModel;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.VsU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81114VsU implements InterfaceC81111VsR {
    public final /* synthetic */ AgeGateDefaultLowerFragment LIZ;

    public C81114VsU(AgeGateDefaultLowerFragment ageGateDefaultLowerFragment) {
        this.LIZ = ageGateDefaultLowerFragment;
    }

    @Override // X.InterfaceC81111VsR
    public final void LIZ(Calendar calendar, int i) {
        Date date;
        MutableLiveData<Date> mutableLiveData = ((AgeGateDefaultLowerViewModel) this.LIZ.LJLJJL.getValue()).LJLIL;
        if (calendar != null) {
            date = calendar.getTime();
        } else {
            date = null;
        }
        mutableLiveData.postValue(date);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                AgeGateDefaultLowerFragment ageGateDefaultLowerFragment = this.LIZ;
                if (ageGateDefaultLowerFragment.LJLIL != 0) {
                    return;
                }
                ageGateDefaultLowerFragment.LJLIL = Math.max(ageGateDefaultLowerFragment.LJLILLLLZI, ageGateDefaultLowerFragment.LJLJI) + 1;
                return;
            }
            AgeGateDefaultLowerFragment ageGateDefaultLowerFragment2 = this.LIZ;
            if (ageGateDefaultLowerFragment2.LJLILLLLZI != 0) {
                return;
            }
            ageGateDefaultLowerFragment2.LJLILLLLZI = Math.max(ageGateDefaultLowerFragment2.LJLIL, ageGateDefaultLowerFragment2.LJLJI) + 1;
            return;
        }
        AgeGateDefaultLowerFragment ageGateDefaultLowerFragment3 = this.LIZ;
        if (ageGateDefaultLowerFragment3.LJLJI != 0) {
            return;
        }
        ageGateDefaultLowerFragment3.LJLJI = Math.max(ageGateDefaultLowerFragment3.LJLIL, ageGateDefaultLowerFragment3.LJLILLLLZI) + 1;
    }
}
