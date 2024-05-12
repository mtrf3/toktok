package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C191867fy;
import X.C1DH;
import X.C214348b8;
import X.C221108m2;
import X.C2TZ;
import X.C3C8;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8P3;
import X.C8PT;
import X.C8R7;
import X.C8R8;
import X.C8RA;
import X.C8RB;
import X.C8RC;
import X.C8T7;
import X.C8YN;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.QD3;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class PoiWriteReviewBottomBarAssemTrigger extends BaseCellTriggerComponent<PoiWriteReviewBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public VideoItemParams LLFFF;
    public PoiAnchorData LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public VideoItemParams LLIFFJFJJ;
    public final C5H3 LLII;
    public final InterfaceC115514g7 LLIIII;
    public final InterfaceC115514g7 LLIIIILZ;
    public final AqS153S0100000_3 LLIIIJ;

    static {
        TBT tbt = new TBT(PoiWriteReviewBottomBarAssemTrigger.class, "reviewVm", "getReviewVm()Lcom/ss/android/ugc/feed/platform/cell/interact/bottom/bar/PoiWriteReviewViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(PoiWriteReviewBottomBarAssemTrigger.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/feed/assem/multitag/VideoFeedMultiTagVM;", 0, c65351Pkp)};
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(PoiWriteReviewBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_poi_write_review";
    }

    public PoiWriteReviewBottomBarAssemTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1274));
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1272));
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8RB.INSTANCE);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiWriteReviewViewModel.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1275), null, C8RA.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoFeedMultiTagVM.class);
        this.LLIIIILZ = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 1276), null, C8PT.INSTANCE, null, null);
        this.LLIIIJ = new AqS153S0100000_3(this, 1277);
    }

    public final BottomBarPriorityAbility l4() {
        return (BottomBarPriorityAbility) this.LLF.getValue();
    }

    public final PoiWriteReviewViewModel m4() {
        return (PoiWriteReviewViewModel) this.LLIIII.LIZ(this, LLIIIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
        getContainerView().setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        String poiId;
        o.LJIIIZ(item, "item");
        super.F0(item);
        this.LLFFF = item;
        getContainerView().setVisibility(8);
        this.LLFZ = false;
        if (k4(item)) {
            PoiAnchorData poiAnchorData = this.LLFII;
            if (poiAnchorData != null && (poiId = poiAnchorData.getPoiId()) != null) {
                BottomBarPriorityAbility l4 = l4();
                if (l4 != null) {
                    l4.Es(this, Boolean.TRUE, new AqS134S0200000_3(this, item, 173));
                }
                PoiServiceImpl.LIZIZ().LJJJZ(poiId, new C8R8(this, poiId), new AqS153S0100000_3(this, 1273));
                return;
            }
            return;
        }
        getContainerView().setVisibility(8);
        BottomBarPriorityAbility l42 = l4();
        if (l42 == null) {
            return;
        }
        l42.en(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        this.LLIFFJFJJ = item;
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        boolean LIZJ = C8RC.LIZJ(aweme, item.mEventType);
        if (LIZJ) {
            C191867fy c191867fy = PoiAnchorData.Companion;
            Aweme aweme2 = item.getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            c191867fy.getClass();
            this.LLFII = C191867fy.LIZ(aweme2);
        }
        return LIZJ;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPoiReTagAwemeChangeEvent(C8P3 c8p3) {
        Aweme aweme;
        VideoItemParams videoItemParams;
        if (c8p3 == null || (aweme = c8p3.LJLIL) == null || (videoItemParams = this.LLFFF) == null || !o.LJ(videoItemParams.getAweme().getAid(), aweme.getAid())) {
            return;
        }
        C1DH.LJIILIIL().postDelayed(new ARunnableS39S0100000_3(this, 119), 1000L);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPoiWriteReviewSuccess(C2TZ event) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        PoiAnchorData poiAnchorData = this.LLFII;
        if (poiAnchorData != null) {
            str = poiAnchorData.getPoiId();
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            getContainerView().setVisibility(8);
            BottomBarPriorityAbility l4 = l4();
            if (l4 != null) {
                l4.en(this);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFZ = false;
        this.LLI = false;
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.8R9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C8R7.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        return o.LJ(baseFeedPageParams.eventType, "personal_homepage");
    }
}
