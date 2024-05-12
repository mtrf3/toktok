package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Rc0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC69900Rc0 implements WireEnum {
    TICKET_TYPE_APP(1),
    TICKET_TYPE_PC(2),
    TICKET_TYPE_WEB(3);

    public static final ProtoAdapter<EnumC69900Rc0> ADAPTER = new EnumAdapter<EnumC69900Rc0>() { // from class: X.Rc6
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC69900Rc0 LIZ(int i) {
            return EnumC69900Rc0.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC69900Rc0 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return TICKET_TYPE_WEB;
            }
            return TICKET_TYPE_PC;
        }
        return TICKET_TYPE_APP;
    }

    public static EnumC69900Rc0 valueOf(String str) {
        return (EnumC69900Rc0) V0N.LJJJ(EnumC69900Rc0.class, str);
    }

    EnumC69900Rc0(int i) {
        this.LJLIL = i;
    }
}
