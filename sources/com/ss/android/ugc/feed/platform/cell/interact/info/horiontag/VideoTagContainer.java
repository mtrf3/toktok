package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.AbstractC48820JEa;
import X.AnonymousClass843;
import X.C09900aA;
import X.C113554cx;
import X.C187227Wk;
import X.C210658On;
import X.C210838Pf;
import X.C210858Ph;
import X.C210868Pi;
import X.C210878Pj;
import X.C210888Pk;
import X.C210898Pl;
import X.C210918Pn;
import X.C210928Po;
import X.C210988Pu;
import X.C210998Pv;
import X.C211018Px;
import X.C211028Py;
import X.C211128Qi;
import X.C212428Vi;
import X.C214348b8;
import X.C218518hr;
import X.C221108m2;
import X.C221138m5;
import X.C2304092m;
import X.C241249dQ;
import X.C2K0;
import X.C2L4;
import X.C30581Hy;
import X.C32I;
import X.C37179EiV;
import X.C39557Ffl;
import X.C3C8;
import X.C47135Ieh;
import X.C47261Igj;
import X.C51556KLg;
import X.C53664L4i;
import X.C55096Ljo;
import X.C59251NNf;
import X.C5H3;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72083SQt;
import X.C76800UCe;
import X.C76965UIn;
import X.C78926UyI;
import X.C79004UzY;
import X.C8MK;
import X.C8MQ;
import X.C8O6;
import X.C8O7;
import X.C8ON;
import X.C8PV;
import X.C8Q2;
import X.C8Q3;
import X.C8Q5;
import X.C8Q7;
import X.C8QC;
import X.C8QG;
import X.C8SG;
import X.C8W0;
import X.C8YN;
import X.EnumC210578Of;
import X.InterfaceC115514g7;
import X.InterfaceC210978Pt;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.InterfaceC88472Yns;
import X.KR8;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.RunnableC210938Pp;
import X.TBT;
import X.TCM;
import X.X1D;
import Y.AObserverS67S0200000_3;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.AvoidUpvoteViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedPaidContentPreviewTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialMafTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialPrivacyTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialRelationTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTagViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTextViewTagTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedUrlTriggerTrigger;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.ss.android.ugc.feed.platform.container.scope.VideoTagComponentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VideoTagContainer extends BaseContainer implements CategoryPriorityAbility, InteractVideoTagAbility, InterfaceC55102Lju, C2L4 {
    public static final C8Q5 LLIIZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIL;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;
    public final InterfaceC115514g7 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final EnumC210578Of LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C221138m5 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final VideoTagContainer$feedModeBaseProtocol$1 LLIILZL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.8Q5] */
    static {
        TBT tbt = new TBT(VideoTagContainer.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIL = new InterfaceC74236TBo[]{tbt, new TBT(VideoTagContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0), new TBT(VideoTagContainer.class, "avoidUpvoteVM", "getAvoidUpvoteVM()Lcom/ss/android/ugc/aweme/feed/adapter/AvoidUpvoteViewModel;", 0)};
        LLIIZ = new Object() { // from class: X.8Q5
        };
    }

    public final void F4() {
        C8YN.LJIIJ(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8Pq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, new TBT() { // from class: X.8MD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZI;
            }
        }, null, C8O6.LJLIL, 12);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8Pr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C210858Ph.LJLIL, 6);
        C8YN.LJII(this, D4(), new TBT() { // from class: X.8Pz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8Q0) obj).LJLIL;
            }
        }, null, C8O7.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final String LQ() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Od0() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -556512712 || hashCode == 136784447) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void yZ(PriorityProtocol protocol, boolean z) {
        o.LJIIIZ(protocol, "protocol");
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer$feedModeBaseProtocol$1] */
    public VideoTagContainer() {
        new LinkedHashMap();
        this.LLFFF = C221108m2.LIZIZ(C8Q3.LJLIL);
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1288));
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C210988Pu.INSTANCE);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C210998Pv.INSTANCE);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSocialTagViewModel.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1291), null, C211018Px.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLII = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 1292), null, C210658On.INSTANCE, null, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(AvoidUpvoteViewModel.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ3, c241249dQ, new AqS153S0100000_3(LIZ3, 1293), null, C8MK.INSTANCE, null, null);
        this.LLIIIILZ = C221108m2.LIZIZ(C210868Pi.LJLIL);
        this.LLIIIJ = C221108m2.LIZIZ(new C210898Pl(this));
        this.LLIIIL = EnumC210578Of.VIDEO_TAG_CONTAINER;
        this.LLIIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1286));
        this.LLIIJI = C221108m2.LIZIZ(C8Q2.LJLIL);
        this.LLIIJLIL = KR8.LJIIJJI(new AqS153S0100000_3(this, 1290));
        this.LLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1289));
        this.LLIILII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1287));
        this.LLIILZL = new FeedModeBaseProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer$feedModeBaseProtocol$1
            public int LJLIL = 8;

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
            public final void M2() {
                this.LJLIL = VideoTagContainer.this.getContainerView().getVisibility();
                if (VideoTagContainer.this.getContainerView().getVisibility() == 0) {
                    VideoTagContainer.this.getContainerView().setVisibility(8);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
            public final void s() {
                if (this.LJLIL == 0) {
                    VideoTagContainer.this.getContainerView().setVisibility(0);
                }
            }
        };
    }

    public final AbstractC48820JEa A4() {
        return (AbstractC48820JEa) this.LLFFF.getValue();
    }

    public final VideoTagContainer$lowTagComponentProtocol$2$1 B4() {
        return (VideoTagContainer$lowTagComponentProtocol$2$1) this.LLIIL.getValue();
    }

    public final C210838Pf C4() {
        return (C210838Pf) this.LLIIIILZ.getValue();
    }

    public final FeedSocialTagViewModel D4() {
        return (FeedSocialTagViewModel) this.LLIFFJFJJ.LIZ(this, LLIL[0]);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(VideoTagComponentScope.class);
    }

    public final C218518hr p4() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        C218518hr c218518hr = new C218518hr(context, null);
        c218518hr.setId(R.id.bq1);
        c218518hr.setLayoutParams(marginLayoutParams2);
        this.LLII.LIZ(this, LLIL[1]).getClass();
        ViewGroup.LayoutParams layoutParams = c218518hr.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int LIZ = C8ON.LIZ();
            int marginStart = marginLayoutParams.getMarginStart();
            int i = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = i;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = LIZ;
        }
        return c218518hr;
    }

    public final void q4() {
        List list = (List) this.LLIIJLIL.getValue();
        if (list == null || list.isEmpty()) {
            A4().LJIIIIZZ("VideoTagContainer onCreateView async protocols is empty");
            if (((Number) C8Q7.LIZ.getValue()).intValue() != 0) {
                C210928Po r4 = r4();
                r4.LIZJ.compareAndSet(false, true);
                Iterator<RunnableC210938Pp> it = r4.LIZ().iterator();
                while (it.hasNext()) {
                    C37179EiV.LJFF.removeCallbacks(it.next());
                }
                r4.LIZ().clear();
                C78926UyI.LJFF(this, new AqS169S0100000_3(this, 1021));
                F4();
                A4().LJIIIIZZ("VideoTagContainer onCreateView async actions invoke syncOnViewCreated");
                return;
            }
            return;
        }
        A4().LJIIIIZZ("VideoTagContainer onCreateView fallback evictAsyncActions ");
        C210928Po r42 = r4();
        r42.getClass();
        if (((Number) C8Q7.LIZ.getValue()).intValue() != 0) {
            if (r42.LIZJ()) {
                r42.LIZIZ().LIZLLL("evictAsyncActions lifecycle destroyed");
                return;
            }
            CopyOnWriteArrayList<RunnableC210938Pp> LIZ = r42.LIZ();
            ArrayList arrayList = new ArrayList();
            Iterator<RunnableC210938Pp> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                RunnableC210938Pp next = it2.next();
                if (!next.LJLILLLLZI) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C37179EiV.LJFF.removeCallbacks((RunnableC210938Pp) it3.next());
                r42.LIZIZ().LJIIIIZZ("evictAsyncActions clear LegoExecutor task");
            }
            if (!arrayList.isEmpty()) {
                if (r42.LIZJ.compareAndSet(false, true)) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        RunnableC210938Pp runnableC210938Pp = (RunnableC210938Pp) it4.next();
                        if (r42.LIZJ()) {
                            r42.LIZIZ().LIZLLL("evictAsyncActions lifecycle destroyed evictActions return");
                        } else {
                            AbstractC48820JEa LIZIZ = r42.LIZIZ();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("evictAsyncActions started shouldCancelAssemAsyncActions => ");
                            LIZ2.append(r42.LIZJ.get());
                            LIZIZ.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                            runnableC210938Pp.run();
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    CopyOnWriteArrayList<RunnableC210938Pp> LIZ3 = r42.LIZ();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<RunnableC210938Pp> it5 = LIZ3.iterator();
                    while (it5.hasNext()) {
                        RunnableC210938Pp next2 = it5.next();
                        if (!next2.LJLILLLLZI) {
                            arrayList2.add(next2);
                        }
                    }
                    jSONObject.put("assem", String.valueOf(arrayList2.size()));
                    C09900aA.LJI("feed_videotag_assem_preload", jSONObject, null, null);
                }
                r42.LIZ().clear();
            }
        }
    }

    public final C210928Po r4() {
        return (C210928Po) this.LLIIJI.getValue();
    }

    public final VideoTagContainer$highTagComponentProtocol$2$1 u4() {
        return (VideoTagContainer$highTagComponentProtocol$2$1) this.LLIILII.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility
    public final List<String> xR() {
        ArrayList arrayList = new ArrayList();
        String o0 = B4().o0();
        if (o0 != null && o0.length() != 0) {
            arrayList.add(o0);
        }
        String o02 = u4().o0();
        if (o02 != null && o02.length() != 0) {
            arrayList.add(o02);
        }
        return arrayList;
    }

    public final InteractAreaCommonAbility z4() {
        return (InteractAreaCommonAbility) this.LLFII.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility
    public final List<String> Bn() {
        ConcurrentHashMap<String, C8PV> concurrentHashMap = C4().LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, C8PV>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().getValue().LIZLLL(), arrayList);
        }
        return arrayList;
    }

    public final boolean E4() {
        if (C8QC.LIZ()) {
            if (C53664L4i.LIZ(C210888Pk.LIZLLL(a1()))) {
                return true;
            }
            return C30581Hy.LJIL(rp0().eventType);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility
    public final void Gt0() {
        InteractAreaCommonAbility z4;
        InteractAreaCommonAbility z42;
        getContainerView().setVisibility(8);
        if (E4()) {
            String o0 = B4().o0();
            if (o0 != null && o0.length() != 0 && (z42 = z4()) != null) {
                z42.Qb0(B4());
            }
            String o02 = u4().o0();
            if (o02 == null || o02.length() == 0 || (z4 = z4()) == null) {
                return;
            }
            z4.Qb0(u4());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem, com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility
    public final ViewGroup getContainerView() {
        return (ViewGroup) getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        VideoTagCategoryProtocol videoTagCategoryProtocol;
        VideoTagCategoryProtocol videoTagCategoryProtocol2;
        C210928Po r4 = r4();
        r4.getClass();
        r4.LIZLLL = this;
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        if (!C2304092m.LIZ()) {
            C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(new FeedStoryTagTrigger()));
        }
        if (!C2304092m.LIZ() || a1().LIZ != 1) {
            InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LJIIJJI = C8SG.LIZIZ.LJIIJJI();
            if (LJIIJJI != null) {
                Object newInstance = C39557Ffl.LIZ(LJIIJJI).newInstance();
                if ((newInstance instanceof VideoTagCategoryProtocol) && (videoTagCategoryProtocol2 = (VideoTagCategoryProtocol) newInstance) != null) {
                    C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(videoTagCategoryProtocol2));
                }
            }
            InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LIZ = C211128Qi.LIZIZ.LIZ();
            if (LIZ != null) {
                Object newInstance2 = C39557Ffl.LIZ(LIZ).newInstance();
                if ((newInstance2 instanceof VideoTagCategoryProtocol) && (videoTagCategoryProtocol = (VideoTagCategoryProtocol) newInstance2) != null) {
                    C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(videoTagCategoryProtocol));
                }
            }
        }
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(new FeedSocialPrivacyTagTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(new FeedSocialRelationTagTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(new FeedSocialMafTagTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(new FeedSocialTextViewTagTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(new FeedUrlTriggerTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(new FeedPaidContentPreviewTagTrigger()));
        C51556KLg.LIZ.getClass();
        VideoTagCategoryProtocol poiTagTrigger = C51556KLg.LIZ().getPoiTagTrigger();
        if (poiTagTrigger != null) {
            C62814Ol0.LJJIIJZLJL(LJIIZILJ, VideoTagCategoryProtocol.class, C47261Igj.LJJIJIL(poiTagTrigger));
        }
        A4().LJIIIIZZ("VideoTagContainer asyncOnViewCreated start");
        C78926UyI.LJFF(this, new AqS169S0100000_3(this, 1020));
        r4().LIZ().add(new RunnableC210938Pp(new AqS153S0100000_3(this, 1776)));
        C210928Po r42 = r4();
        r42.getClass();
        if (((Number) C8Q7.LIZ.getValue()).intValue() != 0) {
            Iterator<RunnableC210938Pp> it = r42.LIZ().iterator();
            while (it.hasNext()) {
                C37179EiV.LJFF.postAtFrontOfQueue(new ARunnableS22S0200000_3(r42, it.next(), 60));
            }
        }
        A4().LJIIIIZZ("VideoTagContainer asyncOnViewCreated finish");
        super.onCreate();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        super.onCreateView();
        C210838Pf C4 = C4();
        ViewGroup viewGroup = (ViewGroup) getContainerView();
        C210878Pj c210878Pj = new C210878Pj(this);
        C4.getClass();
        C4.LIZIZ = viewGroup;
        C4.LIZ = c210878Pj;
        for (Map.Entry<? extends Set<String>, C210918Pn> entry : c210878Pj.LIZIZ.entrySet()) {
            Set<String> key = entry.getKey();
            C210918Pn value = entry.getValue();
            C8PV c8pv = new C8PV();
            C4.LIZJ.put(value.LIZ, c8pv);
            c8pv.LIZ(value.LIZIZ, value.LIZJ);
            viewGroup.addView(value.LIZIZ);
            Iterator<String> it = key.iterator();
            while (it.hasNext()) {
                C4.LIZLLL.put(it.next(), value.LIZ);
            }
        }
        C4.LJ.observe(c210878Pj.LIZJ, new AObserverS67S0200000_3(C4, c210878Pj, 10));
        ((VideoEventDispatchViewModel) this.LLI.getValue()).LJLJJL = new AqS169S0100000_3(this, 583);
        if (((Number) C8Q7.LIZ.getValue()).intValue() == 2) {
            C37179EiV.LIZ().postDelayed(new ARunnableS39S0100000_3(this, 122), 100L);
        } else {
            q4();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        if (AnonymousClass843.LIZIZ()) {
            C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), FeedModeBaseProtocol.class, C47261Igj.LJJIJIL(this.LLIILZL));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLIIIL;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility
    public final void Oc0(C187227Wk privateModelEvent) {
        Aweme aweme;
        UrlModel urlModel;
        List<AwemeHybridLabelModel> list;
        o.LJIIIZ(privateModelEvent, "privateModelEvent");
        FeedSocialTagViewModel D4 = D4();
        D4.getClass();
        VideoItemParams gv0 = D4.gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || !o.LJ(aweme.getAid(), privateModelEvent.LJLILLLLZI.getAid())) {
            return;
        }
        PrivateUrlModel privateUrlModel = privateModelEvent.LJLIL;
        AwemeLabelModel awemeLabelModel = null;
        if (privateUrlModel != null) {
            urlModel = privateUrlModel.labelPrivate;
        } else {
            urlModel = null;
        }
        aweme.setLabelPrivate(urlModel);
        PrivateUrlModel privateUrlModel2 = privateModelEvent.LJLIL;
        if (privateUrlModel2 != null && (list = privateUrlModel2.hybridLabels) != null) {
            if (list.size() > 0) {
                ((AwemeHybridLabelModel) ListProtector.get(list, 0)).setLabelType(HybridLabelTagType.PRIVACY.getValue());
            }
        } else {
            list = null;
        }
        aweme.setHybridLabels(list);
        if (urlModel != null) {
            awemeLabelModel = new AwemeLabelModel();
            awemeLabelModel.setLabelType(1);
            awemeLabelModel.setUrlModels(urlModel);
        }
        List<AwemeLabelModel> list2 = aweme.videoLabels;
        if (list2 != null) {
            if (list2.size() == 0) {
                ListProtector.add(aweme.videoLabels, 0, awemeLabelModel);
            } else {
                ListProtector.set(aweme.videoLabels, 0, awemeLabelModel);
            }
        }
        if (C79004UzY.LJJIFFI(aweme.getHybridLabels())) {
            Boolean LIZ = SharePrefCache.inst().getIsPrivateAvailable().LIZ();
            o.LJIIIIZZ(LIZ, "inst().isPrivateAvailable.cache");
            if (!LIZ.booleanValue() || urlModel == null || C79004UzY.LJJIFFI(urlModel.getUrlList())) {
                D4.setState(C211028Py.LJLIL);
                return;
            }
        }
        D4.setState(new AqS169S0100000_3(aweme, 19));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* renamed from: Z3 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (C59251NNf.LIZIZ(3, item.getAweme())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeTextLabelModel label;
        o.LJIIIZ(item, "item");
        FeedSocialTagViewModel D4 = D4();
        D4.getClass();
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        C72083SQt.LJLJI(aweme);
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && !awemeRawAd.isRightStyle() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (label = awemeRawAd2.getLabel()) != null) {
            aweme.textVideoLabels.add(label);
        }
        if ((aweme.isAd() && C63081OpJ.LLJLLIL(aweme)) || aweme.getRelationLabel() == null) {
            return;
        }
        RelationDynamicLabel relationLabel = aweme.getRelationLabel();
        if (relationLabel != null) {
            if (relationLabel.getType() != 0 || !o.LJ(D4.LJLJI, "homepage_familiar")) {
                return;
            }
            aweme.setRelationLabel(null);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (((Number) C8Q7.LIZ.getValue()).intValue() != 0) {
            return;
        }
        C78926UyI.LJFF(this, new AqS169S0100000_3(this, 1021));
        F4();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        InteractAreaCommonAbility z4;
        InteractAreaCommonAbility z42;
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
        if ((aweme != null && aweme.getReplaceRecTagByRepost()) || !E4()) {
            return;
        }
        String o0 = B4().o0();
        if (o0 != null && o0.length() != 0 && (z42 = z4()) != null) {
            z42.U00(B4(), null, Boolean.TRUE);
        }
        String o02 = u4().o0();
        if (o02 == null || o02.length() == 0 || (z4 = z4()) == null) {
            return;
        }
        z4.U00(u4(), new AqS185S0100000_3(this, 229), Boolean.TRUE);
    }

    public final void n4(Assembler assembler, PriorityProtocol priorityProtocol) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof PriorityProtocol) {
                    arrayList.add(next);
                }
            }
            if (arrayList.contains(priorityProtocol)) {
                A4().LIZLLL("AssemTagComponent duplicate");
                return;
            }
        }
        if (priorityProtocol instanceof BaseCellTriggerComponent) {
            TCM.LJIILJJIL(assembler, this, new AqS134S0200000_3(this, priorityProtocol, 174));
        } else {
            if (priorityProtocol instanceof BaseCellSlotComponent) {
                assembler.sv0(this, new AqS134S0200000_3(this, priorityProtocol, 176));
                return;
            }
            throw new IllegalStateException("The type implementing VideoTagCategoryProtocol is not supported!");
        }
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
        Iterator LIZLLL = C47135Ieh.LIZLLL(C4().LIZJ, "priorityMakers.values");
        while (LIZLLL.hasNext()) {
            C8PV it3 = (C8PV) LIZLLL.next();
            o.LJIIIIZZ(it3, "it");
            C8PV.LJIILIIL(it3);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Es(PriorityProtocol protocol, Boolean bool, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(protocol, "protocol");
        C210838Pf C4 = C4();
        AqS134S0200000_3 aqS134S0200000_3 = new AqS134S0200000_3((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super View, C76800UCe>) this, (VideoTagContainer) 175);
        C4.getClass();
        String str = C4.LIZLLL.get(protocol.y2());
        if (str == null) {
            InterfaceC210978Pt interfaceC210978Pt = C4.LIZ;
            if (interfaceC210978Pt != null) {
                String LIZ = interfaceC210978Pt.LIZ();
                OSZ[] oszArr = new OSZ[2];
                oszArr[0] = new OSZ("tag_name", protocol.y2());
                Collection<C8PV> values = C4.LIZJ.values();
                o.LJIIIIZZ(values, "priorityMakers.values");
                ArrayList arrayList = new ArrayList(C32I.LJJL(values, 10));
                Iterator<C8PV> it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJFF().LIZJ());
                }
                oszArr[1] = new OSZ("priorities", ORZ.LLD(arrayList, null, null, null, null, 63));
                C8QG.LIZ(null, null, LIZ, 0, "main_tag", C113554cx.LJJL(oszArr), 3);
                return;
            }
            o.LJIJI("context");
            throw null;
        }
        C8PV c8pv = C4.LIZJ.get(str);
        if (c8pv != null) {
            c8pv.LJIIL(protocol, bool, aqS134S0200000_3);
        }
    }
}
