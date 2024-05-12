package com.ss.android.ugc.aweme.upvote.detail.repostlist;

import X.C7U3;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RepostedOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        hashMap.put("REPOSTED_LIST_ENTRANCE", new C7U3() { // from class: X.7U0
            @Override // X.C7U3
            public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
                o.LJIIIZ(param, "param");
                return new OSZ<>(C7HV.LIZIZ.LJIIZILJ(param.getEventType()), RepostListViewModel.class);
            }
        });
        return hashMap;
    }
}
