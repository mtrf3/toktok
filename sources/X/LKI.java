package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.List;

/* loaded from: classes10.dex */
public final class LKI extends LK4 {
    public final /* synthetic */ MFUGAssem LJLIL;

    public LKI(MFUGAssem mFUGAssem) {
        this.LJLIL = mFUGAssem;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        List<TopTabProtocol> list;
        String str;
        TopTabProtocol topTabProtocol;
        HomeTabAbility homeTabAbility;
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLIL);
        if (LJIIIIZZ == null || (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJIIIIZZ, null), HomeTabAbility.class, null)) == null || (list = homeTabAbility.L2()) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (i < 0 || i >= list.size() || (topTabProtocol = (TopTabProtocol) ListProtector.get(list, i)) == null || (str = topTabProtocol.getTag()) == null) {
            str = "";
        }
        SpecActServiceImpl.LJJJIL().LJJIJIIJI(str);
        this.LJLIL.A3(i, true);
    }
}
