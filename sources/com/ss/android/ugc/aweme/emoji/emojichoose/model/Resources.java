package com.ss.android.ugc.aweme.emoji.emojichoose.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class Resources implements Serializable {
    public int LJLIL;
    public String LJLILLLLZI;

    @InterfaceC65349Pkn("display_name")
    public String displayName;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("resource_url")
    public String resourceUrl;

    @InterfaceC65349Pkn("version")
    public String version;

    public int hashCode() {
        return String.valueOf(this.id).hashCode();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getId() {
        return this.id;
    }

    public int getOptional() {
        return this.LJLIL;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getType() {
        return this.LJLILLLLZI;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Resources) || this.id != ((Resources) obj).getId()) {
            return false;
        }
        return true;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setOptional(int i) {
        this.LJLIL = i;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public void setType(String str) {
        this.LJLILLLLZI = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
