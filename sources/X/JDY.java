package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class JDY implements Keva.OnChangeListener {
    public static final JDY LIZ = new JDY();

    @Override // com.bytedance.keva.Keva.OnChangeListener
    public final void onChanged(Keva keva, String str) {
        if (o.LJ(str, "slark_events_monitor_list")) {
            String string = keva.getString("slark_events_monitor_list", "");
            o.LJIIIIZZ(string, "rep.getString(Key.SLARK_EVENTS_MONITOR_LIST, \"\")");
            JDX.LIZIZ = s.LJLJJL(string, new String[]{","}, 0, 6);
        }
    }
}
