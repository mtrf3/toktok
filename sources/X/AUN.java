package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AUN implements InterfaceC53590L1m<C53464Kya> {
    public final C53464Kya LIZ;
    public final InterfaceC88472Yns<L4O, L4O> LIZIZ;
    public final EnumC53663L4h LIZJ;

    public AUN() {
        this(null, 3);
    }

    public final int hashCode() {
        int hashCode;
        C53464Kya c53464Kya = this.LIZ;
        int i = 0;
        if (c53464Kya == null) {
            hashCode = 0;
        } else {
            hashCode = c53464Kya.hashCode();
        }
        int i2 = hashCode * 31;
        InterfaceC88472Yns<L4O, L4O> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            i = interfaceC88472Yns.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarLiveData(variant=");
        LIZ.append(this.LIZ);
        LIZ.append(", stateInterceptor=");
        return C249109q6.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // X.InterfaceC53590L1m
    public final EnumC53663L4h LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC53590L1m
    public final /* bridge */ /* synthetic */ C53464Kya LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AUN)) {
            return false;
        }
        AUN aun = (AUN) obj;
        if (o.LJ(this.LIZ, aun.LIZ) && o.LJ(this.LIZIZ, aun.LIZIZ)) {
            return true;
        }
        return false;
    }

    public AUN(C53464Kya c53464Kya, int i) {
        this.LIZ = (i & 1) != 0 ? null : c53464Kya;
        this.LIZIZ = null;
        this.LIZJ = EnumC53663L4h.LIVE;
    }
}
