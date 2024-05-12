package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC63695OzD;
import X.C214578bV;
import X.C51029K0z;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ClickSeeTranslationInBioEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public ClickSeeTranslationInBioEvent() {
        super("click_see_translation_in_bio");
        C65352Pkq.LIZ(String.class);
        this.LJII = C51029K0z.LJJIIZI(new OSZ("target_lang", new C214578bV(false, null, null, false)));
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
