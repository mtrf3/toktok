package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.QVt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC67117QVt implements WireEnum {
    Unknown(0),
    V1(1),
    V2(2);

    public static final ProtoAdapter<EnumC67117QVt> ADAPTER = new EnumAdapter<EnumC67117QVt>() { // from class: X.QVx
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC67117QVt LIZ(int i) {
            return EnumC67117QVt.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC67117QVt fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return V2;
            }
            return V1;
        }
        return Unknown;
    }

    public static EnumC67117QVt valueOf(String str) {
        return (EnumC67117QVt) V0N.LJJJ(EnumC67117QVt.class, str);
    }

    EnumC67117QVt(int i) {
        this.LJLIL = i;
    }
}
