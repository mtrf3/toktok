package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public class FollowTabGuideStruct {

    @InterfaceC65349Pkn("follow_tab_guide_times")
    public Integer followTabGuideTimes;

    @InterfaceC65349Pkn("follow_tab_guide_word")
    public String followTabGuideWord;

    public Integer getFollowTabGuideTimes() {
        Integer num = this.followTabGuideTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getFollowTabGuideWord() {
        String str = this.followTabGuideWord;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
