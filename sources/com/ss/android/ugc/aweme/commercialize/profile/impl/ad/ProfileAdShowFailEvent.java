package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.AbstractC63695OzD;
import X.C214578bV;
import X.C51029K0z;
import X.C65352Pkq;
import X.C9B7;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdShowFailEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ProfileAdShowFailEvent() {
        super("profile_ad_show_fail");
        C65352Pkq.LIZ(C9B7.class);
        this.LJII = C51029K0z.LJJIIZI(new OSZ("fail_reason", new C214578bV(true, null, null, false)));
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
