package com.ss.android.ugc.aweme.share.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SharerInfoChecksum extends BaseResponse {

    @InterfaceC65349Pkn("checksum")
    public final String checksum;

    public final int hashCode() {
        return Objects.hash(this.checksum);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("SharerInfoChecksum:%s", this.checksum);
    }

    public SharerInfoChecksum(String checksum) {
        o.LJIIIZ(checksum, "checksum");
        this.checksum = checksum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharerInfoChecksum)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((SharerInfoChecksum) obj).checksum}, new Object[]{this.checksum});
    }
}
