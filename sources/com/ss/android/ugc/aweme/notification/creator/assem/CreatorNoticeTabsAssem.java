package com.ss.android.ugc.aweme.notification.creator.assem;

import X.C141335gf;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C2WH;
import X.C3C5;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.MT7;
import X.MUU;
import X.TBT;
import X.V1B;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.creator.model.TabSortCacheModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNoticeTabsAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public LinearLayoutManager LJLJI;
    public final C5H3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public CreatorNoticeTabsAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeTabVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 378), MUU.INSTANCE, null);
        this.LJLJJI = V1B.LJZI(new AqS159S0100000_9(this, 379));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 377));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        List<TabSortCacheModel> LIZIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        try {
            C2WH.LIZ.clear();
            String string = C2WH.LIZ().getString("sort_ids", "");
            if (string != null && string.length() != 0 && (LIZIZ = JsonParseUtils.LIZIZ(TabSortCacheModel.class, string)) != null) {
                for (TabSortCacheModel tabSortCacheModel : LIZIZ) {
                    if (tabSortCacheModel != null && tabSortCacheModel.sortType > 0 && tabSortCacheModel.tabId > 0) {
                        C2WH.LIZ.add(tabSortCacheModel);
                    }
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        ((CreatorNoticeTabVM) this.LJLIL.getValue()).gv0(MT7.FIRST_REQUEST);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.MUS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT8) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), null, null, new AqS175S0100000_9(this, 154), 12, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.MUT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((MT8) obj).LJLILLLLZI);
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 33), 4);
    }
}
