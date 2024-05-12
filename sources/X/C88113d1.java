package X;

import Y.IDDListenerS141S0100000_1;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.container.fragment.StickerStorePanelFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.fragment.StickerSetDetailFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3d1 */
/* loaded from: classes2.dex */
public final class C88113d1 {
    public static void LIZJ(ActivityC45651qj activityC45651qj, List tabTypeList, String str, Bundle bundle) {
        o.LJIIIZ(tabTypeList, "tabTypeList");
        C87393br.LJI(String.valueOf(activityC45651qj.hashCode()));
        ASL asl = new ASL();
        asl.LJI(2);
        asl.LIZJ((int) (C63081OpJ.LJJJJJL(activityC45651qj) * 0.73f), (int) (C63081OpJ.LJJJJJL(activityC45651qj) * 0.95f));
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJZL = true;
        StickerStorePanelFragment stickerStorePanelFragment = new StickerStorePanelFragment();
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putIntArray("tab_type_list", ORZ.LLJ(tabTypeList));
        if (str != null) {
            bundle.putString("conversation_id", str);
        }
        stickerStorePanelFragment.setArguments(bundle);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLILLLL = stickerStorePanelFragment;
        tuxSheet2.LJLILLLLZI = new IDDListenerS141S0100000_1(activityC45651qj, 5);
        C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet2, "sticker_store_panel");
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, long j, int i, String str, boolean z, String str2) {
        C84683Ua.LJFF.LIZIZ(new C88013cr(), true);
        C87393br.LJI(String.valueOf(activityC45651qj.hashCode()));
        ASL asl = new ASL();
        asl.LJI(2);
        asl.LIZJ((int) (C63081OpJ.LJJJJJL(activityC45651qj) * 0.73f), (int) (C63081OpJ.LJJJJJL(activityC45651qj) * 0.95f));
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJZL = true;
        StickerSetDetailFragment LIZ = C88123d2.LIZ(i, str, str2, z, j);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLILLLL = LIZ;
        tuxSheet2.LJLILLLLZI = new IDDListenerS141S0100000_1(activityC45651qj, 4);
        C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet2, "sticker_store_panel");
    }

    public static /* synthetic */ void LIZIZ(ActivityC45651qj activityC45651qj, long j, int i, String str, String str2, int i2) {
        String str3 = str;
        String str4 = null;
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 32) == 0) {
            str4 = str2;
        }
        LIZ(activityC45651qj, j, i, str3, false, str4);
    }
}
