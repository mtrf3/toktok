package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC85788Xlg;
import X.EnumC85789Xlh;
import X.IMR;
import X.IMS;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.VL0;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ShowUnlinkPhoneEmailConfirmPageEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ShowUnlinkPhoneEmailConfirmPageEvent() {
        super("show_unlink_phone_email_confirm_page");
        C65352Pkq.LIZ(EnumC85788Xlg.class);
        C65352Pkq.LIZ(IMS.class);
        C65352Pkq.LIZ(IMR.class);
        C65352Pkq.LIZ(VL0.class);
        C65352Pkq.LIZ(EnumC85789Xlh.class);
        this.LJII = C113554cx.LJJL(new OSZ("action_type", new C214578bV(false, null, null, false)), new OSZ("is_2sv_on", new C214578bV(false, null, null, false)), new OSZ("is_email_verified", new C214578bV(false, null, null, false)), new OSZ("is_env_safe", new C214578bV(false, null, null, false)), new OSZ("unlink_type", new C214578bV(false, null, null, false)));
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
