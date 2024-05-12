package com.ss.android.ugc.aweme.cla.et.newet;

import X.ACI;
import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC86693Y0r;
import X.EnumC86779Y3z;
import X.IM5;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.Y4P;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class HideSubtitleEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public HideSubtitleEvent() {
        super("hide_subtitle");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC86693Y0r.class);
        C65352Pkq.LIZ(ACI.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC86779Y3z.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Double.TYPE);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Y4P.class);
        C65352Pkq.LIZ(IM5.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("author_id", new C214578bV(true, null, null, false)), new OSZ("captions_show_type", new C214578bV(false, null, null, false)), new OSZ("captions_unavailable_reason", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(true, null, null, false)), new OSZ("has_subtitle", new C214578bV(false, null, null, false)), new OSZ("have_transl", new C214578bV(false, null, null, false)), new OSZ("is_landscape_screen", new C214578bV(false, null, null, false)), new OSZ("item_duration", new C214578bV(false, null, null, false)), new OSZ("search_id", new C214578bV(false, null, null, false)), new OSZ("search_keyword", new C214578bV(false, null, null, false)), new OSZ("search_type", new C214578bV(false, null, null, false)), new OSZ("subtitle_index", new C214578bV(false, null, null, false)), new OSZ("subtitle_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_position", new C214578bV(false, null, null, false)), new OSZ("subtitle_source_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_type", new C214578bV(false, null, null, false)), new OSZ("use_transl", new C214578bV(false, null, null, false)), new OSZ("user_id", new C214578bV(false, null, null, false)));
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
