package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.adapter.RegionAdapter;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;

/* loaded from: classes5.dex */
public class AqS67S0000000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0000000_4(RegionAdapter regionAdapter, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AqS67S0000000_4 aqS67S0000000_4, Object obj) {
        ViewGroup it = (ViewGroup) obj;
        o.LJIIIZ(it, "it");
        return new RegionAdapter.IndicatorViewHolder(it);
    }

    public static final Object invoke$1(AqS67S0000000_4 aqS67S0000000_4, Object obj) {
        ViewGroup parent = (ViewGroup) obj;
        o.LJIIIZ(parent, "parent");
        return new PushSettingFollowListAdapter.FollowItemViewTitleHolder(parent);
    }

    public static final Object invoke$2(AqS67S0000000_4 aqS67S0000000_4, Object obj) {
        ViewGroup parent = (ViewGroup) obj;
        o.LJIIIZ(parent, "parent");
        return new PushSettingFollowListAdapter.RewardItemViewSwitchHolder(parent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0000000_4(PushSettingFollowListAdapter pushSettingFollowListAdapter, int i) {
        super(1);
        this.$t = i;
    }
}
