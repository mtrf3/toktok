package com.bytedance.android.livesdk.live.data;

import X.AbstractC73672Svk;
import X.AnonymousClass391;
import X.B4T;
import X.BLG;
import X.BLU;
import X.C09650Zl;
import X.C141335gf;
import X.C28467BFf;
import X.C28655BMl;
import X.C29245Bdp;
import X.C2UU;
import X.C3C5;
import X.C43881HKb;
import X.C65814PsI;
import X.C68322mC;
import X.C76800UCe;
import X.CN1;
import X.HH1;
import Y.AfS57S0100000_5;
import Y.IDhS98S0100000_5;
import android.util.Pair;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.detail.RoomApi;
import com.bytedance.android.livesdk.chatroom.utils.LastLiveActionInfo;
import com.bytedance.android.livesdk.livesetting.other.EnableLiveEcRecordsSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class DrawRoomListModel {
    private final String getObjectsStr(List<? extends Object> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(ListProtector.get(list, i).toString());
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public final void handleRoomParams(FeedItem feedItem) {
        int i = feedItem.type;
        if (i == 1 || i == 2) {
            BLG blg = feedItem.item;
            if (blg instanceof Room) {
                o.LJII(blg, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                Room room = (Room) blg;
                room.setLog_pb(feedItem.logPb);
                User owner = room.getOwner();
                if (owner != null) {
                    owner.setLogPb(feedItem.logPb);
                }
                room.setRequestId(feedItem.resId);
                room.isFromRecommendCard = feedItem.isRecommendCard;
            }
        }
    }

    public final AbstractC73672Svk<C28467BFf<Object>> collectUnreadRequest(long j, long j2, String unreadExtra, List<Long> roomIds) {
        o.LJIIIZ(unreadExtra, "unreadExtra");
        o.LJIIIZ(roomIds, "roomIds");
        C65814PsI.LIZ().getClass();
        return ((RoomApi) C65814PsI.LIZJ(RoomApi.class)).collectUnreadRequest(j, j2, unreadExtra, getObjectsStr(roomIds));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC73672Svk<BLU<Pair<List<FeedItem>, FeedExtra>>> getRoomList(long j, String str, String str2, long j2, long j3, String str3, C2UU c2uu, EnterRoomConfig enterRoomConfig, String str4, boolean z, Map<String, String> map) {
        int i;
        long j4;
        String oecInitDataString;
        String str5;
        String str6 = str4;
        HH1.LIZ(str, "reqFrom", str2, "channel_id", str3, "url");
        String LIZ = C28655BMl.LIZ(B4T.LIZ(), null, false, 3);
        Long l = B4T.LIZ().LJFF;
        C28655BMl LIZ2 = B4T.LIZ();
        int i2 = LIZ2.LJII;
        LIZ2.LJII = i2 + 1;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = str;
        HashMap hashMap = new HashMap();
        C43881HKb.LIZJ(j, hashMap, "max_time", "channel_id", str2);
        AnonymousClass391.LJFF(hashMap, "is_draw", "1", j2, "draw_room_id");
        hashMap.put("draw_room_owner_id", String.valueOf(j3));
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("exposure_items", str6);
        if (LIZ != null && l != null) {
            c68322mC.element = "ecom_template_inner_loadmore";
            hashMap.put("ec_template_id", LIZ);
            hashMap.put("ec_top_author", l.toString());
            hashMap.put("refresh_session_index", String.valueOf(i2));
        } else if (B4T.LIZ().LJ != null) {
            c68322mC.element = "ecom_normal_feed_loadmore";
            hashMap.put("enter_source", "commerce_banner");
        } else if (c2uu != null) {
            Integer num = c2uu.LIZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            hashMap.put("session_refresh_index", String.valueOf(i));
            Long l2 = c2uu.LIZIZ;
            if (l2 != null) {
                j4 = l2.longValue();
            } else {
                j4 = 0;
            }
            hashMap.put("session_id", String.valueOf(j4));
        }
        hashMap.put("req_from", c68322mC.element);
        if (EnableLiveEcRecordsSetting.INSTANCE.getValue()) {
            ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).T7().getClass();
            HashMap hashMap2 = new HashMap();
            if (enterRoomConfig != null) {
                hashMap2.put("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId));
                String str8 = enterRoomConfig.mLogData.anchorId;
                if (str8 != null) {
                    hashMap2.put("anchor_id", str8);
                }
                String str9 = enterRoomConfig.mRoomsData.enterFromMerge;
                if (str9 != null) {
                    hashMap2.put("enter_from_merge", str9);
                }
                String str10 = enterRoomConfig.mRoomsData.enterMethod;
                if (str10 != null) {
                    hashMap2.put("enter_method", str10);
                }
                String str11 = enterRoomConfig.mRoomsData.actionType;
                if (str11 != null) {
                    hashMap2.put("action_type", str11);
                }
                Boolean bool = enterRoomConfig.mRoomsData.hasCommerceGoods;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        str5 = "1";
                    } else {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap2.put("is_ecom", str5);
                }
                CommerceStruct commerceStruct = enterRoomConfig.mRoomsData.commerceStruct;
                if (commerceStruct != null && (oecInitDataString = commerceStruct.getOecInitDataString()) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(oecInitDataString);
                        String popProductId = jSONObject.optString("pop_product_id");
                        o.LJIIIIZZ(popProductId, "popProductId");
                        if (popProductId.length() == 0) {
                            String popProduct = jSONObject.optString("pop_product");
                            o.LJIIIIZZ(popProduct, "popProduct");
                            if (popProduct.length() > 0) {
                                popProductId = new JSONObject(popProduct).optString("product_id");
                            }
                        }
                        o.LJIIIIZZ(popProductId, "popProductId");
                        if (popProductId.length() > 0) {
                            hashMap2.put("current_product_id", popProductId);
                        }
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                }
            }
            LastLiveActionInfo LIZIZ = C29245Bdp.LIZIZ(hashMap2);
            if (LIZIZ != null) {
                str7 = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, LIZIZ);
                o.LJIIIIZZ(str7, "get().toJson(it)");
            }
            hashMap.put("related_live", str7);
            C29245Bdp T7 = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).T7();
            List<LastLiveActionInfo> LIZJ = T7.LIZJ(T7.LIZ, T7.LIZIZ);
            Gson gson = C09650Zl.LIZIZ;
            String json = GsonProtectorUtils.toJson(gson, LIZJ);
            o.LJIIIIZZ(json, "get().toJson(list)");
            hashMap.put("last_show_lives", json);
            C29245Bdp T72 = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).T7();
            String json2 = GsonProtectorUtils.toJson(gson, T72.LIZJ(T72.LIZJ, T72.LIZLLL));
            o.LJIIIIZZ(json2, "get().toJson(list)");
            hashMap.put("last_play_lives", json2);
        }
        if (z) {
            hashMap.put("is_non_personalized", "1");
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        C65814PsI.LIZ().getClass();
        return ((FeedApi) C65814PsI.LIZIZ(FeedApi.class)).feed(str3, hashMap).LJJIJL(new IDhS98S0100000_5(c68322mC, 2)).LJIJJLI(new AfS57S0100000_5(this, 136));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC73672Svk getRoomList$default(DrawRoomListModel drawRoomListModel, long j, String str, String str2, long j2, long j3, String str3, C2UU c2uu, EnterRoomConfig enterRoomConfig, String str4, boolean z, Map map, int i, Object obj) {
        if ((i & 512) != 0) {
            z = false;
        }
        if ((i & 1024) != 0) {
            map = null;
        }
        return drawRoomListModel.getRoomList(j, str, str2, j2, j3, str3, c2uu, enterRoomConfig, str4, z, map);
    }
}
