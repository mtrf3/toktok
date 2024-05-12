package com.ss.android.ugc.aweme.poi.detail.discovery;

import X.C0CM;
import X.C12460eI;
import X.C213688a4;
import X.C214298b3;
import X.C220188kY;
import X.C43001GuD;
import X.C58224MtA;
import X.C65352Pkq;
import X.C65776Prg;
import X.C74053T4n;
import X.C78926UyI;
import X.C79234V7u;
import X.C85049XZl;
import X.C85214XcQ;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.InterfaceC189047bQ;
import X.InterfaceC222798ol;
import X.InterfaceC84851XRv;
import X.InterfaceC85215XcR;
import X.K38;
import X.KOV;
import X.S72;
import X.SY4;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiDetailDiscoveryAssem extends PoiDetailBaseAssem {
    public String LJLLI;
    public final C214298b3 LJLLILLLL;
    public C74053T4n LJLLJ;
    public KOV LJLLL;
    public SY4 LJLLLL;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean L3() {
        return true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0j;
    }

    public PoiDetailDiscoveryAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailDiscoveryViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS165S0100000_15(LIZ, 517), C85214XcQ.INSTANCE, null);
    }

    public final PoiDetailDiscoveryViewModel N3() {
        return (PoiDetailDiscoveryViewModel) this.LJLLILLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        String str = this.LJLLI;
        if (str != null) {
            N3().gv0(str);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        InterfaceC85215XcR interfaceC85215XcR;
        super.onDestroy();
        C85049XZl.LIZIZ = -1;
        C85049XZl.LIZLLL = null;
        C85049XZl.LIZJ = null;
        WeakReference<InterfaceC84851XRv> weakReference = C85049XZl.LJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        C85049XZl.LJ = null;
        WeakReference<InterfaceC85215XcR> weakReference2 = C85049XZl.LJFF;
        if (weakReference2 != null && (interfaceC85215XcR = weakReference2.get()) != null) {
            interfaceC85215XcR.LLLLLLLLL();
        }
        WeakReference<InterfaceC85215XcR> weakReference3 = C85049XZl.LJFF;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        C85049XZl.LJFF = null;
        C85049XZl.LJI = 1;
        C58224MtA.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = x3().findViewById(R.id.hk2);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.pd_discovery_tab)");
        this.LJLLJ = (C74053T4n) findViewById;
        View findViewById2 = x3().findViewById(R.id.hk4);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…d.pd_discovery_viewPager)");
        this.LJLLL = (KOV) findViewById2;
        View findViewById3 = x3().findViewById(R.id.hk1);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.pd_discovery_more)");
        this.LJLLLL = (SY4) findViewById3;
        C74053T4n c74053T4n = this.LJLLJ;
        if (c74053T4n != null) {
            c74053T4n.LJLJLLL = false;
            c74053T4n.LJLIL.invalidate();
            String c1 = ((InterfaceC189047bQ) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189047bQ.class), null)).c1();
            this.LJLLI = c1;
            if (c1 != null) {
                N3().LJLIL = c1;
                N3().LJLJI = C79234V7u.LJIIIZ(x3());
                N3().gv0(c1);
            }
            x3().findViewById(R.id.hk1);
            KOV kov = this.LJLLL;
            if (kov != null) {
                InterfaceC222798ol viewItemOperator = kov.getViewItemOperator();
                C220188kY c220188kY = new C220188kY();
                c220188kY.LIZ = 1;
                c220188kY.LIZIZ = false;
                c220188kY.LIZLLL = false;
                c220188kY.LIZJ = "poi_detail_discovery_tab";
                viewItemOperator.LIZIZ(c220188kY);
                viewItemOperator.LJFF(PoiDetailDiscoveryCategoryPage.class);
                KOV kov2 = this.LJLLL;
                if (kov2 != null) {
                    if (kov2.getChildCount() > 0 && (kov2.getChildAt(0) instanceof C0CM)) {
                        View childAt = kov2.getChildAt(0);
                        o.LJII(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
                        C0CM c0cm = (C0CM) childAt;
                        C74053T4n c74053T4n2 = this.LJLLJ;
                        if (c74053T4n2 != null) {
                            c74053T4n2.LIZ(new S72(c0cm));
                            c0cm.LIZIZ(new K38(c74053T4n2));
                        } else {
                            o.LJIJI("tabBar");
                            throw null;
                        }
                    }
                    M3(false);
                    C8YN.LJII(this, N3(), new TBT() { // from class: X.XcP
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C84848XRs) obj).LJLIL;
                        }
                    }, C213688a4.LIZLLL(), new AqS197S0100000_15(this, 17), 4);
                    C12460eI.LJ(x3(), new AqS181S0100000_15(this, 84));
                    SY4 sy4 = this.LJLLLL;
                    if (sy4 != null) {
                        C12460eI.LJ(sy4, new AqS181S0100000_15(this, 85));
                        SY4 sy42 = this.LJLLLL;
                        if (sy42 != null) {
                            C43001GuD.LJIL(sy42, new AqS181S0100000_15(this, 83));
                            return;
                        } else {
                            o.LJIJI("goDiscoveryLandingPageBtn");
                            throw null;
                        }
                    }
                    o.LJIJI("goDiscoveryLandingPageBtn");
                    throw null;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("tabBar");
        throw null;
    }
}
