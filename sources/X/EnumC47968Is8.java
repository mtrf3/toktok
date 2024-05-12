package X;

import android.util.SparseArray;

/* renamed from: X.Is8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC47968Is8 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    public static final SparseArray<EnumC47968Is8> LJLILLLLZI;
    public final int LJLIL;

    static {
        EnumC47968Is8 enumC47968Is8 = UNKNOWN_MOBILE_SUBTYPE;
        EnumC47968Is8 enumC47968Is82 = GPRS;
        EnumC47968Is8 enumC47968Is83 = EDGE;
        EnumC47968Is8 enumC47968Is84 = UMTS;
        EnumC47968Is8 enumC47968Is85 = CDMA;
        EnumC47968Is8 enumC47968Is86 = EVDO_0;
        EnumC47968Is8 enumC47968Is87 = EVDO_A;
        EnumC47968Is8 enumC47968Is88 = RTT;
        EnumC47968Is8 enumC47968Is89 = HSDPA;
        EnumC47968Is8 enumC47968Is810 = HSUPA;
        EnumC47968Is8 enumC47968Is811 = HSPA;
        EnumC47968Is8 enumC47968Is812 = IDEN;
        EnumC47968Is8 enumC47968Is813 = EVDO_B;
        EnumC47968Is8 enumC47968Is814 = LTE;
        EnumC47968Is8 enumC47968Is815 = EHRPD;
        EnumC47968Is8 enumC47968Is816 = HSPAP;
        EnumC47968Is8 enumC47968Is817 = GSM;
        EnumC47968Is8 enumC47968Is818 = TD_SCDMA;
        EnumC47968Is8 enumC47968Is819 = IWLAN;
        EnumC47968Is8 enumC47968Is820 = LTE_CA;
        SparseArray<EnumC47968Is8> sparseArray = new SparseArray<>();
        LJLILLLLZI = sparseArray;
        sparseArray.put(0, enumC47968Is8);
        sparseArray.put(1, enumC47968Is82);
        sparseArray.put(2, enumC47968Is83);
        sparseArray.put(3, enumC47968Is84);
        sparseArray.put(4, enumC47968Is85);
        sparseArray.put(5, enumC47968Is86);
        sparseArray.put(6, enumC47968Is87);
        sparseArray.put(7, enumC47968Is88);
        sparseArray.put(8, enumC47968Is89);
        sparseArray.put(9, enumC47968Is810);
        sparseArray.put(10, enumC47968Is811);
        sparseArray.put(11, enumC47968Is812);
        sparseArray.put(12, enumC47968Is813);
        sparseArray.put(13, enumC47968Is814);
        sparseArray.put(14, enumC47968Is815);
        sparseArray.put(15, enumC47968Is816);
        sparseArray.put(16, enumC47968Is817);
        sparseArray.put(17, enumC47968Is818);
        sparseArray.put(18, enumC47968Is819);
        sparseArray.put(19, enumC47968Is820);
    }

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC47968Is8 forNumber(int i) {
        return LJLILLLLZI.get(i);
    }

    public static EnumC47968Is8 valueOf(String str) {
        return (EnumC47968Is8) V0N.LJJJ(EnumC47968Is8.class, str);
    }

    EnumC47968Is8(int i) {
        this.LJLIL = i;
    }
}
