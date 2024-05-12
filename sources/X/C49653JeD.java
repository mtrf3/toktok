package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JeD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49653JeD implements InterfaceC63694OzC<C49653JeD> {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    public C49653JeD() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("auto_triggered", Boolean.valueOf(this.LJLIL));
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.LJLILLLLZI.hashCode() + (r0 * 31);
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
        LIZ.append("SearchLocationState(autoTriggered=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C49653JeD(int i) {
        this(false, AnonymousClass629.LIZ("randomUUID().toString()"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49653JeD)) {
            return false;
        }
        C49653JeD c49653JeD = (C49653JeD) obj;
        if (this.LJLIL == c49653JeD.LJLIL && o.LJ(this.LJLILLLLZI, c49653JeD.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C49653JeD(boolean z, String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = z;
        this.LJLILLLLZI = sourceId;
    }
}
