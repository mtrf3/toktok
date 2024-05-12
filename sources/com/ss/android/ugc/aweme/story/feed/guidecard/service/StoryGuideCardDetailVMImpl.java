package com.ss.android.ugc.aweme.story.feed.guidecard.service;

import X.C7U3;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardDetailVMImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        hashMap.put("STORY_ENTRANCE_GUIDE_CARD", new C7U3() { // from class: X.8lc
            @Override // X.C7U3
            public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
                o.LJIIIZ(param, "param");
                String storyGuideCardKey = param.getStoryGuideCardKey();
                if (storyGuideCardKey == null) {
                    storyGuideCardKey = "";
                }
                return new OSZ<>(C210408No.LIZ(storyGuideCardKey), StoryGuideCardViewModel.class);
            }
        });
        return hashMap;
    }
}
