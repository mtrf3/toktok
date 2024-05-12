package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import com.zhiliaoapp.musically.R;

/* renamed from: X.AnC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27278AnC implements InterfaceC56182M3e {
    public final long LIZ = System.currentTimeMillis();
    public final /* synthetic */ AddressEditViewModel LIZIZ;

    public C27278AnC(AddressEditViewModel addressEditViewModel) {
        this.LIZIZ = addressEditViewModel;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        String str;
        this.LIZIZ.LL = System.currentTimeMillis() - this.LIZ;
        AddressEditViewModel addressEditViewModel = this.LIZIZ;
        Integer valueOf = Integer.valueOf(R.string.f6s);
        if (j0x != null) {
            str = j0x.getCode();
        } else {
            str = null;
        }
        addressEditViewModel.getClass();
        AddressEditViewModel.ow0(-1, valueOf, str);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        this.LIZIZ.LL = System.currentTimeMillis() - this.LIZ;
        if (bDLocationProxy == null) {
            AddressEditViewModel addressEditViewModel = this.LIZIZ;
            Integer valueOf = Integer.valueOf(R.string.f6s);
            addressEditViewModel.getClass();
            AddressEditViewModel.ow0(-1, valueOf, "fetchLocation onLocationChanged is null");
            return;
        }
        AddressEditViewModel addressEditViewModel2 = this.LIZIZ;
        addressEditViewModel2.getClass();
        addressEditViewModel2.LLIFFJFJJ = new MapLocateData(String.valueOf(bDLocationProxy.getLongitude()), String.valueOf(bDLocationProxy.getLatitude()), addressEditViewModel2.Nv0(addressEditViewModel2.hw0(), true), addressEditViewModel2.LLII, addressEditViewModel2.LLIIII, null, null, null);
        AddressEditViewModel.ow0(1, Integer.valueOf(R.string.f5j), "");
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
