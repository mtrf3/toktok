package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes11.dex */
public enum P09 implements WireEnum {
    TYPE_BY_CONVERSATION(1),
    TYPE_BY_USER(2),
    TYPE_BY_RANK(3);

    public static final ProtoAdapter<P09> ADAPTER = new EnumAdapter<P09>() { // from class: X.P0A
        @Override // com.squareup.wire.EnumAdapter
        public final P09 LIZ(int i) {
            return P09.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static P09 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return TYPE_BY_RANK;
            }
            return TYPE_BY_USER;
        }
        return TYPE_BY_CONVERSATION;
    }

    public static P09 valueOf(String str) {
        return (P09) V0N.LJJJ(P09.class, str);
    }

    P09(int i) {
        this.LJLIL = i;
    }
}
