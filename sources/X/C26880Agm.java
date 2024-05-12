package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelFragment;

/* renamed from: X.Agm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26880Agm {
    public static void LIZ(FragmentManager fragmentManager, AddressPageStarter.AddressListEnterParams addressListEnterParams, String str, String str2, String str3) {
        ASL LIZ = C249109q6.LIZ(1);
        LIZ.LIZ.LJLLLLLL = (int) C27162AlK.LIZJ;
        AddressListPanelFragment addressListPanelFragment = new AddressListPanelFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("enter_params", addressListEnterParams);
        bundle.putString("track_id", str);
        bundle.putString("selected_address_id", str2);
        bundle.putString("unavailable_address_ids", str3);
        if (str != null) {
            C79234V7u.LJJIJLIJ(bundle, str);
        }
        addressListPanelFragment.setArguments(bundle);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLLILLLL = addressListPanelFragment;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.show(fragmentManager, "address_list_panel_fragment");
    }
}
