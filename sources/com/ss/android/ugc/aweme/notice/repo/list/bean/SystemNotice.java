package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes2.dex */
public class SystemNotice {

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("content")
    public String content;

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getContent() {
        return this.content;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
