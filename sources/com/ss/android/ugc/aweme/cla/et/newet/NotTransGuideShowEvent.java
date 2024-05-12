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
public final class NotTransGuideShowEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public NotTransGuideShowEvent() {
        super("not_trans_guide_show");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("display_language", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(true, null, null, false)));
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
