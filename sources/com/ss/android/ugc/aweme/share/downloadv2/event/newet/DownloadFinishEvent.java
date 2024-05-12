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
public final class DownloadFinishEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public DownloadFinishEvent() {
        super("download_finish");
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(Double.TYPE);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("_ad_staging_flag", new C214578bV(false, null, null, false)), new OSZ("aweme_type", new C214578bV(false, null, null, false)), new OSZ("creator_type", new C214578bV(false, null, null, false)), new OSZ("download_id", new C214578bV(false, null, null, false)), new OSZ("download_method", new C214578bV(false, null, null, false)), new OSZ("download_result", new C214578bV(false, null, null, false)), new OSZ("duration", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("error_code", new C214578bV(false, null, null, false)), new OSZ("error_desc", new C214578bV(false, null, null, false)), new OSZ("fileSize", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(false, null, null, false)), new OSZ("is_gif", new C214578bV(false, null, null, false)), new OSZ("is_live_photo", new C214578bV(false, null, null, false)), new OSZ("is_play_cache", new C214578bV(false, null, null, false)), new OSZ("is_player_cache", new C214578bV(false, null, null, false)), new OSZ("is_self_video", new C214578bV(false, null, null, false)), new OSZ("package_size", new C214578bV(false, null, null, false)), new OSZ("platform", new C214578bV(false, null, null, false)), new OSZ("refer", new C214578bV(false, null, null, false)), new OSZ("status", new C214578bV(false, null, null, false)), new OSZ("style_type", new C214578bV(false, null, null, false)), new OSZ("tag", new C214578bV(false, null, null, false)));
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
