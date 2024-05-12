package com.ss.android.ugc.aweme.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Edge2EdgeConfig {

    @InterfaceC65349Pkn("bright_page")
    public final String colorForBrightPage;

    @InterfaceC65349Pkn("dark_page")
    public final String colorForDarkPage;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    public static /* synthetic */ Edge2EdgeConfig copy$default(Edge2EdgeConfig edge2EdgeConfig, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = edge2EdgeConfig.enable;
        }
        if ((i & 2) != 0) {
            str = edge2EdgeConfig.colorForBrightPage;
        }
        if ((i & 4) != 0) {
            str2 = edge2EdgeConfig.colorForDarkPage;
        }
        return edge2EdgeConfig.copy(z, str, str2);
    }

    public final Edge2EdgeConfig copy(boolean z, String str, String str2) {
        return new Edge2EdgeConfig(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Edge2EdgeConfig)) {
            return false;
        }
        Edge2EdgeConfig edge2EdgeConfig = (Edge2EdgeConfig) obj;
        return this.enable == edge2EdgeConfig.enable && o.LJ(this.colorForBrightPage, edge2EdgeConfig.colorForBrightPage) && o.LJ(this.colorForDarkPage, edge2EdgeConfig.colorForDarkPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.colorForBrightPage;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.colorForDarkPage;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Edge2EdgeConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", colorForBrightPage=");
        LIZ.append(this.colorForBrightPage);
        LIZ.append(", colorForDarkPage=");
        return q.LIZIZ(LIZ, this.colorForDarkPage, ')', LIZ);
    }

    public final String getColorForBrightPage() {
        return this.colorForBrightPage;
    }

    public final String getColorForDarkPage() {
        return this.colorForDarkPage;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public Edge2EdgeConfig(boolean z, String str, String str2) {
        this.enable = z;
        this.colorForBrightPage = str;
        this.colorForDarkPage = str2;
    }
}
