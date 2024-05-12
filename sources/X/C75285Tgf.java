package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tgf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75285Tgf {
    public static EnumC74778TWk LIZ;
    public static EnumC74778TWk LIZIZ;

    public static void LIZJ(java.util.Map map) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
        }
    }

    public static void LIZ(LiveEffect liveEffect, java.util.Map map) {
        String str;
        String str2;
        String str3;
        String resourceId;
        Integer num;
        String str4 = "";
        if (liveEffect == null || (num = liveEffect.parentImpressionPos) == null || (str = Integer.valueOf(num.intValue() + 1).toString()) == null) {
            str = "";
        }
        HashMap hashMap = (HashMap) map;
        hashMap.put("impr_position", str);
        if (liveEffect == null || (str2 = Long.valueOf(liveEffect.effectId).toString()) == null) {
            str2 = "";
        }
        hashMap.put("sticker_id", str2);
        if (liveEffect == null || (str3 = liveEffect.getName()) == null) {
            str3 = "";
        }
        hashMap.put("sticker_name", str3);
        if (liveEffect != null && (resourceId = liveEffect.getResourceId()) != null) {
            str4 = resourceId;
        }
        hashMap.put("resource_id", str4);
    }

    public static void LIZIZ(java.util.Map map, EnumC74778TWk enumC74778TWk) {
        String str;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        if (enumC74778TWk == null) {
            MultiGuestDataHolder LIZ2 = TRK.LIZ();
            int i2 = -1;
            if (LIZ2 != null && (multiLiveAnchorPanelSettings2 = LIZ2.LJIIJ) != null) {
                i = multiLiveAnchorPanelSettings2.layoutType;
            } else {
                i = -1;
            }
            MultiGuestDataHolder LIZ3 = TRK.LIZ();
            if (LIZ3 != null && (multiLiveAnchorPanelSettings = LIZ3.LJIIJ) != null) {
                i2 = multiLiveAnchorPanelSettings.fixMicNumAction;
            }
            enumC74778TWk = CL8.LIZJ(i, i2);
        }
        HashMap hashMap = (HashMap) map;
        hashMap.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
        hashMap.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
        if (C78886Uxe.LJJJJZI(C8E.LJ()) > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_guest_onstage", str);
    }

    public static final void LIZLLL(LiveEffect liveEffect, int i) {
        HashMap hashMap = new HashMap();
        LIZJ(hashMap);
        LIZIZ(hashMap, null);
        LIZ(liveEffect, hashMap);
        hashMap.put("is_cancel", String.valueOf(i));
        LJFF("livesdk_anchor_shared_background_click", hashMap);
    }

    public static final void LJ(String str, String str2) {
        HashMap hashMap = new HashMap();
        LIZJ(hashMap);
        LIZIZ(hashMap, null);
        hashMap.put("popup_type", str);
        hashMap.put("action_type", str2);
        LJFF("livesdk_anchor_shared_background_popup", hashMap);
    }

    public static void LJFF(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        LIZ2.LJJIIJZLJL();
    }
}
