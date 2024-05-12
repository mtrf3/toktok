package com.ss.android.ugc.aweme.share.downloadv2.event.newet;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DownloadStartEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public DownloadStartEvent() {
        super("download_start");
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        this.LJII = C113554cx.LJJL(new OSZ("aweme_type", new C214578bV(true, null, null, false)), new OSZ("download_id", new C214578bV(false, null, null, false)), new OSZ("download_method", new C214578bV(true, null, null, false)), new OSZ("download_pic_cnt", new C214578bV(true, null, null, false)), new OSZ("download_pic_location", new C214578bV(true, null, null, false)), new OSZ("download_url", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(true, null, null, false)), new OSZ("group_id", new C214578bV(false, null, null, false)), new OSZ("is_play_cache", new C214578bV(false, null, null, false)), new OSZ("is_player_cache", new C214578bV(false, null, null, false)), new OSZ("is_self_video", new C214578bV(false, null, null, false)), new OSZ("is_server_watermark", new C214578bV(false, null, null, false)), new OSZ("pic_cnt", new C214578bV(true, null, null, false)), new OSZ("retry", new C214578bV(false, null, null, false)), new OSZ("share_platform", new C214578bV(false, null, null, false)), new OSZ("start_download", new C214578bV(false, null, null, false)));
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
