package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C00F;
import X.C109824Ss;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C26009AIr;
import X.C26013AIv;
import X.C26015AIx;
import X.C29S;
import X.C32151Nz;
import X.C33Q;
import X.C35513Dwj;
import X.C38683FGd;
import X.C3C5;
import X.C3C8;
import X.C46442IKo;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51105K3x;
import X.C51106K3y;
import X.C51107K3z;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C72865Sij;
import X.C76800UCe;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.EnumC252729vw;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC50133Jlx;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.K41;
import X.K44;
import X.K47;
import X.KAK;
import X.KPL;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.RBX;
import X.SYL;
import X.TBV;
import X.TBW;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.filter.ActivityOptionStruct;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config.SearchUserFeedbackSettings;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.viewmodel.SearchFilterViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchBottomSheetFragment extends AmeBaseFragment implements KPL {
    public C252709vu LJLIL;
    public SYL LJLILLLLZI;
    public final C214298b3 LJLJI;
    public Map<String, String> LJLJJI;
    public String LJLJJL;
    public InterfaceC50133Jlx LJLJJLL;
    public C51105K3x LJLJL;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public SearchBottomSheetFragment() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchFilterViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 785);
        K41 k41 = K41.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), k41, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), k41, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        this.LJLJJL = "";
    }

    public final SearchFilterViewModel vl() {
        return (SearchFilterViewModel) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        OptionConfigParams LIZIZ;
        SubFilterOptionStruct subFilterOptionStruct;
        SubFilterOptionStruct subFilterOptionStruct2;
        SubFilterOptionStruct subFilterOptionStruct3;
        List<SubSwitchStruct> list;
        SubFilterOptionStruct subFilterOptionStruct4;
        SubFilterOptionStruct subFilterOptionStruct5;
        SubFilterOptionStruct subFilterOptionStruct6;
        String str;
        String str2;
        String str3;
        Resources resources;
        String string;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        SearchStateViewModel searchStateViewModel;
        String schema;
        String str4;
        boolean z;
        C26013AIv c26013AIv;
        FilterOptionStruct filterOptionStruct;
        FilterOptionStruct filterOptionStruct2;
        FilterOptionStruct filterOptionStruct3;
        OptionConfigParams optionConfigParams;
        FilterOptionStruct filterOptionStruct4;
        FilterOptionStruct filterOptionStruct5;
        OptionConfigParams optionConfigParams2;
        FilterOptionStruct filterOptionStruct6;
        Boolean hasShownResearchFilter;
        Map<String, String> requestInfo;
        OptionConfigParams optionConfigParams3;
        FilterOptionStruct filterOptionStruct7;
        FilterOptionStruct filterOptionStruct8;
        FilterOptionStruct filterOptionStruct9;
        FilterOptionStruct filterOptionStruct10;
        ActivityOptionStruct activityOptionStruct;
        FilterOptionStruct filterOptionStruct11;
        FilterOptionStruct filterOptionStruct12;
        FilterOptionStruct filterOptionStruct13;
        NextLiveData<Boolean> gv0;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        SearchFilterViewModel vl = vl();
        String searchTypeName = this.LJLJJL;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Map<String, String> map = this.LJLJJI;
        vl.getClass();
        o.LJIIIZ(searchTypeName, "searchTypeName");
        vl.LJLJLJ = searchTypeName;
        vl.LJLL = mo49getActivity;
        vl.LJLLI = map;
        SearchStartViewModel searchStartViewModel = (SearchStartViewModel) vl.LJLLILLLL.getValue();
        if (searchStartViewModel == null || (gv0 = searchStartViewModel.gv0()) == null || !o.LJ(gv0.getValue(), Boolean.FALSE)) {
            C51107K3z c51107K3z = C51107K3z.LIZ;
            if (mo49getActivity != null) {
                i = mo49getActivity.hashCode();
            } else {
                i = 0;
            }
            LIZIZ = c51107K3z.LIZIZ(i, searchTypeName);
        } else {
            LIZIZ = null;
        }
        vl.LJLJL = LIZIZ;
        if (LIZIZ != null && (filterOptionStruct13 = LIZIZ.filterOptionStruct) != null) {
            subFilterOptionStruct = filterOptionStruct13.getSelectOption();
        } else {
            subFilterOptionStruct = null;
        }
        OptionConfigParams optionConfigParams4 = vl.LJLJL;
        if (optionConfigParams4 != null && (filterOptionStruct12 = optionConfigParams4.sortTypeOptionStruct) != null) {
            subFilterOptionStruct2 = filterOptionStruct12.getSelectOption();
        } else {
            subFilterOptionStruct2 = null;
        }
        OptionConfigParams optionConfigParams5 = vl.LJLJL;
        if (optionConfigParams5 != null && (filterOptionStruct11 = optionConfigParams5.categoryOptionStruct) != null) {
            subFilterOptionStruct3 = filterOptionStruct11.getSelectOption();
        } else {
            subFilterOptionStruct3 = null;
        }
        OptionConfigParams optionConfigParams6 = vl.LJLJL;
        if (optionConfigParams6 != null && (activityOptionStruct = optionConfigParams6.activityTypeOptionStruct) != null) {
            list = activityOptionStruct.getActivitySelectOption();
        } else {
            list = null;
        }
        OptionConfigParams optionConfigParams7 = vl.LJLJL;
        if (optionConfigParams7 != null && (filterOptionStruct10 = optionConfigParams7.followerNumberOptionStruct) != null) {
            subFilterOptionStruct4 = filterOptionStruct10.getSelectOption();
        } else {
            subFilterOptionStruct4 = null;
        }
        OptionConfigParams optionConfigParams8 = vl.LJLJL;
        if (optionConfigParams8 != null && (filterOptionStruct9 = optionConfigParams8.profilesTypesOptionStruct) != null) {
            subFilterOptionStruct5 = filterOptionStruct9.getSelectOption();
        } else {
            subFilterOptionStruct5 = null;
        }
        OptionConfigParams optionConfigParams9 = vl.LJLJL;
        if (optionConfigParams9 != null && (filterOptionStruct8 = optionConfigParams9.otherPreferencesOption) != null) {
            subFilterOptionStruct6 = filterOptionStruct8.getSelectOption();
        } else {
            subFilterOptionStruct6 = null;
        }
        vl.LJLJLLL = new LinkedHashMap();
        if (list != null) {
            for (SubSwitchStruct subSwitchStruct : list) {
                Map<SubSwitchStruct, Boolean> map2 = vl.LJLJLLL;
                if (map2 != null) {
                    map2.put(subSwitchStruct, Boolean.valueOf(subSwitchStruct.isSelected()));
                }
            }
        }
        vl.setState(new K44(subFilterOptionStruct3, subFilterOptionStruct2, subFilterOptionStruct, subFilterOptionStruct4, subFilterOptionStruct5, subFilterOptionStruct6));
        SYL syl = (SYL) view.findViewById(R.id.isf);
        this.LJLILLLLZI = syl;
        String str5 = "";
        if (syl != null) {
            syl.LLLF.LJZL(FlowLayoutCell.class);
            syl.LLLF.LJZL(FilterTitleCell.class);
            syl.LLLF.LJZL(SearchUserFeedbackCell.class);
            C72808Sho<InterfaceC57784Mm4> state = syl.getState();
            SearchFilterViewModel vl2 = vl();
            vl2.getClass();
            ArrayList arrayList = new ArrayList();
            if (!o.LJ(vl2.LJLJLJ, KAK.SOUND.getTabName()) && (optionConfigParams3 = vl2.LJLJL) != null && (filterOptionStruct7 = optionConfigParams3.sortTypeOptionStruct) != null) {
                String title = filterOptionStruct7.getTitle();
                if (title == null) {
                    title = "";
                }
                vl2.LJLIL = title;
                SearchFilterViewModel.gv0(arrayList, filterOptionStruct7);
            }
            if (C00F.LIZ(31744, 0, "search_filter_activity", true) > 0 && ((RBX) HG3.LJIILL()).isLogin() && (optionConfigParams2 = vl2.LJLJL) != null && (filterOptionStruct6 = optionConfigParams2.categoryOptionStruct) != null) {
                String title2 = filterOptionStruct6.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                vl2.LJLILLLLZI = title2;
                String title3 = filterOptionStruct6.getTitle();
                if (title3 == null) {
                    title3 = "";
                }
                arrayList.add(new C35513Dwj(title3));
                List<SubFilterOptionStruct> optionStuct = filterOptionStruct6.getOptionStuct();
                if (optionStuct != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (SubFilterOptionStruct subFilterOptionStruct7 : optionStuct) {
                        SubFilterOptionStruct subFilterOptionStruct8 = subFilterOptionStruct7;
                        C50651JuJ c50651JuJ = C50652JuK.Companion;
                        ActivityC45651qj activityC45651qj = vl2.LJLL;
                        c50651JuJ.getClass();
                        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(activityC45651qj);
                        if (LJIIJJI != null && (hasShownResearchFilter = LJIIJJI.getHasShownResearchFilter()) != null && hasShownResearchFilter.booleanValue() && o.LJ(vl2.LJLJLJ, KAK.TOP.getTabName()) && (requestInfo = subFilterOptionStruct8.getRequestInfo()) != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, String> entry : requestInfo.entrySet()) {
                                if (o.LJ(entry.getKey(), "is_watched") || o.LJ(entry.getKey(), "is_unwatched")) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                            }
                        }
                        arrayList2.add(subFilterOptionStruct7);
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        SubFilterOptionStruct subFilterOptionStruct9 = (SubFilterOptionStruct) it.next();
                        String title4 = filterOptionStruct6.getTitle();
                        if (title4 == null) {
                            title4 = "";
                        }
                        arrayList.add(new K47(subFilterOptionStruct9, title4));
                    }
                }
            }
            OptionConfigParams optionConfigParams10 = vl2.LJLJL;
            if (optionConfigParams10 != null && (filterOptionStruct5 = optionConfigParams10.filterOptionStruct) != null) {
                String title5 = filterOptionStruct5.getTitle();
                if (title5 == null) {
                    title5 = "";
                }
                vl2.LJLJI = title5;
                SearchFilterViewModel.gv0(arrayList, filterOptionStruct5);
            }
            if (o.LJ(vl2.LJLJLJ, KAK.SOUND.getTabName()) && (optionConfigParams = vl2.LJLJL) != null && (filterOptionStruct4 = optionConfigParams.sortTypeOptionStruct) != null) {
                String title6 = filterOptionStruct4.getTitle();
                if (title6 == null) {
                    title6 = "";
                }
                vl2.LJLIL = title6;
                SearchFilterViewModel.gv0(arrayList, filterOptionStruct4);
            }
            OptionConfigParams optionConfigParams11 = vl2.LJLJL;
            if (optionConfigParams11 != null && (filterOptionStruct3 = optionConfigParams11.followerNumberOptionStruct) != null) {
                String title7 = filterOptionStruct3.getTitle();
                if (title7 == null) {
                    title7 = "";
                }
                vl2.LJLJJI = title7;
                SearchFilterViewModel.gv0(arrayList, filterOptionStruct3);
            }
            OptionConfigParams optionConfigParams12 = vl2.LJLJL;
            if (optionConfigParams12 != null && (filterOptionStruct2 = optionConfigParams12.profilesTypesOptionStruct) != null) {
                String title8 = filterOptionStruct2.getTitle();
                if (title8 == null) {
                    title8 = "";
                }
                vl2.LJLJJL = title8;
                SearchFilterViewModel.gv0(arrayList, filterOptionStruct2);
            }
            OptionConfigParams optionConfigParams13 = vl2.LJLJL;
            if (optionConfigParams13 != null && (filterOptionStruct = optionConfigParams13.otherPreferencesOption) != null) {
                String title9 = filterOptionStruct.getTitle();
                if (title9 == null) {
                    title9 = "";
                }
                vl2.LJLJJLL = title9;
                SearchFilterViewModel.gv0(arrayList, filterOptionStruct);
            }
            SearchUserFeedbackSettings.Feedback LIZ = SearchUserFeedbackSettings.LIZ(vl2.LJLJLJ);
            if (LIZ != null && (schema = LIZ.getSchema()) != null) {
                Map<String, String> map3 = vl2.LJLLI;
                if (map3 != null) {
                    str4 = map3.get("search_type");
                } else {
                    str4 = null;
                }
                if (!o.LJ(str4, "music_create") && (C26015AIx.LIZLLL() || ((C26009AIr.LJJIZ() == 1 || C26009AIr.LJJIZ() == 2) && C46442IKo.LIZ()))) {
                    z = true;
                } else {
                    z = false;
                }
                if (schema.length() != 0 && !z) {
                    if (vl2.LJLJL != null) {
                        c26013AIv = new C26013AIv(new C38683FGd(schema), vl2.LJLLI, true);
                    } else {
                        c26013AIv = new C26013AIv(new C38683FGd(schema), vl2.LJLLI, false);
                    }
                    arrayList.add(c26013AIv);
                }
            }
            state.LJ(arrayList);
        }
        this.LJLIL = (C252709vu) view.findViewById(R.id.l_2);
        if (vl().LJLJL == null) {
            C252709vu c252709vu = this.LJLIL;
            if (c252709vu != null) {
                c252709vu.setVisibility(8);
            }
        } else {
            C252709vu c252709vu2 = this.LJLIL;
            if (c252709vu2 != null) {
                c252709vu2.setVisibility(0);
            }
            C235119Kp c235119Kp = new C235119Kp();
            AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
            C234509Ig c234509Ig = new C234509Ig();
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 == null || (resources4 = mo49getActivity2.getResources()) == null || (str = resources4.getString(R.string.cgf)) == null) {
                str = "";
            }
            c234509Ig.LIZJ = str;
            c234509Ig.LJ = true;
            c234509Ig.LIZ(EnumC252729vw.SECONDARY);
            c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 1264));
            abstractC234519IhArr[0] = c234509Ig;
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, abstractC234519IhArr);
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 == null || (resources3 = mo49getActivity3.getResources()) == null || (str2 = resources3.getString(R.string.ii5)) == null) {
                str2 = "";
            }
            LIZLLL.LIZJ = str2;
            c235119Kp.LIZJ = LIZLLL;
            AbstractC234519Ih[] abstractC234519IhArr2 = new AbstractC234519Ih[1];
            C234509Ig c234509Ig2 = new C234509Ig();
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            if (mo49getActivity4 == null || (resources2 = mo49getActivity4.getResources()) == null || (str3 = resources2.getString(R.string.bsb)) == null) {
                str3 = "";
            }
            c234509Ig2.LIZJ = str3;
            c234509Ig2.LJ = false;
            ActivityC45651qj mo49getActivity5 = mo49getActivity();
            if (mo49getActivity5 != null && (resources = mo49getActivity5.getResources()) != null && (string = resources.getString(R.string.bsb)) != null) {
                str5 = string;
            }
            c234509Ig2.LIZIZ = str5;
            c234509Ig2.LIZ = new C109824Ss(new C51106K3y(this));
            abstractC234519IhArr2[0] = c234509Ig2;
            c235119Kp.LIZIZ(abstractC234519IhArr2);
            C252709vu c252709vu3 = this.LJLIL;
            if (c252709vu3 != null) {
                c252709vu3.setNavActions(c235119Kp);
            }
            C8YN.LJII(this, vl(), new TBV() { // from class: X.K43
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((K42) obj).LJLJL);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((K42) obj).LJLJL = ((Boolean) obj2).booleanValue();
                }
            }, null, new AqS186S0100000_4(this, 341), 6);
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.LLIZ(0);
        flexboxLayoutManager.LLIZLLLIL(1);
        flexboxLayoutManager.LLJ(0);
        SYL syl2 = this.LJLILLLLZI;
        o.LJII(syl2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        syl2.setLayoutManager(flexboxLayoutManager);
        C72865Sij c72865Sij = new C72865Sij(getContext());
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicHeight(LJJIIZ);
        shapeDrawable.setIntrinsicWidth(0);
        c72865Sij.LJLIL = shapeDrawable;
        SYL syl3 = this.LJLILLLLZI;
        if (syl3 != null) {
            syl3.LJII(c72865Sij, -1);
        }
        SYL syl4 = this.LJLILLLLZI;
        if (syl4 != null) {
            syl4.setPaddingRelative(C7MY.LIZIZ(16), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0);
        }
        C252709vu c252709vu4 = this.LJLIL;
        if (c252709vu4 != null) {
            c252709vu4.LJIILJJIL(true);
        }
        ActivityC45651qj mo49getActivity6 = mo49getActivity();
        if (mo49getActivity6 != null && (searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity6).get(SearchStateViewModel.class)) != null) {
            searchStateViewModel.setShowingFilters(true);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cfu, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
