package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.filter.ActivityOptionStruct;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui.SearchBottomSheetFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.viewmodel.SearchFilterViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.K3y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51106K3y extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ SearchBottomSheetFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51106K3y(SearchBottomSheetFragment searchBottomSheetFragment) {
        super(0);
        this.LJLIL = searchBottomSheetFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        SubFilterOptionStruct subFilterOptionStruct;
        SubFilterOptionStruct subFilterOptionStruct2;
        List<SubSwitchStruct> list;
        SubFilterOptionStruct subFilterOptionStruct3;
        SubFilterOptionStruct subFilterOptionStruct4;
        SubFilterOptionStruct subFilterOptionStruct5;
        OptionConfigParams optionConfigParams;
        SubFilterOptionStruct categoryOption;
        SubFilterOptionStruct followerNumberOption;
        SubFilterOptionStruct profilesTypesOption;
        SubFilterOptionStruct otherPreferencesOption;
        boolean z;
        ActivityOptionStruct activityOptionStruct;
        java.util.Map<String, String> map;
        java.util.Map<String, String> linkedHashMap;
        java.util.Map<String, String> linkedHashMap2;
        java.util.Map<String, String> linkedHashMap3;
        java.util.Map<String, String> linkedHashMap4;
        java.util.Map<String, String> linkedHashMap5;
        java.util.Map<String, String> linkedHashMap6;
        String str;
        java.util.Map<String, String> requestInfo;
        java.util.Map<String, String> requestInfo2;
        FilterOptionStruct filterOptionStruct;
        FilterOptionStruct filterOptionStruct2;
        FilterOptionStruct filterOptionStruct3;
        FilterOptionStruct filterOptionStruct4;
        ActivityOptionStruct activityOptionStruct2;
        FilterOptionStruct filterOptionStruct5;
        FilterOptionStruct filterOptionStruct6;
        FilterOptionStruct filterOptionStruct7;
        FilterOptionStruct filterOptionStruct8;
        FilterOptionStruct filterOptionStruct9;
        FilterOptionStruct filterOptionStruct10;
        ActivityOptionStruct activityOptionStruct3;
        FilterOptionStruct filterOptionStruct11;
        FilterOptionStruct filterOptionStruct12;
        SearchBottomSheetFragment searchBottomSheetFragment = this.LJLIL;
        SearchFilterViewModel vl = searchBottomSheetFragment.vl();
        K42 state = vl.getVmDispatcher().getState();
        OptionConfigParams optionConfigParams2 = vl.LJLJL;
        if (optionConfigParams2 != null && (filterOptionStruct12 = optionConfigParams2.filterOptionStruct) != null) {
            filterOptionStruct12.selectOption(state.LJLJI);
        }
        OptionConfigParams optionConfigParams3 = vl.LJLJL;
        if (optionConfigParams3 != null && (filterOptionStruct11 = optionConfigParams3.sortTypeOptionStruct) != null) {
            filterOptionStruct11.selectOption(state.LJLILLLLZI);
        }
        java.util.Map<SubSwitchStruct, Boolean> map2 = vl.LJLJLLL;
        if (map2 != null) {
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                SubSwitchStruct subSwitchStruct = (SubSwitchStruct) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                OptionConfigParams optionConfigParams4 = vl.LJLJL;
                if (optionConfigParams4 != null && (activityOptionStruct3 = optionConfigParams4.activityTypeOptionStruct) != null) {
                    activityOptionStruct3.selectOption(subSwitchStruct, booleanValue);
                }
            }
        }
        OptionConfigParams optionConfigParams5 = vl.LJLJL;
        if (optionConfigParams5 != null && (filterOptionStruct10 = optionConfigParams5.categoryOptionStruct) != null) {
            filterOptionStruct10.selectOption(state.LJLIL);
        }
        OptionConfigParams optionConfigParams6 = vl.LJLJL;
        if (optionConfigParams6 != null && (filterOptionStruct9 = optionConfigParams6.followerNumberOptionStruct) != null) {
            filterOptionStruct9.selectOption(state.LJLJJI);
        }
        OptionConfigParams optionConfigParams7 = vl.LJLJL;
        if (optionConfigParams7 != null && (filterOptionStruct8 = optionConfigParams7.profilesTypesOptionStruct) != null) {
            filterOptionStruct8.selectOption(state.LJLJJL);
        }
        OptionConfigParams optionConfigParams8 = vl.LJLJL;
        if (optionConfigParams8 != null && (filterOptionStruct7 = optionConfigParams8.otherPreferencesOption) != null) {
            filterOptionStruct7.selectOption(state.LJLJJLL);
        }
        SearchFilterViewModel vl2 = searchBottomSheetFragment.vl();
        vl2.getClass();
        C50287JoR c50287JoR = new C50287JoR();
        OptionConfigParams optionConfigParams9 = vl2.LJLJL;
        SubFilterOptionStruct subFilterOptionStruct6 = null;
        if (optionConfigParams9 != null && (filterOptionStruct6 = optionConfigParams9.filterOptionStruct) != null) {
            subFilterOptionStruct = filterOptionStruct6.getSelectOption();
        } else {
            subFilterOptionStruct = null;
        }
        OptionConfigParams optionConfigParams10 = vl2.LJLJL;
        if (optionConfigParams10 != null && (filterOptionStruct5 = optionConfigParams10.sortTypeOptionStruct) != null) {
            subFilterOptionStruct2 = filterOptionStruct5.getSelectOption();
        } else {
            subFilterOptionStruct2 = null;
        }
        OptionConfigParams optionConfigParams11 = vl2.LJLJL;
        if (optionConfigParams11 != null && (activityOptionStruct2 = optionConfigParams11.activityTypeOptionStruct) != null) {
            list = activityOptionStruct2.getActivitySelectOption();
        } else {
            list = null;
        }
        OptionConfigParams optionConfigParams12 = vl2.LJLJL;
        if (optionConfigParams12 != null && (filterOptionStruct4 = optionConfigParams12.categoryOptionStruct) != null) {
            subFilterOptionStruct3 = filterOptionStruct4.getSelectOption();
        } else {
            subFilterOptionStruct3 = null;
        }
        c50287JoR.setCategoryOption(subFilterOptionStruct3);
        OptionConfigParams optionConfigParams13 = vl2.LJLJL;
        if (optionConfigParams13 != null && (filterOptionStruct3 = optionConfigParams13.followerNumberOptionStruct) != null) {
            subFilterOptionStruct4 = filterOptionStruct3.getSelectOption();
        } else {
            subFilterOptionStruct4 = null;
        }
        c50287JoR.setFollowerNumberOption(subFilterOptionStruct4);
        OptionConfigParams optionConfigParams14 = vl2.LJLJL;
        if (optionConfigParams14 != null && (filterOptionStruct2 = optionConfigParams14.profilesTypesOptionStruct) != null) {
            subFilterOptionStruct5 = filterOptionStruct2.getSelectOption();
        } else {
            subFilterOptionStruct5 = null;
        }
        c50287JoR.setProfilesTypesOption(subFilterOptionStruct5);
        OptionConfigParams optionConfigParams15 = vl2.LJLJL;
        if (optionConfigParams15 != null && (filterOptionStruct = optionConfigParams15.otherPreferencesOption) != null) {
            subFilterOptionStruct6 = filterOptionStruct.getSelectOption();
        }
        c50287JoR.setOtherPreferencesOption(subFilterOptionStruct6);
        c50287JoR.setFromSchema(false);
        if (subFilterOptionStruct2 != null && (requestInfo2 = subFilterOptionStruct2.getRequestInfo()) != null) {
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            for (Map.Entry<String, String> entry2 : requestInfo2.entrySet()) {
                if (o.LJ(entry2.getKey(), "sort_type")) {
                    linkedHashMap7.put(entry2.getKey(), entry2.getValue());
                }
            }
            Collection values = linkedHashMap7.values();
            if (values != null) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    c50287JoR.setSortType(CastIntegerProtector.parseInt((String) it.next()));
                }
            }
        }
        if (subFilterOptionStruct != null && (requestInfo = subFilterOptionStruct.getRequestInfo()) != null) {
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            for (Map.Entry<String, String> entry3 : requestInfo.entrySet()) {
                if (o.LJ(entry3.getKey(), "publish_time") || o.LJ(entry3.getKey(), "filter_by")) {
                    linkedHashMap8.put(entry3.getKey(), entry3.getValue());
                }
            }
            Collection values2 = linkedHashMap8.values();
            if (values2 != null) {
                Iterator it2 = values2.iterator();
                while (it2.hasNext()) {
                    c50287JoR.setFilterBy(CastIntegerProtector.parseInt((String) it2.next()));
                }
            }
        }
        c50287JoR.setSortTypeStruct(subFilterOptionStruct2);
        c50287JoR.setFilterByStruct(subFilterOptionStruct);
        c50287JoR.setActivitySwitchOption(list);
        if ((subFilterOptionStruct2 == null || subFilterOptionStruct2.isDefaultOption()) && ((subFilterOptionStruct == null || subFilterOptionStruct.isDefaultOption()) && (((optionConfigParams = vl2.LJLJL) == null || (activityOptionStruct = optionConfigParams.activityTypeOptionStruct) == null || activityOptionStruct.isDefault()) && (((categoryOption = c50287JoR.getCategoryOption()) == null || categoryOption.isDefaultOption()) && (((followerNumberOption = c50287JoR.getFollowerNumberOption()) == null || followerNumberOption.isDefaultOption()) && (((profilesTypesOption = c50287JoR.getProfilesTypesOption()) == null || profilesTypesOption.isDefaultOption()) && ((otherPreferencesOption = c50287JoR.getOtherPreferencesOption()) == null || otherPreferencesOption.isDefaultOption()))))))) {
            z = true;
        } else {
            z = false;
        }
        c50287JoR.setDefaultOption(z);
        InterfaceC50133Jlx interfaceC50133Jlx = searchBottomSheetFragment.LJLJJLL;
        if (interfaceC50133Jlx != null) {
            interfaceC50133Jlx.LIZIZ(c50287JoR);
        }
        InterfaceC50133Jlx interfaceC50133Jlx2 = searchBottomSheetFragment.LJLJJLL;
        if (interfaceC50133Jlx2 != null) {
            interfaceC50133Jlx2.LIZ(c50287JoR);
        }
        if (searchBottomSheetFragment.LJLJL != null && (map = searchBottomSheetFragment.LJLJJI) != null && !map.isEmpty()) {
            K45 k45 = new K45();
            o.LJI(map);
            k45.LJIILLIIL(map);
            SubFilterOptionStruct filterByStruct = c50287JoR.getFilterByStruct();
            if (filterByStruct == null || (linkedHashMap = filterByStruct.getLogInfo()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            k45.LJIILLIIL(linkedHashMap);
            SubFilterOptionStruct categoryOption2 = c50287JoR.getCategoryOption();
            if (categoryOption2 == null || (linkedHashMap2 = categoryOption2.getLogInfo()) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            k45.LJIILLIIL(linkedHashMap2);
            SubFilterOptionStruct sortTypeStruct = c50287JoR.getSortTypeStruct();
            if (sortTypeStruct == null || (linkedHashMap3 = sortTypeStruct.getLogInfo()) == null) {
                linkedHashMap3 = new LinkedHashMap<>();
            }
            k45.LJIILLIIL(linkedHashMap3);
            SubFilterOptionStruct followerNumberOption2 = c50287JoR.getFollowerNumberOption();
            if (followerNumberOption2 == null || (linkedHashMap4 = followerNumberOption2.getLogInfo()) == null) {
                linkedHashMap4 = new LinkedHashMap<>();
            }
            k45.LJIILLIIL(linkedHashMap4);
            SubFilterOptionStruct profilesTypesOption2 = c50287JoR.getProfilesTypesOption();
            if (profilesTypesOption2 == null || (linkedHashMap5 = profilesTypesOption2.getLogInfo()) == null) {
                linkedHashMap5 = new LinkedHashMap<>();
            }
            k45.LJIILLIIL(linkedHashMap5);
            SubFilterOptionStruct otherPreferencesOption2 = c50287JoR.getOtherPreferencesOption();
            if (otherPreferencesOption2 == null || (linkedHashMap6 = otherPreferencesOption2.getLogInfo()) == null) {
                linkedHashMap6 = new LinkedHashMap<>();
            }
            k45.LJIILLIIL(linkedHashMap6);
            List<SubSwitchStruct> activitySwitchOption = c50287JoR.getActivitySwitchOption();
            if (activitySwitchOption != null) {
                for (SubSwitchStruct subSwitchStruct2 : activitySwitchOption) {
                    String logInfo = subSwitchStruct2.getLogInfo();
                    if (subSwitchStruct2.isSelected()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    k45.LIZLLL(logInfo, str);
                }
            }
            k45.LJIILIIL();
        }
        ASQ.LJ(this.LJLIL, ASX.LIZ);
        return C76800UCe.LIZ;
    }
}
