package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SizeGuideFragment;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27504Aqq {
    public static void LIZ(FragmentManager fragmentManager, String trackNodeId, SizeGuide sizeGuide) {
        o.LJIIIZ(trackNodeId, "trackNodeId");
        C1A8.LJIJI(trackNodeId, new AqS170S0100000_4(sizeGuide, 304));
        ASL asl = new ASL();
        asl.LJI(1);
        asl.LIZ.LJLLLLLL = (int) C27162AlK.LIZJ;
        SizeGuideFragment sizeGuideFragment = new SizeGuideFragment();
        Bundle bundle = new Bundle();
        C79234V7u.LJJIJLIJ(bundle, trackNodeId);
        sizeGuideFragment.setArguments(bundle);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = sizeGuideFragment;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.show(fragmentManager, "size_guide");
    }
}
