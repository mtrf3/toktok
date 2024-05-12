package com.ss.android.ugc.aweme.freeflowcard.data.database;

import X.AbstractC23740wU;
import X.AbstractC88153Yij;
import X.AbstractC88154Yik;
import X.AbstractC88155Yil;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87532YWy;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class FreeFlowDatabase_Impl extends FreeFlowDatabase {
    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "tb_auto_play_setting", "tb_user_click_event", "tb_app_start_mode");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC88154Yik.class, Collections.emptyList());
        hashMap.put(AbstractC88155Yil.class, Collections.emptyList());
        hashMap.put(AbstractC88153Yij.class, Collections.emptyList());
        return hashMap;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87532YWy(this), "1967f4d2e5a4f7e5e76e753b06cafe2b", "b3be3e5c94533db90027e813123cd689");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
