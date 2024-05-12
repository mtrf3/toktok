package com.ss.android.ugc.feed.platform.componentmanager.mob;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.C8QA;
import X.C8QJ;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ShowCoreFdmtComponentEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ShowCoreFdmtComponentEvent() {
        super("show_core_fdmt_component_v2");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(C8QA.class);
        C65352Pkq.LIZ(C8QJ.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("author_id", new C214578bV(false, null, null, false)), new OSZ("component_key", new C214578bV(true, null, null, false)), new OSZ("component_type", new C214578bV(true, null, null, false)), new OSZ("enter_from", new C214578bV(true, null, null, false)), new OSZ("group_id", new C214578bV(true, null, null, false)), new OSZ("search_id", new C214578bV(false, null, null, false)));
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
