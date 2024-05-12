package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Cae, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31596Cae {
    public static C73411SrX LIZ(ArrayList arrayList, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro failBlock) {
        ArrayList<Long> arrayList2;
        long j;
        Long valueOf;
        o.LJIIIZ(failBlock, "failBlock");
        if (GiftManager.inst().currentEffectList.containsAll(arrayList)) {
            arrayList2 = GiftManager.inst().currentEffectList;
        } else {
            arrayList2 = GiftManager.inst().currentEffectList;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    if (!arrayList2.contains(Long.valueOf(longValue))) {
                        arrayList2.add(Long.valueOf(longValue));
                    }
                }
            }
        }
        ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null && (valueOf = Long.valueOf(room.getOwnerUserId())) != null) {
            valueOf.longValue();
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        return C32341Cmf.LJFF(4, j, arrayList2, new IOS(interfaceC88472Yns, failBlock));
    }
}
