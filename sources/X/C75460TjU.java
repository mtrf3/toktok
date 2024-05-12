package X;

import android.os.Handler;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3UseTimeFixSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TjU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75460TjU {
    public static final java.util.Map<Integer, Integer> LIZ = new LinkedHashMap();
    public static final java.util.Map<Integer, String> LIZIZ = new LinkedHashMap();
    public static final C5H3 LIZJ = C78996UzQ.LJJIJIIJI(C75479Tjn.LJLIL);

    public static void LIZIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("logSource=");
        LIZ2.append(str);
        LIZJ("clearBeautyEffectiveUseTimer", X1D.LIZIZ(LIZ2));
        Handler LIZ3 = C15610jN.LIZ();
        if (LIZ3 != null) {
            LIZ3.removeCallbacks((RunnableC75463TjX) LIZJ.getValue());
        }
        RunnableC75463TjX runnableC75463TjX = (RunnableC75463TjX) LIZJ.getValue();
        runnableC75463TjX.LJLIL = "";
        runnableC75463TjX.LJLILLLLZI = "";
        runnableC75463TjX.LJLJI = 0;
    }

    public static void LIZ(int i, java.util.Map map) {
        RtcUserInfo rtcUserInfo;
        String str;
        String str2;
        String linkMicId;
        String invoke;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
        }
        HashMap hashMap2 = (HashMap) map;
        hashMap2.put("guest_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        String str3 = null;
        if (R6 != null) {
            rtcUserInfo = R6.LLLLLJIL();
        } else {
            rtcUserInfo = null;
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (i == 2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_default_value", str);
        if (rtcUserInfo == null || (str2 = Long.valueOf(rtcUserInfo.getChannelId()).toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("channel_id", str2);
        if (LinkMicMultiGuestV3UseTimeFixSetting.INSTANCE.getValue()) {
            InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LIZIZ;
            if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
                str4 = invoke;
            }
            hashMap2.put("link_id", str4);
        } else {
            HashSet<String> hashSet = C74951TbH.LIZ;
            if (rtcUserInfo != null) {
                str3 = rtcUserInfo.getLinkMicId();
            }
            if (!hashSet.contains(str3) || !LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
                if (rtcUserInfo != null && (linkMicId = rtcUserInfo.getLinkMicId()) != null) {
                    str4 = linkMicId;
                }
                hashMap2.put("link_id", str4);
            }
        }
        hashMap2.put("effect_id", "00");
        hashMap2.put("beauty_type_name", "Default_slider");
        C116484hg.LIZIZ(hashMap2, "resource_id", "00", i, "beauty_value");
    }

    public static void LIZJ(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("method#");
        LIZ2.append(str);
        LIZ2.append(" - ");
        LIZ2.append(str2);
        C0NB.LIZIZ("MultiGuestOldBeautyLogUtil", X1D.LIZIZ(LIZ2));
    }

    public static void LIZLLL(int i, String eventPage) {
        o.LJIIIZ(eventPage, "eventPage");
        if (!LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue() || i == 0) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("beautyLevel=");
        LIZ2.append(i);
        LIZ2.append(", eventPage=");
        LIZ2.append(eventPage);
        LIZJ("reportBeautySelected", X1D.LIZIZ(LIZ2));
        HashMap hashMap = new HashMap();
        LIZ(i, hashMap);
        hashMap.put("event_page", eventPage);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_guest_connection_beauty_select");
        LIZ3.LJIIZILJ();
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJJIIZI();
    }
}
