package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.ELM;
import X.EnumC86732Y2e;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ClaPerfCaptionLoadEndEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ClaPerfCaptionLoadEndEvent() {
        super("cla_perf_caption_load_end");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(ELM.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC86732Y2e.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("author_id", new C214578bV(true, null, null, false)), new OSZ("caption_original_language", new C214578bV(false, null, null, false)), new OSZ("caption_type", new C214578bV(false, null, null, false)), new OSZ("duration", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(true, null, null, false)), new OSZ("is_first_time", new C214578bV(false, null, null, false)), new OSZ("is_lazy_load", new C214578bV(false, null, null, false)), new OSZ("is_preload", new C214578bV(false, null, null, false)), new OSZ("item_duration", new C214578bV(false, null, null, false)), new OSZ("player_cache_hit", new C214578bV(false, null, null, false)), new OSZ("player_download_duration", new C214578bV(false, null, null, false)), new OSZ("player_error_code", new C214578bV(false, null, null, false)), new OSZ("player_file_size", new C214578bV(false, null, null, false)), new OSZ("result_code", new C214578bV(true, null, null, false)), new OSZ("subtitle_id", new C214578bV(false, null, null, false)), new OSZ("target_language", new C214578bV(false, null, null, false)), new OSZ("trigger_method", new C214578bV(false, null, null, false)), new OSZ("user_id", new C214578bV(true, null, null, false)));
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
