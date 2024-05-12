package X;

import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.AGs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25958AGs implements InterfaceC74055T4p {
    public final /* synthetic */ CreatorCenterFragment LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C25958AGs(CreatorCenterFragment creatorCenterFragment) {
        this.LIZ = creatorCenterFragment;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        o.LJIIIZ(tab, "tab");
        ViewPager viewPager = this.LIZ.LJLJJL;
        if (viewPager != null) {
            viewPager.setCurrentItem(tab.LIZLLL, true);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("tab_name", this.LIZ.LJLL.get(Integer.valueOf(tab.LIZLLL)));
            FMX.LJIIL("creator_center_tab_show", c188727au.LIZ);
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }
}
