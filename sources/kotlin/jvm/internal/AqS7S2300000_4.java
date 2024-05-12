package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C25939AFz;
import X.C76800UCe;
import X.C78983UzD;
import X.InterfaceC65784Pro;
import X.OSZ;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS7S2300000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS7S2300000_4 aqS7S2300000_4) {
        IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
        Context context = ((C25939AFz) aqS7S2300000_4.l2).getContext();
        o.LJIIIIZZ(context, "context");
        LJIIIZ.LJI(context, aqS7S2300000_4.s0, aqS7S2300000_4.s1, C78983UzD.LJJJJJ((User) aqS7S2300000_4.l3), "follow", null, null, (Map) aqS7S2300000_4.l4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS7S2300000_4 aqS7S2300000_4) {
        Map<String, Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("follow_status", String.valueOf(((User) aqS7S2300000_4.l2).getFollowStatus())), new OSZ("enter_from", ((FollowListAdapter) aqS7S2300000_4.l3).LL()), new OSZ("source_previous_page", "follow"), new OSZ("start_click_time", Long.valueOf(System.currentTimeMillis())));
        IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
        Context context = ((C25939AFz) aqS7S2300000_4.l4).getContext();
        o.LJIIIIZZ(context, "context");
        LJIIIZ.LJ(context, aqS7S2300000_4.s0, aqS7S2300000_4.s1, ((FollowListAdapter) aqS7S2300000_4.l3).LL(), "follow", null, C78983UzD.LJJJJJ((User) aqS7S2300000_4.l2), Integer.valueOf(((User) aqS7S2300000_4.l2).getFollowStatus()), ((FollowListAdapter) aqS7S2300000_4.l3).LLD(), null, null, null, LJJLIIIIJ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S2300000_4(C25939AFz c25939AFz, C25939AFz c25939AFz2, String str, String str2, User user, Map<String, Object> map) {
        super(0);
        this.$t = map;
        this.l2 = c25939AFz;
        this.s0 = c25939AFz2;
        this.s1 = str;
        this.l3 = str2;
        this.l4 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S2300000_4(User user, FollowListAdapter followListAdapter, C25939AFz c25939AFz, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = user;
        this.l3 = followListAdapter;
        this.l4 = c25939AFz;
        this.s0 = str;
        this.s1 = str2;
    }
}
