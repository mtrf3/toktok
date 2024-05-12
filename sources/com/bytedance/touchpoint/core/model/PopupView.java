package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PopupView extends F9E {
    public String LJLIL;

    @InterfaceC65349Pkn("button")
    public FeedButton button;

    @InterfaceC65349Pkn("cover_image")
    public String coverImage;

    @InterfaceC65349Pkn("highlight_title")
    public Title highlightTitle;

    @InterfaceC65349Pkn("title")
    public Title title;

    @InterfaceC65349Pkn("widget_image")
    public String widgetImage;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.title, this.highlightTitle, this.button, this.coverImage, this.widgetImage, this.LJLIL};
    }

    public PopupView(Title title, Title highlightTitle, FeedButton button, String coverImage, String widgetImage, String widgetImageLocalPath) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(highlightTitle, "highlightTitle");
        o.LJIIIZ(button, "button");
        o.LJIIIZ(coverImage, "coverImage");
        o.LJIIIZ(widgetImage, "widgetImage");
        o.LJIIIZ(widgetImageLocalPath, "widgetImageLocalPath");
        this.title = title;
        this.highlightTitle = highlightTitle;
        this.button = button;
        this.coverImage = coverImage;
        this.widgetImage = widgetImage;
        this.LJLIL = widgetImageLocalPath;
    }
}
