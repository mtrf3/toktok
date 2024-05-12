package com.ss.android.tracker.event.bus;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC214608bY;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfileTabClientShowEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ProfileTabClientShowEvent() {
        super("profile_tab_client_show");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC214608bY.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("author_id", new C214578bV()), new OSZ("enter_from", new C214578bV()), new OSZ("group_id", new C214578bV()), new OSZ("music_id", new C214578bV()), new OSZ("request_id", new C214578bV()), new OSZ("screen_form", new C214578bV()), new OSZ("tab_name", new C214578bV()), new OSZ("tag_id", new C214578bV()), new OSZ("to_user_id", new C214578bV()));
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
