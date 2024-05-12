package com.bytedance.touchpoint.core.model;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighLightText extends F9E {

    @InterfaceC65349Pkn("colors")
    public List<String> color;

    @InterfaceC65349Pkn("gradient_type")
    public String gradientType;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("theme_color")
    public String theme;

    /* JADX WARN: Multi-variable type inference failed */
    public HighLightText() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text, this.theme, this.color, this.gradientType};
    }

    public HighLightText(String text, String theme, List<String> color, String gradientType) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(theme, "theme");
        o.LJIIIZ(color, "color");
        o.LJIIIZ(gradientType, "gradientType");
        this.text = text;
        this.theme = theme;
        this.color = color;
        this.gradientType = gradientType;
    }

    public /* synthetic */ HighLightText(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C47261Igj.LJJIJ("") : list, (i & 8) != 0 ? "" : str3);
    }
}
