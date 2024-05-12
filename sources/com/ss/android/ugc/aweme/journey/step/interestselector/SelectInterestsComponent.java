package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.AbstractC029409q;
import X.AbstractC39351FcR;
import X.C0A2;
import X.C0A6;
import X.C188727au;
import X.C235119Kp;
import X.C252709vu;
import X.C35656Dz2;
import X.C35878E6g;
import X.C36222EJm;
import X.C38986FRu;
import X.C39032FTo;
import X.C40788Fzc;
import X.C40865G2b;
import X.C56662Kg;
import X.C61878OQg;
import X.C63081OpJ;
import X.C76732zl;
import X.C770830u;
import X.C7FC;
import X.C9KF;
import X.E6T;
import X.EnumC40761FzB;
import X.G2E;
import X.G2H;
import X.G2I;
import X.G2J;
import X.G2T;
import X.G2Z;
import X.G30;
import X.ORZ;
import X.OSZ;
import X.V2B;
import Y.ARunnableS25S0200000_6;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.e;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.journey.SelectedInterestList;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SelectInterestsComponent extends AbstractSelectInterestFragment {
    public FlexboxLayoutManager LLF;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public List<NewUserInterestStruct> LLD = C61878OQg.INSTANCE;

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final String Il() {
        return "category";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFF;
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
        return "b6658";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final int getLayout() {
        return R.layout.ber;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public SelectInterestsComponent() {
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
        return new G2Z(this);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final C39032FTo Kl() {
        AbstractC029409q adapter = Gl().getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
        G30 g30 = (G30) adapter;
        List LLJI = ORZ.LLJI(g30.LJLJJLL);
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        Iterator it = LLJI.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            int intValue = ((Number) it.next()).intValue();
            NewUserInterestStruct newUserInterestStruct = (NewUserInterestStruct) ListProtector.get(g30.LJLILLLLZI, intValue);
            NewUserInterestStruct newUserInterestStruct2 = new NewUserInterestStruct(newUserInterestStruct.id, null, null, null, null, null, 56, null);
            JSONObject LIZLLL = C770830u.LIZLLL("select_rank", i);
            LIZLLL.put("show_rank", intValue + 1).put("interest", newUserInterestStruct.id).put("category", newUserInterestStruct.id);
            jSONArray.put(LIZLLL);
            linkedList.add(newUserInterestStruct2);
        }
        OSZ osz = new OSZ(linkedList, jSONArray);
        AbstractC39351FcR LIZ = C38986FRu.LIZ();
        List interestIdList = (List) osz.getFirst();
        int elapsedRealtime = (int) (((SystemClock.elapsedRealtime() - this.LJLJL) + this.LJLJLLL) / 1000);
        o.LJIIIZ(interestIdList, "interestIdList");
        e eVar = new e();
        eVar.LJIIL = false;
        String json = GsonProtectorUtils.toJson(eVar.LIZ(), new SelectedInterestList(interestIdList, Integer.valueOf(LIZ.LIZJ), Integer.valueOf(elapsedRealtime), null, 8, null));
        LIZ.LIZIZ = json;
        if (json == null) {
            json = "";
        }
        String jSONArray2 = ((JSONArray) osz.getSecond()).toString();
        o.LJIIIIZZ(jSONArray2, "pair.second.toString()");
        return new C39032FTo(json, jSONArray2, ((JSONArray) osz.getSecond()).length(), 8);
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
        List<NewUserInterestStruct> list;
        String str;
        C40788Fzc c40788Fzc;
        super.Al();
        C35878E6g.LIZ();
        C35656Dz2 wl = wl();
        if (!(wl instanceof C40788Fzc) || (c40788Fzc = (C40788Fzc) wl) == null || (list = c40788Fzc.LIZLLL) == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LLD = list;
        this.LLF = new FlexboxLayoutManager(Gl().getContext(), 0);
        RecyclerView Gl = Gl();
        FlexboxLayoutManager flexboxLayoutManager = this.LLF;
        if (flexboxLayoutManager != null) {
            Gl.setLayoutManager(flexboxLayoutManager);
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = -1;
            Gl().LJIIJJI(new G2T(new C76732zl(), this, c76732zl, new C76732zl()));
            Gl().post(new ARunnableS25S0200000_6(new AqS153S0200000_6(c76732zl, this, 3), this, 9));
            Gl().setAdapter(new G30(this.LLD, this.LJZ, this.LJLJJLL, this.LJLZ));
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            C40865G2b c40865G2b = this.LJLJJLL;
            if (c40865G2b == null || (str = c40865G2b.LIZLLL) == null) {
                str = "";
            }
            c9kf.LIZJ = str;
            c235119Kp.LIZJ = c9kf;
            c252709vu.setNavActions(c235119Kp);
            return;
        }
        o.LJIJI("layoutManager");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final void Ll(boolean z) {
        String str;
        Dl().setEnabled(z);
        C40865G2b c40865G2b = this.LJLJJLL;
        String str2 = null;
        if (c40865G2b != null) {
            str = c40865G2b.LIZJ;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView Dl = Dl();
            C40865G2b c40865G2b2 = this.LJLJJLL;
            if (c40865G2b2 != null) {
                str2 = c40865G2b2.LIZJ;
            }
            Dl.setText(str2);
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
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_INTERESTS_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJLL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        TextView done = (TextView) _$_findCachedViewById(R.id.cex);
        o.LJIIIIZZ(done, "done");
        this.LJLLJ = done;
        TextView skip = (TextView) _$_findCachedViewById(R.id.k2f);
        o.LJIIIIZZ(skip, "skip");
        this.LJLLL = skip;
        super.onViewCreated(view, bundle);
        C7FC.LIZJ(Dl(), 0.75f);
        TextView textView = this.LJLLL;
        if (textView != null) {
            C7FC.LIZJ(textView, 0.75f);
            G2H g2h = G2H.INTEREST_SELECTION_DID_SHOW;
            C188727au c188727au = new C188727au();
            c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "duration_since_launch");
            Map<String, String> map = c188727au.LIZ;
            o.LJIIIIZZ(map, "newBuilder()\n           …n)\n            .builder()");
            C36222EJm.LIZIZ(g2h, map);
            G2I LIZ2 = G2E.LIZ(enumC40761FzB);
            if (LIZ2 != null) {
                g2j2 = LIZ2.LJLJJLL;
            }
            G2E.LIZIZ(g2j2);
            return;
        }
        o.LJIJI("finalSkip");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment
    public final void Jl(int i, String str, String selectData) {
        int i2;
        G30 g30;
        FlexboxLayoutManager flexboxLayoutManager;
        o.LJIIIZ(selectData, "selectData");
        if (!C63081OpJ.LLIIJLIL()) {
            i2 = -1;
        } else {
            i2 = this.LJLLLLLL;
        }
        if (isViewValid() && Gl().getAdapter() != null) {
            AbstractC029409q adapter = Gl().getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            g30 = (G30) adapter;
            C0A2 layoutManager = Gl().getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
        } else {
            g30 = null;
            flexboxLayoutManager = null;
        }
        G2H g2h = G2H.EXIT_INTEREST_SELECTION;
        String str2 = this.LJLLLL;
        if (str2 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLJ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str2);
            c188727au.LJ(elapsedRealtime, "duration");
            c188727au.LJIIIZ("exit_method", str);
            c188727au.LJIIIZ("interests_list", selectData);
            if (g30 != null) {
                StringBuilder sb = new StringBuilder();
                if (flexboxLayoutManager != null) {
                    int LLILII = flexboxLayoutManager.LLILII() - 1;
                    if (LLILII >= 0) {
                        int i3 = 0;
                        while (true) {
                            sb.append(((NewUserInterestStruct) ListProtector.get(g30.LJLILLLLZI, i3)).id);
                            if (i3 != LLILII) {
                                sb.append(",");
                            }
                            if (i3 == LLILII) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    c188727au.LIZLLL(LLILII + 1, "interests_cnt");
                    c188727au.LJI("interests_show_list", sb.toString());
                }
            }
            Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
            if (LIZIZ != null) {
                c188727au.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
            }
            c188727au.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
            c188727au.LJIIIZ("user_type", (String) this.LJZI.getValue());
            c188727au.LIZLLL(i, "select_interest_cnt");
            c188727au.LIZLLL(i2, "icon_fully_loaded");
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
