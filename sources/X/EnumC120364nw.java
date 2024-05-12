package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.4nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC120364nw implements WireEnum {
    APPLY_SUCCESS(0),
    UPDATE_STATUS_ERR(1),
    CALLBACK_NOT_PASS(2),
    APPLY_NOT_EXIST(3),
    APPLY_PARAMS_ERR(4),
    CONV_SWITCH_CLOSED(5),
    USER_NO_PERMISSION(6),
    USER_ALREADY_IN_GROUP(7),
    CALLBACK_NO_NEED_AUDIT(8),
    APPLY_CONVERSATION_NOT_FOUND(9),
    CONVERSATION_IS_FULL(10),
    APPLY_INTERNAL_ERR(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);

    public static final ProtoAdapter<EnumC120364nw> ADAPTER = new EnumAdapter<EnumC120364nw>() { // from class: X.4nx
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC120364nw LIZ(int i) {
            return EnumC120364nw.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC120364nw fromValue(int i) {
        if (i != 500) {
            switch (i) {
                case 0:
                    return APPLY_SUCCESS;
                case 1:
                    return UPDATE_STATUS_ERR;
                case 2:
                    return CALLBACK_NOT_PASS;
                case 3:
                    return APPLY_NOT_EXIST;
                case 4:
                    return APPLY_PARAMS_ERR;
                case 5:
                    return CONV_SWITCH_CLOSED;
                case 6:
                    return USER_NO_PERMISSION;
                case 7:
                    return USER_ALREADY_IN_GROUP;
                case 8:
                    return CALLBACK_NO_NEED_AUDIT;
                case 9:
                    return APPLY_CONVERSATION_NOT_FOUND;
                case 10:
                    return CONVERSATION_IS_FULL;
                default:
                    return null;
            }
        }
        return APPLY_INTERNAL_ERR;
    }

    public static EnumC120364nw valueOf(String str) {
        return (EnumC120364nw) V0N.LJJJ(EnumC120364nw.class, str);
    }

    EnumC120364nw(int i) {
        this.LJLIL = i;
    }
}
