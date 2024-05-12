package com.ss.android.ugc.aweme.sticker.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EffectAnchorIcon extends F9E implements Serializable {

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    @InterfaceC65349Pkn("width")
    public final int width;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectAnchorIcon copy$default(EffectAnchorIcon effectAnchorIcon, int i, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = effectAnchorIcon.height;
        }
        if ((i3 & 2) != 0) {
            i2 = effectAnchorIcon.width;
        }
        if ((i3 & 4) != 0) {
            str = effectAnchorIcon.uri;
        }
        if ((i3 & 8) != 0) {
            list = effectAnchorIcon.urlList;
        }
        return effectAnchorIcon.copy(i, i2, str, list);
    }

    public final EffectAnchorIcon copy(int i, int i2, String uri, List<String> urlList) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(urlList, "urlList");
        return new EffectAnchorIcon(i, i2, uri, urlList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.height), Integer.valueOf(this.width), this.uri, this.urlList};
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int getWidth() {
        return this.width;
    }

    public EffectAnchorIcon(int i, int i2, String uri, List<String> urlList) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(urlList, "urlList");
        this.height = i;
        this.width = i2;
        this.uri = uri;
        this.urlList = urlList;
    }
}
