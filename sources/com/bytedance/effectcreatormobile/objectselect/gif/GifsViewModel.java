package com.bytedance.effectcreatormobile.objectselect.gif;

import X.AbstractC93428aQi;
import X.C76800UCe;
import X.C79853Bl;
import X.C79863Bm;
import X.C79883Bo;
import X.C94054aao;
import X.C94055aap;
import X.C94060aau;
import X.C94061aav;
import X.C94760amC;
import X.EnumC93413aQT;
import X.EnumC93416aQW;
import X.ORZ;
import X.V1M;
import X.V8H;
import X.XKX;
import X.XLL;
import X.XLM;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class GifsViewModel extends ViewModel {
    public int LJLIL;
    public final int LJLILLLLZI = 30;
    public final XLM LJLJI;
    public final C79863Bm LJLJJI;
    public final XLM LJLJJL;
    public final C79863Bm LJLJJLL;
    public final XLM LJLJL;
    public final C79863Bm LJLJLJ;
    public final XLL LJLJLLL;
    public final C79883Bo LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public final String LJLLJ;

    public final void gv0() {
        this.LJLIL = 0;
        this.LJLLILLLL = true;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94760amC(this, null), 3);
    }

    public GifsViewModel(String str) {
        this.LJLLJ = str;
        XLM LIZ = V8H.LIZ(C94061aav.LIZIZ);
        this.LJLJI = LIZ;
        this.LJLJJI = V1M.LIZLLL(LIZ);
        XLM LIZ2 = V8H.LIZ(EnumC93413aQT.NONE);
        this.LJLJJL = LIZ2;
        this.LJLJJLL = V1M.LIZLLL(LIZ2);
        XLM LIZ3 = V8H.LIZ(new C94055aap(false, ""));
        this.LJLJL = LIZ3;
        this.LJLJLJ = V1M.LIZLLL(LIZ3);
        XLL LIZ4 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJLLL = LIZ4;
        this.LJLL = new C79883Bo(LIZ4);
        this.LJLLI = "";
        this.LJLLILLLL = true;
        gv0();
    }

    public final C76800UCe hv0(int i, ProviderEffect providerEffect, EnumC93416aQW status) {
        Object LIZ = ((AbstractC93428aQi) this.LJLJI.getValue()).LIZ();
        o.LJI(LIZ);
        List LLJILJILJ = ORZ.LLJILJILJ((Collection) LIZ);
        C94054aao c94054aao = (C94054aao) ListProtector.get(LLJILJILJ, i);
        if (providerEffect == null) {
            providerEffect = c94054aao.LJLIL;
        }
        if (status == null) {
            status = EnumC93416aQW.Loading;
        }
        c94054aao.getClass();
        o.LJIIIZ(providerEffect, "providerEffect");
        o.LJIIIZ(status, "status");
        ListProtector.set(LLJILJILJ, i, new C94054aao(providerEffect, status));
        this.LJLJI.setValue(new C94060aau(LLJILJILJ));
        return C76800UCe.LIZ;
    }
}
