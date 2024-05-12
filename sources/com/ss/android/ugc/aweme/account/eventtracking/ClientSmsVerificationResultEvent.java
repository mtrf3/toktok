package com.ss.android.ugc.aweme.account.eventtracking;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.C69098R9y;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.WM7;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ClientSmsVerificationResultEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ClientSmsVerificationResultEvent() {
        super("client_sms_verification_result");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("mobile_num", new C214578bV(false, null, null, false)), new OSZ("result", new C214578bV(false, null, null, false)), new OSZ(WM7.SCENE_SERVICE, new C214578bV(false, null, null, false)), new OSZ("sms_country_code", new C214578bV(false, null, null, false)));
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

    public final void LJI(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LIZLLL(enterFrom, "enter_from");
    }

    public final void LJII(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        LIZLLL(enterMethod, "enter_method");
    }

    public final void LJIIIIZZ(C69098R9y group) {
        o.LJIIIZ(group, "group");
        LIZLLL(group.LJLILLLLZI, "sms_country_code");
        LIZLLL(group.LJLIL, "mobile_num");
    }

    public final void LJIIIZ(int i) {
        LIZLLL(Integer.valueOf(i), "result");
    }

    public final void LJIIJ(int i) {
        LIZLLL(Integer.valueOf(i), WM7.SCENE_SERVICE);
    }
}
