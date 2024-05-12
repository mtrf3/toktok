package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.QuV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC68499QuV implements WireEnum {
    OneByOne(0),
    Increment(1);

    public static final ProtoAdapter<EnumC68499QuV> ADAPTER = new EnumAdapter<EnumC68499QuV>() { // from class: X.QuZ
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC68499QuV LIZ(int i) {
            return EnumC68499QuV.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC68499QuV fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return Increment;
        }
        return OneByOne;
    }

    public static EnumC68499QuV valueOf(String str) {
        return (EnumC68499QuV) V0N.LJJJ(EnumC68499QuV.class, str);
    }

    EnumC68499QuV(int i) {
        this.LJLIL = i;
    }
}
