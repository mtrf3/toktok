package com.ss.android.ugc.gamora.recorder.navi.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileNaviCandidatesResponse extends BaseResponse {

    @InterfaceC65349Pkn("initial_navis")
    public final List<ProfileNaviCandidate> initialNavis;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileNaviCandidatesResponse) && o.LJ(this.initialNavis, ((ProfileNaviCandidatesResponse) obj).initialNavis);
    }

    public final int hashCode() {
        List<ProfileNaviCandidate> list = this.initialNavis;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviCandidatesResponse(initialNavis=");
        return C1NE.LIZIZ(LIZ, this.initialNavis, ')', LIZ);
    }

    public ProfileNaviCandidatesResponse(List<ProfileNaviCandidate> list) {
        this.initialNavis = list;
    }
}
