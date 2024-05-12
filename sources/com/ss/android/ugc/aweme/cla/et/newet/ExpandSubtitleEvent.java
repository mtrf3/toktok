package com.ss.android.ugc.aweme.cla.et.newet;

import X.ACH;
import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.EnumC86692Y0q;
import X.EnumC86778Y3y;
import X.IM4;
import X.InterfaceC54035LIp;
import X.OSZ;
import X.Y4O;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ExpandSubtitleEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ExpandSubtitleEvent() {
        super("expand_subtitle");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC86692Y0q.class);
        C65352Pkq.LIZ(ACH.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(EnumC86778Y3y.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(Double.TYPE);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(Y4O.class);
        C65352Pkq.LIZ(IM4.class);
        C65352Pkq.LIZ(String.class);
        this.LJII = C113554cx.LJJL(new OSZ("author_id", new C214578bV(true, null, null, false)), new OSZ("captions_show_type", new C214578bV(false, null, null, false)), new OSZ("captions_unavailable_reason", new C214578bV(false, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("group_id", new C214578bV(true, null, null, false)), new OSZ("has_subtitle", new C214578bV(false, null, null, false)), new OSZ("have_transl", new C214578bV(false, null, null, false)), new OSZ("is_captions_intro_show", new C214578bV(false, null, null, false)), new OSZ("is_landscape_screen", new C214578bV(false, null, null, false)), new OSZ("item_duration", new C214578bV(false, null, null, false)), new OSZ("launch_volume_pct", new C214578bV(false, null, null, false)), new OSZ("search_id", new C214578bV(false, null, null, false)), new OSZ("search_keyword", new C214578bV(false, null, null, false)), new OSZ("search_type", new C214578bV(false, null, null, false)), new OSZ("subtitle_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_source_lang", new C214578bV(false, null, null, false)), new OSZ("subtitle_type", new C214578bV(false, null, null, false)), new OSZ("use_transl", new C214578bV(false, null, null, false)), new OSZ("user_id", new C214578bV(false, null, null, false)));
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
