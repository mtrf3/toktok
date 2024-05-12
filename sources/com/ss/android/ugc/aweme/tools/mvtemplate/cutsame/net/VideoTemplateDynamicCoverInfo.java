package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoTemplateDynamicCoverInfo {

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("url")
    public final String url;

    @InterfaceC65349Pkn("width")
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoTemplateDynamicCoverInfo() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.VideoTemplateDynamicCoverInfo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTemplateDynamicCoverInfo)) {
            return false;
        }
        VideoTemplateDynamicCoverInfo videoTemplateDynamicCoverInfo = (VideoTemplateDynamicCoverInfo) obj;
        return o.LJ(this.url, videoTemplateDynamicCoverInfo.url) && this.width == videoTemplateDynamicCoverInfo.width && this.height == videoTemplateDynamicCoverInfo.height;
    }

    public final int hashCode() {
        String str = this.url;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.width) * 31) + this.height;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoTemplateDynamicCoverInfo(url=");
        LIZ.append(this.url);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return b0.LIZJ(LIZ, this.height, ')', LIZ);
    }

    public VideoTemplateDynamicCoverInfo(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public /* synthetic */ VideoTemplateDynamicCoverInfo(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
