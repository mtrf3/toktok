package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.config;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class UserRelationTagStyle extends F9E {

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("background_color_dark")
    public final String darkBackgroundColor;

    @InterfaceC65349Pkn("font_color_dark")
    public final String darkFontColor;

    @InterfaceC65349Pkn("font_color")
    public final String fontColor;

    @InterfaceC65349Pkn("highlight_type")
    public final int highlightType;

    /* JADX WARN: Multi-variable type inference failed */
    public UserRelationTagStyle() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.highlightType), this.fontColor, this.backgroundColor, this.darkFontColor, this.darkBackgroundColor};
    }

    public UserRelationTagStyle(int i, String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "fontColor", str2, "backgroundColor", str3, "darkFontColor", str4, "darkBackgroundColor");
        this.highlightType = i;
        this.fontColor = str;
        this.backgroundColor = str2;
        this.darkFontColor = str3;
        this.darkBackgroundColor = str4;
    }

    public /* synthetic */ UserRelationTagStyle(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i, (i2 & 2) != 0 ? "#80161823" : str, (i2 & 4) != 0 ? "#FFF1F1F2" : str2, (i2 & 8) != 0 ? "#80FFFFFF" : str3, (i2 & 16) != 0 ? "#FF252525" : str4);
    }
}
