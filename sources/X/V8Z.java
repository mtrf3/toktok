package X;

/* loaded from: classes14.dex */
public final class V8Z implements InterfaceC79240V8a {
    public final int LIZ;
    public final InterfaceC79240V8a LIZIZ;
    public final Integer LIZJ;

    @Override // X.InterfaceC79240V8a
    public final W98 LIZ(C81828W9o c81828W9o, boolean z) {
        W98 LIZ;
        InterfaceC79240V8a interfaceC79240V8a = this.LIZIZ;
        W98 w98 = null;
        if (interfaceC79240V8a != null) {
            w98 = interfaceC79240V8a.LIZ(c81828W9o, z);
        }
        if (w98 == null) {
            Integer num = this.LIZJ;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        LIZ = new V8Y(this.LIZ).LIZ(c81828W9o, z);
                    } else {
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                    }
                } else {
                    LIZ = new V8X(this.LIZ, false).LIZ(c81828W9o, z);
                }
                if (LIZ != null) {
                    return LIZ;
                }
            }
            W98 LIZ2 = new V8X(this.LIZ, false).LIZ(c81828W9o, z);
            if (LIZ2 == null) {
                return new V8Y(this.LIZ).LIZ(c81828W9o, z);
            }
            return LIZ2;
        }
        return w98;
    }

    public V8Z(int i, InterfaceC79240V8a interfaceC79240V8a, Integer num) {
        this.LIZ = i;
        this.LIZIZ = interfaceC79240V8a;
        this.LIZJ = num;
    }
}
