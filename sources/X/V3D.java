package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes14.dex */
public enum V3D implements WireEnum {
    DEFAULT(1),
    CLICKABLE_TEXT(2);

    public static final ProtoAdapter<V3D> ADAPTER = new EnumAdapter<V3D>() { // from class: X.V3F
        @Override // com.squareup.wire.EnumAdapter
        public final V3D LIZ(int i) {
            return V3D.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static V3D fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return CLICKABLE_TEXT;
        }
        return DEFAULT;
    }

    public static V3D valueOf(String str) {
        return (V3D) V0N.LJJJ(V3D.class, str);
    }

    V3D(int i) {
        this.LJLIL = i;
    }
}
