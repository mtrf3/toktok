package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.viewmodel;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C35513Dwj;
import X.C62822Ol8;
import X.K42;
import X.K47;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class SearchFilterViewModel extends AssemViewModel<K42> {
    public OptionConfigParams LJLJL;
    public Map<SubSwitchStruct, Boolean> LJLJLLL;
    public ActivityC45651qj LJLL;
    public Map<String, String> LJLLI;
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public String LJLJLJ = "";
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 244));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final K42 defaultState() {
        return new K42(0);
    }

    public static void gv0(List list, FilterOptionStruct filterOptionStruct) {
        String title = filterOptionStruct.getTitle();
        if (title == null) {
            title = "";
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C35513Dwj(title));
        List<SubFilterOptionStruct> optionStuct = filterOptionStruct.getOptionStuct();
        if (optionStuct != null) {
            for (SubFilterOptionStruct subFilterOptionStruct : optionStuct) {
                String title2 = filterOptionStruct.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                arrayList.add(new K47(subFilterOptionStruct, title2));
            }
        }
    }
}
