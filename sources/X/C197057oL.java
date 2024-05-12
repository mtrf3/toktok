package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197057oL {
    public final EnumC197067oM LIZ;
    public final InterfaceC46811IYt LIZIZ;
    public final C196947oA LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C197057oL() {
        this((EnumC197067oM) null, (C44418Hby) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C197057oL)) {
            return false;
        }
        C197057oL c197057oL = (C197057oL) obj;
        return this.LIZ == c197057oL.LIZ && o.LJ(this.LIZIZ, c197057oL.LIZIZ) && o.LJ(this.LIZJ, c197057oL.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC46811IYt interfaceC46811IYt = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC46811IYt == null ? 0 : interfaceC46811IYt.hashCode())) * 31;
        C196947oA c196947oA = this.LIZJ;
        return hashCode2 + (c196947oA != null ? c196947oA.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowPlayRequest(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", realRequest=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", config=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C197057oL(EnumC197067oM enumC197067oM, C44418Hby c44418Hby, int i) {
        this((i & 1) != 0 ? EnumC197067oM.INVALID : enumC197067oM, (i & 2) != 0 ? null : c44418Hby, (C196947oA) null);
    }

    public C197057oL(EnumC197067oM type, InterfaceC46811IYt interfaceC46811IYt, C196947oA c196947oA) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = interfaceC46811IYt;
        this.LIZJ = c196947oA;
    }
}
