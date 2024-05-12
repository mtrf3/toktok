package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Xq3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86059Xq3 implements InterfaceC81110VsQ {
    public final /* synthetic */ TTKAgeGateRegistrationFragment LIZ;

    public C86059Xq3(TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment) {
        this.LIZ = tTKAgeGateRegistrationFragment;
    }

    @Override // X.InterfaceC81110VsQ
    public final void LIZ(int i, Calendar calendar, int i2) {
        Date date;
        MutableLiveData<Date> mutableLiveData = this.LIZ.Pl().LJLIL;
        if (calendar != null) {
            date = calendar.getTime();
        } else {
            date = null;
        }
        mutableLiveData.postValue(date);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment = this.LIZ;
                if (tTKAgeGateRegistrationFragment.LJLJJL != 0) {
                    return;
                }
                tTKAgeGateRegistrationFragment.LJLJJL = Math.max(tTKAgeGateRegistrationFragment.LJLJJLL, tTKAgeGateRegistrationFragment.LJLJL) + 1;
                return;
            }
            TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment2 = this.LIZ;
            if (tTKAgeGateRegistrationFragment2.LJLJJLL != 0) {
                return;
            }
            tTKAgeGateRegistrationFragment2.LJLJJLL = Math.max(tTKAgeGateRegistrationFragment2.LJLJJL, tTKAgeGateRegistrationFragment2.LJLJL) + 1;
            return;
        }
        TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment3 = this.LIZ;
        if (tTKAgeGateRegistrationFragment3.LJLJL != 0) {
            return;
        }
        tTKAgeGateRegistrationFragment3.LJLJL = Math.max(tTKAgeGateRegistrationFragment3.LJLJJL, tTKAgeGateRegistrationFragment3.LJLJJLL) + 1;
    }
}
