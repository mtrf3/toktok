package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C201157ux;
import X.C47261Igj;
import X.C54218LPq;
import X.C55787Lux;
import X.C57136Mbc;
import X.C76800UCe;
import X.C7XD;
import X.HG3;
import X.InterfaceC55058LjC;
import X.M5X;
import X.M98;
import X.OSZ;
import X.RBX;
import X.X1D;
import X.Z89;
import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class OpenSocialNowTabAction extends AbstractC54341LUj<C76800UCe> {
    public static final C55787Lux Companion = new C55787Lux();

    @Override // X.AbstractC54341LUj
    public ArrayList<Integer> getFlags() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activityStack, "getActivityStack()");
        if (isHotStart(activityStack)) {
            return C47261Igj.LJII(67108864, 268435456);
        }
        return null;
    }

    private final boolean isFriendsPush(String str) {
        if (o.LJ(str, "click_push_now_post") || o.LJ(str, "click_push_now_aggregate")) {
            return true;
        }
        return false;
    }

    private final boolean isHotStart(Activity[] activityArr) {
        for (Activity activity : activityArr) {
            if (activity instanceof InterfaceC55058LjC) {
                if (activity == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private final void setupSocialLinkParams(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (!C57136Mbc.LIZIZ.getEnable()) {
            return;
        }
        Object obj = hashMap.get("social_share_type");
        if (obj != null) {
            hashMap2.put("social_share_type", obj.toString());
        }
        Object obj2 = hashMap.get("checksum");
        if (obj2 != null) {
            hashMap2.put("share_url_checksum", obj2.toString());
        }
        Object obj3 = hashMap.get("timestamp");
        if (obj3 != null) {
            hashMap2.put("share_url_timestamp", obj3.toString());
        }
        Object obj4 = hashMap.get("share_link_id");
        if (obj4 != null) {
            hashMap2.put("share_url_link_id", obj4.toString());
        }
        Object obj5 = hashMap.get("user_id");
        if (obj5 != null) {
            hashMap2.put("share_url_user_id", obj5.toString());
        }
        Object obj6 = hashMap.get("sec_user_id");
        if (obj6 != null) {
            hashMap2.put("share_sec_url_user_id", obj6.toString());
        }
        Object obj7 = hashMap.get("utm_source");
        if (obj7 != null) {
            hashMap2.put("share_url_utm_source", obj7.toString());
        }
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        String str;
        String str2;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        if (!C54218LPq.LJLIL.LIZ()) {
            originalQueryMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return new OSZ<>("//main", originalQueryMap);
        }
        if (M98.LIZIZ.LIZ(outerUrl)) {
            return new OSZ<>("//now/feed&is_now_daily_push=true", originalQueryMap);
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        Object obj = originalQueryMap.get("gd_label");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Object obj2 = originalQueryMap.get("REDIRECT_TAG");
        if (obj2 != null) {
            hashMap.put("REDIRECT_TAG", obj2);
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            hashMap.put("is_nows", Boolean.TRUE);
            hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_TAB");
            Object obj3 = originalQueryMap.get("unique_id");
            if (!(obj3 instanceof String) || obj3 == null) {
                obj3 = "";
            }
            hashMap.put("now_unique_id", obj3);
            Object obj4 = originalQueryMap.get("user_id");
            if (!(obj4 instanceof String) || obj4 == null) {
                obj4 = "";
            }
            hashMap.put("user_id", obj4);
            Object obj5 = originalQueryMap.get("share_item_id");
            if ((obj5 instanceof String) && obj5 != null) {
                hashMap.put("aweme_id", obj5);
            }
            Object obj6 = originalQueryMap.get("share_app_id");
            if ((obj6 instanceof String) && obj6 != null) {
                hashMap.put("share_app_id", obj6);
            }
            Object obj7 = originalQueryMap.get("creator_uid");
            if ((obj7 instanceof String) && obj7 != null) {
                hashMap.put("creator_uid", obj7);
            }
            Object obj8 = originalQueryMap.get("itemid");
            if (!(obj8 instanceof String) || obj8 == null) {
                obj8 = "";
            }
            hashMap.put("now_post_item_id_list", obj8);
            Object obj9 = originalQueryMap.get("now_post_strategy");
            if (obj9 != null) {
                hashMap.put("now_post_strategy", obj9);
            }
            setupSocialLinkParams(originalQueryMap, hashMap);
            Object obj10 = originalQueryMap.get("insert_backflow_feed_to_top");
            if (obj10 != null) {
                hashMap.put("insert_backflow_feed_to_top", obj10);
            }
            hashMap.put("launch_method", str);
            hashMap.put("is_friends_push", Boolean.valueOf(isFriendsPush(str)));
            Object obj11 = originalQueryMap.get("invite_code");
            if (!(obj11 instanceof String) || obj11 == null) {
                obj11 = "";
            }
            hashMap.put("invite_code", obj11);
            Object obj12 = originalQueryMap.get("invite_source");
            if (!(obj12 instanceof String) || obj12 == null) {
                obj12 = "";
            }
            hashMap.put("invite_source", obj12);
        } else {
            hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_TAB");
            Object obj13 = Boolean.TRUE;
            hashMap.put("is_nows", obj13);
            hashMap.put("is_now_login", obj13);
        }
        Object obj14 = originalQueryMap.get("enter_method");
        if (!(obj14 instanceof String) || obj14 == null) {
            obj14 = "";
        }
        hashMap.put("incentive_enter_method", obj14);
        Object obj15 = Boolean.TRUE;
        hashMap.put("switch_to_inbox_on_finishing", obj15);
        hashMap.put("from_deep_link", obj15);
        Object obj16 = originalQueryMap.get("push_id");
        if ((obj16 instanceof String) && (str2 = (String) obj16) != null) {
            str3 = str2;
        }
        if (str3.length() > 0) {
            Z89.LIZIZ.LJIL();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resultMap: ");
        LIZ.append(hashMap);
        C7XD.LIZ("OpenSocialNowTabAction", X1D.LIZIZ(LIZ));
        return new OSZ<>(C201157ux.LIZIZ, hashMap);
    }
}
