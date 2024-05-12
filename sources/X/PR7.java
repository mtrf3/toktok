package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PR7 {
    public static final List<PR8> LIZ = new ArrayList();

    public static void LIZ() {
        String str;
        ArrayList arrayList = (ArrayList) LIZ;
        if (arrayList.size() == 0) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PR8 pr8 = (PR8) it.next();
            C76W c76w = new C76W();
            c76w.LIZ(WM7.SCENE_SERVICE, pr8.LIZ);
            String str2 = "1";
            if (o.LJ("background", pr8.LIZ)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c76w.LIZ("is_background", str);
            c76w.LIZ("activity", pr8.LIZIZ);
            c76w.LIZ("report_index", String.valueOf(pr8.LIZLLL));
            if (!pr8.LJ) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c76w.LIZ("is_low_power_mode", str2);
            c76w.LIZ("current", String.valueOf(pr8.LIZJ));
            c76w.LIZ("battery_state", String.valueOf(pr8.LJFF));
            c76w.LIZ("start_battery_level", String.valueOf(pr8.LJI));
            c76w.LIZ("end_battery_level", String.valueOf(pr8.LJII));
            c76w.LIZ("battery_temperature", String.valueOf(pr8.LJIIIIZZ));
            c76w.LIZ("thermal_state", String.valueOf(pr8.LJIIIZ));
            c76w.LIZ("extra_thermal_status", String.valueOf(pr8.LJIIJ));
            c76w.LIZ("cpu_usage", String.valueOf(pr8.LJIIJJI));
            c76w.LIZ("cpu_speed", String.valueOf(pr8.LJIIL));
            c76w.LIZ("vss", String.valueOf(pr8.LJIILIIL));
            c76w.LIZ("native_heap_size", String.valueOf(pr8.LJIILJJIL));
            c76w.LIZ("native_heap_allocated_size", String.valueOf(pr8.LJIILL));
            c76w.LIZ("native_heap_free_size", String.valueOf(pr8.LJIILLIIL));
            c76w.LIZ("free_java_memory", String.valueOf(pr8.LJIJ));
            c76w.LIZ("java_used_memory", String.valueOf(pr8.LJIIZILJ));
            c76w.LIZ("java_used_rate", String.valueOf(pr8.LJIJI));
            c76w.LIZ("pss", String.valueOf(pr8.LJIJJ));
            if (((Boolean) C53019KrP.LIZ.getValue()).booleanValue()) {
                c76w.LIZ("free_physical_memory", String.valueOf(pr8.LJIJJLI));
            }
            FMX.LJIILJJIL("prf_power_sample_report", c76w.LIZIZ());
        }
        ((ArrayList) LIZ).clear();
    }
}
