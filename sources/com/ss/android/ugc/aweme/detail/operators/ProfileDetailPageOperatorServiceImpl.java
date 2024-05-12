package com.ss.android.ugc.aweme.detail.operators;

import X.C55532Lqq;
import X.C55533Lqr;
import X.InterfaceC50422Jqc;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class ProfileDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_profile_self", new C55532Lqq());
        hashMap.put("from_profile_other", new C55533Lqr());
        return hashMap;
    }
}
