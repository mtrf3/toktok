package com.ss.android.ugc.aweme.shortvideo.dm;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMUploadVideoInfo implements Serializable {

    @InterfaceC65349Pkn("Height")
    public final Integer height;

    @InterfaceC65349Pkn("Width")
    public final Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public DMUploadVideoInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DMUploadVideoInfo copy$default(DMUploadVideoInfo dMUploadVideoInfo, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dMUploadVideoInfo.width;
        }
        if ((i & 2) != 0) {
            num2 = dMUploadVideoInfo.height;
        }
        return dMUploadVideoInfo.copy(num, num2);
    }

    public final DMUploadVideoInfo copy(Integer num, Integer num2) {
        return new DMUploadVideoInfo(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMUploadVideoInfo)) {
            return false;
        }
        DMUploadVideoInfo dMUploadVideoInfo = (DMUploadVideoInfo) obj;
        return o.LJ(this.width, dMUploadVideoInfo.width) && o.LJ(this.height, dMUploadVideoInfo.height);
    }

    public int hashCode() {
        Integer num = this.width;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DMUploadVideoInfo(width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return s0.LIZJ(LIZ, this.height, ')', LIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public DMUploadVideoInfo(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }

    public /* synthetic */ DMUploadVideoInfo(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
