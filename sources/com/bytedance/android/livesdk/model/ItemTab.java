package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class ItemTab implements Serializable {
    public boolean LJLIL;

    @InterfaceC65349Pkn("enable_dislike")
    public int dislike;

    @InterfaceC65349Pkn("enable_draw_stream")
    public int draw;

    @InterfaceC65349Pkn("event")
    public String event;

    @InterfaceC65349Pkn("feed_style")
    public int feedStyle;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("inter_url")
    public String innerStreamUrl;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("req_from")
    public String reqFrom;

    @InterfaceC65349Pkn("default")
    public int showdefault;

    @InterfaceC65349Pkn("source")
    public int source;

    @InterfaceC65349Pkn("style")
    public int style;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("url")
    public String url;

    public boolean enableDraw() {
        if (this.draw == 1) {
            return true;
        }
        return false;
    }

    public int getShowdefault() {
        int i = this.showdefault;
        if (i != 1 && i != 0) {
            this.showdefault = 0;
        }
        return this.showdefault;
    }

    public int getStyle() {
        int i = this.style;
        if (i < 1 || i > 4) {
            this.style = 2;
        }
        return this.style;
    }

    public int getType() {
        int i = this.type;
        if (i != 1 && i != 2) {
            this.type = 1;
        }
        return this.type;
    }

    public String getTypeString() {
        String str = this.url;
        if (str == null) {
            return null;
        }
        return UriProtector.getQueryParameter(UriProtector.parse(str), "type");
    }

    public boolean isDefaultItem() {
        if (this.showdefault == 1) {
            return true;
        }
        return false;
    }

    public boolean isFollowItem() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isItemValid() {
        if (!TextUtils.isEmpty(this.name) && !TextUtils.isEmpty(this.url)) {
            return true;
        }
        return false;
    }

    public boolean isSinleLine() {
        if (this.style == 1) {
            return true;
        }
        return false;
    }

    public int getDislike() {
        return this.dislike;
    }

    public String getEvent() {
        return this.event;
    }

    public int getFeedStyle() {
        return this.feedStyle;
    }

    public long getId() {
        return this.id;
    }

    public String getInnerStreamUrl() {
        return this.innerStreamUrl;
    }

    public String getName() {
        return this.name;
    }

    public String getReqFrom() {
        return this.reqFrom;
    }

    public int getSource() {
        return this.source;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isChecked() {
        return this.LJLIL;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void setChecked(boolean z) {
        this.LJLIL = z;
    }

    public void setDislike(int i) {
        this.dislike = i;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setFeedStyle(int i) {
        this.feedStyle = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReqFrom(String str) {
        this.reqFrom = str;
    }

    public void setShowdefault(int i) {
        this.showdefault = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
