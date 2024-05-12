package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class TextPlaceHolder extends F9E {

    @InterfaceC65349Pkn("highlight_text")
    public HighLightText highlightText;

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("picture")
    public String picture;

    @InterfaceC65349Pkn("placehold_type")
    public String type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.key, this.type, this.highlightText, this.picture};
    }

    public TextPlaceHolder(String str, String str2, HighLightText highLightText, String str3) {
        HH1.LIZ(str, "key", str2, "type", str3, "picture");
        this.key = str;
        this.type = str2;
        this.highlightText = highLightText;
        this.picture = str3;
    }

    public /* synthetic */ TextPlaceHolder(String str, String str2, HighLightText highLightText, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, highLightText, (i & 8) != 0 ? "" : str3);
    }
}
