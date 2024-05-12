package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.NoShippingTimeFragment;

/* renamed from: X.Ako, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27130Ako {
    public static void LIZ(FragmentManager fragmentManager, ShippingDialogDto shippingDialogDto, InterfaceC71003Rtn interfaceC71003Rtn) {
        if (shippingDialogDto != null && fragmentManager != null) {
            NoShippingTimeFragment noShippingTimeFragment = new NoShippingTimeFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("shipping_dialog", shippingDialogDto);
            if (interfaceC71003Rtn != null) {
                C79234V7u.LJJIJIIJI(bundle, interfaceC71003Rtn, null);
            }
            noShippingTimeFragment.setArguments(bundle);
            ASL asl = new ASL();
            asl.LJI(1);
            int i = (((int) C27162AlK.LIZJ) * 5) / 8;
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLLLLL = i;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJLLILLLL = noShippingTimeFragment;
            tuxSheet.show(fragmentManager, "NoShippingTimeFragment");
        }
    }
}
