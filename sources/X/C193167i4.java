package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.7i4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193167i4 {
    public static void LIZ(ActivityC45651qj activity, boolean z, String str, String str2, int i, InterfaceC192547h4 interfaceC192547h4, boolean z2) {
        o.LJIIIZ(activity, "activity");
        ChooseCollectionSheetFragment chooseCollectionSheetFragment = new ChooseCollectionSheetFragment();
        chooseCollectionSheetFragment.Dl(interfaceC192547h4);
        Bundle LIZJ = AnonymousClass036.LIZJ("excludeId", str, "enterFrom", str2);
        LIZJ.putBoolean("moveToCollection", z);
        LIZJ.putInt("firstPageCount", i);
        LIZJ.putBoolean("useCache", z2);
        chooseCollectionSheetFragment.setArguments(LIZJ);
        ASL asl = new ASL();
        asl.LJI(1);
        asl.LJFF(16);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = chooseCollectionSheetFragment;
        tuxSheet.LJZI = false;
        C1DG.LJII(activity, "activity.supportFragmentManager", tuxSheet, "VideoCollectionChooseCollection");
    }
}
