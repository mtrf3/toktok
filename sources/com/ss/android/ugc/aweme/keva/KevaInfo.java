package com.ss.android.ugc.aweme.keva;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KevaInfo extends F9E {

    @InterfaceC65349Pkn("isSync")
    public final boolean isSync;

    @InterfaceC65349Pkn("mode")
    public final int mode;

    @InterfaceC65349Pkn("repoName")
    public final String repoName;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.repoName, Integer.valueOf(this.mode), Boolean.valueOf(this.isSync)};
    }

    public KevaInfo(String repoName, int i, boolean z) {
        o.LJIIIZ(repoName, "repoName");
        this.repoName = repoName;
        this.mode = i;
        this.isSync = z;
    }
}
