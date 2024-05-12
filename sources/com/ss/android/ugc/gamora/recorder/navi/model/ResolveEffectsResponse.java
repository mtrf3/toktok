package com.ss.android.ugc.gamora.recorder.navi.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ResolveEffectsResponse extends BaseResponse {

    @InterfaceC65349Pkn("navi_resolved_effects")
    public final List<ResolvedEffect> resolvedEffects;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResolveEffectsResponse) && o.LJ(this.resolvedEffects, ((ResolveEffectsResponse) obj).resolvedEffects);
    }

    public final int hashCode() {
        List<ResolvedEffect> list = this.resolvedEffects;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResolveEffectsResponse(resolvedEffects=");
        return C1NE.LIZIZ(LIZ, this.resolvedEffects, ')', LIZ);
    }

    public ResolveEffectsResponse(List<ResolvedEffect> list) {
        this.resolvedEffects = list;
    }
}
