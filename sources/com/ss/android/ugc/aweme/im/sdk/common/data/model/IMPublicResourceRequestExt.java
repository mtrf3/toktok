package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMPublicResourceRequestExt {

    @InterfaceC65349Pkn("sticker_set_id")
    public final Long stickerSetId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMPublicResourceRequestExt) && o.LJ(this.stickerSetId, ((IMPublicResourceRequestExt) obj).stickerSetId);
    }

    public final int hashCode() {
        Long l = this.stickerSetId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMPublicResourceRequestExt(stickerSetId=");
        return JBR.LJ(LIZ, this.stickerSetId, ')', LIZ);
    }

    public IMPublicResourceRequestExt(Long l) {
        this.stickerSetId = l;
    }
}
