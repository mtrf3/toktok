package X;

import kotlin.jvm.internal.AqS0S2001000_3;
import kotlin.jvm.internal.AqS11S0401000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196157mt {
    public static String LIZ;
    public static boolean LIZIZ;
    public static String LJ;
    public static Long LIZJ = -1L;
    public static Long LIZLLL = -1L;
    public static final C199747sg LJFF = new C199747sg();

    public static void LIZJ(InterfaceC194547kI item, C181847Bs nowsFeedHierarchyData) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
        C7MK.LJII("now_retry_show", new AqS134S0200000_3(item, nowsFeedHierarchyData, 212));
    }

    public static void LJFF(String triggerType, String str) {
        o.LJIIIZ(triggerType, "triggerType");
        C7MK.LJI("now_widget_guide_click", new AqS0S2001000_3(triggerType, str, 1));
    }

    public static void LIZIZ(InterfaceC194547kI item, String str, String str2, String str3) {
        o.LJIIIZ(item, "item");
        C7MK.LJI("change_front_now_position", new C7OE(item, str2, str, str3));
    }

    public static void LIZLLL(int i, InterfaceC194547kI item, C181847Bs nowsFeedHierarchyData, long j, Integer num) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
        C7MK.LJII("play_time", new C7NV(i, j, item, nowsFeedHierarchyData, num, null));
    }

    public static void LJ(int i, InterfaceC194547kI item, C181847Bs nowsFeedHierarchyData, Integer num, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
        C78983UzD.LJLJI = item.getAweme().getAid();
        C7MK.LJII("video_play", new AqS11S0401000_3(i, item, nowsFeedHierarchyData, num, interfaceC88472Yns, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r5.LJ == (-1)) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r10, long r11, X.EnumC196137mr r13, java.lang.String r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196157mt.LIZ(java.lang.String, long, X.7mr, java.lang.String, int, int):void");
    }
}
