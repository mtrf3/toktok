package X;

import defpackage.i0;

/* renamed from: X.0tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22110tr {
    public static final /* synthetic */ C22110tr LIZ = new C22110tr();

    public static InterfaceC22120ts LIZ(final long j) {
        if (j != C11850dJ.LJI) {
            return new InterfaceC22120ts(j) { // from class: X.1ZS
                public final long LIZIZ;

                @Override // X.InterfaceC22120ts
                public final /* synthetic */ InterfaceC22120ts LIZIZ(InterfaceC22120ts interfaceC22120ts) {
                    return i0.LIZ(this, interfaceC22120ts);
                }

                @Override // X.InterfaceC22120ts
                public final AbstractC11740d8 LIZLLL() {
                    return null;
                }

                @Override // X.InterfaceC22120ts
                public final /* synthetic */ InterfaceC22120ts LJ(InterfaceC65784Pro interfaceC65784Pro) {
                    return i0.LIZIZ(this, interfaceC65784Pro);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1ZS) && C11850dJ.LIZJ(this.LIZIZ, ((C1ZS) obj).LIZIZ);
                }

                public final String toString() {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ColorStyle(value=");
                    LIZ2.append((Object) C11850dJ.LJIIIIZZ(this.LIZIZ));
                    LIZ2.append(')');
                    return X1D.LIZIZ(LIZ2);
                }

                @Override // X.InterfaceC22120ts
                public final float LIZ() {
                    return C11850dJ.LIZLLL(this.LIZIZ);
                }

                public final int hashCode() {
                    return C61876OQe.LIZJ(this.LIZIZ);
                }

                @Override // X.InterfaceC22120ts
                public final long LIZJ() {
                    return this.LIZIZ;
                }

                {
                    this.LIZIZ = j;
                    if (j != C11850dJ.LJI) {
                        return;
                    }
                    "ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString();
                    throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                }
            };
        }
        return C1ZT.LIZIZ;
    }
}
