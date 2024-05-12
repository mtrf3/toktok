package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CBd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC30909CBd implements View.OnClickListener {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LJLIL;

    public ViewOnClickListenerC30909CBd(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        this.LJLIL = subscriptionPrivilegeDetailFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LJLIL;
        subscriptionPrivilegeDetailFragment.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_click");
        subscriptionPrivilegeDetailFragment.Al(LIZ);
        LIZ.LJJIIJZLJL();
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_template());
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL.LJLJJL).entrySet()) {
            c32364Cn2.LIZJ((String) entry.getKey(), (String) entry.getValue());
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        Room room = this.LJLIL.LJLJLLL;
        long j2 = 0;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        c32364Cn2.LIZJ("anchor_id", ((C29374Bfu) LIZIZ).LIZJ(j));
        Room room2 = this.LJLIL.LJLJLLL;
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        }
        c32364Cn2.LIZIZ(j2, "log_anchor_id");
        c32364Cn2.LIZJ("subscribe_state", C29232Bdc.LJIL(this.LJLIL.LJLJLLL));
        c32364Cn2.LIZJ("need_high_state_page", "false");
        c32364Cn2.LIZJ("privilege_show_type", "vertical");
        c32364Cn2.LIZJ("privilege_page", "main_page");
        c32364Cn2.LIZ(1, "use_spark");
        c32364Cn2.LIZ(1, "user_present");
        c32364Cn2.LIZIZ(this.LJLIL.LJZI, "_user_temp_ts");
        c32364Cn2.LIZIZ(this.LJLIL.LJZ, "_user_sku_ts");
        c32364Cn2.LIZ(1, "is_native");
        Context context = this.LJLIL.getContext();
        String LIZLLL = c32364Cn2.LIZLLL();
        LIZLLL.toString();
        C31847Ceh.LJIIIIZZ(context, LIZLLL, null);
        this.LJLIL.dismiss();
    }
}
