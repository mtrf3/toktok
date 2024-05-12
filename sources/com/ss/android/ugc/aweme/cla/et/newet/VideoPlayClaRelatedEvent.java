package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC86684Y0i;
import X.EnumC86685Y0j;
import X.EnumC86686Y0k;
import X.EnumC86697Y0v;
import X.IM8;
import X.IM9;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.Y4S;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VideoPlayClaRelatedEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public VideoPlayClaRelatedEvent() {
        super("video_play_cla_related");
        C65352Pkq.LIZ(EnumC86697Y0v.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(IM8.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(IM9.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(Double.TYPE);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Y4S.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC86684Y0i.class);
        C65352Pkq.LIZ(EnumC86685Y0j.class);
        C65352Pkq.LIZ(EnumC86686Y0k.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        this.LJII = C113554cx.LJJL(new OSZ("captions_show_type", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(false, null, null, false)), new OSZ("has_subtitle", new C214578bV(false, null, null, false)), new OSZ("has_text_sticker", new C214578bV(false, null, null, false)), new OSZ("has_title", new C214578bV(false, null, null, false)), new OSZ("have_transl", new C214578bV(false, null, null, false)), new OSZ("is_author", new C214578bV(false, null, null, false)), new OSZ("is_burned_in", new C214578bV(false, null, null, false)), new OSZ("is_captions_intro_show", new C214578bV(false, null, null, false)), new OSZ("is_from_push", new C214578bV(false, null, null, false)), new OSZ("is_fullscreen", new C214578bV(false, null, null, false)), new OSZ("is_text_sticker_translatable", new C214578bV(false, null, null, false)), new OSZ("is_text_sticker_translated", new C214578bV(false, null, null, false)), new OSZ("is_title_translatable", new C214578bV(false, null, null, false)), new OSZ("is_title_translated", new C214578bV(false, null, null, false)), new OSZ("is_video_translatable", new C214578bV(false, null, null, false)), new OSZ("item_duration", new C214578bV(false, null, null, false)), new OSZ("launch_volume_pct", new C214578bV(false, null, null, false)), new OSZ("opaque_text_sticker_cnt", new C214578bV(false, null, null, false)), new OSZ("push_label", new C214578bV(false, null, null, false)), new OSZ("rank", new C214578bV(false, null, null, false)), new OSZ("search_id", new C214578bV(false, null, null, false)), new OSZ("search_keyword", new C214578bV(false, null, null, false)), new OSZ("search_type", new C214578bV(false, null, null, false)), new OSZ("subtitle_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_source_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_type", new C214578bV(false, null, null, false)), new OSZ("target_lang", new C214578bV(false, null, null, false)), new OSZ("text_sticker_cnt", new C214578bV(false, null, null, false)), new OSZ("text_sticker_lang", new C214578bV(false, null, null, false)), new OSZ("text_sticker_source_lang", new C214578bV(false, null, null, false)), new OSZ("title_source_lang", new C214578bV(false, null, null, false)), new OSZ("translate_sticker_status", new C214578bV(false, null, null, false)), new OSZ("translate_title_status", new C214578bV(false, null, null, false)), new OSZ("translation_status", new C214578bV(false, null, null, false)), new OSZ("transparent_text_sticker_cnt", new C214578bV(false, null, null, false)), new OSZ("use_transl", new C214578bV(false, null, null, false)));
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
