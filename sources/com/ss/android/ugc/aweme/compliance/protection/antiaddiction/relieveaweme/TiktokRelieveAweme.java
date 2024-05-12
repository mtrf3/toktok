package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.relieveaweme;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokRelieveAweme extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    public static /* synthetic */ TiktokRelieveAweme copy$default(TiktokRelieveAweme tiktokRelieveAweme, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tiktokRelieveAweme.awemeId;
        }
        return tiktokRelieveAweme.copy(str);
    }

    private Object[] getObjects() {
        return new Object[]{this.awemeId};
    }

    public final TiktokRelieveAweme copy(String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        return new TiktokRelieveAweme(awemeId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TiktokRelieveAweme) {
            return C78966Uyw.LJIIIZ(((TiktokRelieveAweme) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("TiktokRelieveAweme:%s", getObjects());
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public TiktokRelieveAweme(String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        this.awemeId = awemeId;
    }
}
