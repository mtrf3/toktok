package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Oyn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63669Oyn implements WireEnum {
    TYPING(3),
    CLEAR_INPUT(4);

    public static final ProtoAdapter<EnumC63669Oyn> ADAPTER = new EnumAdapter<EnumC63669Oyn>() { // from class: X.Oys
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63669Oyn LIZ(int i) {
            return EnumC63669Oyn.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63669Oyn fromValue(int i) {
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return CLEAR_INPUT;
        }
        return TYPING;
    }

    public static EnumC63669Oyn valueOf(String str) {
        return (EnumC63669Oyn) V0N.LJJJ(EnumC63669Oyn.class, str);
    }

    EnumC63669Oyn(int i) {
        this.LJLIL = i;
    }
}
