package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.IxT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48299IxT implements WireEnum {
    UNKNOWN(0),
    WIFI(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    MOBILE_4G(4),
    MOBILE_5G(5);

    public static final ProtoAdapter<EnumC48299IxT> ADAPTER = new EnumAdapter<EnumC48299IxT>() { // from class: X.IxU
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC48299IxT LIZ(int i) {
            return EnumC48299IxT.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC48299IxT fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return MOBILE_5G;
                        }
                        return MOBILE_4G;
                    }
                    return MOBILE_3G;
                }
                return MOBILE_2G;
            }
            return WIFI;
        }
        return UNKNOWN;
    }

    public static EnumC48299IxT valueOf(String str) {
        return (EnumC48299IxT) V0N.LJJJ(EnumC48299IxT.class, str);
    }

    EnumC48299IxT(int i) {
        this.LJLIL = i;
    }
}
