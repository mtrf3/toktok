package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Ozr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63735Ozr implements WireEnum {
    BY_CONVERSATION(0),
    BY_USER(1);

    public static final ProtoAdapter<EnumC63735Ozr> ADAPTER = new EnumAdapter<EnumC63735Ozr>() { // from class: X.Ozs
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63735Ozr LIZ(int i) {
            return EnumC63735Ozr.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63735Ozr fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BY_USER;
        }
        return BY_CONVERSATION;
    }

    public static EnumC63735Ozr valueOf(String str) {
        return (EnumC63735Ozr) V0N.LJJJ(EnumC63735Ozr.class, str);
    }

    EnumC63735Ozr(int i) {
        this.LJLIL = i;
    }
}
