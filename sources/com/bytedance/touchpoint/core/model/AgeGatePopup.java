package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AgeGatePopup extends F9E {

    @InterfaceC65349Pkn("button")
    public FeedButton button;

    @InterfaceC65349Pkn("button_link")
    public String buttonLink;

    @InterfaceC65349Pkn("cover_image")
    public String coverImage;

    @InterfaceC65349Pkn("desc")
    public Title desc;

    @InterfaceC65349Pkn("desc_link")
    public String descLink;

    @InterfaceC65349Pkn("highlight_desc")
    public Title highlightDesc;

    @InterfaceC65349Pkn("highlight_title")
    public Title highlightTitle;

    @InterfaceC65349Pkn("title")
    public Title title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.coverImage, this.title, this.highlightTitle, this.button, this.desc, this.highlightDesc, this.buttonLink, this.descLink};
    }

    public AgeGatePopup(String coverImage, Title title, Title highlightTitle, FeedButton button, Title desc, Title highlightDesc, String buttonLink, String descLink) {
        o.LJIIIZ(coverImage, "coverImage");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(highlightTitle, "highlightTitle");
        o.LJIIIZ(button, "button");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(highlightDesc, "highlightDesc");
        o.LJIIIZ(buttonLink, "buttonLink");
        o.LJIIIZ(descLink, "descLink");
        this.coverImage = coverImage;
        this.title = title;
        this.highlightTitle = highlightTitle;
        this.button = button;
        this.desc = desc;
        this.highlightDesc = highlightDesc;
        this.buttonLink = buttonLink;
        this.descLink = descLink;
    }

    public /* synthetic */ AgeGatePopup(String str, Title title, Title title2, FeedButton feedButton, Title title3, Title title4, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, title, title2, feedButton, title3, title4, str2, str3);
    }
}
