package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdTagStruct implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn("tag_position")
    public final int position;

    @InterfaceC65349Pkn("tag_text")
    public final String tagText;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @InterfaceC65349Pkn("type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public AdTagStruct() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getType() {
        return this.type;
    }

    public AdTagStruct(int i, String tagText, String backgroundColor, String textColor, String icon, String type) {
        o.LJIIIZ(tagText, "tagText");
        o.LJIIIZ(backgroundColor, "backgroundColor");
        o.LJIIIZ(textColor, "textColor");
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(type, "type");
        this.position = i;
        this.tagText = tagText;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.icon = icon;
        this.type = type;
    }

    public /* synthetic */ AdTagStruct(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "#" : str2, (i2 & 8) == 0 ? str3 : "#", (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "");
    }
}
