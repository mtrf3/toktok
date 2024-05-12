package com.ss.android.ugc.aweme.dsp.playpage.viewpager;

import X.AbstractC91394Ztu;
import X.AbstractC91590Zx4;
import X.C221108m2;
import X.C2K0;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C61878OQg;
import X.C62822Ol8;
import X.C91264Zro;
import X.C91395Ztv;
import X.C91454Zus;
import X.C91455Zut;
import X.C91456Zuu;
import X.C91503Zvf;
import X.C91616ZxU;
import X.C91617ZxV;
import X.C91618ZxW;
import X.InterfaceC55102Lju;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IViewPagerAbility;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class DspViewPagerAssem extends UIContentAssem implements IViewPagerAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL;
    public C91503Zvf LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -928968259) {
            return null;
        }
        return this;
    }

    public DspViewPagerAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C91456Zuu.class, "ViewPagerHierarchyData"), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 49));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IViewPagerAbility
    public final List<C91395Ztv> getData() {
        AbstractC91394Ztu abstractC91394Ztu;
        List<C91395Ztv> LJJIIJ;
        C91503Zvf c91503Zvf = this.LJLILLLLZI;
        if (c91503Zvf != null) {
            PagerAdapter adapter = c91503Zvf.getAdapter();
            if (!(adapter instanceof AbstractC91394Ztu) || (abstractC91394Ztu = (AbstractC91394Ztu) adapter) == null || (LJJIIJ = abstractC91394Ztu.LJJIIJ()) == null) {
                return C61878OQg.INSTANCE;
            }
            return LJJIIJ;
        }
        o.LJIJI("mdViewPager");
        throw null;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C91503Zvf c91503Zvf;
        AbstractC91590Zx4 HS;
        o.LJIIIZ(view, "view");
        if (!(view instanceof C91503Zvf) || (c91503Zvf = (C91503Zvf) view) == null) {
            return;
        }
        this.LJLILLLLZI = c91503Zvf;
        c91503Zvf.setBackground(null);
        C91503Zvf c91503Zvf2 = this.LJLILLLLZI;
        if (c91503Zvf2 != null) {
            c91503Zvf2.setAdapter(((C91456Zuu) this.LJLIL.getValue()).LJLIL);
            C91454Zus c91454Zus = new C91454Zus(new C91616ZxU(this), new C91617ZxV(this));
            C91503Zvf c91503Zvf3 = this.LJLILLLLZI;
            if (c91503Zvf3 != null) {
                c91503Zvf3.LJI(c91454Zus);
                IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
                if (LIZJ == null || (HS = LIZJ.HS()) == null) {
                    return;
                }
                C91455Zut c91455Zut = new C91455Zut(HS, new C91618ZxW(this));
                C91503Zvf c91503Zvf4 = this.LJLILLLLZI;
                if (c91503Zvf4 != null) {
                    c91503Zvf4.setFilterScrollInterceptor(c91455Zut);
                    C91503Zvf c91503Zvf5 = this.LJLILLLLZI;
                    if (c91503Zvf5 != null) {
                        c91503Zvf5.LL = false;
                        c91503Zvf5.LJJIIJ(1, false, false, 0);
                        ((C91456Zuu) this.LJLIL.getValue()).LJLIL.LJJIIJZLJL(this);
                        return;
                    }
                    o.LJIJI("mdViewPager");
                    throw null;
                }
                o.LJIJI("mdViewPager");
                throw null;
            }
            o.LJIJI("mdViewPager");
            throw null;
        }
        o.LJIJI("mdViewPager");
        throw null;
    }
}
