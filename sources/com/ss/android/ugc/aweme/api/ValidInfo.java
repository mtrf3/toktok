package com.ss.android.ugc.aweme.api;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ValidInfo implements Serializable {

    @InterfaceC65349Pkn("attachable")
    public final boolean attachable;

    @InterfaceC65349Pkn("is_long_url")
    public final boolean isLongUrl;

    @InterfaceC65349Pkn("toast_content")
    public final String toastContent;

    public static /* synthetic */ ValidInfo copy$default(ValidInfo validInfo, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = validInfo.attachable;
        }
        if ((i & 2) != 0) {
            str = validInfo.toastContent;
        }
        if ((i & 4) != 0) {
            z2 = validInfo.isLongUrl;
        }
        return validInfo.copy(z, str, z2);
    }

    public final ValidInfo copy(boolean z, String str, boolean z2) {
        return new ValidInfo(z, str, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidInfo)) {
            return false;
        }
        ValidInfo validInfo = (ValidInfo) obj;
        return this.attachable == validInfo.attachable && o.LJ(this.toastContent, validInfo.toastContent) && this.isLongUrl == validInfo.isLongUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z = this.attachable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.toastContent;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + (this.isLongUrl ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ValidInfo(attachable=");
        LIZ.append(this.attachable);
        LIZ.append(", toastContent=");
        LIZ.append(this.toastContent);
        LIZ.append(", isLongUrl=");
        return C48339Iy7.LIZJ(LIZ, this.isLongUrl, ')', LIZ);
    }

    public final boolean getAttachable() {
        return this.attachable;
    }

    public final String getToastContent() {
        return this.toastContent;
    }

    public final boolean isLongUrl() {
        return this.isLongUrl;
    }

    public ValidInfo(boolean z, String str, boolean z2) {
        this.attachable = z;
        this.toastContent = str;
        this.isLongUrl = z2;
    }
}
