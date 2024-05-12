package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.AbstractC63695OzD;
import X.C214578bV;
import X.C51029K0z;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfileFeedSwipeEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ProfileFeedSwipeEvent() {
        super("profile_feed_swipe");
        C65352Pkq.LIZ(Integer.TYPE);
        this.LJII = C51029K0z.LJJIIZI(new OSZ("value", new C214578bV(true, null, null, false)));
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
