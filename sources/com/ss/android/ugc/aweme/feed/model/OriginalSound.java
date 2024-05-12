package com.ss.android.ugc.aweme.feed.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class OriginalSound {

    @InterfaceC65349Pkn("play_addr")
    public UrlModel playAddr;

    /* JADX WARN: Multi-variable type inference failed */
    public OriginalSound() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OriginalSound copy$default(OriginalSound originalSound, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = originalSound.playAddr;
        }
        return originalSound.copy(urlModel);
    }

    public final OriginalSound copy(UrlModel urlModel) {
        return new OriginalSound(urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OriginalSound) && o.LJ(this.playAddr, ((OriginalSound) obj).playAddr);
    }

    public int hashCode() {
        UrlModel urlModel = this.playAddr;
        if (urlModel == null) {
            return 0;
        }
        return urlModel.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OriginalSound(playAddr=");
        return C31461Li.LIZLLL(LIZ, this.playAddr, ')', LIZ);
    }

    public OriginalSound(UrlModel urlModel) {
        this.playAddr = urlModel;
    }

    public /* synthetic */ OriginalSound(UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel);
    }
}
