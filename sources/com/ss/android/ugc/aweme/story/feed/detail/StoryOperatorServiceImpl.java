package com.ss.android.ugc.aweme.story.feed.detail;

import X.C7U3;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        hashMap.put("STORY_ENTRANCE_ARCHIVE", new C7U3() { // from class: X.7U1
            @Override // X.C7U3
            public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
                o.LJIIIZ(param, "param");
                return new OSZ<>("story_arch_list", StoryArchListViewModel.class);
            }
        });
        return hashMap;
    }
}
