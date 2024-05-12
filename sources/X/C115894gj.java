package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardSettingsFragment;

/* renamed from: X.4gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115894gj {
    public static void LIZ(FragmentManager fragmentManager, Bundle bundle) {
        ASL asl = new ASL();
        BillboardSettingsFragment billboardSettingsFragment = new BillboardSettingsFragment();
        billboardSettingsFragment.setArguments(bundle);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = billboardSettingsFragment;
        tuxSheet.LJZI = false;
        asl.LJI(1);
        int LIZIZ = (int) C27162AlK.LIZIZ();
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = LIZIZ;
        tuxSheet2.LJZL = true;
        tuxSheet2.show(fragmentManager, BillboardSettingsFragment.class.getName());
    }
}
