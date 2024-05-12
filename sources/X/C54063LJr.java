package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.LegoAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.main.MainFragment;

/* renamed from: X.LJr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C54063LJr extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C54063LJr(Object obj) {
        super(0, obj, LegoAssem.class, "feedUGViewShowFestival", "feedUGViewShowFestival()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C2MA Fi;
        InterfaceC57312Mt LJIIIIZZ;
        ActivityC45651qj LIZ;
        C8W0 c8w0 = (C8W0) this.receiver;
        c8w0.getClass();
        MainPageBusinessAssem mainPageBusinessAssem = (MainPageBusinessAssem) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(c8w0), MainPageBusinessAssem.class, null);
        if (mainPageBusinessAssem != null && (Fi = mainPageBusinessAssem.Fi()) != null && (LJIIIIZZ = Fi.LJIIIIZZ()) != null && (LIZ = C212428Vi.LIZ(mainPageBusinessAssem)) != null) {
            Fragment mv0 = C116694i1.LIZ(LIZ).mv0();
            if ((mv0 instanceof MainFragment) && (((MainFragment) mv0).w2() instanceof FeedRecommendFragment)) {
                LJIIIIZZ.LJJJIL();
            }
        }
        return C76800UCe.LIZ;
    }
}
