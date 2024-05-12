package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicMixStreamVideoParams {

    @InterfaceC65349Pkn("codec")
    public String codec;

    @InterfaceC65349Pkn("fps")
    public int fps;

    @InterfaceC65349Pkn("gop")
    public int gop;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkMicMixStreamVideoParams() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamVideoParams.<init>():void");
    }

    public LinkMicMixStreamVideoParams(String codec, int i, int i2) {
        o.LJIIIZ(codec, "codec");
        this.codec = codec;
        this.fps = i;
        this.gop = i2;
    }

    public /* synthetic */ LinkMicMixStreamVideoParams(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2);
    }
}
