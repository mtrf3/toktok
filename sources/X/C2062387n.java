package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.ui.FavoriteNoticeSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.87n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2062387n {
    public static void LIZ(ActivityC45651qj activityC45651qj, String str, Aweme aweme) {
        FavoriteNoticeSheetFragment favoriteNoticeSheetFragment = new FavoriteNoticeSheetFragment();
        favoriteNoticeSheetFragment.LJLILLLLZI = aweme;
        favoriteNoticeSheetFragment.LJLIL = str;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = favoriteNoticeSheetFragment;
        tuxSheet.LJLLJ = true;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLILLLLZI = favoriteNoticeSheetFragment;
        C1DG.LJII(activityC45651qj, "act.supportFragmentManager", tuxSheet2, "FavoriteNoticeSheet");
    }
}
