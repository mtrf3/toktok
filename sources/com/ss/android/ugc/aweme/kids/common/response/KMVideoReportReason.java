package com.ss.android.ugc.aweme.kids.common.response;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KMVideoReportReason extends F9E {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("img")
    public final String img;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public KMVideoReportReason() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.code), this.text, this.img};
    }

    public KMVideoReportReason(int i, String text, String img) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(img, "img");
        this.code = i;
        this.text = text;
        this.img = img;
    }

    public /* synthetic */ KMVideoReportReason(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
