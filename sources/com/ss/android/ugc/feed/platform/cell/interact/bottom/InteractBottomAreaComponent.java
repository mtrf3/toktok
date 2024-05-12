package com.ss.android.ugc.feed.platform.cell.interact.bottom;

import X.C212428Vi;
import X.C2K0;
import X.C39557Ffl;
import X.C3C8;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C76800UCe;
import X.C8LU;
import X.C8LZ;
import X.C8MQ;
import X.C8SG;
import X.C8W0;
import X.EnumC207218Bh;
import X.EnumC210578Of;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractBottomAreaComponent extends BaseContainer implements InteractBottomAreaAttachAbility, AreaContainerProtocol, InterfaceC55102Lju {
    public final C8LU LLFFF;
    public final EnumC210578Of LLFII;

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1669038589) {
            return null;
        }
        return this;
    }

    public InteractBottomAreaComponent() {
        new LinkedHashMap();
        this.LLFFF = new C8LU(true, true);
        this.LLFII = EnumC210578Of.INTERACT_BOTTOM_AREA_COMPONENT;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void E1() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).E1();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LLIILZL();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLFII;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        super.onCreateView();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIII(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIJIIJIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ReusedUIAssem reusedUIAssem;
        ReusedUIAssem reusedUIAssem2;
        InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZIZ;
        ReusedUIAssem reusedUIAssem3;
        o.LJIIIZ(view, "view");
        C8LU operator = this.LLFFF;
        o.LJIIIZ(operator, "operator");
        if (o.LJ("cell_photos", a1().LIZ()) && (LIZIZ = C8SG.LIZIZ.LIZIZ(EnumC207218Bh.TYPE_BOTTOM_AREA)) != null && (reusedUIAssem3 = (ReusedUIAssem) C39557Ffl.LIZ(LIZIZ).newInstance()) != null) {
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem3);
            ((ArrayList) C8LZ.LIZIZ).add(reusedUIAssem3);
        }
        BaseCellPlaceHolderComponent baseCellPlaceHolderComponent = new BaseCellPlaceHolderComponent("ad_bottom_area_layout");
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent);
        ArrayList arrayList = (ArrayList) C8LZ.LIZIZ;
        arrayList.add(baseCellPlaceHolderComponent);
        if (1 == a1().LIZ) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJIIJ = c55723Ltv.LJIJ().LJIIJ();
            if (LJIIJ != null && (reusedUIAssem2 = (ReusedUIAssem) C39557Ffl.LIZ(LJIIJ).newInstance()) != null) {
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem2);
                arrayList.add(reusedUIAssem2);
            }
            InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJIILL = c55723Ltv.LJIJ().LJIILL();
            if (LJIILL != null && (reusedUIAssem = (ReusedUIAssem) C39557Ffl.LIZ(LJIILL).newInstance()) != null) {
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem);
                arrayList.add(reusedUIAssem);
            }
        }
        InteractBottomBannerComponent interactBottomBannerComponent = new InteractBottomBannerComponent();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(interactBottomBannerComponent);
        arrayList.add(interactBottomBannerComponent);
        DownloadPlaceHolderComponent downloadPlaceHolderComponent = new DownloadPlaceHolderComponent();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(downloadPlaceHolderComponent);
        arrayList.add(downloadPlaceHolderComponent);
        if (getContainerView() instanceof ViewGroup) {
            C8LZ.LIZ(this, this.LLFFF, (ViewGroup) getContainerView());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).B2(i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        this.LLFFF.LIZLLL(getContainerView(), ins);
        win.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).v0(i, aweme);
            }
        }
    }
}
