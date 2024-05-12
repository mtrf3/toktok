package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.4gX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC115774gX implements WireEnum {
    APPLYING(1),
    AGREE(2),
    DENY(3),
    INVALID(4);

    public static final ProtoAdapter<EnumC115774gX> ADAPTER = new EnumAdapter<EnumC115774gX>() { // from class: X.4gY
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC115774gX LIZ(int i) {
            return EnumC115774gX.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC115774gX fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return INVALID;
                }
                return DENY;
            }
            return AGREE;
        }
        return APPLYING;
    }

    public static EnumC115774gX valueOf(String str) {
        return (EnumC115774gX) V0N.LJJJ(EnumC115774gX.class, str);
    }

    EnumC115774gX(int i) {
        this.LJLIL = i;
    }
}
