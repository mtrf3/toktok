package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC63822P3a;
import X.EnumC85694XkA;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.P3W;
import X.P3X;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class VerificationListShowEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public VerificationListShowEvent() {
        super("verification_list_show");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(P3W.class);
        C65352Pkq.LIZ(P3X.class);
        C65352Pkq.LIZ(EnumC63822P3a.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC85694XkA.class);
        this.LJII = C113554cx.LJJL(new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("is_email_show", new C214578bV(false, null, null, false)), new OSZ("is_pw_show", new C214578bV(false, null, null, false)), new OSZ("is_sms_show", new C214578bV(false, null, null, false)), new OSZ("page", new C214578bV(false, null, null, false)), new OSZ("verification_method", new C214578bV(false, null, null, false)));
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
