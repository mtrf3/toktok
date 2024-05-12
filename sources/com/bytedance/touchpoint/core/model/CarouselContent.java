package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CarouselContent extends F9E {

    @InterfaceC65349Pkn("image")
    public String picture;

    @InterfaceC65349Pkn("title")
    public final Title title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.title, this.picture};
    }

    public CarouselContent(Title title, String picture) {
        o.LJIIIZ(picture, "picture");
        this.title = title;
        this.picture = picture;
    }

    public /* synthetic */ CarouselContent(Title title, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(title, (i & 2) != 0 ? "" : str);
    }
}
