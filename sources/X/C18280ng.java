package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.game.TnsPiracyDetail;

/* renamed from: X.0ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18280ng {
    public static C19840qC LIZ;
    public static C73411SrX LIZIZ;
    public static C73411SrX LIZJ;
    public static final LinkedList<TnsPiracyDetail> LIZLLL = new LinkedList<>();
    public static LinkedList<TnsPiracyDetail> LJ;

    public static String LIZ() {
        String name = C16880lQ.LLLLIIIILLL().getName();
        o.LJIIIIZZ(name, "currentThread().name");
        return name;
    }

    public static void LIZJ(TnsPiracyDetail tnsPiracyDetail) {
        boolean z;
        List<Double> list = tnsPiracyDetail.angle;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int size = tnsPiracyDetail.angle.size();
            for (int i = 0; i < size; i++) {
                ListProtector.set(tnsPiracyDetail.angle, i, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
            }
        }
        List<Double> list2 = tnsPiracyDetail.acceleration;
        if (list2 != null && !list2.isEmpty()) {
            int size2 = tnsPiracyDetail.acceleration.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ListProtector.set(tnsPiracyDetail.acceleration, i2, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
            }
        }
        tnsPiracyDetail.frontScreenClicks = 0L;
        tnsPiracyDetail.backScreenClicks = 0L;
        tnsPiracyDetail.microSound = 0L;
        tnsPiracyDetail.recordTime = 0L;
        LinkedList<TnsPiracyDetail> linkedList = LIZLLL;
        int size3 = linkedList.size();
        C19840qC c19840qC = LIZ;
        if (c19840qC != null) {
            if (size3 <= c19840qC.LIZ && !linkedList.contains(tnsPiracyDetail)) {
                linkedList.add(tnsPiracyDetail);
                return;
            }
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    public static void LIZIZ(int i, int i2, String str, int i3, int i4, boolean z) {
        int i5 = !z ? 1 : 0;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_tns_piracy_info_report_result");
        C19840qC c19840qC = LIZ;
        if (c19840qC != null) {
            LIZ2.LJIJJ(c19840qC.LIZJ, "room_id");
            C19840qC c19840qC2 = LIZ;
            if (c19840qC2 != null) {
                LIZ2.LJIJJ(c19840qC2.LIZIZ, "anchor_id");
                LIZ2.LJIJJ(Integer.valueOf(i5), "result");
                LIZ2.LJIJJ(Integer.valueOf(i2), "details_size");
                LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
                LIZ2.LJIJJ(Integer.valueOf(i3), "is_mic_volume_valid");
                LIZ2.LJIJJ(Integer.valueOf(i4), "is_motion_data_valid");
                C1FL.LJI(LIZ2, str, "error_message");
                return;
            }
            o.LJIJI("config");
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }
}
