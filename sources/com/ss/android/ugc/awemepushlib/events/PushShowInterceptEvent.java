package com.ss.android.ugc.awemepushlib.events;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PushShowInterceptEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public PushShowInterceptEvent() {
        super("push_show_intercept");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("msg_id", new C214578bV(false, null, null, false)), new OSZ("push_channel", new C214578bV(false, null, null, false)), new OSZ("push_label", new C214578bV(false, null, null, false)), new OSZ("reason", new C214578bV(false, null, null, false)), new OSZ("rule_id", new C214578bV(false, null, null, false)), new OSZ("rule_id64", new C214578bV(false, null, null, false)));
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
