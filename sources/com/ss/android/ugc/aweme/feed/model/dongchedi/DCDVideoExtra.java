package com.ss.android.ugc.aweme.feed.model.dongchedi;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class DCDVideoExtra implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("title")
    public String title;

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
