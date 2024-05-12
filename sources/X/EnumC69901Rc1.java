package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Rc1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC69901Rc1 implements WireEnum {
    FROM_UNKNOWN(0),
    FROM_FRONTIER(1),
    FROM_HTTP(2),
    FROM_SERVER(3);

    public static final ProtoAdapter<EnumC69901Rc1> ADAPTER = new EnumAdapter<EnumC69901Rc1>() { // from class: X.Rc4
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC69901Rc1 LIZ(int i) {
            return EnumC69901Rc1.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC69901Rc1 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FROM_SERVER;
                }
                return FROM_HTTP;
            }
            return FROM_FRONTIER;
        }
        return FROM_UNKNOWN;
    }

    public static EnumC69901Rc1 valueOf(String str) {
        return (EnumC69901Rc1) V0N.LJJJ(EnumC69901Rc1.class, str);
    }

    EnumC69901Rc1(int i) {
        this.LJLIL = i;
    }
}
