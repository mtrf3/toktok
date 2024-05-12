package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4D6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4D6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C99033ud sessionInfo, String str) {
        String processID = C3Y4.LIZJ;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(processID, "processID");
        C772831o.LIZ().LIZIZ("tikbot_voice_input_cancel", C113554cx.LJJL(new OSZ("enter_from", sessionInfo.getEnterFromForMob()), new OSZ("enter_method", sessionInfo.getEnterMethod()), new OSZ("process_id", processID), new OSZ("cancel_method", str)));
    }

    public static void LIZJ(C99033ud sessionInfo, String str) {
        String processID = C3Y4.LIZJ;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(processID, "processID");
        C772831o.LIZ().LIZIZ("tikbot_voice_toast_show", C113554cx.LJJL(new OSZ("enter_from", sessionInfo.getEnterFromForMob()), new OSZ("enter_method", sessionInfo.getEnterMethod()), new OSZ("process_id", processID), new OSZ("reason", str)));
    }

    public static void LIZ(C99033ud sessionInfo, String str, String str2) {
        String processID = C3Y4.LIZJ;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(processID, "processID");
        C772831o.LIZ().LIZIZ("tikbot_input_button_click", C113554cx.LJJL(new OSZ("enter_from", sessionInfo.getEnterFromForMob()), new OSZ("enter_method", sessionInfo.getEnterMethod()), new OSZ("process_id", processID), new OSZ("button_type", str), new OSZ("to_status", str2)));
    }
}
