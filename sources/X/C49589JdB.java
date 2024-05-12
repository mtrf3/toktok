package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JdB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49589JdB implements InterfaceC63694OzC<C49589JdB> {
    public final long LJLIL;
    public final String LJLILLLLZI;

    public C49589JdB() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_session_id", Long.valueOf(this.LJLIL));
        return linkedHashMap;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (C16880lQ.LLJIJIL(this.LJLIL) * 31);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchSessionState(searchSessionId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C49589JdB(int i) {
        this(0L, AnonymousClass629.LIZ("randomUUID().toString()"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49589JdB)) {
            return false;
        }
        C49589JdB c49589JdB = (C49589JdB) obj;
        if (this.LJLIL == c49589JdB.LJLIL && o.LJ(this.LJLILLLLZI, c49589JdB.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C49589JdB(long j, String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = j;
        this.LJLILLLLZI = sourceId;
    }
}
