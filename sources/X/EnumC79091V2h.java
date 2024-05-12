package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.V2h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC79091V2h implements WireEnum {
    Default(0),
    ServerError(1),
    Moderation(2),
    Loading(3),
    Restricted(4),
    Abnormal(5);

    public static final ProtoAdapter<EnumC79091V2h> ADAPTER = new EnumAdapter<EnumC79091V2h>() { // from class: X.V2j
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC79091V2h LIZ(int i) {
            return EnumC79091V2h.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC79091V2h fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return Abnormal;
                        }
                        return Restricted;
                    }
                    return Loading;
                }
                return Moderation;
            }
            return ServerError;
        }
        return Default;
    }

    public static EnumC79091V2h valueOf(String str) {
        return (EnumC79091V2h) V0N.LJJJ(EnumC79091V2h.class, str);
    }

    EnumC79091V2h(int i) {
        this.LJLIL = i;
    }
}
