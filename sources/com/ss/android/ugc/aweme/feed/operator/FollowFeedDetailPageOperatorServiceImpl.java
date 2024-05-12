package com.ss.android.ugc.aweme.feed.operator;

import X.C55461Lph;
import X.C55462Lpi;
import X.InterfaceC50422Jqc;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class FollowFeedDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_following_sky_light", new C55462Lpi());
        hashMap.put("from_follow_page", new C55461Lph());
        return hashMap;
    }
}
