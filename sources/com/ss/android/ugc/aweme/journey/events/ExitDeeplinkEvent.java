package com.ss.android.ugc.aweme.journey.events;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExitDeeplinkEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ExitDeeplinkEvent() {
        super("exit_deeplink");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Integer.TYPE);
        this.LJII = C113554cx.LJJL(new OSZ("deeplink_uri", new C214578bV(false, null, null, false)), new OSZ("is_from_task", new C214578bV(false, null, null, false)));
    }

    @Override // X.AbstractC63695OzD
    public final Map<String, C214578bV> LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC63695OzD
    public final AbstractC63695OzD LJ(InterfaceC54035LIp group) {
        o.LJIIIZ(group, "group");
        LIZ().add(group);
        return this;
    }
}
