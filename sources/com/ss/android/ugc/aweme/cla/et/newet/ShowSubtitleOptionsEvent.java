package com.ss.android.ugc.aweme.cla.et.newet;

import X.ACG;
import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC25843ACh;
import X.EnumC31581CaP;
import X.EnumC86696Y0u;
import X.IM6;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.Y40;
import X.Y4R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ShowSubtitleOptionsEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ShowSubtitleOptionsEvent() {
        super("show_subtitle_options");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC31581CaP.class);
        C65352Pkq.LIZ(EnumC86696Y0u.class);
        C65352Pkq.LIZ(ACG.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Y40.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Y4R.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC25843ACh.class);
        C65352Pkq.LIZ(IM6.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("author_id", new C214578bV(false, null, null, false)), new OSZ("author_options", new C214578bV(false, null, null, false)), new OSZ("captions_show_type", new C214578bV(false, null, null, false)), new OSZ("captions_unavailable_reason", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(false, null, null, false)), new OSZ("has_subtitle", new C214578bV(false, null, null, false)), new OSZ("is_landscape_screen", new C214578bV(false, null, null, false)), new OSZ("is_to_turn_on", new C214578bV(false, null, null, false)), new OSZ("item_duration", new C214578bV(false, null, null, false)), new OSZ("landscape_from_group_id", new C214578bV(false, null, null, false)), new OSZ("search_id", new C214578bV(false, null, null, false)), new OSZ("search_keyword", new C214578bV(false, null, null, false)), new OSZ("search_type", new C214578bV(false, null, null, false)), new OSZ("subtitle_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_source_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_type", new C214578bV(false, null, null, false)), new OSZ("target_lang", new C214578bV(false, null, null, false)), new OSZ("translation_options", new C214578bV(false, null, null, false)), new OSZ("use_transl", new C214578bV(false, null, null, false)), new OSZ("user_id", new C214578bV(false, null, null, false)));
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
