package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JeH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49657JeH implements InterfaceC63694OzC<C49657JeH> {
    public final C49847JhL LJLIL;
    public final String LJLILLLLZI;

    public C49657JeH() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("auto_triggered", this.LJLIL);
        return linkedHashMap;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
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
        LIZ.append("SearchStreamBindingState(streamRoot=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C49657JeH(int i) {
        this(new C49847JhL(0), AnonymousClass629.LIZ("randomUUID().toString()"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49657JeH)) {
            return false;
        }
        C49657JeH c49657JeH = (C49657JeH) obj;
        if (o.LJ(this.LJLIL, c49657JeH.LJLIL) && o.LJ(this.LJLILLLLZI, c49657JeH.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C49657JeH(C49847JhL streamRoot, String sourceId) {
        o.LJIIIZ(streamRoot, "streamRoot");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = streamRoot;
        this.LJLILLLLZI = sourceId;
    }
}
