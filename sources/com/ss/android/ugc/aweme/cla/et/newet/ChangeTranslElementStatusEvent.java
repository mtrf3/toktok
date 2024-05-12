package com.ss.android.ugc.aweme.cla.et.newet;

import X.AC3;
import X.AC4;
import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC218698i9;
import X.EnumC218708iA;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ChangeTranslElementStatusEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ChangeTranslElementStatusEvent() {
        super("change_transl_element_status");
        C65352Pkq.LIZ(EnumC218698i9.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC218708iA.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Integer.TYPE);
        C65352Pkq.LIZ(AC3.class);
        C65352Pkq.LIZ(AC4.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("element", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(false, null, null, false)), new OSZ("is_author", new C214578bV(false, null, null, false)), new OSZ("overall_status", new C214578bV(false, null, null, false)), new OSZ("to_status", new C214578bV(false, null, null, false)), new OSZ("user_id", new C214578bV(false, null, null, false)));
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
