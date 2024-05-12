package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.U8o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76706U8o extends AbstractC76704U8m {
    public final U92 LJI;

    public static String LIZJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_LinkDataProvider_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_LinkDataProvider_", i, LIZ2);
    }

    public final C76711U8t LJI(int i) {
        String str;
        String str2;
        String LIZJ = LIZJ(263);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getMicWindow pos=");
        LIZ.append(i);
        C32014ChO.LJFF(LIZJ, X1D.LIZIZ(LIZ));
        Layout layout = this.LIZLLL;
        C76711U8t c76711U8t = null;
        if (layout == null) {
            C32014ChO.LIZJ(LIZJ(266), "link currentLayout is null", null);
            C0K2.LIZ("live currentLayout is null.", new Throwable());
            return LIZIZ(EnumC75419Tip.StateInit);
        }
        if (layout.isFixedType() || this.LIZJ.LIZ()) {
            for (Map.Entry<String, OnLineMicInfo> entry : this.LJI.LIZ().entrySet()) {
                if (this.LJI.LJIIIZ()) {
                    MicPositionInfo micPositionData = entry.getValue().getMicPositionData();
                    if (micPositionData != null && micPositionData.getUiPos() == i) {
                        str = entry.getKey();
                        break;
                    }
                } else {
                    MicPositionInfo micPositionData2 = entry.getValue().getMicPositionData();
                    if (micPositionData2 != null && micPositionData2.getPosition() == i) {
                        str = entry.getKey();
                        break;
                    }
                }
            }
            str = null;
            Iterator<C76711U8t> it = this.LJFF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C76711U8t next = it.next();
                C76711U8t c76711U8t2 = next;
                if (str != null && o.LJ(c76711U8t2.LJLIL.LIZJ, str)) {
                    c76711U8t = next;
                    break;
                }
            }
            C76711U8t c76711U8t3 = c76711U8t;
            if (c76711U8t3 == null) {
                return LIZIZ(EnumC75419Tip.StateInit);
            }
            return c76711U8t3;
        }
        for (Map.Entry<String, OnLineMicInfo> entry2 : this.LJI.LJIILJJIL().entrySet()) {
            if (this.LJI.LJIIIZ()) {
                MicPositionInfo micPositionData3 = entry2.getValue().getMicPositionData();
                if (micPositionData3 != null && micPositionData3.getUiPos() == i) {
                    str2 = entry2.getKey();
                    break;
                }
            } else {
                MicPositionInfo micPositionData4 = entry2.getValue().getMicPositionData();
                if (micPositionData4 != null && micPositionData4.getPosition() == i) {
                    str2 = entry2.getKey();
                    break;
                }
            }
        }
        str2 = null;
        Iterator<C76711U8t> it2 = this.LJFF.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C76711U8t next2 = it2.next();
            C76711U8t c76711U8t4 = next2;
            if (str2 != null && o.LJ(c76711U8t4.LJLIL.LIZJ, str2)) {
                c76711U8t = next2;
                break;
            }
        }
        C76711U8t c76711U8t5 = c76711U8t;
        if (c76711U8t5 != null) {
            return c76711U8t5;
        }
        return LIZIZ(EnumC75419Tip.StateIdle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76706U8o(Context context, U92 positionManager, U9E mappingHelper) {
        super(context, positionManager, mappingHelper);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(positionManager, "positionManager");
        o.LJIIIZ(mappingHelper, "mappingHelper");
        this.LJI = positionManager;
    }
}
