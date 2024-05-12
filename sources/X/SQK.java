package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SQK {
    public static TuxSheet LIZ(FragmentManager fragmentManager, C31J enterMethod, String str) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(enterMethod, "enterMethod");
        SQM.LIZ().storeInt("BottomSheetDisplayCount", SQM.LIZ().getInt("BottomSheetDisplayCount", 0) + 1);
        DmFilterAddKeywordsBottomSheet dmFilterAddKeywordsBottomSheet = new DmFilterAddKeywordsBottomSheet(enterMethod);
        ASL asl = new ASL();
        asl.LIZ.LJZL = true;
        asl.LJFF(16);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = dmFilterAddKeywordsBottomSheet;
        dmFilterAddKeywordsBottomSheet.LJLILLLLZI = tuxSheet;
        tuxSheet.show(fragmentManager, str);
        DmFilterAddKeywordsBottomSheet.LJLJLJ = dmFilterAddKeywordsBottomSheet;
        TuxSheet tuxSheet2 = dmFilterAddKeywordsBottomSheet.LJLILLLLZI;
        if (tuxSheet2 != null) {
            return tuxSheet2;
        }
        o.LJIJI("sheet");
        throw null;
    }

    public static boolean LIZIZ(FragmentManager fragmentManager, C31J enterMethod, String str) {
        o.LJIIIZ(enterMethod, "enterMethod");
        if (DmFilterAddKeywordsBottomSheet.LJLJLJ != null || SQM.LIZ().getInt("BottomSheetDisplayCount", 0) >= 4 || SQM.LIZ().getBoolean("KeywordsEditedBefore", false)) {
            return false;
        }
        LIZ(fragmentManager, enterMethod, str);
        return true;
    }
}
