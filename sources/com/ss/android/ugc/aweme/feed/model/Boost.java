package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class Boost extends F9E implements Serializable {

    @InterfaceC65349Pkn("color")
    public String bgColor;

    @InterfaceC65349Pkn("label")
    public String text;

    @InterfaceC65349Pkn("color_text")
    public String textColor;

    /* JADX WARN: Multi-variable type inference failed */
    public Boost() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Boost copy$default(Boost boost, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boost.text;
        }
        if ((i & 2) != 0) {
            str2 = boost.bgColor;
        }
        if ((i & 4) != 0) {
            str3 = boost.textColor;
        }
        return boost.copy(str, str2, str3);
    }

    public final Boost copy(String text, String bgColor, String textColor) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(bgColor, "bgColor");
        o.LJIIIZ(textColor, "textColor");
        return new Boost(text, bgColor, textColor);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.text, this.bgColor, this.textColor};
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public Boost(String str, String str2, String str3) {
        HH1.LIZ(str, "text", str2, "bgColor", str3, "textColor");
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
    }

    public /* synthetic */ Boost(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
