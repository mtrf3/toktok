package com.ss.android.ugc.aweme.ecommerce.global.address.list;

import X.C26639Act;
import X.C26645Acz;
import X.C78613UtF;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalAddressListViewModel extends AddressListViewModel {
    public boolean LLF;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel
    public final List<Object> Pv0(AddressListData addressListData) {
        o.LJIIIZ(addressListData, "addressListData");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C26639Act());
        withState(new AqS108S0300000_4(addressListData, (AddressListData) arrayList, (List<Object>) this, (GlobalAddressListViewModel) 14));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel
    public final void Rv0(Address address) {
        o.LJIIIZ(address, "address");
        setState(new AqS135S0200000_4(address, this, 58));
        if (Ov0() && !o.LJ(this.LJLJLJ, Boolean.TRUE)) {
            Jv0(address);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel
    public final void Sv0(Address address) {
        o.LJIIIZ(address, "address");
        Uv0(0);
        this.LLF = true;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C26645Acz(address, this, null), 2);
    }
}
