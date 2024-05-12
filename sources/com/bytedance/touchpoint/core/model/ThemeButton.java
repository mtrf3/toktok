package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ThemeButton extends F9E {

    @InterfaceC65349Pkn("background_color")
    public String bgColor;

    @InterfaceC65349Pkn("background_image")
    public String bgImage;

    @InterfaceC65349Pkn("content")
    public Title content;

    @InterfaceC65349Pkn("special_effect")
    public String effect;

    @InterfaceC65349Pkn("jump_link")
    public String jumpLink;

    @InterfaceC65349Pkn("link_type")
    public final String linkType;

    @InterfaceC65349Pkn("theme_color")
    public String theme;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.content, this.bgImage, this.bgColor, this.theme, this.effect, this.jumpLink, this.linkType};
    }

    public ThemeButton(Title title, String bgImage, String bgColor, String theme, String effect, String jumpLink, String linkType) {
        o.LJIIIZ(bgImage, "bgImage");
        o.LJIIIZ(bgColor, "bgColor");
        o.LJIIIZ(theme, "theme");
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(jumpLink, "jumpLink");
        o.LJIIIZ(linkType, "linkType");
        this.content = title;
        this.bgImage = bgImage;
        this.bgColor = bgColor;
        this.theme = theme;
        this.effect = effect;
        this.jumpLink = jumpLink;
        this.linkType = linkType;
    }

    public /* synthetic */ ThemeButton(Title title, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(title, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "");
    }
}
