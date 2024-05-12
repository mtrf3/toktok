package com.ss.android.ugc.feed.platform.cell.interact.info;

import X.C135355Sx;
import X.C212428Vi;
import X.C214128am;
import X.C226128u8;
import X.C2301991r;
import X.C2304092m;
import X.C2K0;
import X.C2S6;
import X.C39557Ffl;
import X.C3C8;
import X.C47261Igj;
import X.C51029K0z;
import X.C52552Kjs;
import X.C55096Ljo;
import X.C58096Mr6;
import X.C65776Prg;
import X.C76800UCe;
import X.C7HV;
import X.C88545Yp3;
import X.C8K0;
import X.C8LU;
import X.C8LX;
import X.C8LZ;
import X.C8MQ;
import X.C8MS;
import X.C8W0;
import X.EnumC210578Of;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.Y01;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.ad.feed.tag.IAdTagService;
import com.ss.android.ugc.aweme.api.component.AdComponentServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.AdAssemServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.AdTagServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.addiction.AntiAddictionVideoAssemTrigger;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagTrigger;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.assem.statecontrol.StateControlMediaTrigger;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.NewReportWarnBottomBarAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractInfoAreaComponent extends BaseContainer implements InteractInfoAreaAttachAbility, AreaContainerProtocol, InterfaceC55102Lju {
    public final C8LU LLFFF;
    public final EnumC210578Of LLFII;

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 2012153696) {
            return null;
        }
        return this;
    }

    public InteractInfoAreaComponent() {
        new LinkedHashMap();
        this.LLFFF = new C8LU(true, true);
        this.LLFII = EnumC210578Of.INTEARCT_INFO_AREA_COMPONENT;
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final Rect K1() {
        return C135355Sx.LIZ(getContainerView());
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final Rect dJ() {
        return C135355Sx.LIZIZ(getContainerView().findViewById(R.id.c7b));
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
        boolean z;
        IAdTagService iAdTagService;
        boolean z2;
        VideoItemParams videoItemParams;
        InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIIIZZ;
        ReusedUIAssem reusedUIAssem;
        Aweme aweme;
        IAdComponentService LIZLLL;
        C65776Prg LIZJ;
        ReusedUIAssem reusedUIAssem2;
        C65776Prg LIZ;
        ReusedUIAssem reusedUIAssem3;
        ReusedUIAssem reusedUIAssem4;
        VideoItemParams videoItemParams2;
        Aweme aweme2;
        o.LJIIIZ(view, "view");
        C8LU operator = this.LLFFF;
        o.LJIIIZ(operator, "operator");
        Context context = getContext();
        if (context != null) {
            z = C2S6.LIZ(context).isFromEffectDiscover();
        } else {
            z = false;
        }
        if (C214128am.LIZ()) {
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent = new BaseCellPlaceHolderComponent("ad_red_packet_layout");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent);
            ArrayList arrayList = (ArrayList) C8LZ.LIZIZ;
            arrayList.add(baseCellPlaceHolderComponent);
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent2 = new BaseCellPlaceHolderComponent("vs_vast_ad_tag_layout");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent2);
            arrayList.add(baseCellPlaceHolderComponent2);
        }
        if (C8MS.LIZ() && C7HV.LIZIZ.LJIJ().LJ() != null) {
            UpvoteVideoTrigger upvoteVideoTrigger = new UpvoteVideoTrigger();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(upvoteVideoTrigger);
            ((ArrayList) C8LZ.LIZIZ).add(upvoteVideoTrigger);
        }
        if (C2301991r.LIZ() && a1().LIZ != 4) {
            VideoTagContainer videoTagContainer = new VideoTagContainer();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoTagContainer);
            ((ArrayList) C8LZ.LIZIZ).add(videoTagContainer);
        }
        if (C226128u8.LIZ()) {
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent3 = new BaseCellPlaceHolderComponent("micro_tag");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent3);
            ArrayList arrayList2 = (ArrayList) C8LZ.LIZIZ;
            arrayList2.add(baseCellPlaceHolderComponent3);
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent4 = new BaseCellPlaceHolderComponent("link_tag");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent4);
            arrayList2.add(baseCellPlaceHolderComponent4);
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent5 = new BaseCellPlaceHolderComponent("ad4ad_label");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent5);
            arrayList2.add(baseCellPlaceHolderComponent5);
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent6 = new BaseCellPlaceHolderComponent("ad_desc_label_above_nickname");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent6);
            arrayList2.add(baseCellPlaceHolderComponent6);
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent7 = new BaseCellPlaceHolderComponent("dou_plus_link_tag");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent7);
            arrayList2.add(baseCellPlaceHolderComponent7);
        }
        Object LIZ2 = C58096Mr6.LIZ(IAdTagService.class, false);
        if (LIZ2 != null) {
            iAdTagService = (IAdTagService) LIZ2;
        } else {
            if (C58096Mr6.LLLLJ == null) {
                synchronized (IAdTagService.class) {
                    if (C58096Mr6.LLLLJ == null) {
                        C58096Mr6.LLLLJ = new AdTagServiceImpl();
                    }
                }
            }
            iAdTagService = C58096Mr6.LLLLJ;
        }
        ReusedUIAssem reusedUIAssem5 = (ReusedUIAssem) C39557Ffl.LIZ(iAdTagService.LIZ()).newInstance();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem5);
        ArrayList arrayList3 = (ArrayList) C8LZ.LIZIZ;
        arrayList3.add(reusedUIAssem5);
        if (C2304092m.LIZ() && a1().LIZ == 1) {
            z2 = true;
        } else {
            z2 = false;
            VideoFeedMultiTagTrigger videoFeedMultiTagTrigger = new VideoFeedMultiTagTrigger();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoFeedMultiTagTrigger);
            arrayList3.add(videoFeedMultiTagTrigger);
        }
        AntiAddictionVideoAssemTrigger antiAddictionVideoAssemTrigger = new AntiAddictionVideoAssemTrigger();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(antiAddictionVideoAssemTrigger);
        arrayList3.add(antiAddictionVideoAssemTrigger);
        if (a1().LIZ != 4 && !z) {
            VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = new VideoAuthorInfoRelationAssem();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoAuthorInfoRelationAssem);
            arrayList3.add(videoAuthorInfoRelationAssem);
        }
        StateControlMediaTrigger stateControlMediaTrigger = new StateControlMediaTrigger();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(stateControlMediaTrigger);
        arrayList3.add(stateControlMediaTrigger);
        if (a1().LIZ != 4 && !z) {
            VideoDescAssem videoDescAssem = new VideoDescAssem();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoDescAssem);
            arrayList3.add(videoDescAssem);
        }
        if (a1().LIZ != 4 && !z2 && !z && (((videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this)) == null || (aweme = videoItemParams.getAweme()) == null || !C47261Igj.LJJIIZI(aweme)) && (LJIIIIZZ = Y01.LIZIZ.LJIIIIZZ()) != null && (reusedUIAssem = (ReusedUIAssem) C39557Ffl.LIZ(LJIIIIZZ).newInstance()) != null)) {
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem);
            arrayList3.add(reusedUIAssem);
        }
        BaseCellPlaceHolderComponent baseCellPlaceHolderComponent8 = new BaseCellPlaceHolderComponent("ad_desc_label_layout");
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent8);
        arrayList3.add(baseCellPlaceHolderComponent8);
        Context context2 = getContext();
        if (context2 != null && a1().LIZ != 4 && !z && !C2S6.LIZ(context2).isHideMusicText() && ((videoItemParams2 = (VideoItemParams) C51029K0z.LJIILLIIL(this)) == null || (aweme2 = videoItemParams2.getAweme()) == null || !aweme2.isPaidContent)) {
            if (((Number) C8LX.LIZ.getValue()).intValue() == 1) {
                VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem = new VideoMusicTitleRefactorAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoMusicTitleRefactorAssem);
                arrayList3.add(videoMusicTitleRefactorAssem);
            } else {
                VideoMusicTitleAssem videoMusicTitleAssem = new VideoMusicTitleAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoMusicTitleAssem);
                arrayList3.add(videoMusicTitleAssem);
            }
        }
        InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> castingAssemClass = C88545Yp3.LIZIZ.LIZ().getCastingAssemClass();
        if (castingAssemClass != null && (reusedUIAssem4 = (ReusedUIAssem) C39557Ffl.LIZ(castingAssemClass).newInstance()) != null) {
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem4);
            arrayList3.add(reusedUIAssem4);
        }
        if (C52552Kjs.LIZ()) {
            SentinelSpaceTrigger sentinelSpaceTrigger = new SentinelSpaceTrigger();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(sentinelSpaceTrigger);
            arrayList3.add(sentinelSpaceTrigger);
        }
        BaseCellPlaceHolderComponent baseCellPlaceHolderComponent9 = new BaseCellPlaceHolderComponent("ad_product_tile_view_stub");
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent9);
        arrayList3.add(baseCellPlaceHolderComponent9);
        IAdAssemService LIZLLL2 = AdAssemServiceImpl.LIZLLL();
        if (LIZLLL2 != null && (LIZ = LIZLLL2.LIZ()) != null && (reusedUIAssem3 = (ReusedUIAssem) C39557Ffl.LIZ(LIZ).newInstance()) != null) {
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem3);
            arrayList3.add(reusedUIAssem3);
        }
        NewReportWarnBottomBarAssem newReportWarnBottomBarAssem = new NewReportWarnBottomBarAssem();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(newReportWarnBottomBarAssem);
        arrayList3.add(newReportWarnBottomBarAssem);
        if (a1().LIZ != 4) {
            FeedBottomButtonContainer feedBottomButtonContainer = new FeedBottomButtonContainer();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(feedBottomButtonContainer);
            arrayList3.add(feedBottomButtonContainer);
        }
        BaseCellPlaceHolderComponent baseCellPlaceHolderComponent10 = new BaseCellPlaceHolderComponent("native_ad_bottom_label_view");
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent10);
        arrayList3.add(baseCellPlaceHolderComponent10);
        BaseCellPlaceHolderComponent baseCellPlaceHolderComponent11 = new BaseCellPlaceHolderComponent("intro_ll_padding");
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent11);
        arrayList3.add(baseCellPlaceHolderComponent11);
        BaseCellPlaceHolderComponent baseCellPlaceHolderComponent12 = new BaseCellPlaceHolderComponent("ad4ad_button");
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent12);
        arrayList3.add(baseCellPlaceHolderComponent12);
        if (o.LJ(a1().LIZ(), "cell_commerce") && (LIZLLL = AdComponentServiceImpl.LIZLLL()) != null && (LIZJ = LIZLLL.LIZJ()) != null && (reusedUIAssem2 = (ReusedUIAssem) C39557Ffl.LIZ(LIZJ).newInstance()) != null) {
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reusedUIAssem2);
            arrayList3.add(reusedUIAssem2);
        }
        view.findViewById(R.id.c7b);
        C8LU indexOperator = this.LLFFF;
        o.LJIIIZ(indexOperator, "indexOperator");
        C8K0.LIZIZ(this);
        if (getContainerView() instanceof ViewGroup) {
            C8LZ.LIZ(this, this.LLFFF, (ViewGroup) getContainerView());
        }
        C8K0.LIZ(this);
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
