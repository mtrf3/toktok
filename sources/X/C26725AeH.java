package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServicePopup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.ShippingServiceFragment;

/* renamed from: X.AeH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26725AeH {
    public static Object LIZ(FragmentManager fragmentManager, ShippingServicePopup shippingServicePopup, String str, InterfaceC71003Rtn interfaceC71003Rtn, InterfaceC67352kd interfaceC67352kd) {
        if (shippingServicePopup == null) {
            return C76800UCe.LIZ;
        }
        if (fragmentManager == null) {
            return C76800UCe.LIZ;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        ShippingServiceFragment.LJLJJI = c84654XKg;
        ASL LIZ = C249109q6.LIZ(1);
        LIZ.LIZ.LJLLLLLL = (int) C27162AlK.LIZJ;
        ShippingServiceFragment shippingServiceFragment = new ShippingServiceFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_content_popup", shippingServicePopup);
        if (str == null) {
            str = "";
        }
        bundle.putString("shipping_rights_content", str);
        if (interfaceC71003Rtn != null) {
            C79234V7u.LJJIJIIJI(bundle, interfaceC71003Rtn, null);
        }
        shippingServiceFragment.setArguments(bundle);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLLILLLL = shippingServiceFragment;
        tuxSheet.LJZI = false;
        tuxSheet.show(fragmentManager, "ShippingServiceFragment");
        Object LIZ2 = c84654XKg.LIZ();
        if (LIZ2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ2;
        }
        return C76800UCe.LIZ;
    }
}
