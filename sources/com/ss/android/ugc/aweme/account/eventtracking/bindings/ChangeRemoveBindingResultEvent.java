package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC85632XjA;
import X.IMJ;
import X.IML;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ChangeRemoveBindingResultEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ChangeRemoveBindingResultEvent() {
        super("change_remove_binding_result");
        C65352Pkq.LIZ(EnumC85632XjA.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(IMJ.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(IML.class);
        this.LJII = C113554cx.LJJL(new OSZ("action_type", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("error_code", new C214578bV(false, null, null, false)), new OSZ("is_safe_env", new C214578bV(false, null, null, false)), new OSZ("is_success", new C214578bV(false, null, null, false)), new OSZ("unlink_type", new C214578bV(false, null, null, false)), new OSZ("is_email_verified", new C214578bV(false, null, null, false)));
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
