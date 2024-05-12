package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ChA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32000ChA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Long l) {
        BZI LIZIZ = C0JU.LIZIZ("gift_icon_reddot_show", "color_change", "show_reason", "1", "is_click_available");
        LIZIZ.LJIJJ(l, "gift_id");
        LIZIZ.LJIIZILJ();
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZ(Room room, EnumC32619Cr9 status, EnumC32607Cqx animationType) {
        Object obj;
        Object obj2;
        Long l;
        String str;
        Object obj3;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(animationType, "animationType");
        OSZ osz = new OSZ(BJM.LJFF(), BJM.LJIIIIZZ());
        String str2 = "1";
        if (C74838TYs.LJ().LJJ > 0) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IInteractService iInteractService = C31120CJg.LIZ;
        if (!TextUtils.isEmpty(iInteractService.FZ())) {
            java.util.Map LJFF = C31120CJg.LJFF();
            if (LJFF != null) {
                linkedHashMap.putAll(LJFF);
            }
            if (TextUtils.equals("in_pk", iInteractService.FZ())) {
                linkedHashMap.put("match_status", "pk_phase");
            } else {
                linkedHashMap.put("match_status", "punish");
            }
            if (((IInteractService) CN1.LIZ(IInteractService.class)).yr() == 2) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_multi", obj3);
        }
        if (C31120CJg.LJIIIIZZ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_match_item", obj2);
        linkedHashMap.put("pk_id", String.valueOf(C31120CJg.LIZ()));
        if (!C31120CJg.LJIIJ()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_match_item_user", str2);
        BZI LIZ2 = C28787BRn.LIZ("gift_icon_click");
        LIZ2.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        LIZ2.LJIJJ(osz.getFirst(), "enter_from_merge");
        LIZ2.LJIJJ(osz.getSecond(), "enter_method");
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        LIZ2.LJIJJ(l2, "anchor_id");
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ2.LJIJJ(str, "user_type");
        LIZ2.LJIJJ(status.getDesc(), "guide_from");
        LIZ2.LJIJJ(animationType.getDesc(), "guide_reason");
        LIZ2.LJIJJ(obj, "is_guest_connection");
        LIZ2.LJJIFFI(linkedHashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }
}
