package com.ss.android.ugc.aweme.story.feed.detail;

import X.C55472Lps;
import X.C55473Lpt;
import X.C55474Lpu;
import X.C55476Lpw;
import X.InterfaceC50422Jqc;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class StoryDefaultOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("STORY_ENTRANCE_DEFAULT", new C55472Lps());
        hashMap.put("STORY_ENTRANCE_COMMON", new C55474Lpu());
        hashMap.put("STORY_ENTRANCE_WIDGET", new C55476Lpw());
        C55473Lpt c55473Lpt = new C55473Lpt();
        hashMap.put("STORY_ENTRANCE_MINE", c55473Lpt);
        hashMap.put("STORY_ENTRANCE_OTHER", c55473Lpt);
        hashMap.put("STORY_ENTRANCE_AVATAR", c55473Lpt);
        hashMap.put("STORY_ENTRANCE_PREVIEW", c55473Lpt);
        return hashMap;
    }
}
