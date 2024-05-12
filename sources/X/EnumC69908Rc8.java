package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Rc8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC69908Rc8 implements WireEnum {
    Success(1),
    AsyncSuccess(2),
    Fail(3),
    Offline(4);

    public static final ProtoAdapter<EnumC69908Rc8> ADAPTER = new EnumAdapter<EnumC69908Rc8>() { // from class: X.Rc9
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC69908Rc8 LIZ(int i) {
            return EnumC69908Rc8.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC69908Rc8 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return Offline;
                }
                return Fail;
            }
            return AsyncSuccess;
        }
        return Success;
    }

    public static EnumC69908Rc8 valueOf(String str) {
        return (EnumC69908Rc8) V0N.LJJJ(EnumC69908Rc8.class, str);
    }

    EnumC69908Rc8(int i) {
        this.LJLIL = i;
    }
}
