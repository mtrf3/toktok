package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.AbstractC029409q;
import X.AbstractC030309z;
import X.AbstractC39351FcR;
import X.C0A6;
import X.C188727au;
import X.C278817o;
import X.C35656Dz2;
import X.C35878E6g;
import X.C36222EJm;
import X.C38986FRu;
import X.C39032FTo;
import X.C40788Fzc;
import X.C40864G2a;
import X.C40865G2b;
import X.C42398GkU;
import X.C56662Kg;
import X.C61878OQg;
import X.C79045V0n;
import X.E6T;
import X.EnumC40761FzB;
import X.G2E;
import X.G2H;
import X.G2I;
import X.G2J;
import X.G2X;
import X.G2Y;
import X.OSZ;
import X.V2B;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.e;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.journey.SelectedInterestList;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryItemStruct;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SelectTopicInterestsComponent extends AbstractSelectInterestFragment {
    public LinearLayoutManager LLFF;
    public TuxTextView LLFFF;
    public TuxTextView LLFII;
    public TuxTextView LLFZ;
    public TuxTextView LLI;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public List<TopicInterestCategoryStruct> LLD = C61878OQg.INSTANCE;
    public final C40864G2a LLF = new C40864G2a();

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final String Il() {
        return "topic";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIFFJFJJ;
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

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b0285";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final int getLayout() {
        return R.layout.bes;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public SelectTopicInterestsComponent() {
        G2J g2j;
        G2I LIZ = G2E.LIZ(EnumC40761FzB.JOURNEY_INTERESTS_ID);
        if (LIZ != null) {
            g2j = LIZ.LJLJLJ;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final C0A6 Hl() {
        return new G2X(this);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final C39032FTo Kl() {
        AbstractC029409q adapter = Gl().getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter");
        TopicInterestAdapter topicInterestAdapter = (TopicInterestAdapter) adapter;
        HashSet<G2Y> hashSet = topicInterestAdapter.LJLJLJ;
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        Iterator<G2Y> it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            G2Y next = it.next();
            String str = ((TopicInterestCategoryStruct) ListProtector.get(topicInterestAdapter.LJLILLLLZI, next.LIZ)).id;
            String str2 = next.LIZIZ;
            int i2 = next.LIZ;
            int i3 = next.LIZJ;
            linkedList.add(new NewUserInterestStruct(str, null, null, null, null, null, 56, null));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("select_rank", i);
            jSONObject.put("interest", str2);
            jSONObject.put("category", str);
            jSONObject.put("show_rank", i2 + 1);
            jSONObject.put("topic_rank", i3 + 1);
            jSONArray.put(jSONObject);
        }
        OSZ osz = new OSZ(linkedList, jSONArray);
        Iterator<G2Y> it2 = topicInterestAdapter.LJLJLJ.iterator();
        String str3 = "";
        String str4 = "";
        while (it2.hasNext()) {
            G2Y next2 = it2.next();
            if (str4.length() > 0) {
                str4 = C42398GkU.LIZIZ(str4, '|');
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str4);
            LIZ.append(next2.LIZIZ);
            str4 = X1D.LIZIZ(LIZ);
        }
        AbstractC39351FcR LIZ2 = C38986FRu.LIZ();
        List interestIdList = (List) osz.getFirst();
        int elapsedRealtime = (int) (((SystemClock.elapsedRealtime() - this.LJLJL) + this.LJLJLLL) / 1000);
        o.LJIIIZ(interestIdList, "interestIdList");
        e eVar = new e();
        eVar.LJIIL = false;
        String json = GsonProtectorUtils.toJson(eVar.LIZ(), new SelectedInterestList(interestIdList, Integer.valueOf(LIZ2.LIZJ), Integer.valueOf(elapsedRealtime), null, 8, null));
        LIZ2.LIZIZ = json;
        if (json != null) {
            str3 = json;
        }
        String jSONArray2 = ((JSONArray) osz.getSecond()).toString();
        o.LJIIIIZZ(jSONArray2, "pair.second.toString()");
        return new C39032FTo(str3, jSONArray2, ((JSONArray) osz.getSecond()).length(), str4);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        G2J g2j;
        G2J g2j2;
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_INTERESTS_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j3 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onResume();
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j3 = LIZ3.LJLJLJ;
        }
        G2E.LIZIZ(g2j3);
        G2E.LIZLLL(enumC40761FzB);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final void Al() {
        List<TopicInterestCategoryStruct> list;
        C40788Fzc c40788Fzc;
        C35878E6g.LIZ();
        C35656Dz2 wl = wl();
        if (!(wl instanceof C40788Fzc) || (c40788Fzc = (C40788Fzc) wl) == null || (list = c40788Fzc.LJ) == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LLD = list;
        TuxTextView tuxTextView = this.LLFII;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
            TuxTextView tuxTextView2 = this.LLFZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
                TuxTextView tuxTextView3 = this.LLI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setVisibility(0);
                    TuxTextView tuxTextView4 = this.LLFFF;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setVisibility(0);
                        TuxTextView tuxTextView5 = this.LLFFF;
                        if (tuxTextView5 != null) {
                            this.LJLLL = tuxTextView5;
                            TuxTextView tuxTextView6 = this.LLI;
                            if (tuxTextView6 != null) {
                                this.LJLLJ = tuxTextView6;
                                super.Al();
                                getContext();
                                this.LLFF = new LinearLayoutManager();
                                RecyclerView Gl = Gl();
                                LinearLayoutManager linearLayoutManager = this.LLFF;
                                if (linearLayoutManager != null) {
                                    Gl.setLayoutManager(linearLayoutManager);
                                    RecyclerView Gl2 = Gl();
                                    final int LIZ = C278817o.LIZ(38.0f);
                                    Gl2.LJII(new AbstractC030309z(LIZ) { // from class: X.4bg
                                        public final int LJLIL;

                                        {
                                            this.LJLIL = LIZ;
                                        }

                                        @Override // X.AbstractC030309z
                                        public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                                            T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                                            rect.bottom = this.LJLIL;
                                            if (RecyclerView.LJJJJIZL(view) == 0) {
                                                rect.top = this.LJLIL;
                                            }
                                        }
                                    }, -1);
                                    Gl().setItemViewCacheSize(this.LLD.size());
                                    List<TopicInterestCategoryStruct> list2 = this.LLD;
                                    AqS172S0100000_6 aqS172S0100000_6 = this.LJZ;
                                    C40865G2b c40865G2b = this.LJLJJLL;
                                    LinearLayoutManager linearLayoutManager2 = this.LLFF;
                                    if (linearLayoutManager2 != null) {
                                        Gl().setAdapter(new TopicInterestAdapter(list2, aqS172S0100000_6, c40865G2b, linearLayoutManager2, this.LJLZ, this.LLF));
                                        return;
                                    } else {
                                        o.LJIJI("outerLayoutManager");
                                        throw null;
                                    }
                                }
                                o.LJIJI("outerLayoutManager");
                                throw null;
                            }
                            o.LJIJI("centerNext");
                            throw null;
                        }
                        o.LJIJI("topSkip");
                        throw null;
                    }
                    o.LJIJI("topSkip");
                    throw null;
                }
                o.LJIJI("centerNext");
                throw null;
            }
            o.LJIJI("rightNext");
            throw null;
        }
        o.LJIJI("bottomSkip");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final void Ll(boolean z) {
        String str;
        Dl().setEnabled(z);
        int i = 0;
        if (z) {
            TextView Dl = Dl();
            Context context = Dl().getContext();
            o.LJIIIIZZ(context, "finalNext.context");
            Integer LJI = C79045V0n.LJI(R.attr.dj, context);
            if (LJI != null) {
                i = LJI.intValue();
            }
            Dl.setTextColor(i);
        } else {
            TextView Dl2 = Dl();
            Context context2 = Dl().getContext();
            o.LJIIIIZZ(context2, "finalNext.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.gp, context2);
            if (LJI2 != null) {
                i = LJI2.intValue();
            }
            Dl2.setTextColor(i);
        }
        C40865G2b c40865G2b = this.LJLJJLL;
        if (c40865G2b != null) {
            str = c40865G2b.LIZJ;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView Dl3 = Dl();
            C40865G2b c40865G2b2 = this.LJLJJLL;
            o.LJI(c40865G2b2);
            Dl3.setText(c40865G2b2.LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        G2J g2j;
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_INTERESTS_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJI;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onCreate(bundle);
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJJI;
        }
        G2E.LIZIZ(g2j2);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        G2J g2j;
        o.LJIIIZ(view, "view");
        G2I LIZ = G2E.LIZ(EnumC40761FzB.JOURNEY_INTERESTS_ID);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJLL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        TuxTextView top_skip = (TuxTextView) _$_findCachedViewById(R.id.lgc);
        o.LJIIIIZZ(top_skip, "top_skip");
        this.LLFFF = top_skip;
        TuxTextView bottom_skip = (TuxTextView) _$_findCachedViewById(R.id.ari);
        o.LJIIIIZZ(bottom_skip, "bottom_skip");
        this.LLFII = bottom_skip;
        TuxTextView right_next = (TuxTextView) _$_findCachedViewById(R.id.j2r);
        o.LJIIIIZZ(right_next, "right_next");
        this.LLFZ = right_next;
        TuxTextView center_next = (TuxTextView) _$_findCachedViewById(R.id.b8e);
        o.LJIIIIZZ(center_next, "center_next");
        this.LLI = center_next;
        TuxTextView tuxTextView = this.LLFZ;
        if (tuxTextView != null) {
            this.LJLLJ = tuxTextView;
            TuxTextView tuxTextView2 = this.LLFII;
            if (tuxTextView2 != null) {
                this.LJLLL = tuxTextView2;
                super.onViewCreated(view, bundle);
                int size = this.LLD.size();
                for (int i = 0; i < size; i++) {
                    this.LLF.LIZIZ.put(Integer.valueOf(i), -1);
                }
                G2H g2h = G2H.INTEREST_SELECTION_DID_SHOW;
                C188727au c188727au = new C188727au();
                c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "duration_since_launch");
                c188727au.LJIIIZ("vid", (String) this.LJZL.getValue());
                Map<String, String> map = c188727au.LIZ;
                o.LJIIIIZZ(map, "newBuilder()\n           …d)\n            .builder()");
                C36222EJm.LIZIZ(g2h, map);
                G2I LIZ2 = G2E.LIZ(EnumC40761FzB.JOURNEY_INTERESTS_ID);
                if (LIZ2 != null) {
                    g2j2 = LIZ2.LJLJJLL;
                }
                G2E.LIZIZ(g2j2);
                return;
            }
            o.LJIJI("bottomSkip");
            throw null;
        }
        o.LJIJI("rightNext");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final void Jl(int i, String str, String selectData) {
        TopicInterestAdapter topicInterestAdapter;
        int i2;
        List<TopicInterestCategoryItemStruct> list;
        TopicInterestCategoryItemStruct topicInterestCategoryItemStruct;
        String str2;
        o.LJIIIZ(selectData, "selectData");
        if (isViewValid() && Gl().getAdapter() != null) {
            AbstractC029409q adapter = Gl().getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter");
            topicInterestAdapter = (TopicInterestAdapter) adapter;
        } else {
            topicInterestAdapter = null;
        }
        G2H g2h = G2H.EXIT_INTEREST_SELECTION;
        String str3 = this.LJLLLL;
        if (str3 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLJ;
            C40864G2a visibleCategoryTracking = this.LLF;
            o.LJIIIZ(visibleCategoryTracking, "visibleCategoryTracking");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int i3 = visibleCategoryTracking.LIZ;
            if (i3 >= 0) {
                int i4 = 0;
                while (true) {
                    if (topicInterestAdapter != null) {
                        List<TopicInterestCategoryStruct> list2 = topicInterestAdapter.LJLILLLLZI;
                        if (list2 != null) {
                            if (list2.isEmpty() || i4 >= list2.size()) {
                                break;
                            }
                            linkedHashSet2.add(((TopicInterestCategoryStruct) ListProtector.get(list2, i4)).id);
                            if (!visibleCategoryTracking.LIZIZ.isEmpty()) {
                                int size = visibleCategoryTracking.LIZIZ.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    List<TopicInterestCategoryItemStruct> list3 = ((TopicInterestCategoryStruct) ListProtector.get(list2, i4)).topics;
                                    if (list3 != null) {
                                        i2 = list3.size();
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i5 < i2 && (list = ((TopicInterestCategoryStruct) ListProtector.get(list2, i4)).topics) != null && (topicInterestCategoryItemStruct = (TopicInterestCategoryItemStruct) ListProtector.get(list, i5)) != null && (str2 = topicInterestCategoryItemStruct.id) != null) {
                                        linkedHashSet.add(str2);
                                    }
                                }
                            }
                        }
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str3);
            c188727au.LJ(elapsedRealtime, "duration");
            c188727au.LJIIIZ("exit_method", str);
            c188727au.LJIIIZ("interests_list", selectData);
            StringBuilder sb = new StringBuilder();
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    int i7 = i6 + 1;
                    sb.append((String) it.next());
                    if (i6 != linkedHashSet.size() - 1) {
                        sb.append(",");
                    }
                    i6 = i7;
                }
                c188727au.LIZLLL(linkedHashSet.size(), "topic_cnt");
                c188727au.LJI("topic_show_list", sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            if (!linkedHashSet2.isEmpty()) {
                Iterator it2 = linkedHashSet2.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    int i9 = i8 + 1;
                    sb2.append((String) it2.next());
                    if (i8 != linkedHashSet2.size() - 1) {
                        sb2.append(",");
                    }
                    i8 = i9;
                }
                c188727au.LIZLLL(linkedHashSet2.size(), "interests_cnt");
                c188727au.LJI("interests_show_list", sb2.toString());
            }
            Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
            if (LIZIZ != null) {
                c188727au.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
            }
            c188727au.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
            c188727au.LJIIIZ("user_type", (String) this.LJZI.getValue());
            c188727au.LIZLLL(i, "select_interest_cnt");
            c188727au.LIZLLL(this.LJLLLLLL, "icon_fully_loaded");
            C36222EJm.LIZ(c188727au);
            Map<String, String> mobInterestSelectorExitEvent$lambda$1 = c188727au.LIZ;
            o.LJIIIIZZ(mobInterestSelectorExitEvent$lambda$1, "mobInterestSelectorExitEvent$lambda$1");
            V2B.LJIJ(mobInterestSelectorExitEvent$lambda$1);
            C36222EJm.LIZIZ(g2h, mobInterestSelectorExitEvent$lambda$1);
            return;
        }
        o.LJIJI("enterFrom");
        throw null;
    }
}
