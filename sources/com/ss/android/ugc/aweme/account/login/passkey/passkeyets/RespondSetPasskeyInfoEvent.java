package com.ss.android.ugc.aweme.account.login.passkey.passkeyets;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RespondSetPasskeyInfoEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public RespondSetPasskeyInfoEvent() {
        super("respond_set_passkey_info");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        this.LJII = C113554cx.LJJL(new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("is_key_set", new C214578bV(false, null, null, false)), new OSZ("result", new C214578bV(false, null, null, false)));
    }

    public final void LJI() {
        LIZLLL("account_page", "enter_from");
    }

    public final void LJII() {
        LIZLLL("click", "enter_method");
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
