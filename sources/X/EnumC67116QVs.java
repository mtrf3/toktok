package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.QVs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC67116QVs implements WireEnum {
    NotExist(0),
    Active(1),
    Closed(2);

    public static final ProtoAdapter<EnumC67116QVs> ADAPTER = new EnumAdapter<EnumC67116QVs>() { // from class: X.QVv
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC67116QVs LIZ(int i) {
            return EnumC67116QVs.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC67116QVs fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Closed;
            }
            return Active;
        }
        return NotExist;
    }

    public static EnumC67116QVs valueOf(String str) {
        return (EnumC67116QVs) V0N.LJJJ(EnumC67116QVs.class, str);
    }

    EnumC67116QVs(int i) {
        this.LJLIL = i;
    }
}
