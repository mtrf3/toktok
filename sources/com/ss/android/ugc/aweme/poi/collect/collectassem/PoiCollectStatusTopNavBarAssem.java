package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C04330Ez;
import X.C189127bY;
import X.C2068389v;
import X.C221108m2;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8VC;
import X.InterfaceC189137bZ;
import X.O6R;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiCollectStatusTopNavBarAssem extends PoiCollectStatusBaseAssem {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0a;
    }

    public PoiCollectStatusTopNavBarAssem() {
        new LinkedHashMap();
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 694));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 695));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 696));
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View L3() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectContainer>(...)");
        return (View) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final TuxIconView N3() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectIcon>(...)");
        return (TuxIconView) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final String I3() {
        return M3().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void P3(boolean z) {
        C189127bY.LIZIZ((InterfaceC189137bZ) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), z, "click_banner");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void R3(boolean z) {
        if (z) {
            TuxIconView N3 = N3();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bookmark_fill;
            c2068389v.LIZLLL = Integer.valueOf(C04330Ez.LIZIZ(L3().getContext(), R.color.ck));
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
            N3.setTuxIcon(c2068389v);
            return;
        }
        TuxIconView N32 = N3();
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_bookmark;
        c2068389v2.LIZLLL = Integer.valueOf(C04330Ez.LIZIZ(L3().getContext(), R.color.ck));
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        N32.setTuxIcon(c2068389v2);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        view.findViewById(R.id.hvb).setVisibility(8);
    }
}
