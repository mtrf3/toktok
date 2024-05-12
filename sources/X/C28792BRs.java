package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BRs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28792BRs {
    public static String LIZ = CardStruct.IStatusCode.DEFAULT;
    public static String LIZIZ = "";

    public static void LIZ(Boolean bool, String str, List list) {
        String str2;
        int i;
        String str3;
        InterfaceC29405BgP LIZIZ2;
        InterfaceC05190Ih interfaceC05190Ih;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        String str4;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE2;
        RedEnvelopInfo4FE redEnvelopInfo4FE2;
        Integer num;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE3;
        RedEnvelopInfo4FE redEnvelopInfo4FE3;
        HashMap hashMap = new HashMap(7);
        String str5 = "";
        if (list == null || (redEnvelopeMessage4FE3 = (RedEnvelopeMessage4FE) ListProtector.get(list, 0)) == null || (redEnvelopInfo4FE3 = redEnvelopeMessage4FE3.envelopInfo) == null || (str2 = redEnvelopInfo4FE3.envelopeId) == null) {
            str2 = "";
        }
        hashMap.put("envelope_id", str2);
        if (list != null && (redEnvelopeMessage4FE2 = (RedEnvelopeMessage4FE) ListProtector.get(list, 0)) != null && (redEnvelopInfo4FE2 = redEnvelopeMessage4FE2.envelopInfo) != null && (num = redEnvelopInfo4FE2.businessType) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        hashMap.put("business_type", String.valueOf(i));
        if (list != null && (redEnvelopeMessage4FE = (RedEnvelopeMessage4FE) ListProtector.get(list, 0)) != null && (redEnvelopInfo4FE = redEnvelopeMessage4FE.envelopInfo) != null && (str4 = redEnvelopInfo4FE.sendUserId) != null) {
            str5 = str4;
        }
        hashMap.put("send_user_id", str5);
        hashMap.put("drop_reason", str);
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ2 = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str3);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_treasure_box_data_drop");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        LIZ3.LJIIJJI("live_detail");
        LIZ3.LJIIL("click");
        LIZ3.LJIIIZ("live");
        LIZ3.LJJIIJZLJL();
        C0K2.LJII(0, "ttlive_treasure_box_data_drop", hashMap);
    }

    public static void LIZIZ(DataChannel dataChannel, C28793BRt event, boolean z) {
        String str;
        String str2;
        String str3;
        InterfaceC29405BgP LIZIZ2;
        InterfaceC05190Ih interfaceC05190Ih;
        String str4;
        String str5;
        FollowInfo followInfo;
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(event, "event");
        HashMap hashMap = new HashMap(11);
        hashMap.put("enter_from_merge", BJM.LJFF());
        hashMap.put("enter_method", BJM.LJIIIIZZ());
        hashMap.put("redpacket_type", "coins");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            String str6 = "";
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str4 = Q4K.LIZJ(followInfo)) == null) {
                str4 = "";
            }
            hashMap.put("follow_status", str4);
            Hashtag hashtag = room.hashtag;
            if (hashtag != null && (str5 = hashtag.title) != null) {
                str6 = str5;
            }
            hashMap.put("hashtag_type", str6);
            LiveMode streamType = room.getStreamType();
            o.LJIIIIZZ(streamType, "streamType");
            hashMap.put("live_type", C28509BGv.LIZ(streamType));
        }
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ2 = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str);
        hashMap.put("online_watch_users", String.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()));
        if (!TextUtils.isEmpty(event.LJLJI)) {
            hashMap.put("guide_reason", event.LJLJI);
        }
        hashMap.put("guide_from", event.LJLJJI);
        hashMap.put(WM7.SCENE_SERVICE, C31120CJg.LJI());
        if (!o.LJ(event.LJLILLLLZI, "gift")) {
            str2 = "redpacket_in_more_click";
        } else {
            str2 = "redpacket_panel_click";
        }
        if (o.LJ(str2, "redpacket_in_more_click")) {
            if (C44384HbQ.LJJIJ()) {
                InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
                if (pk != null && pk.LJFF(EnumC30204BtI.INTERACTION_FEATURES)) {
                    str3 = "more_interaction";
                } else {
                    str3 = "interaction";
                }
            } else {
                str3 = "more";
            }
            hashMap.put("entrance", str3);
        }
        BZI LIZ3 = C28787BRn.LIZ(str2);
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        LIZ3.LJIIL("click");
        LIZ3.LJIIIZ("live");
        LIZ3.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r8, java.lang.String r9, java.util.List r10, java.lang.Boolean r11, java.lang.Exception r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28792BRs.LIZJ(int, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Exception, boolean):void");
    }
}
