package com.ss.ugc.android.editor.base.resource;

import java.util.List;

/* loaded from: classes16.dex */
public class ResourceBean {
    public Resource resource;
    public String type;
    public String version;

    /* loaded from: classes16.dex */
    public static class Resource {
        public List<ResourceItem> list;

        public List<ResourceItem> getList() {
            return this.list;
        }

        public void setList(List<ResourceItem> list) {
            this.list = list;
        }
    }

    public Resource getResource() {
        return this.resource;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
