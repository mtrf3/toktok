package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import java.util.ArrayList;

/* renamed from: X.LYw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54458LYw extends LK4 {
    public final /* synthetic */ NonPersonalizedAssem LJLIL;

    public C54458LYw(NonPersonalizedAssem nonPersonalizedAssem) {
        this.LJLIL = nonPersonalizedAssem;
    }

    @Override // X.LK4, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.LJLIL.LJLLI = i;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        NonPersonalizedAssem nonPersonalizedAssem = this.LJLIL;
        int i2 = nonPersonalizedAssem.LJLLI;
        nonPersonalizedAssem.LJLLI = 0;
        nonPersonalizedAssem.I3().setStateImmediate(C35669DzF.LJLIL);
        if (i2 == 1) {
            ArrayList<String> arrayList = NonPersonalizedVM.LJLIL;
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LJLIL.LJLLJ.getValue();
            if (homeTabAbility != null) {
                str = homeTabAbility.QW();
            } else {
                str = null;
            }
            if (ORZ.LJLJJI(str, arrayList) && C90383gg.LIZ()) {
                this.LJLIL.I3().gv0();
                this.LJLIL.H3().LIZJ(LZ1.LJLIL);
            }
        }
    }
}
