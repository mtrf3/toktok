package X;

import com.ss.android.ugc.aweme.search.source.neo.model.SearchResult;
import com.ss.android.ugc.aweme.search.source.utils.RecommendInfoConfig;
import defpackage.q;
import defpackage.s;
import kotlin.jvm.internal.o;

/* renamed from: X.Jr3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50449Jr3 implements InterfaceC63694OzC<C50449Jr3> {
    public final s<SearchResult> LJLIL;
    public final long LJLILLLLZI;
    public final transient String LJLJI;

    public C50449Jr3() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + JBR.LIZJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchRecommendInfoState(searchResults=");
        LIZ.append(this.LJLIL);
        LIZ.append(", timestamp=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C50449Jr3(int i) {
        this(new s(((RecommendInfoConfig) C50454Jr8.LIZIZ.getValue()).maxQueryCount), -1L, AnonymousClass629.LIZ("randomUUID().toString()"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50449Jr3)) {
            return false;
        }
        C50449Jr3 c50449Jr3 = (C50449Jr3) obj;
        if (o.LJ(this.LJLIL, c50449Jr3.LJLIL) && this.LJLILLLLZI == c50449Jr3.LJLILLLLZI && o.LJ(this.LJLJI, c50449Jr3.LJLJI)) {
            return true;
        }
        return false;
    }

    public static C50449Jr3 LIZ(C50449Jr3 c50449Jr3, long j) {
        s<SearchResult> searchResults = c50449Jr3.LJLIL;
        String sourceId = c50449Jr3.LJLJI;
        c50449Jr3.getClass();
        o.LJIIIZ(searchResults, "searchResults");
        o.LJIIIZ(sourceId, "sourceId");
        return new C50449Jr3(searchResults, j, sourceId);
    }

    public C50449Jr3(s<SearchResult> searchResults, long j, String sourceId) {
        o.LJIIIZ(searchResults, "searchResults");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = searchResults;
        this.LJLILLLLZI = j;
        this.LJLJI = sourceId;
    }
}
