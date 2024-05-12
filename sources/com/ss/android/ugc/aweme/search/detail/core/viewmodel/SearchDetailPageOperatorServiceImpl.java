package com.ss.android.ugc.aweme.search.detail.core.viewmodel;

import X.C50413JqT;
import X.C50414JqU;
import X.C50415JqV;
import X.C50416JqW;
import X.C50417JqX;
import X.InterfaceC50422Jqc;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class SearchDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_search", new C50414JqU());
        hashMap.put("from_search_jedi", new C50417JqX());
        hashMap.put("from_search_mix", new C50413JqT());
        hashMap.put("from_search_continuous_loading_card", new C50415JqV());
        hashMap.put("from_search_continuous_play_card", new C50416JqW());
        return hashMap;
    }
}
