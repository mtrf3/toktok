package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.P0h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63751P0h implements WireEnum {
    UNBLOCK(0),
    BLOCK(1);

    public static final ProtoAdapter<EnumC63751P0h> ADAPTER = new EnumAdapter<EnumC63751P0h>() { // from class: X.P0i
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63751P0h LIZ(int i) {
            return EnumC63751P0h.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63751P0h fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BLOCK;
        }
        return UNBLOCK;
    }

    public static EnumC63751P0h valueOf(String str) {
        return (EnumC63751P0h) V0N.LJJJ(EnumC63751P0h.class, str);
    }

    EnumC63751P0h(int i) {
        this.LJLIL = i;
    }
}
