package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Title extends F9E {

    @InterfaceC65349Pkn("color_type")
    public final int colorType;
    public final UrlModel icon;
    public final String title;

    public static /* synthetic */ Title copy$default(Title title, UrlModel urlModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = title.icon;
        }
        if ((i2 & 2) != 0) {
            str = title.title;
        }
        if ((i2 & 4) != 0) {
            i = title.colorType;
        }
        return title.copy(urlModel, str, i);
    }

    public final Title copy(UrlModel icon, String title, int i) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        return new Title(icon, title, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.icon, this.title, Integer.valueOf(this.colorType)};
    }

    public final int getColorType() {
        return this.colorType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public Title(UrlModel icon, String title, int i) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        this.icon = icon;
        this.title = title;
        this.colorType = i;
    }

    public /* synthetic */ Title(UrlModel urlModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(urlModel, str, (i2 & 4) != 0 ? 0 : i);
    }
}
