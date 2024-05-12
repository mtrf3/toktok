package com.bytedance.android.live.rank.impl.list;

import X.AbstractC029409q;
import X.AbstractC78035Ujv;
import X.B9K;
import X.BTJ;
import X.BZI;
import X.C018905p;
import X.C06490Nh;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C1EW;
import X.C28787BRn;
import X.C29306Beo;
import X.C29494Bhq;
import X.C2NU;
import X.C31413CUn;
import X.C31415CUp;
import X.C31520CYq;
import X.C31522CYs;
import X.C31524CYu;
import X.C41081jM;
import X.C47121t6;
import X.C47261Igj;
import X.C51029K0z;
import X.C65814PsI;
import X.C73008Sl2;
import X.C73340SqO;
import X.C77933UiH;
import X.C77934UiI;
import X.C77938UiM;
import X.C77942UiQ;
import X.C77944UiS;
import X.C77952Uia;
import X.C77960Uii;
import X.C77961Uij;
import X.C77969Uir;
import X.C77970Uis;
import X.C77971Uit;
import X.C77979Uj1;
import X.C77987Uj9;
import X.C78001UjN;
import X.C78002UjO;
import X.C78016Ujc;
import X.C78017Ujd;
import X.C78018Uje;
import X.C78020Ujg;
import X.C78024Ujk;
import X.C78030Ujq;
import X.C78034Uju;
import X.C78688UuS;
import X.C80655Vl5;
import X.CXJ;
import X.CZ2;
import X.EnumC31059CGx;
import X.InterfaceC77992UjE;
import X.VWJ;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnTouchListenerC77995UjH;
import Y.AObserverS81S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS24S0400000_13;
import Y.AfS52S0300000_13;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RankLeagueListDialog extends RankListDialog implements InterfaceC77992UjE {
    public C47121t6 LJLLILLLL;
    public C47121t6 LJLLJ;
    public C47121t6 LJLLL;
    public C47121t6 LJLLLL;
    public C47121t6 LJLLLLLL;
    public C47121t6 LJLZ;
    public C47121t6 LJZ;
    public C47121t6 LJZI;
    public C47121t6 LJZL;
    public double LLD;
    public C47121t6 LLFFF;
    public ImageView LLFII;
    public LiveIconView LLFZ;
    public C47121t6 LLI;
    public C47121t6 LLIFFJFJJ;
    public C47121t6 LLII;
    public RecyclerView LLIIII;
    public C41081jM LLIIIILZ;
    public C41081jM LLIIIJ;
    public C80655Vl5 LLIIIL;
    public VWJ LLIIIZ;
    public CZ2 LLIIJI;
    public RecyclerView LLIIJLIL;
    public C31415CUp LLIIL;
    public final Map<Integer, View> LLIILII = new LinkedHashMap();
    public int LL = C15380j0.LIZ(375.0f);
    public double LLF = C15380j0.LIZ((this.LL * 179.75f) / 375.0f);
    public double LLFF = C15380j0.LIZ((this.LL * 111.0f) / 375.0f);

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIILII).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIILII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public RankLeagueListDialog() {
        this.LLD = C15380j0.LIZ((r0 * 165.75f) / 375.0f);
    }

    public final void Al() {
        FragmentManager fragmentManager;
        RankTabInfo rankTabInfo = new RankTabInfo();
        rankTabInfo.rankType = wl().LIZIZ().LJLJJL.type;
        rankTabInfo.LJLILLLLZI = RankTypeV2.LJIIJ.rankPhase;
        rankTabInfo.LJLIL = C15380j0.LJIILJJIL(R.string.m7s);
        List LJJIJ = C47261Igj.LJJIJ(rankTabInfo);
        Iterator it = LJJIJ.iterator();
        while (it.hasNext()) {
            if ((EnumC31059CGx.RANK_DIALOG.getScene() & ((RankTabInfo) it.next()).listLynxType) != 0) {
                C73340SqO.LJJIJIIJI(getContext(), C51029K0z.LJIILIIL(this), LJJIJ);
                return;
            }
        }
        long j = wl().LJLJI.LIZ;
        long j2 = wl().LJLJI.LIZIZ;
        boolean z = wl().LJLJI.LIZLLL;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIIJ;
        C77934UiI c77934UiI = new C77934UiI(j, j2, LJJIJ, z, rankTypeV2, rankTypeV2, wl().LJLJI.LJI);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && (fragmentManager = (FragmentManager) LJIILIIL.kv0(C29494Bhq.class)) != null) {
            RankListDialog LIZ = C77933UiH.LIZ(c77934UiI, this, true, false);
            if (LIZ != null) {
                LIZ.show(fragmentManager, "RankHistoryDialog");
            }
            C31522CYs.LJI(null, this.LJLJLJ, C51029K0z.LJIILIIL(this));
        }
    }

    public final void Dl(boolean z) {
        RankTypeV2 rankTypeV2;
        long j;
        RankRootViewModel LIZIZ = wl().LIZIZ();
        RankTypeV2 rankType = xl().LJFF;
        long j2 = xl().LIZIZ;
        long j3 = xl().LIZ;
        C77979Uj1 c77979Uj1 = new C77979Uj1(wl().LIZIZ().LJLJJI, wl().LIZIZ().LJLJJL.type, wl().LIZIZ().LJLJJL.rankPhase, wl().LJLJI.LIZJ);
        C77944UiS c77944UiS = new C77944UiS(this);
        C77987Uj9 c77987Uj9 = this.LJLJJLL;
        LIZIZ.getClass();
        o.LJIIIZ(rankType, "rankType");
        if (C15380j0.LIZLLL() != null) {
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C78017Ujd(LIZIZ.gv0(LIZIZ.LJLJLJ)));
                    LIZIZ.LJLLI.postValue(arrayList);
                }
            } catch (Exception unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C78018Uje(LIZIZ.gv0(LIZIZ.LJLJLJ)));
            LIZIZ.LJLLI.postValue(arrayList2);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C78017Ujd(LIZIZ.gv0(LIZIZ.LJLJLJ)));
        LIZIZ.LJLLI.postValue(arrayList3);
        String LIZ = C31520CYq.LIZ(rankType.type, rankType.rankPhase, LIZIZ.LJLJJLL);
        if (LIZ != null) {
            LIZIZ.iv0(LIZ, rankType, c77944UiS, c77979Uj1, true);
            return;
        }
        if (!isAdded()) {
            return;
        }
        C78688UuS.LJJJLL();
        if (c77987Uj9 != null) {
            rankTypeV2 = c77987Uj9.LIZLLL;
        } else {
            rankTypeV2 = null;
        }
        if (o.LJ(rankTypeV2, rankType)) {
            c77987Uj9.LIZ(new C77952Uia(this, LIZIZ, rankType, c77944UiS, c77979Uj1));
        }
        if (!z) {
            return;
        }
        C31524CYu.LIZJ(rankType.type, rankType.rankPhase);
        C65814PsI.LIZ().getClass();
        RankApi rankApi = (RankApi) C65814PsI.LIZJ(RankApi.class);
        String valueOf = String.valueOf(rankType.type);
        if (LIZIZ.LJLJJLL) {
            j = -1;
        } else {
            j = 0;
        }
        C1EW.LIZ(rankApi.getRankListV2(j3, j2, valueOf, 1, j, true, rankType.rankPhase)).LJII(BTJ.LIZIZ(this)).LJJJLIIL(new AfS24S0400000_13(LIZIZ, rankType, c77944UiS, c77979Uj1, 4), new AfS52S0300000_13(LIZIZ, rankType, c77979Uj1, 3));
    }

    @Override // X.InterfaceC77992UjE
    public final void LLIILII(List<AbstractC78035Ujv> list) {
        C31415CUp c31415CUp;
        if (list == null || list.isEmpty()) {
            RecyclerView recyclerView = this.LLIIJLIL;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        RecyclerView recyclerView2 = this.LLIIJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        if (list != null && (c31415CUp = this.LLIIL) != null) {
            c31415CUp.LJLZ(list);
        }
        C31415CUp c31415CUp2 = this.LLIIL;
        if (c31415CUp2 == null) {
            return;
        }
        c31415CUp2.notifyDataSetChanged();
    }

    @Override // X.InterfaceC77992UjE
    public final void LLLLII(String titleStr) {
        o.LJIIIZ(titleStr, "titleStr");
        C47121t6 c47121t6 = this.LLI;
        if (c47121t6 != null) {
            c47121t6.setVisibility(0);
        }
        C47121t6 c47121t62 = this.LLI;
        if (c47121t62 == null) {
            return;
        }
        c47121t62.setText(titleStr);
    }

    @Override // X.InterfaceC77992UjE
    public final void M6(C77942UiQ rankEntranceItem) {
        o.LJIIIZ(rankEntranceItem, "rankEntranceItem");
        RankListV2Response.PathToOtherList pathToOtherList = rankEntranceItem.LIZIZ;
        if (!pathToOtherList.existFlowPath || TextUtils.isEmpty(pathToOtherList.schema)) {
            C47121t6 c47121t6 = this.LLFFF;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
            ImageView imageView = this.LLFII;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        C47121t6 c47121t62 = this.LLFFF;
        if (c47121t62 != null) {
            c47121t62.setVisibility(0);
        }
        ImageView imageView2 = this.LLFII;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        C47121t6 c47121t63 = this.LLFFF;
        if (c47121t63 != null) {
            c47121t63.setText(CXJ.LJFF(rankEntranceItem.LIZIZ.description, "").toString());
        }
        C47121t6 c47121t64 = this.LLFFF;
        if (c47121t64 != null) {
            C16880lQ.LJJIIZ(c47121t64, new C77938UiM(this, rankEntranceItem));
        }
        C31522CYs.LJIIIZ(rankEntranceItem.LIZ, this.dataChannel, "champion_tournament_list");
    }

    @Override // X.InterfaceC77992UjE
    public final void hf(C78020Ujg faqItem) {
        o.LJIIIZ(faqItem, "faqItem");
        if (TextUtils.isEmpty(faqItem.LIZIZ)) {
            LiveIconView liveIconView = this.LLFZ;
            if (liveIconView == null) {
                return;
            }
            liveIconView.setVisibility(8);
            return;
        }
        LiveIconView liveIconView2 = this.LLFZ;
        if (liveIconView2 != null) {
            liveIconView2.setVisibility(0);
        }
        LiveIconView liveIconView3 = this.LLFZ;
        if (liveIconView3 != null) {
            C16880lQ.LJJII(liveIconView3, new C77960Uii(this, faqItem));
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog
    public final void initView(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        o.LJIIIZ(view, "view");
        this.LJLLILLLL = (C47121t6) view.findViewById(R.id.mmu);
        this.LJLLJ = (C47121t6) view.findViewById(R.id.mmt);
        this.LJLLL = (C47121t6) view.findViewById(R.id.mms);
        this.LJLLLL = (C47121t6) view.findViewById(R.id.mmn);
        this.LJLLLLLL = (C47121t6) view.findViewById(R.id.mmm);
        this.LJLZ = (C47121t6) view.findViewById(R.id.mml);
        this.LJZ = (C47121t6) view.findViewById(R.id.mmr);
        this.LJZI = (C47121t6) view.findViewById(R.id.mmq);
        this.LJZL = (C47121t6) view.findViewById(R.id.mmp);
        int LIZJ = B9K.LIZJ(getContext());
        this.LL = LIZJ;
        double d = LIZJ;
        this.LLD = (165.75d * d) / 375.0d;
        this.LLF = (179.75d * d) / 375.0d;
        this.LLFF = (d * 111.0d) / 375.0d;
        C47121t6 c47121t6 = this.LJLLILLLL;
        ViewGroup.LayoutParams layoutParams6 = null;
        if (c47121t6 != null) {
            layoutParams = c47121t6.getLayoutParams();
        } else {
            layoutParams = null;
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = (int) this.LLFF;
        C47121t6 c47121t62 = this.LJLLILLLL;
        if (c47121t62 != null) {
            c47121t62.setLayoutParams(layoutParams);
        }
        C47121t6 c47121t63 = this.LJLLJ;
        if (c47121t63 != null) {
            layoutParams2 = c47121t63.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams2.width = (int) this.LLFF;
        C47121t6 c47121t64 = this.LJLLJ;
        if (c47121t64 != null) {
            c47121t64.setLayoutParams(layoutParams2);
        }
        C47121t6 c47121t65 = this.LJLLL;
        if (c47121t65 != null) {
            layoutParams3 = c47121t65.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams3.width = (int) this.LLFF;
        C47121t6 c47121t66 = this.LJLLL;
        if (c47121t66 != null) {
            c47121t66.setLayoutParams(layoutParams3);
        }
        C47121t6 c47121t67 = this.LJLLLL;
        if (c47121t67 != null) {
            layoutParams4 = c47121t67.getLayoutParams();
        } else {
            layoutParams4 = null;
        }
        o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams4.width = (int) this.LLD;
        C47121t6 c47121t68 = this.LJLLLL;
        if (c47121t68 != null) {
            c47121t68.setLayoutParams(layoutParams4);
        }
        C47121t6 c47121t69 = this.LJLLLLLL;
        if (c47121t69 != null) {
            layoutParams5 = c47121t69.getLayoutParams();
        } else {
            layoutParams5 = null;
        }
        o.LJII(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams5.width = (int) this.LLF;
        C47121t6 c47121t610 = this.LJLLLLLL;
        if (c47121t610 != null) {
            c47121t610.setLayoutParams(layoutParams5);
        }
        C47121t6 c47121t611 = this.LJLZ;
        if (c47121t611 != null) {
            layoutParams6 = c47121t611.getLayoutParams();
        }
        o.LJII(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams6.width = (int) this.LLD;
        C47121t6 c47121t612 = this.LJLZ;
        if (c47121t612 != null) {
            c47121t612.setLayoutParams(layoutParams6);
        }
        this.LLI = (C47121t6) view.findViewById(R.id.mm4);
        this.LLIFFJFJJ = (C47121t6) view.findViewById(R.id.mm3);
        this.LLII = (C47121t6) view.findViewById(R.id.m8k);
        this.LLIIII = (RecyclerView) view.findViewById(R.id.j_8);
        this.LLFFF = (C47121t6) view.findViewById(R.id.mg9);
        this.LLFII = (ImageView) view.findViewById(R.id.f9h);
        this.LLFZ = (LiveIconView) view.findViewById(R.id.f33);
        this.LLIIIILZ = (C41081jM) view.findViewById(R.id.fau);
        this.LLIIIJ = (C41081jM) view.findViewById(R.id.e_4);
        this.LLIIIL = (C80655Vl5) view.findViewById(R.id.kyt);
        this.LLIIIZ = (VWJ) view.findViewById(R.id.nb6);
        this.LLIIJLIL = (RecyclerView) view.findViewById(R.id.isn);
        C15490jB.LJ(this.LLIIIILZ, "tiktok_live_revenue_demand_1", "ttlive_bg_rank_league_super_tab.png");
        C15490jB.LJ(this.LLIIIJ, "tiktok_live_revenue_demand_1", "ttlive_icon_rank_league_super_tab_front.png");
        RecyclerView recyclerView = this.LLIIII;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
        RecyclerView recyclerView2 = this.LLIIII;
        if (recyclerView2 != null) {
            C31413CUn c31413CUn = new C31413CUn();
            c31413CUn.LJLZ(C78034Uju.class, new C77961Uij());
            recyclerView2.setAdapter(c31413CUn);
        }
        RecyclerView recyclerView3 = this.LLIIII;
        if (recyclerView3 != null) {
            recyclerView3.setChildDrawingOrderCallback(C78030Ujq.LIZ);
        }
        RecyclerView recyclerView4 = this.LLIIII;
        if (recyclerView4 != null) {
            recyclerView4.LJII(new C73008Sl2(), -1);
        }
        RecyclerView recyclerView5 = this.LLIIJLIL;
        if (recyclerView5 != null) {
            getContext();
            recyclerView5.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView6 = this.LLIIJLIL;
        if (recyclerView6 == null) {
            return;
        }
        C31415CUp c31415CUp = this.LLIIL;
        if (c31415CUp == null) {
            c31415CUp = new C31415CUp();
            this.LLIIL = c31415CUp;
            c31415CUp.LJLLLLLL(C78017Ujd.class, new C77971Uit());
            c31415CUp.LJLLLLLL(C78018Uje.class, new C77969Uir(new AqS163S0100000_13(this, 733)));
            c31415CUp.LJLLLLLL(C78016Ujc.class, new C77970Uis(new AqS163S0100000_13(this, 734)));
        }
        recyclerView6.setAdapter(c31415CUp);
    }

    @Override // X.InterfaceC77992UjE
    public final void nd(String subtitleStr) {
        o.LJIIIZ(subtitleStr, "subtitleStr");
        C47121t6 c47121t6 = this.LLIFFJFJJ;
        if (c47121t6 != null) {
            c47121t6.setVisibility(0);
        }
        C47121t6 c47121t62 = this.LLII;
        if (c47121t62 != null) {
            c47121t62.setVisibility(8);
        }
        RecyclerView recyclerView = this.LLIIII;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        C47121t6 c47121t63 = this.LLIFFJFJJ;
        if (c47121t63 != null) {
            c47121t63.setText(subtitleStr);
        }
        C47121t6 c47121t64 = this.LLIFFJFJJ;
        if (c47121t64 != null) {
            c47121t64.post(new ARunnableS49S0100000_13(this, 58));
        }
    }

    @Override // X.InterfaceC77992UjE
    public final void tb(C78024Ujk historyItem) {
        boolean z;
        AbstractC029409q abstractC029409q;
        String str;
        Text text;
        float f;
        AbstractC029409q adapter;
        int itemCount;
        C31413CUn c31413CUn;
        List<RankListV2Response.RankInfo> list;
        o.LJIIIZ(historyItem, "historyItem");
        RankListV2Response.HistoryEntrance historyEntrance = historyItem.LIZ;
        if (historyEntrance != null && historyEntrance.ifHasHistory) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C47121t6 c47121t6 = this.LLII;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
            RecyclerView recyclerView = this.LLIIII;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        RecyclerView recyclerView2 = this.LLIIII;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        C47121t6 c47121t62 = this.LLII;
        if (c47121t62 != null) {
            c47121t62.setVisibility(0);
        }
        C47121t6 c47121t63 = this.LLIFFJFJJ;
        if (c47121t63 != null) {
            c47121t63.setVisibility(8);
        }
        RecyclerView recyclerView3 = this.LLIIII;
        ViewGroup.LayoutParams layoutParams = null;
        if (recyclerView3 != null) {
            abstractC029409q = recyclerView3.getAdapter();
        } else {
            abstractC029409q = null;
        }
        if ((abstractC029409q instanceof C31413CUn) && (c31413CUn = (C31413CUn) abstractC029409q) != null) {
            ArrayList arrayList = new ArrayList();
            RankListV2Response.HistoryEntrance historyEntrance2 = historyItem.LIZ;
            if (historyEntrance2 != null && (list = historyEntrance2.ranks) != null) {
                for (RankListV2Response.RankInfo it : list) {
                    o.LJIIIIZZ(it, "it");
                    arrayList.add(new C78034Uju(it));
                }
            }
            c31413CUn.LJZ(arrayList);
            c31413CUn.notifyDataSetChanged();
        }
        RecyclerView recyclerView4 = this.LLIIII;
        if (recyclerView4 != null) {
            recyclerView4.setOnTouchListener(ViewOnTouchListenerC77995UjH.LJLIL);
        }
        RecyclerView recyclerView5 = this.LLIIII;
        if (recyclerView5 != null) {
            recyclerView5.setOnClickListener(new ViewOnClickListenerC13880ga(new C78001UjN(this)));
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_hourly_live_rank_show");
        C31522CYs.LIZ(LIZ, this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJIJJ(this.LJLJLJ.LIZIZ.rankName, "rank_type");
        LIZ.LJIJJ("click", "enter_from");
        LIZ.LJIJJ("last", "rank_period");
        C06490Nh.LIZLLL(LIZ, "folded", "list_type", "rankings", "list_content");
        C47121t6 c47121t64 = this.LLII;
        if (c47121t64 != null) {
            c47121t64.setVisibility(0);
        }
        C47121t6 c47121t65 = this.LLII;
        if (c47121t65 != null) {
            RankListV2Response.HistoryEntrance historyEntrance3 = historyItem.LIZ;
            if (historyEntrance3 != null) {
                text = historyEntrance3.entranceText;
            } else {
                text = null;
            }
            c47121t65.setText(CXJ.LJFF(text, "").toString());
        }
        C47121t6 c47121t66 = this.LLII;
        if (c47121t66 != null) {
            C16880lQ.LJJIIZ(c47121t66, new C78002UjO(this));
        }
        C47121t6 c47121t67 = this.LLII;
        if (c47121t67 != null) {
            layoutParams = c47121t67.getLayoutParams();
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        RecyclerView recyclerView6 = this.LLIIII;
        if (recyclerView6 == null || (adapter = recyclerView6.getAdapter()) == null || (itemCount = adapter.getItemCount()) == 0) {
            f = 0.0f;
        } else {
            f = ((itemCount - 1) * 20.0f) + 8.0f;
        }
        marginLayoutParams.setMarginStart(C15380j0.LIZ(f));
        C47121t6 c47121t68 = this.LLII;
        if (c47121t68 != null) {
            c47121t68.setLayoutParams(marginLayoutParams);
        }
        LiveIconView liveIconView = this.LLFZ;
        if (liveIconView != null) {
            ViewGroup.LayoutParams layoutParams2 = liveIconView.getLayoutParams();
            if (layoutParams2 != null) {
                C018905p c018905p = (C018905p) layoutParams2;
                c018905p.setMarginStart(C15380j0.LIZ(8.83f));
                C47121t6 c47121t69 = this.LLII;
                if (c47121t69 != null) {
                    c018905p.topToTop = c47121t69.getId();
                    c018905p.bottomToBottom = c47121t69.getId();
                }
                liveIconView.setLayoutParams(c018905p);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.RankListDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RankRootController wl = wl();
        wl.LJLJJL = this;
        wl.LIZIZ().LJLLI.observe(wl.LJLILLLLZI, new AObserverS81S0100000_13(wl, 15));
        wl.LIZIZ().LJLLILLLL.observe(wl.LJLILLLLZI, new AObserverS81S0100000_13(wl, 16));
        wl.LIZIZ().LJLLJ.observe(wl.LJLILLLLZI, new AObserverS81S0100000_13(wl, 17));
        wl.LIZIZ().LJLLL.observe(wl.LJLILLLLZI, new AObserverS81S0100000_13(wl, 18));
        wl.LIZIZ().LJLLLL.observe(wl.LJLILLLLZI, new AObserverS81S0100000_13(wl, 19));
        wl.LIZIZ().LJLLLLLL.observe(wl.LJLILLLLZI, new AObserverS81S0100000_13(wl, 20));
        Dl(false);
    }
}
