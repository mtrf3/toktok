package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.ELR;
import X.ELS;
import X.ELT;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShowUnlinkPhoneEmailSuccessBannerEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ShowUnlinkPhoneEmailSuccessBannerEvent() {
        super("show_unlink_phone_email_success_banner");
        C65352Pkq.LIZ(ELR.class);
        C65352Pkq.LIZ(ELS.class);
        C65352Pkq.LIZ(ELT.class);
        this.LJII = C113554cx.LJJL(new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("is_env_safe", new C214578bV(false, null, null, false)), new OSZ("unlink_type", new C214578bV(false, null, null, false)));
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
