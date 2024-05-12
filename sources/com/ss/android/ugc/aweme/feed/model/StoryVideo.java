package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class StoryVideo implements Serializable {

    @InterfaceC65349Pkn("aweme_type")
    public int awemeType = 77;

    @InterfaceC65349Pkn("story_videos")
    public List<Video> subVideoList;

    public int getAwemeType() {
        return this.awemeType;
    }

    public List<Video> getSubVideoList() {
        return this.subVideoList;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setSubVideoList(List<Video> list) {
        this.subVideoList = list;
    }
}
