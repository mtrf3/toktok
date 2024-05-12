package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.utils.ReplaceLineEndAdapter;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class ChallengeDisclaimer implements Serializable {

    @InterfaceC65349Pkn("content")
    @InterfaceC65404Plg(ReplaceLineEndAdapter.class)
    public String content;

    @InterfaceC65349Pkn("title")
    public String title;

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
