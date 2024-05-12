package com.ss.android.ugc.gamora.editorpro.dynamic;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class PipLimit extends F9E {

    @InterfaceC65349Pkn("max_overlay_limit")
    public final int countLimit;

    @InterfaceC65349Pkn("max_height")
    public final int heightLimit;

    @InterfaceC65349Pkn("max_width")
    public final int widthLimit;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PipLimit() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.dynamic.PipLimit.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.countLimit), Integer.valueOf(this.widthLimit), Integer.valueOf(this.heightLimit)};
    }

    public PipLimit(int i, int i2, int i3) {
        this.countLimit = i;
        this.widthLimit = i2;
        this.heightLimit = i3;
    }

    public /* synthetic */ PipLimit(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 6 : i, (i4 & 2) != 0 ? 720 : i2, (i4 & 4) != 0 ? 1280 : i3);
    }
}
