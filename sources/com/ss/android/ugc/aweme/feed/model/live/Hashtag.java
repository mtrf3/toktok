package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class Hashtag implements Serializable {

    @InterfaceC65349Pkn("id")
    public Long id = 0L;

    @InterfaceC65349Pkn("title")
    public String title = "";

    public final Long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
