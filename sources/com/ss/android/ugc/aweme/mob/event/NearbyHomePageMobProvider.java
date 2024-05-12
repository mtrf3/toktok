package com.ss.android.ugc.aweme.mob.event;

import X.C55247LmF;
import X.C60212Xx;
import X.C80703Es;
import X.InterfaceC55235Lm3;
import X.InterfaceC55251LmJ;
import java.util.Map;

/* loaded from: classes2.dex */
public final class NearbyHomePageMobProvider implements IHomePageMobProvider<C60212Xx> {
    public final InterfaceC55235Lm3 LJLIL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C60212Xx getParam() {
        C80703Es c80703Es;
        String str;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(this.LJLIL, C80703Es.class, "source_default_key");
        Map<String, String> map = null;
        if (LIZLLL != null) {
            c80703Es = (C80703Es) LIZLLL.getSource();
        } else {
            c80703Es = null;
        }
        C60212Xx c60212Xx = new C60212Xx(null);
        if (c80703Es != null) {
            str = c80703Es.LJLIL;
        } else {
            str = null;
        }
        c60212Xx.LJLIL = str;
        if (c80703Es != null) {
            map = c80703Es.LJLILLLLZI;
        }
        c60212Xx.LJLILLLLZI = map;
        return c60212Xx;
    }

    public NearbyHomePageMobProvider(InterfaceC55235Lm3 interfaceC55235Lm3) {
        this.LJLIL = interfaceC55235Lm3;
    }
}
