package X;

import android.util.SparseArray;

/* renamed from: X.Iw1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48209Iw1 {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    public static final SparseArray<EnumC48209Iw1> LJLILLLLZI;
    public final int LJLIL;

    static {
        EnumC48209Iw1 enumC48209Iw1 = MOBILE;
        EnumC48209Iw1 enumC48209Iw12 = WIFI;
        EnumC48209Iw1 enumC48209Iw13 = MOBILE_MMS;
        EnumC48209Iw1 enumC48209Iw14 = MOBILE_SUPL;
        EnumC48209Iw1 enumC48209Iw15 = MOBILE_DUN;
        EnumC48209Iw1 enumC48209Iw16 = MOBILE_HIPRI;
        EnumC48209Iw1 enumC48209Iw17 = WIMAX;
        EnumC48209Iw1 enumC48209Iw18 = BLUETOOTH;
        EnumC48209Iw1 enumC48209Iw19 = DUMMY;
        EnumC48209Iw1 enumC48209Iw110 = ETHERNET;
        EnumC48209Iw1 enumC48209Iw111 = MOBILE_FOTA;
        EnumC48209Iw1 enumC48209Iw112 = MOBILE_IMS;
        EnumC48209Iw1 enumC48209Iw113 = MOBILE_CBS;
        EnumC48209Iw1 enumC48209Iw114 = WIFI_P2P;
        EnumC48209Iw1 enumC48209Iw115 = MOBILE_IA;
        EnumC48209Iw1 enumC48209Iw116 = MOBILE_EMERGENCY;
        EnumC48209Iw1 enumC48209Iw117 = PROXY;
        EnumC48209Iw1 enumC48209Iw118 = VPN;
        EnumC48209Iw1 enumC48209Iw119 = NONE;
        SparseArray<EnumC48209Iw1> sparseArray = new SparseArray<>();
        LJLILLLLZI = sparseArray;
        sparseArray.put(0, enumC48209Iw1);
        sparseArray.put(1, enumC48209Iw12);
        sparseArray.put(2, enumC48209Iw13);
        sparseArray.put(3, enumC48209Iw14);
        sparseArray.put(4, enumC48209Iw15);
        sparseArray.put(5, enumC48209Iw16);
        sparseArray.put(6, enumC48209Iw17);
        sparseArray.put(7, enumC48209Iw18);
        sparseArray.put(8, enumC48209Iw19);
        sparseArray.put(9, enumC48209Iw110);
        sparseArray.put(10, enumC48209Iw111);
        sparseArray.put(11, enumC48209Iw112);
        sparseArray.put(12, enumC48209Iw113);
        sparseArray.put(13, enumC48209Iw114);
        sparseArray.put(14, enumC48209Iw115);
        sparseArray.put(15, enumC48209Iw116);
        sparseArray.put(16, enumC48209Iw117);
        sparseArray.put(17, enumC48209Iw118);
        sparseArray.put(-1, enumC48209Iw119);
    }

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC48209Iw1 forNumber(int i) {
        return LJLILLLLZI.get(i);
    }

    public static EnumC48209Iw1 valueOf(String str) {
        return (EnumC48209Iw1) V0N.LJJJ(EnumC48209Iw1.class, str);
    }

    EnumC48209Iw1(int i) {
        this.LJLIL = i;
    }
}
