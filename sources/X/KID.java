package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KID implements InterfaceC63694OzC<KID> {
    public final long LJLIL;
    public final String LJLILLLLZI;

    public KID() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("music_search_session_id", Long.valueOf(this.LJLIL));
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
        LIZ.append("MusicSearchSessionState(musicSearchSessionId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ KID(int i) {
        this(0L, AnonymousClass629.LIZ("randomUUID().toString()"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KID)) {
            return false;
        }
        KID kid = (KID) obj;
        if (this.LJLIL == kid.LJLIL && o.LJ(this.LJLILLLLZI, kid.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public KID(long j, String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = j;
        this.LJLILLLLZI = sourceId;
    }
}
