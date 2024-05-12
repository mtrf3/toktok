package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Rc2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC69902Rc2 implements WireEnum {
    ENTER_CONVERSATION(1),
    EXIT_CONVERSATION(2);

    public static final ProtoAdapter<EnumC69902Rc2> ADAPTER = new EnumAdapter<EnumC69902Rc2>() { // from class: X.Rc7
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC69902Rc2 LIZ(int i) {
            return EnumC69902Rc2.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC69902Rc2 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return EXIT_CONVERSATION;
        }
        return ENTER_CONVERSATION;
    }

    public static EnumC69902Rc2 valueOf(String str) {
        return (EnumC69902Rc2) V0N.LJJJ(EnumC69902Rc2.class, str);
    }

    EnumC69902Rc2(int i) {
        this.LJLIL = i;
    }
}
