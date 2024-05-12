package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostListReservationButtonColorOptSetting;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TqT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75893TqT {
    public static long LIZ;
    public static java.util.Map<Long, Long> LIZIZ = new HashMap();
    public static boolean LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static boolean LJIIIZ;
    public static long LJIIJ;
    public static boolean LJIIJJI;

    public static boolean LIZ(C75981Trt c75981Trt) {
        RivalExtraInfo rivalExtraInfo;
        if (CoHostListReservationButtonColorOptSetting.INSTANCE.isEnable() && !o.LJ(InterfaceC30442Bx8.f68o3.LIZJ(), Boolean.TRUE)) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.p3;
            Integer LIZJ2 = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_MULTI_COHOST_RESERVE_EDUCATION_COUNT.value");
            if (LIZJ2.intValue() <= 3 && !LJIIJJI && (rivalExtraInfo = c75981Trt.LJLJJI) != null && rivalExtraInfo.showPlayType == 2 && (c75981Trt.LJLJL || !((IInteractService) CN1.LIZ(IInteractService.class)).ta0())) {
                LJIIJJI = true;
                c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
                c75981Trt.LJLLJ = true;
                return true;
            }
        }
        return false;
    }
}
