package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.7Im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183607Im {
    public static OSZ<String, Long> LIZ = new OSZ<>("", -1L);
    public static OSZ<String, Long> LIZIZ = new OSZ<>("", -1L);

    public static void LIZIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        LIZIZ = new OSZ<>(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LIZ(String str, String trigger, String str2) {
        long longValue;
        o.LJIIIZ(trigger, "trigger");
        if (str.length() == 0) {
            return;
        }
        if (o.LJ(trigger, "like") && o.LJ(str, LIZ.getFirst())) {
            longValue = LIZ.getSecond().longValue();
        } else if (o.LJ(trigger, "loop") && o.LJ(str, LIZIZ.getFirst())) {
            longValue = LIZIZ.getSecond().longValue();
        } else {
            return;
        }
        if (longValue <= 0) {
            return;
        }
        FMX.LJIILL("repost_guide_btn_show_duration", new OSZ(str, "group_id"), new OSZ(Long.valueOf(SystemClock.elapsedRealtime() - longValue), "duration"), new OSZ(str2, "enter_from"), new OSZ(trigger, "trigger"));
        LIZ = new OSZ<>("", -1L);
        LIZIZ = new OSZ<>("", -1L);
    }
}
