package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BPX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i != 0) {
            if (i == 1) {
                return "gift records";
            }
            if (i == 2) {
                return "gifter only";
            }
            if (i == 4) {
                return "subscriber only";
            }
            if (i == 8) {
                return "comment only";
            }
        }
        return "all messages";
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        String str2;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_extended_comment_filed_filter_selection_show");
        LIZ2.LJIILLIIL(dataChannel);
        LiveMode liveMode = (LiveMode) dataChannel.kv0(BCX.class);
        if (liveMode != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = null;
        }
        LIZ2.LJIJ(str2);
        LIZ2.LJIJJ(str, "filter_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(DataChannel dataChannel, long j, List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(LIZ(((Number) it.next()).intValue()));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_extended_comment_filed_filter_use_time");
        LIZ2.LJIILLIIL(dataChannel);
        LiveMode liveMode = (LiveMode) dataChannel.kv0(BCX.class);
        if (liveMode != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = null;
        }
        LIZ2.LJIJ(str);
        LIZ2.LJIJJ(Long.valueOf(j / 1000), "use_time");
        LIZ2.LJIJJ(GsonProtectorUtils.toJson(C09650Zl.LIZJ, arrayList), "chosen_status");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(DataChannel dataChannel, String str, int i, List list, String closeType) {
        String str2;
        o.LJIIIZ(closeType, "closeType");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(LIZ(((Number) it.next()).intValue()));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_extended_comment_filed_filter_selection_click");
        LIZ2.LJIILLIIL(dataChannel);
        LiveMode liveMode = (LiveMode) dataChannel.kv0(BCX.class);
        if (liveMode != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = null;
        }
        LIZ2.LJIJ(str2);
        LIZ2.LJIJJ(str, "filter_type");
        LIZ2.LJIJJ(LIZ(i), "filter_name");
        LIZ2.LJIJJ(GsonProtectorUtils.toJson(C09650Zl.LIZJ, arrayList), "chosen_status");
        LIZ2.LJIJJ(closeType, "close_type");
        LIZ2.LJJIIJZLJL();
    }
}
