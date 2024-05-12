package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.OyL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63641OyL implements WireEnum {
    Internal(1),
    External(2);

    public static final ProtoAdapter<EnumC63641OyL> ADAPTER = new EnumAdapter<EnumC63641OyL>() { // from class: X.OyO
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63641OyL LIZ(int i) {
            return EnumC63641OyL.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63641OyL fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return External;
        }
        return Internal;
    }

    public static EnumC63641OyL valueOf(String str) {
        return (EnumC63641OyL) V0N.LJJJ(EnumC63641OyL.class, str);
    }

    EnumC63641OyL(int i) {
        this.LJLIL = i;
    }
}
