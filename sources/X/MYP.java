package X;

import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class MYP {
    public static Long LIZ;

    static {
        EventBus.LIZJ().LJIILJJIL(new MYP());
    }

    public static Long LIZ() {
        Long l = LIZ;
        if (l == null) {
            return null;
        }
        l.longValue();
        LIZ = null;
        return l;
    }

    @QD3
    public final void recordInboxLiveSkyLightPosition(MYW event) {
        o.LJIIIZ(event, "event");
        LIZ = Long.valueOf(event.LJLIL);
    }
}
