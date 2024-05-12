package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PrefetchStatusDescTranslEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public PrefetchStatusDescTranslEvent() {
        super("prefetch_status_desc_transl");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Integer.TYPE);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("desc_lang", new C214578bV(false, null, null, false)), new OSZ("duration", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(false, null, null, false)), new OSZ("status", new C214578bV(false, null, null, false)), new OSZ("target_lang", new C214578bV(false, null, null, false)));
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
