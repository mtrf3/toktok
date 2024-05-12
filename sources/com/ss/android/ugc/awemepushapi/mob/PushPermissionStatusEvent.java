package com.ss.android.ugc.awemepushapi.mob;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC46482IMc;
import X.EnumC86785Y4f;
import X.EnumC86786Y4g;
import X.IMD;
import X.IME;
import X.IMT;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PushPermissionStatusEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public PushPermissionStatusEvent() {
        super("push_permission_status");
        C65352Pkq.LIZ(EnumC46482IMc.class);
        C65352Pkq.LIZ(IME.class);
        C65352Pkq.LIZ(EnumC86785Y4f.class);
        C65352Pkq.LIZ(EnumC86786Y4g.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(IMD.class);
        C65352Pkq.LIZ(IMT.class);
        C65352Pkq.LIZ(cls);
        this.LJII = C113554cx.LJJL(new OSZ("click_type", new C214578bV(false, null, null, false)), new OSZ("is_with_cover", new C214578bV(false, null, null, false)), new OSZ("out_status_after", new C214578bV(false, null, null, false)), new OSZ("out_status_before", new C214578bV(false, null, null, false)), new OSZ("pop_up_count", new C214578bV(false, null, null, false)), new OSZ("pop_up_rn", new C214578bV(false, null, null, false)), new OSZ("popup_type", new C214578bV(false, null, null, false)), new OSZ("timestamp_diff", new C214578bV(false, null, null, false)));
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

    public final void LJI(EnumC46482IMc clickType) {
        o.LJIIIZ(clickType, "clickType");
        LIZLLL(clickType.getValue(), "click_type");
    }

    public final void LJII(IME isWithCover) {
        o.LJIIIZ(isWithCover, "isWithCover");
        LIZLLL(Integer.valueOf(isWithCover.getValue()), "is_with_cover");
    }

    public final void LJIIIIZZ(EnumC86785Y4f outStatusAfter) {
        o.LJIIIZ(outStatusAfter, "outStatusAfter");
        LIZLLL(outStatusAfter.getValue(), "out_status_after");
    }

    public final void LJIIIZ(EnumC86786Y4g outStatusBefore) {
        o.LJIIIZ(outStatusBefore, "outStatusBefore");
        LIZLLL(outStatusBefore.getValue(), "out_status_before");
    }

    public final void LJIIJ(IMT popupType) {
        o.LJIIIZ(popupType, "popupType");
        LIZLLL(Integer.valueOf(popupType.getValue()), "popup_type");
    }
}
