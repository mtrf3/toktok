package X;

import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BON implements C0C3 {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ LiveDrawerDialogV3 LJLJI;

    public BON(LiveDrawerDialogV3 liveDrawerDialogV3) {
        this.LJLJI = liveDrawerDialogV3;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = true;
        if (i == 1) {
            this.LJLIL = true;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        String str2;
        BOO boo = this.LJLJI.LJLJL;
        if (boo != null) {
            str = ((DrawerTabsItem) ListProtector.get(boo.LJLJLJ, i)).tabType;
        } else {
            str = null;
        }
        if (this.LJLILLLLZI) {
            LiveDrawerDialogV3 liveDrawerDialogV3 = this.LJLJI;
            if (this.LJLIL) {
                str2 = "slide";
            } else {
                str2 = "click";
            }
            if (liveDrawerDialogV3.LJZ) {
                BZI LIZ = C28787BRn.LIZ("livesdk_drawer_tab_switch");
                LIZ.LJIILLIIL(liveDrawerDialogV3.LJLJJLL);
                LIZ.LJIJJ(str2, "switch_action");
                C06490Nh.LIZLLL(LIZ, "auto", "landing_reason", str, "tab_type");
                C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                c08680Vs.getClass();
                c08680Vs.LJIIJJI = "auto";
            }
            liveDrawerDialogV3.LJZ = true;
            this.LJLILLLLZI = false;
            this.LJLIL = false;
        }
        C08680Vs.LJIILJJIL.LJII = str;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        ((BUC) this.LJLJI._$_findCachedViewById(R.id.chi)).setViewPagerPos(i);
    }
}
