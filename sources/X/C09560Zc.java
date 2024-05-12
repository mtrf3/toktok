package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0Zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09560Zc {
    public EnumC09550Zb LIZ;
    public List<? extends InterfaceC15200ii> LIZIZ;
    public InterfaceC32651Px LIZJ;
    public C1OX LIZLLL;
    public InterfaceC10890bl LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09560Zc)) {
            return false;
        }
        C09560Zc c09560Zc = (C09560Zc) obj;
        return this.LIZ == c09560Zc.LIZ && o.LJ(this.LIZIZ, c09560Zc.LIZIZ) && o.LJ(this.LIZJ, c09560Zc.LIZJ) && o.LJ(this.LIZLLL, c09560Zc.LIZLLL) && o.LJ(this.LJ, c09560Zc.LJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<? extends InterfaceC15200ii> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        InterfaceC32651Px interfaceC32651Px = this.LIZJ;
        int hashCode3 = (hashCode2 + (interfaceC32651Px == null ? 0 : interfaceC32651Px.hashCode())) * 31;
        C1OX c1ox = this.LIZLLL;
        return this.LJ.hashCode() + ((hashCode3 + (c1ox != null ? c1ox.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KVRepoConfig(mode=");
        LIZ.append(this.LIZ);
        LIZ.append(", repoProxy=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sourceRepo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", migrationKeyInformation=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", repoFactory=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C09560Zc(EnumC09550Zb mode, List<? extends InterfaceC15200ii> list, InterfaceC32651Px interfaceC32651Px, C1OX c1ox, InterfaceC10890bl interfaceC10890bl) {
        o.LJIIIZ(mode, "mode");
        this.LIZ = mode;
        this.LIZIZ = list;
        this.LIZJ = interfaceC32651Px;
        this.LIZLLL = c1ox;
        this.LJ = interfaceC10890bl;
    }
}
