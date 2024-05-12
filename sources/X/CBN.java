package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBN {
    public static void LIZIZ(Context context, boolean z, CB3 pageType, String showEntrance, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(showEntrance, "showEntrance");
        Room LJJIL = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
        if (LJJIL != null) {
            LIZ(context, LJJIL, showEntrance, new LinkedHashMap(), null, Boolean.valueOf(z), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Context context, Room roomInfo, String showEntrance, java.util.Map map, CBM cbm, Boolean bool, String str) {
        boolean z;
        SubscribeInfo subscribeInfo;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(roomInfo, "roomInfo");
        o.LJIIIZ(showEntrance, "showEntrance");
        int i = 1;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            map.put("anchor_id", str);
            map.put("sec_another_user_id", str);
            map.put("sec_anchor_id", str);
        } else {
            String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(roomInfo.getOwnerUserId());
            map.put("anchor_id", LIZJ);
            map.put("sec_another_user_id", LIZJ);
            map.put("sec_anchor_id", LIZJ);
        }
        map.put("room_id", String.valueOf(roomInfo.getId()));
        map.put("enter_from_merge", BJM.LJFF());
        map.put("enter_method", BJM.LJIIIIZZ());
        map.put("show_entrance", showEntrance);
        map.put("request_id", BJM.LJIILIIL());
        map.put("video_id", BJM.LJIJ());
        User owner = roomInfo.getOwner();
        if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            i = 0;
        }
        map.put("is_subscribe", String.valueOf(i));
        map.remove("_user_temp_ts");
        map.remove("_user_sku_ts");
        ActivityC45651qj LIZ = C29306Beo.LIZ(context);
        if (LIZ != null) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = new SubscriptionPrivilegeDetailFragment();
            subscriptionPrivilegeDetailFragment.LJLIL = SystemClock.elapsedRealtime();
            if (bool != null) {
                subscriptionPrivilegeDetailFragment.LJLJL = bool.booleanValue();
            }
            subscriptionPrivilegeDetailFragment.LJLJLJ = showEntrance;
            subscriptionPrivilegeDetailFragment.LJLJLLL = roomInfo;
            subscriptionPrivilegeDetailFragment.LJLJJLL = cbm;
            subscriptionPrivilegeDetailFragment.LJLJJL.putAll(map);
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    subscriptionPrivilegeDetailFragment.LLI.put(entry.getKey(), value);
                }
            }
            FragmentManager supportFragmentManager = LIZ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "fragmentActivity.supportFragmentManager");
            subscriptionPrivilegeDetailFragment.show(supportFragmentManager, "SubscriptionPrivilegeDetailFragment");
        }
    }
}
