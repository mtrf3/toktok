package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KyR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53455KyR {
    public final InterfaceC88472Yns<C53447KyJ, Float> LIZ;
    public final InterfaceC88472Yns<C53447KyJ, Float> LIZIZ;

    public C53455KyR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53455KyR)) {
            return false;
        }
        C53455KyR c53455KyR = (C53455KyR) obj;
        return o.LJ(this.LIZ, c53455KyR.LIZ) && o.LJ(this.LIZIZ, c53455KyR.LIZIZ);
    }

    public final int hashCode() {
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns = this.LIZ;
        int hashCode = (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode()) * 31;
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns2 = this.LIZIZ;
        return hashCode + (interfaceC88472Yns2 != null ? interfaceC88472Yns2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarNodeSize(widthPx=");
        LIZ.append(this.LIZ);
        LIZ.append(", heightPx=");
        return C249109q6.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C53455KyR(int i) {
        this(C53451KyN.LJLIL, C53452KyO.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C53455KyR(InterfaceC88472Yns<? super C53447KyJ, Float> interfaceC88472Yns, InterfaceC88472Yns<? super C53447KyJ, Float> interfaceC88472Yns2) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88472Yns2;
    }
}
