package X;

import android.content.Context;
import com.ss.android.ugc.aweme.paidcontent.manageseries.fragment.ManageSeriesFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class A0V extends AbstractC008101l {
    public final /* synthetic */ ManageSeriesFragment LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        ManageSeriesFragment manageSeriesFragment = this.LIZJ;
        Context context = manageSeriesFragment.getContext();
        if (context != null) {
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LJ(R.string.qrm);
            LIZ.LIZ(R.string.qrj);
            UC0.LIZJ(LIZ, new AqS170S0100000_4(manageSeriesFragment, 1374));
            LIZ.LJII = true;
            LIZ.LJI().LIZLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0V(ManageSeriesFragment manageSeriesFragment) {
        super(true);
        this.LIZJ = manageSeriesFragment;
    }
}
