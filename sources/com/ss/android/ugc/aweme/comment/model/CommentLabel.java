package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CommentLabel implements Serializable {
    public static final long serialVersionUID = 5974802910310825054L;

    @InterfaceC65349Pkn("color")
    public String color;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("url")
    public String url;

    public String getLabelColor() {
        return this.color;
    }

    public String getLabelText() {
        return this.text;
    }

    public int getLabelType() {
        return this.type;
    }

    public String getLabelUrl() {
        return this.url;
    }

    public void setLabelColor(String str) {
        this.color = str;
    }

    public void setLabelText(String str) {
        this.text = str;
    }

    public void setLabelType(int i) {
        this.type = i;
    }

    public void setLabelUrl(String str) {
        this.url = str;
    }
}
