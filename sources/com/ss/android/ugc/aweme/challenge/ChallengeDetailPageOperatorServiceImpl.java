package com.ss.android.ugc.aweme.challenge;

import X.C55524Lqi;
import X.C55525Lqj;
import X.C55526Lqk;
import X.InterfaceC50422Jqc;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class ChallengeDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_discovery_challenge", new C55525Lqj());
        hashMap.put("from_challenge", new C55526Lqk());
        hashMap.put("from_search_recalled_challenge", new C55524Lqi());
        return hashMap;
    }
}
