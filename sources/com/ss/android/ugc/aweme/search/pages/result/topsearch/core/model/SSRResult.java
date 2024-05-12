package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SSRResult {

    @InterfaceC65349Pkn("disableHydrate")
    public final Number disableHydrate;

    @InterfaceC65349Pkn("originalSource")
    public final String originalSource;

    @InterfaceC65349Pkn("ssrSource")
    public final String ssrSource;

    /* JADX WARN: Multi-variable type inference failed */
    public SSRResult() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SSRResult)) {
            return false;
        }
        SSRResult sSRResult = (SSRResult) obj;
        return o.LJ(this.originalSource, sSRResult.originalSource) && o.LJ(this.ssrSource, sSRResult.ssrSource) && o.LJ(this.disableHydrate, sSRResult.disableHydrate);
    }

    public final int hashCode() {
        String str = this.originalSource;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ssrSource;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Number number = this.disableHydrate;
        return hashCode2 + (number != null ? number.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SSRResult(originalSource=");
        LIZ.append(this.originalSource);
        LIZ.append(", ssrSource=");
        LIZ.append(this.ssrSource);
        LIZ.append(", disableHydrate=");
        LIZ.append(this.disableHydrate);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SSRResult(String str, String str2, Number number) {
        this.originalSource = str;
        this.ssrSource = str2;
        this.disableHydrate = number;
    }

    public /* synthetic */ SSRResult(String str, String str2, Number number, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : number);
    }
}
