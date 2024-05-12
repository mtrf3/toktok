package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Rc3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC69903Rc3 implements WireEnum {
    TYPE_MENTION(1),
    TYPE_SEND_BY_GROUP_OWNER(2),
    TYPE_AUTO_SEND_BY_SERVER(3),
    TYPE_MENTION_AND_SEND_BY_GROUP_OWNER(4);

    public static final ProtoAdapter<EnumC69903Rc3> ADAPTER = new EnumAdapter<EnumC69903Rc3>() { // from class: X.Rc5
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC69903Rc3 LIZ(int i) {
            return EnumC69903Rc3.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC69903Rc3 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return TYPE_MENTION_AND_SEND_BY_GROUP_OWNER;
                }
                return TYPE_AUTO_SEND_BY_SERVER;
            }
            return TYPE_SEND_BY_GROUP_OWNER;
        }
        return TYPE_MENTION;
    }

    public static EnumC69903Rc3 valueOf(String str) {
        return (EnumC69903Rc3) V0N.LJJJ(EnumC69903Rc3.class, str);
    }

    EnumC69903Rc3(int i) {
        this.LJLIL = i;
    }
}
