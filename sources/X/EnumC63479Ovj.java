package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Ovj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63479Ovj implements WireEnum {
    JOIN_TIME(1),
    CREATED_TIME(2),
    GROUP_NAME(3),
    ACTIVE_TIME(4);

    public static final ProtoAdapter<EnumC63479Ovj> ADAPTER = new EnumAdapter<EnumC63479Ovj>() { // from class: X.Ow8
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63479Ovj LIZ(int i) {
            return EnumC63479Ovj.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63479Ovj fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return ACTIVE_TIME;
                }
                return GROUP_NAME;
            }
            return CREATED_TIME;
        }
        return JOIN_TIME;
    }

    public static EnumC63479Ovj valueOf(String str) {
        return (EnumC63479Ovj) V0N.LJJJ(EnumC63479Ovj.class, str);
    }

    EnumC63479Ovj(int i) {
        this.LJLIL = i;
    }
}
