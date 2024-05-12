package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes11.dex */
public enum P10 implements WireEnum {
    REFER_NOT_USED(0),
    ANDROID(1),
    IOS(2),
    PC(3),
    SERVER(4);

    public static final ProtoAdapter<P10> ADAPTER = new EnumAdapter<P10>() { // from class: X.P11
        @Override // com.squareup.wire.EnumAdapter
        public final P10 LIZ(int i) {
            return P10.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static P10 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SERVER;
                    }
                    return PC;
                }
                return IOS;
            }
            return ANDROID;
        }
        return REFER_NOT_USED;
    }

    public static P10 valueOf(String str) {
        return (P10) V0N.LJJJ(P10.class, str);
    }

    P10(int i) {
        this.LJLIL = i;
    }
}
