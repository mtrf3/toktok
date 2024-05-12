package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC85633XjB;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class IdentityVerificationTypingEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public IdentityVerificationTypingEvent() {
        super("identity_verification_typing");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC85633XjB.class);
        this.LJII = C113554cx.LJJL(new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("page", new C214578bV(false, null, null, false)), new OSZ("verification_method", new C214578bV(false, null, null, false)));
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
