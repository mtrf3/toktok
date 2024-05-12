package X;

import com.bytedance.android.livesdk.chatroom.utils.LastLiveActionInfo;
import com.bytedance.android.livesdk.livesetting.other.LiveEcRecordsMaxCountSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bdp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29245Bdp implements InterfaceC08690Vt {
    public static final C5H3<C29245Bdp> LJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C29247Bdr.LJLIL);
    public final LinkedList<Long> LIZ = new LinkedList<>();
    public final HashMap<Long, LastLiveActionInfo> LIZIZ = new HashMap<>();
    public final LinkedList<Long> LIZJ = new LinkedList<>();
    public final HashMap<Long, LastLiveActionInfo> LIZLLL = new HashMap<>();

    public C29245Bdp() {
        ((IHostUser) CN1.LIZ(IHostUser.class)).observeAccountChange(new C29246Bdq(this));
    }

    public static LastLiveActionInfo LIZIZ(java.util.Map map) {
        Long LJJIZ;
        Long LJJIZ2;
        Long LJJIZ3;
        Long LJJIZ4;
        Long LJJIZ5;
        if (map != null) {
            LastLiveActionInfo lastLiveActionInfo = new LastLiveActionInfo(0L, null, null, null, null, null, 63, null);
            String str = (String) map.get("room_id");
            if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                lastLiveActionInfo.roomId = LJJIZ.longValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((String) map.get("enter_from_merge"));
                LIZ.append('#');
                LIZ.append((String) map.get("enter_method"));
                LIZ.append('#');
                LIZ.append((String) map.get("action_type"));
                String LIZIZ = X1D.LIZIZ(LIZ);
                o.LJIIIZ(LIZIZ, "<set-?>");
                lastLiveActionInfo.entrance = LIZIZ;
                String str2 = (String) map.get("anchor_id");
                if (str2 != null && (LJJIZ5 = C38350F3i.LJJIZ(str2)) != null) {
                    lastLiveActionInfo.authorId = Long.valueOf(LJJIZ5.longValue());
                }
                String str3 = (String) map.get("duration");
                if (str3 != null && (LJJIZ4 = C38350F3i.LJJIZ(str3)) != null) {
                    lastLiveActionInfo.duration = Long.valueOf(LJJIZ4.longValue());
                }
                String str4 = (String) map.get("is_ecom");
                if (str4 != null && (LJJIZ3 = C38350F3i.LJJIZ(str4)) != null) {
                    lastLiveActionInfo.isEcom = Long.valueOf(LJJIZ3.longValue());
                }
                String str5 = (String) map.get("current_product_id");
                if (str5 != null && (LJJIZ2 = C38350F3i.LJJIZ(str5)) != null) {
                    lastLiveActionInfo.currentProductId = Long.valueOf(LJJIZ2.longValue());
                }
                return lastLiveActionInfo;
            }
            return null;
        }
        return null;
    }

    public final synchronized List<LastLiveActionInfo> LIZJ(LinkedList<Long> linkedList, HashMap<Long, LastLiveActionInfo> hashMap) {
        LinkedList linkedList2;
        linkedList2 = new LinkedList();
        Iterator<Long> it = linkedList.iterator();
        while (it.hasNext()) {
            LastLiveActionInfo lastLiveActionInfo = hashMap.get(it.next());
            if (lastLiveActionInfo != null) {
                linkedList2.add(lastLiveActionInfo);
            }
        }
        return linkedList2;
    }

    public final synchronized void LIZ(LastLiveActionInfo lastLiveActionInfo, LinkedList<Long> linkedList, HashMap<Long, LastLiveActionInfo> hashMap) {
        long j = lastLiveActionInfo.roomId;
        if (j <= 0) {
            return;
        }
        if (linkedList.contains(Long.valueOf(j))) {
            linkedList.remove(Long.valueOf(j));
            hashMap.remove(Long.valueOf(j));
        }
        if (!linkedList.isEmpty() && linkedList.size() >= LiveEcRecordsMaxCountSetting.INSTANCE.getValue()) {
            hashMap.remove(linkedList.removeFirst());
        }
        linkedList.add(Long.valueOf(j));
        hashMap.put(Long.valueOf(j), lastLiveActionInfo);
    }
}
