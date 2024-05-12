package com.ss.android.ugc.aweme.commercialize.model.promote;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class PromoteModel implements Serializable {

    @InterfaceC65349Pkn("is_promote_ad_label")
    public boolean isPromoteAdLabel;

    @InterfaceC65349Pkn("label_click")
    public int labelClick = 2;

    @InterfaceC65349Pkn("label_color")
    public String labelColor;

    @InterfaceC65349Pkn("label_icon")
    public int labelIcon;

    @InterfaceC65349Pkn("label_text")
    public String labelText;

    public final int getLabelClick() {
        return this.labelClick;
    }

    public final String getLabelColor() {
        return this.labelColor;
    }

    public final int getLabelIcon() {
        return this.labelIcon;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final boolean isPromoteAdLabel() {
        return this.isPromoteAdLabel;
    }

    public final void setLabelClick(int i) {
        this.labelClick = i;
    }

    public final void setLabelColor(String str) {
        this.labelColor = str;
    }

    public final void setLabelIcon(int i) {
        this.labelIcon = i;
    }

    public final void setLabelText(String str) {
        this.labelText = str;
    }

    public final void setPromoteAdLabel(boolean z) {
        this.isPromoteAdLabel = z;
    }
}
