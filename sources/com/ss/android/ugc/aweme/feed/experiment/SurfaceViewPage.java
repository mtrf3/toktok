package com.ss.android.ugc.aweme.feed.experiment;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SurfaceViewPage {

    @InterfaceC65349Pkn("pages")
    public final List<String> pages;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceViewPage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurfaceViewPage) && o.LJ(this.pages, ((SurfaceViewPage) obj).pages);
    }

    public final int hashCode() {
        List<String> list = this.pages;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SurfaceViewPage(pages=");
        return C1NE.LIZIZ(LIZ, this.pages, ')', LIZ);
    }

    public SurfaceViewPage(List<String> list) {
        this.pages = list;
    }

    public /* synthetic */ SurfaceViewPage(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
