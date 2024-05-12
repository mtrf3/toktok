package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC218718iB;
import X.EnumC86690Y0o;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.Y4L;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ClickSeeOriginalEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ClickSeeOriginalEvent() {
        super("click_see_original");
        C65352Pkq.LIZ(EnumC86690Y0o.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC218718iB.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
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
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Y4L.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        this.LJII = C113554cx.LJJL(new OSZ("captions_show_type", new C214578bV(false, null, null, false)), new OSZ("current_lang", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("extra_display_cnt", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(true, null, null, false)), new OSZ("has_dubbing", new C214578bV(false, null, null, false)), new OSZ("has_subtitle", new C214578bV(false, null, null, false)), new OSZ("has_text_sticker", new C214578bV(false, null, null, false)), new OSZ("has_title", new C214578bV(false, null, null, false)), new OSZ("have_transl", new C214578bV(false, null, null, false)), new OSZ("is_author", new C214578bV(false, null, null, false)), new OSZ("is_burned_in", new C214578bV(false, null, null, false)), new OSZ("is_dubbing_on", new C214578bV(false, null, null, false)), new OSZ("is_from_push", new C214578bV(false, null, null, false)), new OSZ("is_from_subtitle", new C214578bV(false, null, null, false)), new OSZ("is_landscape_screen", new C214578bV(false, null, null, false)), new OSZ("is_text_sticker_translatable", new C214578bV(false, null, null, false)), new OSZ("is_text_sticker_translated", new C214578bV(false, null, null, false)), new OSZ("is_title_translatable", new C214578bV(false, null, null, false)), new OSZ("is_title_translated", new C214578bV(false, null, null, false)), new OSZ("item_duration", new C214578bV(false, null, null, false)), new OSZ("landscape_from_group_id", new C214578bV(false, null, null, false)), new OSZ("opaque_text_sticker_cnt", new C214578bV(false, null, null, false)), new OSZ("question_id", new C214578bV(false, null, null, false)), new OSZ("search_id", new C214578bV(false, null, null, false)), new OSZ("search_keyword", new C214578bV(false, null, null, false)), new OSZ("search_type", new C214578bV(false, null, null, false)), new OSZ("subtitle_current_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_source_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_target_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_type", new C214578bV(false, null, null, false)), new OSZ("target_lang", new C214578bV(true, null, null, false)), new OSZ("text_sticker_cnt", new C214578bV(false, null, null, false)), new OSZ("text_sticker_lang", new C214578bV(false, null, null, false)), new OSZ("text_sticker_source_lang", new C214578bV(false, null, null, false)), new OSZ("title_lang", new C214578bV(false, null, null, false)), new OSZ("title_source_lang", new C214578bV(false, null, null, false)), new OSZ("transparent_text_sticker_cnt", new C214578bV(false, null, null, false)), new OSZ("use_transl", new C214578bV(false, null, null, false)));
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
