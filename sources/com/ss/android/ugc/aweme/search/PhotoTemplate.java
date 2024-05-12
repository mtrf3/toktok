package com.ss.android.ugc.aweme.search;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class PhotoTemplate implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("use_count")
    public int useCount;

    public List<String> children() {
        return null;
    }

    public boolean isCombine() {
        return false;
    }

    public String desc() {
        return this.desc;
    }

    public UrlModel icon() {
        return this.icon;
    }

    public String id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public int useCount() {
        return this.useCount;
    }
}
