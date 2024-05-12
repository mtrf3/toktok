package X;

/* renamed from: X.HgC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44680HgC implements InterfaceC44516HdY {
    @Override // X.InterfaceC44516HdY
    public final Integer LIZIZ(int i) {
        if (i <= 720 && 1 <= i) {
            boolean[] zArr = C44985Hl7.LIZIZ;
            if (zArr[5] || zArr[4]) {
                return 62;
            }
            return 40;
        }
        return null;
    }

    @Override // X.InterfaceC44516HdY
    public final OSZ<Boolean, OSZ<Integer, Boolean>> LIZ(int i, int i2, int i3, int i4) {
        if (i <= 720 && 1 <= i) {
            if (1 <= i3) {
                if (i3 < 41) {
                    return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
                }
                if (i3 < 63) {
                    if (i4 == 28) {
                        if (C44985Hl7.LIZIZ[0]) {
                            return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.valueOf(C44985Hl7.LIZ[0])));
                        }
                    } else if (i4 == 174 && C44985Hl7.LIZIZ[1]) {
                        return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.valueOf(C44985Hl7.LIZ[1])));
                    }
                }
            } else if (i3 == 0 && i4 == 0) {
                if (((Boolean) C44681HgD.LIZ.getValue()).booleanValue()) {
                    return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
                }
                if (C44985Hl7.LIZIZ[0]) {
                    return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.valueOf(C44985Hl7.LIZ[0])));
                }
            }
            return new OSZ<>(Boolean.TRUE, new OSZ(-3, Boolean.FALSE));
        }
        Boolean bool = Boolean.FALSE;
        return new OSZ<>(bool, new OSZ(-1, bool));
    }
}
