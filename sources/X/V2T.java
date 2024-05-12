package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes14.dex */
public enum V2T implements WireEnum {
    TEXT(0),
    PICTURE(1);

    public static final ProtoAdapter<V2T> ADAPTER = new EnumAdapter<V2T>() { // from class: X.V2X
        @Override // com.squareup.wire.EnumAdapter
        public final V2T LIZ(int i) {
            return V2T.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static V2T fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PICTURE;
        }
        return TEXT;
    }

    public static V2T valueOf(String str) {
        return (V2T) V0N.LJJJ(V2T.class, str);
    }

    V2T(int i) {
        this.LJLIL = i;
    }
}
