package com.ss.android.ugc.aweme.sticker.channel.download;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DownloadResult extends F9E {

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("success")
    public int success;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.path, Integer.valueOf(this.success)};
    }

    public DownloadResult(String path, int i) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.success = i;
    }

    public /* synthetic */ DownloadResult(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }
}
