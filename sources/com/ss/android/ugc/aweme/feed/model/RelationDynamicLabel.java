package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class RelationDynamicLabel implements Serializable {

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("label_info")
    public String labelInfo;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("show_type")
    public int showType;

    @InterfaceC65349Pkn("tab_label_info")
    public String tabText;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    public boolean isValid() {
        return !TextUtils.isEmpty(this.labelInfo);
    }

    public int getCount() {
        return this.count;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getShowType() {
        return this.showType;
    }

    public String getTabText() {
        return this.tabText;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setShowType(int i) {
        this.showType = i;
    }

    public void setTabText(String str) {
        this.tabText = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public RelationDynamicLabel setUserId(String str) {
        this.userId = str;
        return this;
    }
}
