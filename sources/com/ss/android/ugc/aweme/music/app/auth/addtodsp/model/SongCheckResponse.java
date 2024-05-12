package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class SongCheckResponse extends BaseResponse {

    @InterfaceC65349Pkn("available")
    public boolean available;

    @InterfaceC65349Pkn("region")
    public final String region;

    /* JADX WARN: Multi-variable type inference failed */
    public SongCheckResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SongCheckResponse) {
            return C78966Uyw.LJIIIZ(((SongCheckResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.available), this.region};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("SongCheckResponse:%s,%s", getObjects());
    }

    public SongCheckResponse(boolean z, String region) {
        o.LJIIIZ(region, "region");
        this.available = z;
        this.region = region;
    }

    public /* synthetic */ SongCheckResponse(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
