package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;

/* renamed from: X.LJq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C54062LJq extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C54062LJq(Object obj) {
        super(0, obj, MainPageFragment.class, "feedUGViewShowFestival", "feedUGViewShowFestival()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC57312Mt interfaceC57312Mt;
        MainPageFragment mainPageFragment = (MainPageFragment) this.receiver;
        InterfaceC54061LJp wl = mainPageFragment.wl();
        Fragment fragment = null;
        if (wl != null) {
            interfaceC57312Mt = wl.LJIIIIZZ();
        } else {
            interfaceC57312Mt = null;
        }
        TabChangeManager tabChangeManager = mainPageFragment.LJLJL;
        if (tabChangeManager != null) {
            fragment = tabChangeManager.mv0();
        }
        if ((fragment instanceof MainFragment) && (((MainFragment) fragment).w2() instanceof FeedRecommendFragment) && wl != null && interfaceC57312Mt != null) {
            interfaceC57312Mt.LJJJIL();
        }
        return C76800UCe.LIZ;
    }
}
