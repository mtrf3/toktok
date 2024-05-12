package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC85785Xld;
import X.EnumC85786Xle;
import X.IMP;
import X.IMQ;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.VL1;
import X.VL2;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ExitUnlinkPhoneEmailConfirmPageEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ExitUnlinkPhoneEmailConfirmPageEvent() {
        super("exit_unlink_phone_email_confirm_page");
        C65352Pkq.LIZ(EnumC85785Xld.class);
        C65352Pkq.LIZ(VL2.class);
        C65352Pkq.LIZ(IMQ.class);
        C65352Pkq.LIZ(IMP.class);
        C65352Pkq.LIZ(VL1.class);
        C65352Pkq.LIZ(EnumC85786Xle.class);
        this.LJII = C113554cx.LJJL(new OSZ("action_type", new C214578bV(false, null, null, false)), new OSZ("exit_method", new C214578bV(false, null, null, false)), new OSZ("is_2sv_on", new C214578bV(false, null, null, false)), new OSZ("is_email_verified", new C214578bV(false, null, null, false)), new OSZ("is_env_safe", new C214578bV(false, null, null, false)), new OSZ("unlink_type", new C214578bV(false, null, null, false)));
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

    public final void LJI(EnumC85785Xld actionType) {
        o.LJIIIZ(actionType, "actionType");
        LIZLLL(actionType.getValue(), "action_type");
    }

    public final void LJII(IMQ is2svOn) {
        o.LJIIIZ(is2svOn, "is2svOn");
        LIZLLL(Integer.valueOf(is2svOn.getValue()), "is_2sv_on");
    }

    public final void LJIIIIZZ(VL1 isEnvSafe) {
        o.LJIIIZ(isEnvSafe, "isEnvSafe");
        LIZLLL(Integer.valueOf(isEnvSafe.getValue()), "is_env_safe");
    }

    public final void LJIIIZ(EnumC85786Xle unlinkType) {
        o.LJIIIZ(unlinkType, "unlinkType");
        LIZLLL(unlinkType.getValue(), "unlink_type");
    }
}
