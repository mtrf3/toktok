package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.9bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240209bk implements InterfaceC57784Mm4 {
    public final InterfaceC88472Yns<Context, C76800UCe> LJLIL;

    public C240209bk() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C240209bk) && o.LJ(this.LJLIL, ((C240209bk) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        InterfaceC88472Yns<Context, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns == null) {
            return 0;
        }
        return interfaceC88472Yns.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeatureVideoCreateNewVideoItem(clickListener=");
        return C249109q6.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C240209bk(InterfaceC88472Yns<? super Context, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
