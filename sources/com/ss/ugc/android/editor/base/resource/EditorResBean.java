package com.ss.ugc.android.editor.base.resource;

import java.util.List;

/* loaded from: classes16.dex */
public class EditorResBean {
    public ResourceBean resource;
    public String type;

    /* loaded from: classes16.dex */
    public static class ResourceBean {
        public List<ResourceItem> list;

        public List<ResourceItem> getList() {
            return this.list;
        }

        public void setList(List<ResourceItem> list) {
            this.list = list;
        }
    }

    public ResourceBean getResource() {
        return this.resource;
    }

    public String getType() {
        return this.type;
    }

    public void setResource(ResourceBean resourceBean) {
        this.resource = resourceBean;
    }

    public void setType(String str) {
        this.type = str;
    }
}
