package X;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cc8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31688Cc8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, java.util.Map map, java.util.Map dataContainer) {
        o.LJIIIZ(dataContainer, "dataContainer");
        long LIZ2 = C31684Cc4.LIZ("param_live_slot_start_time_long", dataContainer);
        long LIZ3 = C31684Cc4.LIZ("param_live_slot_api_end_time_long", dataContainer);
        long LIZ4 = C31684Cc4.LIZ("param_live_slot_prepare_to_show", dataContainer);
        long LIZ5 = C31684Cc4.LIZ("PARAM_LIVE_SLOT_ON_CREATE", dataContainer);
        if (LIZ2 > 0) {
            if (LIZ3 > 0) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(LIZ3 - LIZ2);
                LIZ6.append("");
                ((HashMap) map).put("request_time", X1D.LIZIZ(LIZ6));
            }
            if (LIZ4 > 0) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append(LIZ4 - LIZ2);
                LIZ7.append("");
                ((HashMap) map).put("prepare_to_show_time", X1D.LIZIZ(LIZ7));
            }
            if (j > 0) {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(j - LIZ2);
                LIZ8.append("");
                ((HashMap) map).put("on_load_start_time", X1D.LIZIZ(LIZ8));
            }
            if (LIZ5 > 0) {
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append(LIZ5 - LIZ2);
                LIZ9.append("");
                ((HashMap) map).put("slot_on_create_time", X1D.LIZIZ(LIZ9));
            }
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append(SystemClock.uptimeMillis() - LIZ2);
            LIZ10.append("");
            ((HashMap) map).put("all_time", X1D.LIZIZ(LIZ10));
        }
    }
}
