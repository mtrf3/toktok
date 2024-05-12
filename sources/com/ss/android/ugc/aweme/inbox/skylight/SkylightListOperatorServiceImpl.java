package com.ss.android.ugc.aweme.inbox.skylight;

import X.C53339KwZ;
import X.C7U3;
import X.L2P;
import X.M8P;
import X.M8Q;
import X.M8R;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class SkylightListOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        C7U3 m8r = new M8R();
        M8Q m8q = new M8Q();
        M8P m8p = new M8P();
        if (C53339KwZ.LJ()) {
            m8r = m8p;
        } else if (L2P.LIZ()) {
            m8r = m8q;
        }
        hashMap.put("STORY_ENTRANCE_INBOX_TOP_LIST", m8r);
        return hashMap;
    }
}
