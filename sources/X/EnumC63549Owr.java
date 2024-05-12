package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Owr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63549Owr implements WireEnum {
    SEND_SUCCEED(0),
    USER_NOT_IN_CONVERSATION(1),
    CHECK_CONV_NOT_PASS(2),
    CHECK_MSG_NOT_PASS(3),
    CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE(4),
    USER_HAS_BEEN_BLOCKED(5);

    public static final ProtoAdapter<EnumC63549Owr> ADAPTER = new EnumAdapter<EnumC63549Owr>() { // from class: X.Ows
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63549Owr LIZ(int i) {
            return EnumC63549Owr.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63549Owr fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return USER_HAS_BEEN_BLOCKED;
                        }
                        return CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE;
                    }
                    return CHECK_MSG_NOT_PASS;
                }
                return CHECK_CONV_NOT_PASS;
            }
            return USER_NOT_IN_CONVERSATION;
        }
        return SEND_SUCCEED;
    }

    public static EnumC63549Owr valueOf(String str) {
        return (EnumC63549Owr) V0N.LJJJ(EnumC63549Owr.class, str);
    }

    EnumC63549Owr(int i) {
        this.LJLIL = i;
    }
}
