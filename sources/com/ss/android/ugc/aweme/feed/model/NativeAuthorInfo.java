package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NativeAuthorInfo implements Serializable {

    @InterfaceC65349Pkn("auto_pull_up")
    public int autoPullStyle;

    @InterfaceC65349Pkn("bottom_banner")
    public BottomBanner bottomBanner;

    /* JADX WARN: Multi-variable type inference failed */
    public NativeAuthorInfo() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NativeAuthorInfo copy$default(NativeAuthorInfo nativeAuthorInfo, BottomBanner bottomBanner, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bottomBanner = nativeAuthorInfo.bottomBanner;
        }
        if ((i2 & 2) != 0) {
            i = nativeAuthorInfo.autoPullStyle;
        }
        return nativeAuthorInfo.copy(bottomBanner, i);
    }

    public final NativeAuthorInfo copy(BottomBanner bottomBanner, int i) {
        return new NativeAuthorInfo(bottomBanner, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAuthorInfo)) {
            return false;
        }
        NativeAuthorInfo nativeAuthorInfo = (NativeAuthorInfo) obj;
        return o.LJ(this.bottomBanner, nativeAuthorInfo.bottomBanner) && this.autoPullStyle == nativeAuthorInfo.autoPullStyle;
    }

    public int hashCode() {
        BottomBanner bottomBanner = this.bottomBanner;
        return ((bottomBanner == null ? 0 : bottomBanner.hashCode()) * 31) + this.autoPullStyle;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NativeAuthorInfo(bottomBanner=");
        LIZ.append(this.bottomBanner);
        LIZ.append(", autoPullStyle=");
        return b0.LIZJ(LIZ, this.autoPullStyle, ')', LIZ);
    }

    public final int getAutoPullStyle() {
        return this.autoPullStyle;
    }

    public final BottomBanner getBottomBanner() {
        return this.bottomBanner;
    }

    public final void setAutoPullStyle(int i) {
        this.autoPullStyle = i;
    }

    public final void setBottomBanner(BottomBanner bottomBanner) {
        this.bottomBanner = bottomBanner;
    }

    public NativeAuthorInfo(BottomBanner bottomBanner, int i) {
        this.bottomBanner = bottomBanner;
        this.autoPullStyle = i;
    }

    public /* synthetic */ NativeAuthorInfo(BottomBanner bottomBanner, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bottomBanner, (i2 & 2) != 0 ? 0 : i);
    }
}
