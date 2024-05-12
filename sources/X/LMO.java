package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class LMO extends LK4 {
    public final /* synthetic */ MFSocialAssem LJLIL;

    public LMO(MFSocialAssem mFSocialAssem) {
        this.LJLIL = mFSocialAssem;
    }

    @Override // X.LK4, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        InterfaceC55235Lm3 LJIIZILJ;
        HomeViewPagerAbility homeViewPagerAbility;
        MFSocialAssem mFSocialAssem = this.LJLIL;
        mFSocialAssem.getClass();
        if (C53314KwA.LIZ() && !mFSocialAssem.LJLJJI) {
            mFSocialAssem.LJLJJI = true;
            Context context = mFSocialAssem.getContext();
            if (context != null && (LJIIZILJ = C55096Ljo.LJIIZILJ(mFSocialAssem)) != null && (homeViewPagerAbility = (HomeViewPagerAbility) C55096Ljo.LIZ(LJIIZILJ, HomeViewPagerAbility.class, null)) != null) {
                homeViewPagerAbility.LJJLIIIIJ(C04330Ez.LIZIZ(context, R.color.ey));
            }
        }
        LND lnd = this.LJLIL.LJLJLJ;
        if (lnd != null) {
            lnd.onPageScrollStateChanged(i);
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        LND lnd = this.LJLIL.LJLJLJ;
        if (lnd != null) {
            lnd.onPageSelected(i);
        }
    }
}
