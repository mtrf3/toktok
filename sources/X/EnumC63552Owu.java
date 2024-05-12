package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Owu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63552Owu implements WireEnum {
    OK(0),
    INVALID_TOKEN(1),
    EXPIRED_TOKEN(100),
    INVALID_TICKET(2),
    CONVERSATION_NOT_FOUND(3),
    INVALID_REQUEST(4),
    INVALID_CMD(5),
    SERVER_ERR(6),
    USER_FORBIDDEN(11),
    DEVICE_NOT_BIND(7),
    MESSAGE_ILLEGAL(8),
    USER_ILLEGAL(9),
    USER_NOT_FRIENDS(10),
    USER_SILENCE(12),
    USER_NOT_IN_GROUP(13),
    USER_BANNED_TO_POST(14),
    INTERNAL_ERROR(LiveMaxRetainAlogMessageSizeSetting.DEFAULT),
    MESSAGE_TARGET_CONVERSATION_NOT_EXIST(15),
    DEGRADATION_ERROR(16),
    RECALL_TIMEOUT(17),
    TOUCH_LIMIT(18),
    CALLBACK_DENY(19),
    CONV_NOT_FOUND(100017);

    public static final ProtoAdapter<EnumC63552Owu> ADAPTER = new EnumAdapter<EnumC63552Owu>() { // from class: X.Owv
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63552Owu LIZ(int i) {
            return EnumC63552Owu.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63552Owu fromValue(int i) {
        if (i != 100) {
            if (i != 500) {
                if (i != 100017) {
                    switch (i) {
                        case 0:
                            return OK;
                        case 1:
                            return INVALID_TOKEN;
                        case 2:
                            return INVALID_TICKET;
                        case 3:
                            return CONVERSATION_NOT_FOUND;
                        case 4:
                            return INVALID_REQUEST;
                        case 5:
                            return INVALID_CMD;
                        case 6:
                            return SERVER_ERR;
                        case 7:
                            return DEVICE_NOT_BIND;
                        case 8:
                            return MESSAGE_ILLEGAL;
                        case 9:
                            return USER_ILLEGAL;
                        case 10:
                            return USER_NOT_FRIENDS;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            return USER_FORBIDDEN;
                        case 12:
                            return USER_SILENCE;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            return USER_NOT_IN_GROUP;
                        case 14:
                            return USER_BANNED_TO_POST;
                        case 15:
                            return MESSAGE_TARGET_CONVERSATION_NOT_EXIST;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            return DEGRADATION_ERROR;
                        case 17:
                            return RECALL_TIMEOUT;
                        case 18:
                            return TOUCH_LIMIT;
                        case 19:
                            return CALLBACK_DENY;
                        default:
                            return null;
                    }
                }
                return CONV_NOT_FOUND;
            }
            return INTERNAL_ERROR;
        }
        return EXPIRED_TOKEN;
    }

    public static EnumC63552Owu valueOf(String str) {
        return (EnumC63552Owu) V0N.LJJJ(EnumC63552Owu.class, str);
    }

    EnumC63552Owu(int i) {
        this.LJLIL = i;
    }
}
