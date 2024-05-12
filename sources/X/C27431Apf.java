package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;

/* renamed from: X.Apf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27431Apf implements InterfaceC54674Ld0 {
    public final /* synthetic */ DistrictFragment LIZ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        this.LIZ.wl();
    }

    public C27431Apf(DistrictFragment districtFragment) {
        this.LIZ = districtFragment;
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIZ(this.LIZ.getString(R.string.f6s));
        c26045AKb.LJIIJ();
        View view = this.LIZ.getView();
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70945Rsr(0), new AqS170S0100000_4(this.LIZ, 1256));
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIZ(this.LIZ.getString(R.string.f6u));
        c26045AKb.LJIIJ();
        View view = this.LIZ.getView();
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70945Rsr(0), new AqS58S1100000_4(str, this.LIZ, 41));
        }
    }
}
