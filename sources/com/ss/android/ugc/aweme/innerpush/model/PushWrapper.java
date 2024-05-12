package com.ss.android.ugc.aweme.innerpush.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PushWrapper implements Serializable {

    @InterfaceC65349Pkn("group_id")
    public long gid;

    @InterfaceC65349Pkn("push_show_type")
    public int pushShowType;

    @InterfaceC65349Pkn("id")
    public long rid;

    @InterfaceC65349Pkn("open_url")
    public String openUrl = "";

    @InterfaceC65349Pkn("image_url")
    public String imageUrl = "";

    @InterfaceC65349Pkn("extra_str")
    public String extraStr = "";

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("text")
    public String content = "";

    public final String getContent() {
        return this.content;
    }

    public final String getExtraStr() {
        return this.extraStr;
    }

    public final long getGid() {
        return this.gid;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final int getPushShowType() {
        return this.pushShowType;
    }

    public final long getRid() {
        return this.rid;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.content = str;
    }

    public final void setExtraStr(String str) {
        this.extraStr = str;
    }

    public final void setGid(long j) {
        this.gid = j;
    }

    public final void setImageUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setOpenUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.openUrl = str;
    }

    public final void setPushShowType(int i) {
        this.pushShowType = i;
    }

    public final void setRid(long j) {
        this.rid = j;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }
}
