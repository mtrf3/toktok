package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeedButton extends F9E {

    @InterfaceC65349Pkn("background_colors")
    public final List<String> backgroundColors;

    @InterfaceC65349Pkn("background_color")
    public final String bgColor;

    @InterfaceC65349Pkn("button_action")
    public final String buttonAction;

    @InterfaceC65349Pkn("button_action_type")
    public final String buttonActionType;

    @InterfaceC65349Pkn("content")
    public Content content;

    @InterfaceC65349Pkn("gradient_type")
    public final int gradientType;

    @InterfaceC65349Pkn("jump_link")
    public final String jumpLink;

    @InterfaceC65349Pkn("link_type")
    public final String linkType;

    @InterfaceC65349Pkn("locations")
    public final List<Float> locations;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.content, this.bgColor, this.buttonActionType, this.backgroundColors, Integer.valueOf(this.gradientType), this.jumpLink, this.linkType, this.locations, this.buttonAction};
    }

    public FeedButton(Content content, String bgColor, String buttonActionType, List<String> list, int i, String jumpLink, String linkType, List<Float> list2, String buttonAction) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(bgColor, "bgColor");
        o.LJIIIZ(buttonActionType, "buttonActionType");
        o.LJIIIZ(jumpLink, "jumpLink");
        o.LJIIIZ(linkType, "linkType");
        o.LJIIIZ(buttonAction, "buttonAction");
        this.content = content;
        this.bgColor = bgColor;
        this.buttonActionType = buttonActionType;
        this.backgroundColors = list;
        this.gradientType = i;
        this.jumpLink = jumpLink;
        this.linkType = linkType;
        this.locations = list2;
        this.buttonAction = buttonAction;
    }
}
