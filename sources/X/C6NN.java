package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6NN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NN {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final InterfaceC88472Yns<View, C76800UCe> LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6NN() {
        /*
            r3 = this;
            r2 = 0
            r1 = 15
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6NN.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6NN)) {
            return false;
        }
        C6NN c6nn = (C6NN) obj;
        return this.LIZ == c6nn.LIZ && this.LIZIZ == c6nn.LIZIZ && o.LJ(this.LIZJ, c6nn.LIZJ) && o.LJ(this.LIZLLL, c6nn.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, ((this.LIZ * 31) + this.LIZIZ) * 31, 31);
        InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns = this.LIZLLL;
        if (interfaceC88472Yns == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88472Yns.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerBubbleItem(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconRes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", text=");
        LIZ.append(this.LIZJ);
        LIZ.append(", onAnim=");
        return C249109q6.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C6NN(int i, int i2, String str, int i3) {
        this((i3 & 4) != 0 ? "" : str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (InterfaceC88472Yns) null);
    }

    public C6NN(String text, int i, int i2, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(text, "text");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = text;
        this.LIZLLL = interfaceC88472Yns;
    }
}
