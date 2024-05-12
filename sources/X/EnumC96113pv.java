package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.3pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC96113pv implements WireEnum {
    ORDINARY(0),
    OWNER(1),
    MANAGER(2),
    VISITOR(3),
    SYSTEM(4);

    public static final ProtoAdapter<EnumC96113pv> ADAPTER = new EnumAdapter<EnumC96113pv>() { // from class: X.3py
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC96113pv LIZ(int i) {
            return EnumC96113pv.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC96113pv fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SYSTEM;
                    }
                    return VISITOR;
                }
                return MANAGER;
            }
            return OWNER;
        }
        return ORDINARY;
    }

    public static EnumC96113pv valueOf(String str) {
        return (EnumC96113pv) V0N.LJJJ(EnumC96113pv.class, str);
    }

    EnumC96113pv(int i) {
        this.LJLIL = i;
    }
}
