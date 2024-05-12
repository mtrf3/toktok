package com.ss.android.ugc.aweme.journey.events;

import X.AbstractC63695OzD;
import X.C214578bV;
import X.C51029K0z;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShowDeeplinkEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ShowDeeplinkEvent() {
        super("show_deeplink");
        C65352Pkq.LIZ(String.class);
        this.LJII = C51029K0z.LJJIIZI(new OSZ("deeplink_uri", new C214578bV(false, null, null, false)));
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
