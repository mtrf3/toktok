package X;

import java.util.Arrays;

/* renamed from: X.IpP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47799IpP {
    public static final C47799IpP LIZJ = new C47799IpP();
    public C48433Izd LIZ;
    public final boolean LIZIZ;

    public C47799IpP() {
    }

    public C47799IpP(boolean z) {
        this.LIZIZ = z;
    }

    public final void LIZJ(C47871IqZ c47871IqZ) {
        if (c47871IqZ == null || c47871IqZ.LIZLLL != 1) {
            return;
        }
        LIZ(c47871IqZ.LIZJ, c47871IqZ.LIZ, c47871IqZ.LIZIZ);
    }

    public final void LIZIZ(int i, java.util.Map map) {
        if (this.LIZIZ) {
            if (map == null || map.isEmpty()) {
                return;
            }
            int[] iArr = new int[map.size()];
            int[] iArr2 = new int[map.size()];
            int i2 = 0;
            for (C47871IqZ c47871IqZ : map.values()) {
                if (c47871IqZ.LIZLLL == 1 && ((C47872Iqa) c47871IqZ).LJFF == i) {
                    int i3 = c47871IqZ.LIZJ;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    C78253UnR.LIZLLL("PlayerConfigExecutor", "unknown value type");
                                } else {
                                    C48433Izd c48433Izd = this.LIZ;
                                    if (c48433Izd != null) {
                                        c48433Izd.LIZLLL(c47871IqZ.LIZ, (String) c47871IqZ.LIZIZ);
                                    }
                                }
                            } else {
                                C48433Izd c48433Izd2 = this.LIZ;
                                if (c48433Izd2 != null) {
                                    c48433Izd2.LIZJ(((Float) c47871IqZ.LIZIZ).floatValue(), c47871IqZ.LIZ);
                                }
                            }
                        } else {
                            C48433Izd c48433Izd3 = this.LIZ;
                            if (c48433Izd3 != null) {
                                c48433Izd3.LJFF(c47871IqZ.LIZ, ((Long) c47871IqZ.LIZIZ).longValue());
                            }
                        }
                    } else {
                        iArr[i2] = c47871IqZ.LIZ;
                        iArr2[i2] = ((Integer) c47871IqZ.LIZIZ).intValue();
                        i2++;
                    }
                }
            }
            if (i2 <= 0) {
                return;
            }
            C48433Izd c48433Izd4 = this.LIZ;
            Arrays.copyOf(iArr, i2);
            Arrays.copyOf(iArr2, i2);
            c48433Izd4.getClass();
            return;
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        for (C47871IqZ c47871IqZ2 : map.values()) {
            if (c47871IqZ2.LIZLLL == 1 && ((C47872Iqa) c47871IqZ2).LJFF == i) {
                LIZ(c47871IqZ2.LIZJ, c47871IqZ2.LIZ, c47871IqZ2.LIZIZ);
            }
        }
    }

    public final void LIZ(int i, int i2, Object obj) {
        C48433Izd c48433Izd = this.LIZ;
        if (c48433Izd == null) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C78253UnR.LIZLLL("PlayerConfigExecutor", "unknown value type");
                        return;
                    } else {
                        c48433Izd.LIZLLL(i2, (String) obj);
                        return;
                    }
                }
                c48433Izd.LIZJ(((Float) obj).floatValue(), i2);
                return;
            }
            c48433Izd.LJFF(i2, ((Long) obj).longValue());
            return;
        }
        c48433Izd.LJ(i2, ((Integer) obj).intValue());
    }
}
