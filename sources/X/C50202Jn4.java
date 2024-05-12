package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jn4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50202Jn4 {
    public final List<SearchLabel> LIZ;
    public final String LIZIZ;

    public C50202Jn4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50202Jn4)) {
            return false;
        }
        C50202Jn4 c50202Jn4 = (C50202Jn4) obj;
        return o.LJ(this.LIZ, c50202Jn4.LIZ) && o.LJ(this.LIZIZ, c50202Jn4.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchHubTabs(tabs=");
        LIZ.append(this.LIZ);
        LIZ.append(", color=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C50202Jn4(int i) {
        this(C61878OQg.INSTANCE, null);
    }

    public C50202Jn4(List<SearchLabel> tabs, String str) {
        o.LJIIIZ(tabs, "tabs");
        this.LIZ = tabs;
        this.LIZIZ = str;
    }
}
