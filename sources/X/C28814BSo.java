package X;

import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BSo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28814BSo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(EnvelopePortalMessage envelopePortalMessage, boolean z) {
        String str;
        String str2;
        HashMap hashMap = new HashMap(11);
        EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage.portalInfo;
        String str3 = null;
        if (portalInfo != null) {
            str3 = portalInfo.id;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("portal_id", str3);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str);
        EnvelopePortalMessage.PortalInfo portalInfo2 = envelopePortalMessage.portalInfo;
        if (portalInfo2 != null && (str2 = portalInfo2.senderId) != null) {
            str4 = str2;
        }
        hashMap.put("sender_id", str4);
        hashMap.put("portal_view_type", String.valueOf(envelopePortalMessage.portalView));
        BZI LIZ2 = C28787BRn.LIZ("livesdk_portal_short_touch_enqueue");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(EnvelopePortalMessage portalMessage, boolean z, String str) {
        String str2;
        String str3;
        o.LJIIIZ(portalMessage, "portalMessage");
        HashMap hashMap = new HashMap(11);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str2);
        ArrayList arrayList = new ArrayList();
        EnvelopePortalMessage.PortalInfo portalInfo = portalMessage.portalInfo;
        if (portalInfo == null || (str3 = portalInfo.id) == null) {
            str3 = "";
        }
        arrayList.add(str3);
        String abstractCollection = arrayList.toString();
        o.LJIIIIZZ(abstractCollection, "ids.toString()");
        hashMap.put("drop_portal_ids", abstractCollection);
        hashMap.put("drop_count", "1");
        hashMap.put("drop_reason", str);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_portal_msg_drop");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }
}
