package X;

import defpackage.q;
import defpackage.s;
import kotlin.jvm.internal.o;

/* renamed from: X.JeB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49651JeB implements InterfaceC63694OzC<C49651JeB> {
    public final s<C49647Je7> LJLIL;
    public final String LJLILLLLZI;

    public C49651JeB() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
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
        LIZ.append("SearchLatestGroupIdState(lastTwoSearchGidInfoList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C49651JeB(int i) {
        s<C49647Je7> sVar = new s<>(2);
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LJLIL = sVar;
        this.LJLILLLLZI = LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49651JeB)) {
            return false;
        }
        C49651JeB c49651JeB = (C49651JeB) obj;
        if (o.LJ(this.LJLIL, c49651JeB.LJLIL) && o.LJ(this.LJLILLLLZI, c49651JeB.LJLILLLLZI)) {
            return true;
        }
        return false;
    }
}
