package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes14.dex */
public enum V3O implements WireEnum {
    Video(0),
    Live(1);

    public static final ProtoAdapter<V3O> ADAPTER = new EnumAdapter<V3O>() { // from class: X.V3Q
        @Override // com.squareup.wire.EnumAdapter
        public final V3O LIZ(int i) {
            return V3O.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static V3O fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return Live;
        }
        return Video;
    }

    public static V3O valueOf(String str) {
        return (V3O) V0N.LJJJ(V3O.class, str);
    }

    V3O(int i) {
        this.LJLIL = i;
    }
}
