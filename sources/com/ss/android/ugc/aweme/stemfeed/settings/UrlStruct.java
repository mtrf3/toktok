package com.ss.android.ugc.aweme.stemfeed.settings;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UrlStruct {

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public String[] urlList;

    @InterfaceC65349Pkn("width")
    public int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UrlStruct() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.stemfeed.settings.UrlStruct.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlStruct)) {
            return false;
        }
        UrlStruct urlStruct = (UrlStruct) obj;
        return this.height == urlStruct.height && this.width == urlStruct.width && o.LJ(this.uri, urlStruct.uri) && o.LJ(this.urlList, urlStruct.urlList);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.uri, ((this.height * 31) + this.width) * 31, 31);
        String[] strArr = this.urlList;
        if (strArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(strArr);
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlStruct(height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", uri=");
        LIZ.append(this.uri);
        LIZ.append(", urlList=");
        return q.LIZIZ(LIZ, Arrays.toString(this.urlList), ')', LIZ);
    }

    public UrlStruct(int i, int i2, String uri, String[] strArr) {
        o.LJIIIZ(uri, "uri");
        this.height = i;
        this.width = i2;
        this.uri = uri;
        this.urlList = strArr;
    }

    public /* synthetic */ UrlStruct(int i, int i2, String str, String[] strArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : strArr);
    }
}
