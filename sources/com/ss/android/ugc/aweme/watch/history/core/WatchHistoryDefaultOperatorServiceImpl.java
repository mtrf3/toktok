package com.ss.android.ugc.aweme.watch.history.core;

import X.C7U3;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WatchHistoryDefaultOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        hashMap.put("WATCH_HISTORY_LIST_ENTRANCE", new C7U3() { // from class: X.7aK
            @Override // X.C7U3
            public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
                o.LJIIIZ(param, "param");
                return new OSZ<>("account_history", WatchHistoryListViewModel.class);
            }
        });
        return hashMap;
    }
}
