package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Oxs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63612Oxs implements WireEnum {
    GATEWAY(0),
    BEFORE_CALLBACK(1),
    AFTER_CALLBACK(2),
    BEFORE_CONVERSATION_KAFKA(3),
    AFTER_CONVERSATION_KAFKA(4),
    BEFORE_USER_KAFKA(5),
    AFTER_USER_KAFKA(6),
    PUSH(7);

    public static final ProtoAdapter<EnumC63612Oxs> ADAPTER = new EnumAdapter<EnumC63612Oxs>() { // from class: X.Oxt
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63612Oxs LIZ(int i) {
            return EnumC63612Oxs.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63612Oxs fromValue(int i) {
        switch (i) {
            case 0:
                return GATEWAY;
            case 1:
                return BEFORE_CALLBACK;
            case 2:
                return AFTER_CALLBACK;
            case 3:
                return BEFORE_CONVERSATION_KAFKA;
            case 4:
                return AFTER_CONVERSATION_KAFKA;
            case 5:
                return BEFORE_USER_KAFKA;
            case 6:
                return AFTER_USER_KAFKA;
            case 7:
                return PUSH;
            default:
                return null;
        }
    }

    public static EnumC63612Oxs valueOf(String str) {
        return (EnumC63612Oxs) V0N.LJJJ(EnumC63612Oxs.class, str);
    }

    EnumC63612Oxs(int i) {
        this.LJLIL = i;
    }
}
