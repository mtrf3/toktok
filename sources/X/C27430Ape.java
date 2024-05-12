package X;

import android.view.View;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ape, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27430Ape implements InterfaceC56182M3e {
    public final /* synthetic */ DistrictFragment LIZ;

    public C27430Ape(DistrictFragment districtFragment) {
        this.LIZ = districtFragment;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        if (!this.LIZ.isAdded()) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIZ(this.LIZ.getString(R.string.f6s));
        c26045AKb.LJIIJ();
        View view = this.LIZ.getView();
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70945Rsr(0), new AqS135S0200000_4(j0x, this.LIZ, 55));
        }
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        if (!this.LIZ.isAdded()) {
            return;
        }
        if (bDLocationProxy == null) {
            C36746EbW.LIZ(4, "onLocationDataChanged, location is null");
            View tvUseCurrentLocation = this.LIZ._$_findCachedViewById(R.id.lyg);
            o.LJIIIIZZ(tvUseCurrentLocation, "tvUseCurrentLocation");
            OUP.LJIJJLI(tvUseCurrentLocation);
            View tvCurrentLocation = this.LIZ._$_findCachedViewById(R.id.lw3);
            o.LJIIIIZZ(tvCurrentLocation, "tvCurrentLocation");
            OUP.LJIJJLI(tvCurrentLocation);
            View iconSpinner = this.LIZ._$_findCachedViewById(R.id.eag);
            o.LJIIIIZZ(iconSpinner, "iconSpinner");
            OUP.LJJLIIIJ(iconSpinner);
            View locateSpinner = this.LIZ._$_findCachedViewById(R.id.g9j);
            o.LJIIIIZZ(locateSpinner, "locateSpinner");
            OUP.LJIJJLI(locateSpinner);
            C26045AKb c26045AKb = new C26045AKb(this.LIZ);
            c26045AKb.LJIIIZ(this.LIZ.getString(R.string.f6s));
            c26045AKb.LJIIJ();
            View view = this.LIZ.getView();
            if (view != null) {
                C78946Uyc.LJJIIJ(view, new C70945Rsr(0), new AqS170S0100000_4(this.LIZ, 325));
                return;
            }
            return;
        }
        DistrictFragment districtFragment = this.LIZ;
        C78565UsT.LJJIJIIJIL(districtFragment, new C27429Apd(bDLocationProxy, districtFragment, null));
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        C56181M3d.LIZ(this, bDLocationException);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        C56181M3d.LIZIZ(this, bDLocation);
    }
}
