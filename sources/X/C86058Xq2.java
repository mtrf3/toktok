package X;

import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.AgeGateYearOnlyRegistrationFragment;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Xq2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86058Xq2 implements InterfaceC81110VsQ {
    public final /* synthetic */ AgeGateYearOnlyRegistrationFragment LIZ;

    public C86058Xq2(AgeGateYearOnlyRegistrationFragment ageGateYearOnlyRegistrationFragment) {
        this.LIZ = ageGateYearOnlyRegistrationFragment;
    }

    @Override // X.InterfaceC81110VsQ
    public final void LIZ(int i, Calendar calendar, int i2) {
        Date date;
        AgeGateYearOnlyRegistrationFragment ageGateYearOnlyRegistrationFragment = this.LIZ;
        Date date2 = null;
        if (calendar != null) {
            date = calendar.getTime();
        } else {
            date = null;
        }
        ageGateYearOnlyRegistrationFragment.LJLLILLLL = date;
        this.LIZ.Pl().LJLIL.postValue(this.LIZ.LJLLILLLL);
        SY4 sy4 = (SY4) this.LIZ._$_findCachedViewById(R.id.yr);
        if (sy4 != null) {
            sy4.setEnabled(true);
        }
        this.LIZ.Yl(i);
        C81108VsO c81108VsO = (C81108VsO) this.LIZ._$_findCachedViewById(R.id.ym);
        if (calendar != null) {
            date2 = calendar.getTime();
        }
        c81108VsO.LIZJ(date2);
    }
}
