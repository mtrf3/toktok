package Y;

import X.C188727au;
import X.C72549Sdd;
import X.C72553Sdh;
import X.C72556Sdk;
import X.C72734Sgc;
import X.FMX;
import X.InterfaceC72558Sdm;
import X.InterfaceC72738Sgg;
import X.LYU;
import X.ORZ;
import X.SR0;
import X.SR1;
import X.T9W;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.ui.CountryListActivity;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.detail.panel.CreateButtonPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACListenerS29S0101000_12 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS29S0101000_12 aCListenerS29S0101000_12, View view) {
        switch (aCListenerS29S0101000_12.i1) {
            case 0:
                ((CreateButtonPanel) ((LifecycleOwner) aCListenerS29S0101000_12.l0)).LLIIJLIL(view);
                return;
            case 1:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) ((LifecycleOwner) aCListenerS29S0101000_12.l0);
                stickerPropDetailFragment.getClass();
                view.setVisibility(8);
                stickerPropDetailFragment.LLJJLIIIJLLLLLLLZ = 0.0f;
                stickerPropDetailFragment.LLJJL = 0.0f;
                ((Keva) T9W.LIZ.getValue()).storeInt("click_status", 1);
                stickerPropDetailFragment.Gl("click_banner");
                return;
            default:
                ((BaseDiscoverAndSearchFragmentNew) ((LifecycleOwner) aCListenerS29S0101000_12.l0)).sm();
                return;
        }
    }

    public static final void onClick$1(ACListenerS29S0101000_12 aCListenerS29S0101000_12, View view) {
        EditProfileBadgeModel editProfileBadgeModel;
        ((C72734Sgc) aCListenerS29S0101000_12.l0).LJLJJI = Integer.valueOf(aCListenerS29S0101000_12.i1);
        C72734Sgc c72734Sgc = (C72734Sgc) aCListenerS29S0101000_12.l0;
        InterfaceC72738Sgg interfaceC72738Sgg = c72734Sgc.LJLIL;
        List<EditProfileBadgeModel> list = c72734Sgc.LJLILLLLZI;
        if (list != null) {
            editProfileBadgeModel = (EditProfileBadgeModel) ORZ.LJLLLLLL(aCListenerS29S0101000_12.i1, list);
        } else {
            editProfileBadgeModel = null;
        }
        interfaceC72738Sgg.Ob(editProfileBadgeModel);
        ((C72734Sgc) aCListenerS29S0101000_12.l0).notifyDataSetChanged();
    }

    public static final void onClick$2(ACListenerS29S0101000_12 aCListenerS29S0101000_12, View view) {
        SR1 sr1 = ((SR0) aCListenerS29S0101000_12.l0).LJLIL;
        if (sr1 != null) {
            sr1.onItemClick(aCListenerS29S0101000_12.i1);
        }
    }

    public static final void onClick$3(ACListenerS29S0101000_12 aCListenerS29S0101000_12, View view) {
        switch (aCListenerS29S0101000_12.i1) {
            case 0:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) ((AmeBaseFragment) aCListenerS29S0101000_12.l0);
                stickerPropDetailFragment.LLILZ.setVisibility(8);
                stickerPropDetailFragment.LLJJLIIIJLLLLLLLZ = 0.0f;
                stickerPropDetailFragment.LLJJL = 0.0f;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("prop_id", stickerPropDetailFragment.getCurId());
                c188727au.LJIIIZ("enter_from", "prop_page");
                FMX.LJIIL("close_h5_page_entrance_banner", c188727au.LIZ);
                ((Keva) T9W.LIZ.getValue()).storeInt("click_status", 1);
                return;
            default:
                BaseDiscoverAndSearchFragmentNew.vl((BaseDiscoverAndSearchFragmentNew) ((AmeBaseFragment) aCListenerS29S0101000_12.l0));
                return;
        }
    }

    public static final void onClick$4(ACListenerS29S0101000_12 aCListenerS29S0101000_12, View view) {
        switch (aCListenerS29S0101000_12.i1) {
            case 0:
                ((CountryListActivity) aCListenerS29S0101000_12.l0).onBackPressed();
                return;
            case 1:
                FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aCListenerS29S0101000_12.l0;
                feedFollowFragment.getClass();
                LYU.LJI = "click";
                feedFollowFragment.Ol();
                return;
            case 2:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aCListenerS29S0101000_12.l0;
                if (stickerPropDetailFragment.LLJLIL == null) {
                    return;
                }
                stickerPropDetailFragment.Jl();
                stickerPropDetailFragment.LLILLJJLI.LIZIZ();
                return;
            case 3:
                ((BaseDiscoverAndSearchFragmentNew) aCListenerS29S0101000_12.l0).sm();
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS29S0101000_12.l0).lambda$initUnits$17(view);
                return;
        }
    }

    public static final void onClick$5(ACListenerS29S0101000_12 aCListenerS29S0101000_12, View view) {
        C72549Sdd c72549Sdd = ((C72553Sdh) aCListenerS29S0101000_12.l0).LJLIL;
        int LJZ = ORZ.LJZ(c72549Sdd.LIZIZ, c72549Sdd.LIZ);
        C72553Sdh c72553Sdh = (C72553Sdh) aCListenerS29S0101000_12.l0;
        InterfaceC72558Sdm interfaceC72558Sdm = c72553Sdh.LJLILLLLZI;
        Object obj = ListProtector.get(c72553Sdh.LJLIL.LIZ, aCListenerS29S0101000_12.i1);
        o.LJIIIIZZ(obj, "data.colors[position]");
        interfaceC72558Sdm.Jd((C72556Sdk) obj);
        ((C72553Sdh) aCListenerS29S0101000_12.l0).notifyItemChanged(LJZ);
        ((C72553Sdh) aCListenerS29S0101000_12.l0).notifyItemChanged(aCListenerS29S0101000_12.i1);
    }

    public ACListenerS29S0101000_12(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
