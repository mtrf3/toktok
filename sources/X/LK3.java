package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;

/* loaded from: classes10.dex */
public final class LK3 extends LK4 {
    public final /* synthetic */ MFBizIconsAssem LJLIL;

    public LK3(MFBizIconsAssem mFBizIconsAssem) {
        this.LJLIL = mFBizIconsAssem;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        IMFToolBarAbility LJJIIJZLJL;
        boolean Q1 = ECommerceMallService.v3().Q1();
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LJLIL.LJLJJL.getValue();
        if (homeViewPagerAbility == null || (str = homeViewPagerAbility.n7(i)) == null) {
            str = "";
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this.LJLIL);
        if (Q1 && LIZLLL != null) {
            if (TextUtils.equals("Shop", str)) {
                C2K0 c2k0 = null;
                if ((LIZLLL instanceof InterfaceC54054LJi) && LIZLLL.getFragmentManager() != null) {
                    c2k0 = C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), IMFShopAbility.class, null);
                }
                IMFShopAbility iMFShopAbility = (IMFShopAbility) c2k0;
                if (iMFShopAbility != null) {
                    iMFShopAbility.Jb(str);
                    return;
                }
                return;
            }
            if (TextUtils.equals("homepage_explore", str) || (LJJIIJZLJL = C78929UyL.LJJIIJZLJL(LIZLLL)) == null) {
                return;
            }
            LJJIIJZLJL.e0();
        }
    }
}
