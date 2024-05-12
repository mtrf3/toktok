package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.innerpush.api.setting.FriendsPostExp;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushReverseExp;
import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85919Xnn {
    public static final HashMap<String, Boolean> LIZ;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("friends_only_push", Boolean.valueOf(GuideOutPushExperiment.LIZIZ()));
        hashMap.put("friend_upvote_push", Boolean.valueOf(C7HZ.LIZ()));
        hashMap.put("acq_video_push", Boolean.valueOf(((Boolean) C53040Krk.LIZ.getValue()).booleanValue()));
        hashMap.put("general_upvote_push", Boolean.valueOf(((Boolean) C53138KtK.LIZ.getValue()).booleanValue()));
        SettingsManager.LIZLLL().getClass();
        boolean z4 = false;
        hashMap.put("natural_disaster_forecasts_push", Boolean.valueOf(SettingsManager.LIZ("show_natural_disaster_forecasts_push", false)));
        if (C52293Kfh.LIZ() && !InnerPushReverseExp.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("live_inner_push", Boolean.valueOf(z));
        if (((Boolean) C52906Kpa.LIZ.getValue()).booleanValue() && !InnerPushReverseExp.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        hashMap.put("in_app_active_status_push", Boolean.valueOf(z2));
        hashMap.put("in_app_friends_post_push", Boolean.valueOf(((Boolean) FriendsPostExp.LIZJ.getValue()).booleanValue()));
        if (C52483Kil.LIZ && Z8A.LIZIZ.shouldShowProfileViewerPushItem()) {
            z3 = true;
        } else {
            z3 = false;
        }
        hashMap.put("in_app_profile_viewer_push", Boolean.valueOf(z3));
        hashMap.put("in_app_digg_push", Boolean.valueOf(!InnerPushReverseExp.LIZ()));
        hashMap.put("in_app_comment_push", Boolean.valueOf(!InnerPushReverseExp.LIZ()));
        hashMap.put("in_app_follow_push", Boolean.valueOf(!InnerPushReverseExp.LIZ()));
        hashMap.put("in_app_mention_push", Boolean.valueOf(!InnerPushReverseExp.LIZ()));
        if (!InnerPushReverseExp.LIZ() || !ORY.LJJIJ(21, (int[]) InnerPushReverseExp.LIZJ.getValue())) {
            z4 = true;
        }
        hashMap.put("in_app_im_push", Boolean.valueOf(z4));
        LIZ = hashMap;
    }

    public static boolean LIZ(PushItem pushItem) {
        boolean z;
        o.LJIIIZ(pushItem, "pushItem");
        String itemId = pushItem.itemId;
        o.LJIIIZ(itemId, "itemId");
        HashMap<String, Boolean> hashMap = LIZ;
        if (hashMap.containsKey(itemId)) {
            z = o.LJ(hashMap.get(itemId), Boolean.TRUE);
        } else {
            z = true;
        }
        if ((pushItem.clientControlFlags & 2) != 0) {
            if (z && ((RBX) HG3.LJIILL()).getCurUser().isPhoneBinded()) {
                return true;
            }
            return false;
        }
        return z;
    }
}
