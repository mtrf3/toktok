package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BJK implements BU3<C28246B6s> {
    public final BJJ LIZ = new BJJ();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BU3
    public final void LIZ(Object obj, java.util.Map map) {
        Boolean bool;
        String str;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        String str2;
        SubscribeInfo subscribeInfo;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        String str10;
        String str11;
        C28246B6s data = (C28246B6s) obj;
        o.LJIIIZ(data, "data");
        LIZIZ("initial_follow_status", data.LJII, map);
        B8A b8a = data.LIZLLL;
        if (b8a != null) {
            LIZIZ("duration_after_live_take", String.valueOf((C30725C4b.LIZ() / 1000) - b8a.LJLIL), map);
        }
        Boolean bool5 = data.LJIIIIZZ;
        String str12 = "1";
        if (bool5 != null) {
            if (bool5.booleanValue()) {
                str11 = "1";
            } else {
                str11 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ("is_fresh", str11, map);
        }
        BJL bjl = data.LJFF;
        if (bjl != null) {
            String str13 = bjl.LIZIZ;
            Object obj2 = map.get("action_type");
            if (obj2 == null) {
                obj2 = bjl.LJ;
            }
            Long l = bjl.LJIILJJIL;
            Long l2 = bjl.LJIILL;
            Long l3 = bjl.LJIILLIIL;
            Long l4 = bjl.LJIIZILJ;
            if (o.LJ("homepage_hot", str13) && o.LJ("click", obj2)) {
                if (l != null && l.longValue() > 0) {
                    LIZIZ("first_label", l.toString(), map);
                }
                if (l2 != null && l2.longValue() > 0) {
                    LIZIZ("second_label", l2.toString(), map);
                }
                if (l3 != null && l3.longValue() > 0) {
                    LIZIZ("bottom_label", l3.toString(), map);
                }
                if (l4 != null && l4.longValue() > 0) {
                    LIZIZ("bottom_sub_label", l4.toString(), map);
                }
            }
            LIZIZ("enter_method", bjl.LIZ, map);
            LIZIZ("enter_from_merge", bjl.LIZIZ, map);
            Long l5 = bjl.LIZJ;
            if (l5 != null) {
                str5 = l5.toString();
            } else {
                str5 = null;
            }
            LIZIZ("from_room_id", str5, map);
            LIZIZ("gd_label", bjl.LIZLLL, map);
            LIZIZ("action_type", bjl.LJ, map);
            LIZIZ("list_item_id", bjl.LJFF, map);
            if (C29306Beo.LJJIFFI(bjl.LJI)) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ("is_video_head", str6, map);
            LIZIZ("request_id", bjl.LJII, map);
            LIZIZ("live_window_mode", bjl.LJIIIIZZ, map);
            Long l6 = bjl.LJIIIZ;
            if (l6 != null) {
                str7 = l6.toString();
            } else {
                str7 = null;
            }
            LIZIZ("small_picture_order", str7, map);
            LIZIZ("is_guest_connection", bjl.LJIIJ, map);
            LIZIZ("content_type", bjl.LJIJ, map);
            if (!map.containsKey("connection_type") && (str10 = bjl.LJIJI) != null) {
                String str14 = "normal";
                if (!TextUtils.isEmpty(str10)) {
                    if (o.LJ(bjl.LJIJI, "normal")) {
                        if (C74838TYs.LJ().LJIIL && C74838TYs.LJ().LJJ > 0) {
                            str14 = "audience";
                        } else {
                            str14 = bjl.LJIJI;
                        }
                    } else {
                        str14 = bjl.LJIJI;
                    }
                }
                LIZIZ("connection_type", str14, map);
            }
            LIZIZ("distribution_type", bjl.LJIIJJI, map);
            LIZIZ("explore_level", String.valueOf(bjl.LJIJJ), map);
            if (TextUtils.equals("live_cover", bjl.LIZ)) {
                Integer num = bjl.LJJIJIIJIL;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                LIZIZ("is_from_list", String.valueOf(i), map);
            }
            if (TextUtils.equals("live_cover_recommend", bjl.LIZ) && !TextUtils.isEmpty(bjl.LJJIJIL)) {
                LIZIZ("recommend_type", bjl.LJJIJIL, map);
            }
            if (!TextUtils.isEmpty(bjl.LJIJJLI)) {
                LIZIZ("from_drawer_tab", String.valueOf(bjl.LJIJJLI), map);
            }
            LIZIZ("top_left_label", bjl.LJIL, map);
            Integer num2 = bjl.LJJ;
            if (num2 != null) {
                str8 = num2.toString();
            } else {
                str8 = null;
            }
            LIZIZ("from_end", str8, map);
            Integer num3 = bjl.LJJ;
            if (num3 != null && num3.intValue() == 1) {
                LIZIZ("end_source_enter_from_merge", bjl.LJJI, map);
                LIZIZ("end_source_enter_method", bjl.LJJIFFI, map);
                LIZIZ("end_source_action_type", bjl.LJJII, map);
                LIZIZ("end_view_status", bjl.LJJIII, map);
            }
            LIZIZ("liveend_exit", bjl.LJJIIJ, map);
            LIZIZ("user_rank", String.valueOf(bjl.LJJIIJZLJL), map);
            boolean LIZIZ = B4T.LIZ().LIZIZ();
            if (LIZIZ) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ("is_commerce_inner_flow", str9, map);
            if (LIZIZ) {
                bool = null;
                LIZIZ("commerce_inner_flow_id", C28655BMl.LIZ(B4T.LIZ(), null, true, 1), map);
                LIZIZ("commerce_inner_source", B4T.LIZ().LJI, map);
            } else {
                bool = null;
            }
            if (o.LJ("live_merge", bjl.LIZIZ) && o.LJ("live_cover", bjl.LIZ) && o.LJ("draw", bjl.LJ)) {
                LIZIZ("is_from_bubble", String.valueOf(bjl.LJJIJ), map);
                LIZIZ("is_from_cache", String.valueOf(bjl.LJJIJIIJI), map);
            }
            if (o.LJ("follow_widget", bjl.LIZIZ)) {
                LIZIZ("widget_type", bjl.LJJIZ, map);
                LIZIZ("widget_anchor_num", String.valueOf(bjl.LJJJ), map);
                LIZIZ("anchor_position", String.valueOf(bjl.LJJJIL), map);
            }
            if (o.LJ("homepage_live", bjl.LIZIZ)) {
                LIZIZ("is_auto", String.valueOf(bjl.LJJJI), map);
            }
            java.util.Map<String, String> map2 = bjl.LJJIL;
            if (map2 != null) {
                map.putAll(map2);
            }
        } else {
            bool = null;
        }
        BJE bje = data.LJ;
        if (bje != null) {
            LIZIZ("live_window_mode", bje.LIZ, map);
            Long l7 = bje.LIZLLL;
            if (l7 != null) {
                str3 = l7.toString();
            } else {
                str3 = bool;
            }
            LIZIZ("small_picture_order", str3, map);
            LIZIZ("log_pb", bje.LIZIZ, map);
            LIZIZ("request_id", bje.LIZJ, map);
            Long l8 = bje.LJ;
            if (l8 != null) {
                str4 = l8.toString();
            } else {
                str4 = bool;
            }
            LIZIZ("room_id", str4, map);
            LIZIZ("is_ecom", bje.LJI, map);
        }
        B8D b8d = data.LJI;
        if (b8d != null) {
            LIZIZ("room_position", String.valueOf(b8d.LJLIL), map);
            LIZIZ("is_from_draw_req", String.valueOf(b8d.LJLILLLLZI), map);
        }
        LIZIZ("event_page", data.LIZ, map);
        BJJ bjj = this.LIZ;
        Room room = data.LIZIZ;
        bjj.getClass();
        BJJ.LIZIZ(map, room);
        Long l9 = data.LIZJ;
        if (l9 != null) {
            str = l9.toString();
        } else {
            str = bool;
        }
        LIZIZ("anchor_id", str, map);
        Room room2 = data.LIZIZ;
        if (room2 != null) {
            User owner = room2.getOwner();
            if (owner != null) {
                bool2 = Boolean.valueOf(owner.isAnchorHasSubQualification());
            } else {
                bool2 = bool;
            }
            if (C29306Beo.LJIL(bool2)) {
                LIZIZ("is_subscription", "-1", map);
            } else {
                User owner2 = room2.getOwner();
                if (owner2 != null) {
                    bool3 = Boolean.valueOf(owner2.isSubscribed());
                } else {
                    bool3 = bool;
                }
                if (!C29306Beo.LJJIFFI(bool3)) {
                    str12 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZIZ("is_subscription", str12, map);
            }
            User owner3 = room2.getOwner();
            if (owner3 != null) {
                bool4 = Boolean.valueOf(owner3.isSubscribed());
            } else {
                bool4 = bool;
            }
            if (C29306Beo.LJJIFFI(bool4)) {
                str2 = "subscribed_not_expired";
            } else {
                User owner4 = room2.getOwner();
                if (owner4 != null && (subscribeInfo = owner4.getSubscribeInfo()) != null) {
                    bool = Boolean.valueOf(subscribeInfo.isInGracePeriod());
                }
                if (!C29306Beo.LJIL(bool)) {
                    str2 = "subscribed_expired_grace_period";
                } else {
                    str2 = "not_subscribed";
                }
            }
            LIZIZ("subscribe_state", str2, map);
        }
    }

    public static final void LIZIZ(String str, String str2, java.util.Map map) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }
}
