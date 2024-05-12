package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LynxSSRInfo {

    @InterfaceC65349Pkn("ssr_result")
    public final SSRResult ssrResult;

    /* JADX WARN: Multi-variable type inference failed */
    public LynxSSRInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LynxSSRInfo) && o.LJ(this.ssrResult, ((LynxSSRInfo) obj).ssrResult);
    }

    public final int hashCode() {
        SSRResult sSRResult = this.ssrResult;
        if (sSRResult == null) {
            return 0;
        }
        return sSRResult.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxSSRInfo(ssrResult=");
        LIZ.append(this.ssrResult);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LynxSSRInfo(SSRResult sSRResult) {
        this.ssrResult = sSRResult;
    }

    public /* synthetic */ LynxSSRInfo(SSRResult sSRResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sSRResult);
    }
}
