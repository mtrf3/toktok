package com.ss.android.ugc.aweme.sticker.channel.download;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DownloadRequest extends F9E {

    @InterfaceC65349Pkn("needUpzip")
    public int needUpzip;

    @InterfaceC65349Pkn("url")
    public List<String> url;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.needUpzip), this.url};
    }

    public DownloadRequest(int i, List<String> url) {
        o.LJIIIZ(url, "url");
        this.needUpzip = i;
        this.url = url;
    }
}
