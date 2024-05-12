package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.Y28;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ClaPerfTranslationsEndEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ClaPerfTranslationsEndEvent() {
        super("cla_perf_translations_end");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Y28.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("author_id", new C214578bV(true, null, null, false)), new OSZ("caption_original_language", new C214578bV(false, null, null, false)), new OSZ("desc_is_cached", new C214578bV(false, null, null, false)), new OSZ("desc_original_language", new C214578bV(false, null, null, false)), new OSZ("desc_original_size", new C214578bV(false, null, null, false)), new OSZ("desc_result", new C214578bV(false, null, null, false)), new OSZ("desc_stat", new C214578bV(false, null, null, false)), new OSZ("desc_translated_size", new C214578bV(false, null, null, false)), new OSZ("description_duration", new C214578bV(false, null, null, false)), new OSZ("description_msg", new C214578bV(false, null, null, false)), new OSZ("duration", new C214578bV(true, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(true, null, null, false)), new OSZ("item_duration", new C214578bV(false, null, null, false)), new OSZ("offline_caption_stat", new C214578bV(false, null, null, false)), new OSZ("realtime_caption_duration", new C214578bV(false, null, null, false)), new OSZ("realtime_caption_is_cached", new C214578bV(false, null, null, false)), new OSZ("realtime_caption_msg", new C214578bV(false, null, null, false)), new OSZ("realtime_caption_result", new C214578bV(false, null, null, false)), new OSZ("realtime_caption_stat", new C214578bV(false, null, null, false)), new OSZ("realtime_caption_translated_size", new C214578bV(false, null, null, false)), new OSZ("result_code", new C214578bV(true, null, null, false)), new OSZ("sticker_duration", new C214578bV(false, null, null, false)), new OSZ("sticker_is_cached", new C214578bV(false, null, null, false)), new OSZ("sticker_msg", new C214578bV(false, null, null, false)), new OSZ("sticker_original_language", new C214578bV(false, null, null, false)), new OSZ("sticker_original_size", new C214578bV(false, null, null, false)), new OSZ("sticker_result", new C214578bV(false, null, null, false)), new OSZ("sticker_stat", new C214578bV(false, null, null, false)), new OSZ("sticker_translated_size", new C214578bV(false, null, null, false)), new OSZ("target_language", new C214578bV(true, null, null, false)), new OSZ("trigger_method", new C214578bV(true, null, null, false)), new OSZ("user_id", new C214578bV(true, null, null, false)));
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
