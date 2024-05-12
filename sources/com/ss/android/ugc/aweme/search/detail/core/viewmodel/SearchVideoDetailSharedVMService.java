package com.ss.android.ugc.aweme.search.detail.core.viewmodel;

import X.C7U3;
import X.M8N;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class SearchVideoDetailSharedVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        hashMap.put("from_search_activity", new M8N());
        return hashMap;
    }
}
