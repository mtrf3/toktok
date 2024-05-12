package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BeautyConfig {

    @InterfaceC65349Pkn("has_bubble")
    public boolean hasBubble;

    @InterfaceC65349Pkn("has_none_item")
    public boolean hasNone;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeautyConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.broadcast.BeautyConfig.<init>():void");
    }

    public BeautyConfig(boolean z, boolean z2) {
        this.hasNone = z;
        this.hasBubble = z2;
    }

    public /* synthetic */ BeautyConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
