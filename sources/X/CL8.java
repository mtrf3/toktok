package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAdaptMicRoomSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveAnchorSwitchFrequency;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CL8 {
    public static final int LIZ = MultiLiveAnchorSwitchFrequency.INSTANCE.getValue();
    public static final ArrayList<Long> LIZIZ = new ArrayList<>();
    public static final ArrayList<Long> LIZJ = new ArrayList<>();
    public static final ArrayList<Long> LIZLLL = new ArrayList<>();

    public static EnumC74778TWk LIZLLL() {
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (C19N.LIZLLL()) {
            return C59994Ngc.LIZJ();
        }
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LJJIIZ;
        }
        return null;
    }

    public static boolean LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = LIZLLL;
        if (arrayList.size() < LIZ) {
            arrayList.add(Long.valueOf(currentTimeMillis));
            return true;
        }
        Object obj = ListProtector.get(arrayList, 0);
        o.LJIIIIZZ(obj, "switchPermissionRecords[0]");
        if (currentTimeMillis - ((Number) obj).longValue() < 60000) {
            return false;
        }
        ListProtector.remove(arrayList, 0);
        arrayList.add(Long.valueOf(currentTimeMillis));
        return true;
    }

    public static boolean LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = LIZJ;
        if (arrayList.size() < LIZ) {
            arrayList.add(Long.valueOf(currentTimeMillis));
            return true;
        }
        Object obj = ListProtector.get(arrayList, 0);
        o.LJIIIIZZ(obj, "switchRecords[0]");
        if (currentTimeMillis - ((Number) obj).longValue() < 60000) {
            return false;
        }
        ListProtector.remove(arrayList, 0);
        arrayList.add(Long.valueOf(currentTimeMillis));
        return true;
    }

    public static boolean LJ(DataChannel dataChannel) {
        Boolean bool;
        C29630Bk2 c29630Bk2;
        boolean z;
        if (dataChannel != null && (c29630Bk2 = (C29630Bk2) dataChannel.kv0(C29627Bjz.class)) != null) {
            if (c29630Bk2.LIZ == 2) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool) || !MultiGuestAdaptMicRoomSwitchSetting.INSTANCE.isEnable()) {
            return false;
        }
        return true;
    }

    public static final EnumC74778TWk LIZJ(int i, int i2) {
        if (i == 1) {
            if (i2 == 0) {
                return EnumC74778TWk.FLOATING_FIX;
            }
        } else if (i != 1) {
            if (i == 0) {
                if (i2 == 0) {
                    return EnumC74778TWk.GRID_FIX;
                }
                if (i2 == 1) {
                    return EnumC74778TWk.GRID;
                }
            }
            return EnumC74778TWk.NORMAL;
        }
        if (i2 == 1) {
            return EnumC74778TWk.FLOATING;
        }
        return EnumC74778TWk.NORMAL;
    }
}
