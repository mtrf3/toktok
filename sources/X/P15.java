package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes11.dex */
public enum P15 implements WireEnum {
    PER_USER(1),
    PER_CONVERSATION(2);

    public static final ProtoAdapter<P15> ADAPTER = new EnumAdapter<P15>() { // from class: X.P16
        @Override // com.squareup.wire.EnumAdapter
        public final P15 LIZ(int i) {
            return P15.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static P15 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return PER_CONVERSATION;
        }
        return PER_USER;
    }

    public static P15 valueOf(String str) {
        return (P15) V0N.LJJJ(P15.class, str);
    }

    P15(int i) {
        this.LJLIL = i;
    }
}
