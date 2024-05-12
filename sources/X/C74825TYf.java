package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TYf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74825TYf {
    public static String LIZ = "";

    public static void LIZ(java.util.Map map) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("action_type", BJM.LIZLLL());
            String str = room.getStreamType().logStreamingType;
            o.LJIIIIZZ(str, "room.streamType.logStreamingType");
            hashMap.put("live_type", str);
        }
        C77123UOp.LJIILJJIL(map);
    }

    public static void LIZLLL(int i) {
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        EnumC74778TWk LIZLLL = CL8.LIZLLL();
        hashMap.put("guest_cnt", String.valueOf(C74838TYs.LJ().LJJ));
        hashMap.put("layout_setting", C74824TYe.LJI(LIZLLL).getFirst());
        hashMap.put("window_setting", C74824TYe.LJI(LIZLLL).getSecond());
        hashMap.put("prioritized_request_ucnt", String.valueOf(i));
        C29822Bn8.LIZIZ("livesdk_anchor_guest_prioritized_list_show", hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (X.C29137Bc5.LIZIZ(r3) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(int r4, X.EnumC74778TWk r5, java.lang.String r6, java.lang.Integer r7) {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r3 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r3
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            LIZ(r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = X.C74825TYf.LIZ
            r2.put(r1, r0)
            X.TYs r0 = X.C74838TYs.LJ()
            int r0 = r0.LJJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_cnt"
            r2.put(r0, r1)
            java.lang.String r1 = "request_list_ucnt"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r2.put(r1, r0)
            if (r3 == 0) goto L9a
            boolean r1 = X.C29137Bc5.LIZIZ(r3)
            r0 = 1
            if (r1 != r0) goto L9a
        L3a:
            java.lang.String r3 = ""
            if (r0 == 0) goto L7f
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C8E.LJ()
            X.TjB r0 = r0.R6()
            if (r0 == 0) goto L5a
            X.U8H r0 = r0.LJJZZI()
            if (r0 == 0) goto L5a
            X.U8e r0 = r0.LJJIII()
            if (r0 == 0) goto L5a
            java.lang.String r1 = r0.getLayoutId()
            if (r1 != 0) goto L5b
        L5a:
            r1 = r3
        L5b:
            java.lang.String r0 = "layout_id"
            r2.put(r0, r1)
        L60:
            java.lang.String r0 = "tab_page"
            r2.put(r0, r3)
            java.lang.String r0 = "show_time"
            r2.put(r0, r6)
            if (r7 == 0) goto L79
            int r0 = r7.intValue()
            java.lang.String r1 = X.C74824TYe.LJIIJJI(r0)
            java.lang.String r0 = "request_display_setting"
            r2.put(r0, r1)
        L79:
            java.lang.String r0 = "livesdk_anchor_guest_connection_invite_list_show"
            X.C29822Bn8.LIZIZ(r0, r2)
            return
        L7f:
            X.OSZ r0 = X.C74824TYe.LJI(r5)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r0 = "layout_setting"
            r2.put(r0, r1)
            X.OSZ r0 = X.C74824TYe.LJI(r5)
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r0 = "window_setting"
            r2.put(r0, r1)
            goto L60
        L9a:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74825TYf.LIZJ(int, X.TWk, java.lang.String, java.lang.Integer):void");
    }

    public static final void LIZIZ(long j, EnumC74778TWk enumC74778TWk, int i, List<String> list, List<String> list2, String str, long j2, Long l, Integer num, Integer num2) {
        Integer num3;
        String str2;
        String str3;
        U8H LJJZZI;
        C76696U8e LJJIII;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        AnonymousClass391.LJFF(hashMap, "enter_from", LIZ, j, "guest_id");
        if (room != null && C29137Bc5.LIZIZ(room)) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 == null || (LJJZZI = R6.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null || (str3 = LJJIII.getLayoutId()) == null) {
                str3 = "";
            }
            hashMap.put("layout_id", str3);
        } else {
            hashMap.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
            hashMap.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
        }
        hashMap.put("rank", String.valueOf(i));
        if (list != null) {
            num3 = Integer.valueOf(list.size());
        } else {
            num3 = null;
        }
        hashMap.put("tag_show_cnt", String.valueOf(num3));
        Gson gson = C09650Zl.LIZJ;
        String json = GsonProtectorUtils.toJson(gson, list2);
        o.LJIIIIZZ(json, "getDefault().toJson(tag_list)");
        hashMap.put("tag_list", json);
        String json2 = GsonProtectorUtils.toJson(gson, list);
        o.LJIIIIZZ(json2, "getDefault().toJson(show_tag_list)");
        hashMap.put("show_tag_list", json2);
        hashMap.put("multi_request_id", C58578Mys.LIZ);
        AnonymousClass391.LJFF(hashMap, "show_time", str, j2, "anchor_relationship");
        if (l != null) {
            l.longValue();
            hashMap.put("gift_num", l.toString());
        }
        if (num != null) {
            num.intValue();
            hashMap.put("gift_rank", num.toString());
        }
        if (TUZ.LIZ() && num2 != null) {
            if (num2.intValue() == 0) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "1";
            }
            hashMap.put("is_prioritized_request", str2);
        }
        C29822Bn8.LIZIZ("livesdk_anchor_guest_connection_invite_show", hashMap);
    }
}
