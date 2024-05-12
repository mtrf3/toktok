package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.P0y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63768P0y implements WireEnum {
    UNKNOWN_AUTH(0),
    SESSION_AUTH(1),
    TOKEN_AUTH(2);

    public static final ProtoAdapter<EnumC63768P0y> ADAPTER = new EnumAdapter<EnumC63768P0y>() { // from class: X.P0z
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63768P0y LIZ(int i) {
            return EnumC63768P0y.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63768P0y fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return TOKEN_AUTH;
            }
            return SESSION_AUTH;
        }
        return UNKNOWN_AUTH;
    }

    public static EnumC63768P0y valueOf(String str) {
        return (EnumC63768P0y) V0N.LJJJ(EnumC63768P0y.class, str);
    }

    EnumC63768P0y(int i) {
        this.LJLIL = i;
    }
}
