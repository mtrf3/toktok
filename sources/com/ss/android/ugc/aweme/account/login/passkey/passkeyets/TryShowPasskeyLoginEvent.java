package com.ss.android.ugc.aweme.account.login.passkey.passkeyets;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TryShowPasskeyLoginEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public TryShowPasskeyLoginEvent() {
        super("try_show_passkey_login");
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        this.LJII = C113554cx.LJJL(new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("has_google_account", new C214578bV(false, null, null, false)), new OSZ("has_screen_lock", new C214578bV(false, null, null, false)));
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
