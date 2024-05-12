package com.ss.android.ugc.aweme.feed.model.video;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class PillarBoxVideoInfo implements Serializable {

    @InterfaceC65349Pkn("bottom")
    public float bottom;

    @InterfaceC65349Pkn("left")
    public float left;

    @InterfaceC65349Pkn("right")
    public float right;

    @InterfaceC65349Pkn("top")
    public float top;

    @InterfaceC65349Pkn("version")
    public String version;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PillarBoxVideoInfo() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo.<init>():void");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PillarBoxVideoInfo(top=");
        LIZ.append(this.top);
        LIZ.append(", bottom=");
        LIZ.append(this.bottom);
        LIZ.append(", left=");
        LIZ.append(this.left);
        LIZ.append(", right=");
        LIZ.append(this.right);
        LIZ.append(", version=");
        return q.LIZIZ(LIZ, this.version, ')', LIZ);
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public PillarBoxVideoInfo(float f, float f2, float f3, float f4, String str) {
        this.top = f;
        this.bottom = f2;
        this.left = f3;
        this.right = f4;
        this.version = str;
    }

    public /* synthetic */ PillarBoxVideoInfo(float f, float f2, float f3, float f4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) == 0 ? f4 : 0.0f, (i & 16) != 0 ? "" : str);
    }
}
