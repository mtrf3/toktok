package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Orl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63233Orl implements WireEnum {
    MODIFY_PROPERTY_SUCCESS(0),
    MODIFY_PROPERTY_REPEAT_REQUEST(1),
    MODIFY_PROPERTY_INVALID_LENGTH(2),
    MODIFY_PROPERTY_INVALID_REQUEST(3),
    MODIFY_PROPERTY_CALLBACK_ERROR(4),
    MODIFY_PROPERTY_INTERNAL_ERROR(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);

    public static final ProtoAdapter<EnumC63233Orl> ADAPTER = new EnumAdapter<EnumC63233Orl>() { // from class: X.Ors
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63233Orl LIZ(int i) {
            return EnumC63233Orl.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63233Orl fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 500) {
                                return null;
                            }
                            return MODIFY_PROPERTY_INTERNAL_ERROR;
                        }
                        return MODIFY_PROPERTY_CALLBACK_ERROR;
                    }
                    return MODIFY_PROPERTY_INVALID_REQUEST;
                }
                return MODIFY_PROPERTY_INVALID_LENGTH;
            }
            return MODIFY_PROPERTY_REPEAT_REQUEST;
        }
        return MODIFY_PROPERTY_SUCCESS;
    }

    public static EnumC63233Orl valueOf(String str) {
        return (EnumC63233Orl) V0N.LJJJ(EnumC63233Orl.class, str);
    }

    EnumC63233Orl(int i) {
        this.LJLIL = i;
    }
}
