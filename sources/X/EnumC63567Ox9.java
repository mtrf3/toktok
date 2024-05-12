package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Ox9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63567Ox9 implements WireEnum {
    OP_SUCCEED(0),
    REJECTED(1),
    PARTLY_REJECTED(2),
    APPLY_REJECTED(3),
    APPLY_SUCCEED(4),
    CALLBACK_REJECTED(5),
    TOUCH_LIMITS(6);

    public static final ProtoAdapter<EnumC63567Ox9> ADAPTER = new EnumAdapter<EnumC63567Ox9>() { // from class: X.OxC
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63567Ox9 LIZ(int i) {
            return EnumC63567Ox9.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63567Ox9 fromValue(int i) {
        switch (i) {
            case 0:
                return OP_SUCCEED;
            case 1:
                return REJECTED;
            case 2:
                return PARTLY_REJECTED;
            case 3:
                return APPLY_REJECTED;
            case 4:
                return APPLY_SUCCEED;
            case 5:
                return CALLBACK_REJECTED;
            case 6:
                return TOUCH_LIMITS;
            default:
                return null;
        }
    }

    public static EnumC63567Ox9 valueOf(String str) {
        return (EnumC63567Ox9) V0N.LJJJ(EnumC63567Ox9.class, str);
    }

    EnumC63567Ox9(int i) {
        this.LJLIL = i;
    }
}
