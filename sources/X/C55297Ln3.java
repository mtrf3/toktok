package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunTabInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ln3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55297Ln3 extends AbstractC51501KJd {
    public final ScrollSwitchStateManager LJLJJLL;
    public List<MallRacunTabInfo> LJLJL;
    public final HashMap<Integer, MallRacunPageFragment> LJLJLJ;
    public Bundle LJLJLLL;
    public Integer LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<MallRacunTabInfo> list = this.LJLJL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        MallRacunTabInfo mallRacunTabInfo;
        List<MallRacunTabInfo> list = this.LJLJL;
        if (list != null && (mallRacunTabInfo = (MallRacunTabInfo) ListProtector.get(list, i)) != null) {
            return mallRacunTabInfo.getTabName();
        }
        return null;
    }

    public final MallRacunPageFragment LJJIIZI(int i) {
        return this.LJLJLJ.get(Integer.valueOf(i));
    }

    public C55297Ln3(FragmentManager fragmentManager, ScrollSwitchStateManager scrollSwitchStateManager) {
        super(fragmentManager);
        this.LJLJJLL = scrollSwitchStateManager;
        this.LJLJLJ = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51501KJd, androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        Object LJIILLIIL = super.LJIILLIIL(i, viewGroup);
        o.LJIIIIZZ(LJIILLIIL, "super.instantiateItem(viewGroup, position)");
        this.LJLJLJ.put(Integer.valueOf(i), LJIILLIIL);
        return LJIILLIIL;
    }

    @Override // X.AbstractC51502KJe
    public final Object LJJIII(int i, ViewGroup viewGroup) {
        MallRacunTabInfo mallRacunTabInfo;
        MallRacunPageFragment mallRacunPageFragment = new MallRacunPageFragment();
        mallRacunPageFragment.setArguments(this.LJLJLLL);
        mallRacunPageFragment.LLIFFJFJJ = this.LJLL;
        List<MallRacunTabInfo> list = this.LJLJL;
        if (list != null) {
            mallRacunTabInfo = (MallRacunTabInfo) ORZ.LJLLLLLL(i, list);
        } else {
            mallRacunTabInfo = null;
        }
        mallRacunPageFragment.LLII = mallRacunTabInfo;
        mallRacunPageFragment.LJLILLLLZI.LJLJL = mallRacunTabInfo;
        return mallRacunPageFragment;
    }
}
