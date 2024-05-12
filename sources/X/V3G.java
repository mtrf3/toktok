package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes14.dex */
public enum V3G implements WireEnum {
    MessageNormal(10001),
    MessageCenter(10002),
    BannerTop(20001),
    BannerBottom(20002),
    PopupTop(30001),
    PopupBottom(30002);

    public static final ProtoAdapter<V3G> ADAPTER = new EnumAdapter<V3G>() { // from class: X.V3I
        @Override // com.squareup.wire.EnumAdapter
        public final V3G LIZ(int i) {
            return V3G.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static V3G fromValue(int i) {
        if (i != 10001) {
            if (i != 10002) {
                if (i != 20001) {
                    if (i != 20002) {
                        if (i != 30001) {
                            if (i != 30002) {
                                return null;
                            }
                            return PopupBottom;
                        }
                        return PopupTop;
                    }
                    return BannerBottom;
                }
                return BannerTop;
            }
            return MessageCenter;
        }
        return MessageNormal;
    }

    public static V3G valueOf(String str) {
        return (V3G) V0N.LJJJ(V3G.class, str);
    }

    V3G(int i) {
        this.LJLIL = i;
    }
}
