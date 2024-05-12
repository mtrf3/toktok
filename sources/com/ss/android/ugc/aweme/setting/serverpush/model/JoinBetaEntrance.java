package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class JoinBetaEntrance {

    @InterfaceC65349Pkn("is_show")
    public final boolean show;

    @InterfaceC65349Pkn("h5_url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinBetaEntrance)) {
            return false;
        }
        JoinBetaEntrance joinBetaEntrance = (JoinBetaEntrance) obj;
        return this.show == joinBetaEntrance.show && o.LJ(this.url, joinBetaEntrance.url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.url;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinBetaEntrance(show=");
        LIZ.append(this.show);
        LIZ.append(", url=");
        return q.LIZIZ(LIZ, this.url, ')', LIZ);
    }

    public JoinBetaEntrance(boolean z, String str) {
        this.show = z;
        this.url = str;
    }
}
