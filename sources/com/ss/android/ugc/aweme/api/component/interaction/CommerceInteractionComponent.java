package com.ss.android.ugc.aweme.api.component.interaction;

import X.AbstractC58948NBo;
import X.C214348b8;
import X.C221108m2;
import X.C222588oQ;
import X.C242549fW;
import X.C2K0;
import X.C46104I7o;
import X.C46106I7q;
import X.C51029K0z;
import X.C55096Ljo;
import X.C58191Msd;
import X.C58655N0h;
import X.C58704N2e;
import X.C58934NBa;
import X.C58936NBc;
import X.C58938NBe;
import X.C58940NBg;
import X.C58941NBh;
import X.C58947NBn;
import X.C58950NBq;
import X.C58951NBr;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73340SqO;
import X.C76512zP;
import X.C8SF;
import X.C8T5;
import X.C8YN;
import X.EnumC46105I7p;
import X.InterfaceC55102Lju;
import X.InterfaceC58942NBi;
import X.NBN;
import X.NBZ;
import X.NOE;
import X.O8Y;
import X.TBT;
import X.V9W;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceInteractionComponent extends BaseCellContentComponent implements CommerceInteractionAbility, NBN, InterfaceC55102Lju {
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public View LLF;
    public final C5H3 LLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1931704516) {
            return null;
        }
        return this;
    }

    public CommerceInteractionComponent() {
        new LinkedHashMap();
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 71));
        this.LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 70));
        this.LLD = C221108m2.LIZIZ(C58191Msd.LJLIL);
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C8SF.INSTANCE);
    }

    public final VideoEventDispatchViewModel b4() {
        return (VideoEventDispatchViewModel) this.LLFF.getValue();
    }

    public final InterfaceC58942NBi c4() {
        String str;
        IFeedService iFeedService = (IFeedService) this.LLD.getValue();
        Context context = getContext();
        C222588oQ c222588oQ = a1().LIZLLL;
        String str2 = null;
        if (c222588oQ != null) {
            str = c222588oQ.LJIIIZ;
        } else {
            str = null;
        }
        InterfaceC58942NBi LIZJ = iFeedService.LIZJ(context, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), str, true);
        if (LIZJ == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFeedItemModule commerceInteractionOperator init = ");
        LIZ.append(LIZJ.LJIIIZ());
        LIZ.append(" ,event_type =  ");
        C222588oQ c222588oQ2 = a1().LIZLLL;
        if (c222588oQ2 != null) {
            str2 = c222588oQ2.LJIIIZ;
        }
        LIZ.append(str2);
        LIZ.append(",item.aweme = ");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        LIZJ.LJIIJJI(this);
        return LIZJ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHolderUnbind awemeId = ");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
        LIZ.append(",des =");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getDesc());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC58942NBi c4 = c4();
        if (c4 != null) {
            c4.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHolderUnselected awemeId = ");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
        LIZ.append(",des =");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getDesc());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC58942NBi c4 = c4();
        if (c4 != null) {
            c4.LJJIIZ();
        }
        C8T5 LJIL = C46104I7o.LJIL(EnumC46105I7p.ANOLE_LEFT_INTERACT.getInteractName());
        if (LJIL != null) {
            C242549fW.LIZ(" resetLeftVisibility()");
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LL.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.D3(LJIL, true, null);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBind awemeId = ");
        LIZ.append(item.getAweme().getAid());
        LIZ.append(",des =");
        LIZ.append(item.getAweme().getDesc());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC58942NBi c4 = c4();
        if (c4 != null) {
            View view = this.LLF;
            if (view != null) {
                c4.LJFF(view);
            } else {
                o.LJIJI("itemMainView");
                throw null;
            }
        }
    }

    @Override // X.NBN
    public final void N(AbstractC58948NBo event) {
        C8T5 LJIL;
        InteractAreaCommonAbility interactAreaCommonAbility;
        o.LJIIIZ(event, "event");
        if (event instanceof C58947NBn) {
            C242549fW.LIZ("handleEvent ShowBusinessComponent");
            C58947NBn c58947NBn = (C58947NBn) event;
            C76512zP componentAppearModel = c58947NBn.LIZ;
            Set<String> slotIdList = c58947NBn.LIZIZ;
            o.LJIIIZ(componentAppearModel, "componentAppearModel");
            o.LJIIIZ(slotIdList, "slotIdList");
            if (((List) componentAppearModel.LJLILLLLZI).isEmpty() && ((List) componentAppearModel.LJLJI).isEmpty()) {
                C242549fW.LIZ("show business list and hide business list are all empty,return");
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("componentAppearModel.toShowModels = ");
            LIZ.append(componentAppearModel.LJLILLLLZI);
            LIZ.append(",componentAppearModel.toHideModels = ");
            LIZ.append(componentAppearModel.LJLJI);
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) componentAppearModel.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                C46104I7o.LJI((AnoleComponentBusinessAppearModel) it.next(), arrayList, true);
            }
            Iterator it2 = ((List) componentAppearModel.LJLJI).iterator();
            while (it2.hasNext()) {
                C46104I7o.LJI((AnoleComponentBusinessAppearModel) it2.next(), arrayList, false);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("check containerInteractConfigList = ");
            LIZ2.append(arrayList);
            C242549fW.LIZ(X1D.LIZIZ(LIZ2));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C46106I7q c46106I7q = (C46106I7q) it3.next();
                if (c46106I7q.LIZIZ != null && (LJIL = C46104I7o.LJIL(c46106I7q.LIZ)) != null && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LL.getValue()) != null) {
                    interactAreaCommonAbility.D3(LJIL, c46106I7q.LIZJ, c46106I7q.LIZIZ);
                }
            }
            return;
        }
        if (!(event instanceof C58951NBr)) {
            return;
        }
        C58951NBr c58951NBr = (C58951NBr) event;
        if (c58951NBr.LIZ != 1) {
            return;
        }
        V9W LJIJI = C73340SqO.LJIJI();
        Context context = getContext();
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        int i = c58951NBr.LIZJ;
        C58950NBq c58950NBq = C58950NBq.LIZ;
        LJIJI.getClass();
        NOE.LJJIIJ(context, aweme, i, c58950NBq);
        C58655N0h LIZLLL = C58704N2e.LIZLLL(c58951NBr.LJ, "click", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAwemeRawAd());
        LIZLLL.LIZJ(c58951NBr.LIZLLL, "refer");
        LIZLLL.LIZ(c58951NBr.LJFF);
        LIZLLL.LJI();
        AwemeRawAd awemeRawAd = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAwemeRawAd();
        if (awemeRawAd == null) {
            return;
        }
        UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
        Long creativeId = awemeRawAd.getCreativeId();
        String logExtra = awemeRawAd.getLogExtra();
        new AqS192S0100000_10(awemeRawAd, 60);
        O8Y.LIZ("click", clickTrackUrlList, creativeId, logExtra);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLF = view;
        C8YN.LJII(this, b4(), new TBT() { // from class: X.8UJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLL;
            }
        }, null, C58936NBc.LJLIL, 6);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.7KE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLILLLLZI;
            }
        }, null, C58940NBg.LJLIL, 6);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.7KC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLJI;
            }
        }, null, C58938NBe.LJLIL, 6);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.7yx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJZ;
            }
        }, null, C58941NBh.LJLIL, 6);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.8UK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJZI;
            }
        }, null, C58934NBa.LJLIL, 6);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.7KD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLJL;
            }
        }, null, NBZ.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHolderSelected awemeId = ");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
        LIZ.append(",des =");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getDesc());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC58942NBi c4 = c4();
        if (c4 != null) {
            c4.LJJII();
        }
    }
}
