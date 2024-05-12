package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jdj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49623Jdj implements InterfaceC63694OzC<C49623Jdj> {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;

    public C49623Jdj() {
        this(null, false, 7);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_stack_id", this.LJLIL);
        linkedHashMap.put("search_stack_top", Boolean.valueOf(this.LJLILLLLZI));
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLJI.hashCode() + ((hashCode + i) * 31);
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
        LIZ.append("SearchStackState(searchStackId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", searchStackTop=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49623Jdj)) {
            return false;
        }
        C49623Jdj c49623Jdj = (C49623Jdj) obj;
        if (o.LJ(this.LJLIL, c49623Jdj.LJLIL) && this.LJLILLLLZI == c49623Jdj.LJLILLLLZI && o.LJ(this.LJLJI, c49623Jdj.LJLJI)) {
            return true;
        }
        return false;
    }

    public C49623Jdj(String searchStackId, boolean z, int i) {
        String sourceId;
        searchStackId = (i & 1) != 0 ? "" : searchStackId;
        z = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            sourceId = AnonymousClass629.LIZ("randomUUID().toString()");
        } else {
            sourceId = null;
        }
        o.LJIIIZ(searchStackId, "searchStackId");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = searchStackId;
        this.LJLILLLLZI = z;
        this.LJLJI = sourceId;
    }
}
