package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileBadgeStruct implements Serializable {

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("should_show")
    public boolean shouldShow;

    @InterfaceC65349Pkn("name")
    public String name = "";

    @InterfaceC65349Pkn("description")
    public String description = "";

    @InterfaceC65349Pkn("url")
    public String url = "";

    public final String getDescription() {
        return this.description;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setDescription(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.description = str;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.name = str;
    }

    public final void setShouldShow(boolean z) {
        this.shouldShow = z;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }
}
