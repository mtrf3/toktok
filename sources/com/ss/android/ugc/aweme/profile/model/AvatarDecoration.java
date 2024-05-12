package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class AvatarDecoration implements Serializable, Cloneable {

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("source_url")
    public UrlModel sourceUrl;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }
}
