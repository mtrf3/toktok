package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class SearchPullFeedbackOptions {

    @InterfaceC65349Pkn("top_tab")
    public List<String> topTab = new ArrayList();

    @InterfaceC65349Pkn("user_tab")
    public List<String> userTab = new ArrayList();

    @InterfaceC65349Pkn("sound_tab")
    public List<String> soundTab = new ArrayList();

    @InterfaceC65349Pkn("hashtag_tab")
    public List<String> hashtagTab = new ArrayList();

    @InterfaceC65349Pkn("video_tab")
    public List<String> videoTab = new ArrayList();

    public List<String> getHashtagTab() {
        return this.hashtagTab;
    }

    public List<String> getSoundTab() {
        return this.soundTab;
    }

    public List<String> getTopTab() {
        return this.topTab;
    }

    public List<String> getUserTab() {
        return this.userTab;
    }

    public List<String> getVideoTab() {
        return this.videoTab;
    }
}
