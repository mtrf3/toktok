package com.ss.android.ugc.aweme.detail.ui.search;

import X.AbstractC51036K1g;
import X.C221108m2;
import X.C55453LpZ;
import X.C55457Lpd;
import X.C62822Ol8;
import X.InterfaceC51679KPz;
import X.KQ7;
import X.M89;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class MultiTypeDetailComponent extends DetailPageComponent {
    public final C62822Ol8 LLIILII;

    public MultiTypeDetailComponent() {
        new LinkedHashMap();
        this.LLIILII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 50));
    }

    public final MultiTypeDetailPageFragment P3() {
        return (MultiTypeDetailPageFragment) this.LLIILII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final InterfaceC51679KPz A3(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        AbstractC51036K1g abstractC51036K1g2 = C55457Lpd.LJLL;
        if (abstractC51036K1g2 != null) {
            C55457Lpd.LJLL = null;
            M89 m89 = this.LJZ;
            JediViewModel jediViewModel = C55457Lpd.LJLJL;
            C55457Lpd.LJLJL = null;
            InterfaceC51679KPz LIZ = C55453LpZ.LIZ(jediViewModel, abstractC51036K1g2, m89);
            if (LIZ != null && P3().Yl()) {
                InterfaceC51679KPz A3 = super.A3(abstractC51036K1g);
                MixFlowParam Vl = P3().Vl();
                P3().getClass();
                MixFlowParam mixFlowParam = new MixFlowParam("general_search", "from_search_mix");
                int Wl = P3().Wl();
                P3().Tl(A3);
                return new KQ7(Vl, mixFlowParam, Wl, A3, LIZ, null);
            }
        }
        return super.A3(abstractC51036K1g);
    }
}
