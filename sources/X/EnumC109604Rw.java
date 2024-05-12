package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.4Rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC109604Rw implements WireEnum {
    AVAILABLE(0),
    NOT_EXIST(1),
    INVISIBLE(2),
    RECALLED(3),
    DELETED(4),
    VIOLATIVE(5);

    public static final ProtoAdapter<EnumC109604Rw> ADAPTER = new EnumAdapter<EnumC109604Rw>() { // from class: X.4Rx
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC109604Rw LIZ(int i) {
            return EnumC109604Rw.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC109604Rw fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return VIOLATIVE;
                        }
                        return DELETED;
                    }
                    return RECALLED;
                }
                return INVISIBLE;
            }
            return NOT_EXIST;
        }
        return AVAILABLE;
    }

    public static EnumC109604Rw valueOf(String str) {
        return (EnumC109604Rw) V0N.LJJJ(EnumC109604Rw.class, str);
    }

    EnumC109604Rw(int i) {
        this.LJLIL = i;
    }
}
