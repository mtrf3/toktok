package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC46490IMk;
import X.EnumC85784Xlc;
import X.EnumC85787Xlf;
import X.IMO;
import X.IMX;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ExitUnlinkPhoneEmailPopupEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ExitUnlinkPhoneEmailPopupEvent() {
        super("exit_unlink_phone_email_popup");
        C65352Pkq.LIZ(EnumC46490IMk.class);
        C65352Pkq.LIZ(EnumC85784Xlc.class);
        C65352Pkq.LIZ(IMO.class);
        C65352Pkq.LIZ(IMX.class);
        C65352Pkq.LIZ(EnumC85787Xlf.class);
        this.LJII = C113554cx.LJJL(new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("exit_method", new C214578bV(false, null, null, false)), new OSZ("is_email_verified", new C214578bV(false, null, null, false)), new OSZ("unlink_eligible_status", new C214578bV(false, null, null, false)), new OSZ("unlink_type", new C214578bV(false, null, null, false)));
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
