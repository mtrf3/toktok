package com.byted.cast.common.auth;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public class AuthService {
    public List<String> mContentList;
    public String mEdition;
    public String mName;

    public List<String> getContentList() {
        return this.mContentList;
    }

    public String getEdition() {
        return this.mEdition;
    }

    public String getName() {
        return this.mName;
    }

    public AuthService(String str) {
        this.mName = str;
    }

    public void setContentList(List<String> list) {
        if (this.mContentList == null) {
            this.mContentList = new ArrayList();
        }
        this.mContentList.clear();
        if (list != null && list.size() > 0) {
            this.mContentList.addAll(list);
        }
    }

    public void setEdition(String str) {
        this.mEdition = str;
    }

    public void setName(String str) {
        this.mName = str;
    }
}
