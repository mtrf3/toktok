package com.ss.android.ugc.aweme.share.downloadv2.event.newet;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ClientWatermarkEndEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ClientWatermarkEndEvent() {
        super("client_watermark_end");
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("aweme_type", new C214578bV(false, null, null, false)), new OSZ("download_id", new C214578bV(false, null, null, false)), new OSZ("download_method", new C214578bV(false, null, null, false)), new OSZ("duration", new C214578bV(false, null, null, false)), new OSZ("end_watermark", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(false, null, null, false)), new OSZ("is_self_video", new C214578bV(false, null, null, false)), new OSZ("pic_cnt", new C214578bV(false, null, null, false)), new OSZ("succeed", new C214578bV(false, null, null, false)), new OSZ("watermark_id", new C214578bV(false, null, null, false)), new OSZ("watermark_sdk", new C214578bV(false, null, null, false)), new OSZ("watermark_type", new C214578bV(false, null, null, false)));
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
