package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BeG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29272BeG {
    public static HashMap LIZ(long j, Room room, java.util.Map map, boolean z) {
        String str;
        o.LJIIIZ(room, "room");
        HashMap hashMap = new HashMap();
        hashMap.put("target_uid", String.valueOf(j));
        hashMap.put("sec_target_uid", ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(j));
        hashMap.put("packed_level", "2");
        hashMap.put("current_room_id", String.valueOf(room.getId()));
        hashMap.put("request_from", "profile_card_v2");
        if (room.getOwner() != null) {
            str = String.valueOf(room.getOwner().getId());
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("anchor_id", str);
        hashMap.put("sec_anchor_id", ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(room.getOwnerUserId()));
        hashMap.put("user_role", C38393F4z.LJFF(map));
        hashMap.put("request_from_scene", "1");
        hashMap.put("need_block_status", "true");
        hashMap.put("need_preload_room", String.valueOf(z));
        return hashMap;
    }
}
