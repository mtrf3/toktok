package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NYv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59553NYv implements InterfaceC80650Vl0 {
    public final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget LJLIL;

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        return false;
    }

    public C59553NYv(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
        this.LJLIL = adNewFakeUserProfileDetailFragmentWidget;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        C80648Vky LJIJ;
        List<Fragment> list = this.LJLIL.LJLLLLLL;
        if (list == null || ((ArrayList) list).isEmpty() || this.LJLIL.LJIJ() == null || (LJIJ = this.LJLIL.LJIJ()) == null) {
            return;
        }
        LJIJ.setCanScrollUp(true);
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        List<Fragment> list;
        C80648Vky LJIJ;
        AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget = this.LJLIL;
        if (!adNewFakeUserProfileDetailFragmentWidget.LJLJJLL || (list = adNewFakeUserProfileDetailFragmentWidget.LJLLLLLL) == null || ((ArrayList) list).isEmpty() || this.LJLIL.LJIJ() == null || (LJIJ = this.LJLIL.LJIJ()) == null) {
            return;
        }
        LJIJ.setCanScrollUp(true);
    }
}
