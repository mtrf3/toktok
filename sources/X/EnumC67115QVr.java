package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.QVr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC67115QVr implements WireEnum {
    SpecTopic(0),
    GlobalTopic(1),
    CustomTopic(2);

    public static final ProtoAdapter<EnumC67115QVr> ADAPTER = new EnumAdapter<EnumC67115QVr>() { // from class: X.QVw
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC67115QVr LIZ(int i) {
            return EnumC67115QVr.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC67115QVr fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CustomTopic;
            }
            return GlobalTopic;
        }
        return SpecTopic;
    }

    public static EnumC67115QVr valueOf(String str) {
        return (EnumC67115QVr) V0N.LJJJ(EnumC67115QVr.class, str);
    }

    EnumC67115QVr(int i) {
        this.LJLIL = i;
    }
}
