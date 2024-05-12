package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.OsA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63258OsA implements WireEnum {
    ADD_PROPERTY_ITEM(0),
    REMOVE_PROPERTY_ITEM(1),
    SET_PROPERTY(2),
    DEL_PROPERTY(3),
    XSET_PROPERTY(4),
    MODIFY_PROPERTY(5);

    public static final ProtoAdapter<EnumC63258OsA> ADAPTER = new EnumAdapter<EnumC63258OsA>() { // from class: X.OsB
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63258OsA LIZ(int i) {
            return EnumC63258OsA.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63258OsA fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return MODIFY_PROPERTY;
                        }
                        return XSET_PROPERTY;
                    }
                    return DEL_PROPERTY;
                }
                return SET_PROPERTY;
            }
            return REMOVE_PROPERTY_ITEM;
        }
        return ADD_PROPERTY_ITEM;
    }

    public static EnumC63258OsA valueOf(String str) {
        return (EnumC63258OsA) V0N.LJJJ(EnumC63258OsA.class, str);
    }

    EnumC63258OsA(int i) {
        this.LJLIL = i;
    }
}
