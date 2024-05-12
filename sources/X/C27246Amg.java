package X;

import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;

/* renamed from: X.Amg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27246Amg {
    public static void LIZ(FragmentManager fragmentManager, AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        AddressEditFragment addressEditFragment = new AddressEditFragment();
        if (addressEditEnterParams != null) {
            addressEditFragment.LJLLJ = addressEditEnterParams;
            addressEditFragment.LJZI = false;
            addressEditFragment.LJZL = 0;
        }
        addressEditFragment.LJLLLLLL = SystemClock.elapsedRealtime();
        ASL LIZ = C249109q6.LIZ(1);
        LIZ.LIZ.LJLLJ = true;
        LIZ.LJFF(16);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLLILLLL = addressEditFragment;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.LLD = false;
        tuxSheet.LJLJJL = true;
        tuxSheet.show(fragmentManager, "address_edit_fragment");
    }
}
