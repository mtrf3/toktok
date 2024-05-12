package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS5S0002000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aj5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27023Aj5 implements InterfaceC27028AjA {
    public final /* synthetic */ AddressEditDetailActivity LIZ;

    public C27023Aj5(AddressEditDetailActivity addressEditDetailActivity) {
        this.LIZ = addressEditDetailActivity;
    }

    @Override // X.InterfaceC27028AjA
    public final void onItemClick(int i) {
        CandInputData candInputData;
        int size;
        View addressCandidateRecyclerView = this.LIZ._$_findCachedViewById(R.id.x1);
        o.LJIIIIZZ(addressCandidateRecyclerView, "addressCandidateRecyclerView");
        OUP.LJIJJLI(addressCandidateRecyclerView);
        View enterManuallyLayout = this.LIZ._$_findCachedViewById(R.id.cx4);
        o.LJIIIIZZ(enterManuallyLayout, "enterManuallyLayout");
        OUP.LJIJJLI(enterManuallyLayout);
        AddressEditDetailActivity addressEditDetailActivity = this.LIZ;
        if (addressEditDetailActivity.LJLJJL != 0) {
            C78946Uyc.LJJII(addressEditDetailActivity, new C70991Rtb(), new AqS170S0100000_4(this.LIZ, 1389));
        }
        List<CandInputData> list = this.LIZ.LJLLL.LJLIL;
        Address address = null;
        if (list != null) {
            candInputData = (CandInputData) ListProtector.get(list, i);
        } else {
            candInputData = null;
        }
        if (candInputData != null) {
            Integer num = candInputData.placeType;
            if (num == null || num.intValue() != 0) {
                if (candInputData.address != null) {
                    AddressEditDetailViewModel LLFZ = this.LIZ.LLFZ();
                    LLFZ.LJLJL = candInputData;
                    if (candInputData != null) {
                        address = candInputData.address;
                    }
                    LLFZ.LJLJLJ = address;
                    LLFZ.setState(new AqS135S0200000_4(LLFZ, candInputData, 273));
                }
            } else {
                AddressEditDetailViewModel LLFZ2 = this.LIZ.LLFZ();
                Address address2 = candInputData.address;
                AddressEditDetailActivity addressEditDetailActivity2 = this.LIZ;
                String str = addressEditDetailActivity2.LJLJLJ;
                String str2 = candInputData.autocompleteAddressId;
                Integer num2 = candInputData.placeType;
                AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(addressEditDetailActivity2, 1390);
                LLFZ2.getClass();
                if (address2 != null && str != null && str2 != null && str2.length() != 0) {
                    XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C26720AeC(LLFZ2, address2, str, str2, num2, aqS170S0100000_4, null), 2);
                }
            }
        }
        AddressEditDetailActivity.LJZ = "sug";
        List<CandInputData> list2 = this.LIZ.LJLLL.LJLIL;
        if (list2 != null && (size = list2.size()) > 0 && i >= 0) {
            C78946Uyc.LJJII(this.LIZ, new C70990Rta(), new AqS5S0002000_4(size, i, 2));
        }
    }
}
