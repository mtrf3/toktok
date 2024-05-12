package com.ss.android.ugc.awemepushlib.events;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.IMH;
import X.InterfaceC54035LIp;
import X.M4W;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PushImgDownloadStatusEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public PushImgDownloadStatusEvent() {
        super("push_img_download_status");
        C65352Pkq.LIZ(M4W.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(IMH.class);
        this.LJII = C113554cx.LJJL(new OSZ("img_source", new C214578bV(false, null, null, false)), new OSZ("img_type", new C214578bV(false, null, null, false)), new OSZ("img_url", new C214578bV(false, null, null, false)), new OSZ("push_type", new C214578bV(false, null, null, false)), new OSZ("rule_id", new C214578bV(false, null, null, false)), new OSZ("status", new C214578bV(false, null, null, false)));
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
