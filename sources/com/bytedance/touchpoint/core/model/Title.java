package com.bytedance.touchpoint.core.model;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Title extends F9E {

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("font")
    public final String font;

    @InterfaceC65349Pkn("size")
    public final String size;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public Title() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text, this.color, this.font, this.size};
    }

    public Title(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "text", str2, "color", str3, "font", str4, "size");
        this.text = str;
        this.color = str2;
        this.font = str3;
        this.size = str4;
    }

    public /* synthetic */ Title(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
