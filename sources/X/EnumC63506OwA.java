package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.OwA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63506OwA implements WireEnum {
    ONE_TO_ONE_CHAT(1),
    GROUP_CHAT(2),
    LIVE_CHAT(3),
    BROADCAST_CHAT(4);

    public static final ProtoAdapter<EnumC63506OwA> ADAPTER = new EnumAdapter<EnumC63506OwA>() { // from class: X.OwB
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63506OwA LIZ(int i) {
            return EnumC63506OwA.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63506OwA fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return BROADCAST_CHAT;
                }
                return LIVE_CHAT;
            }
            return GROUP_CHAT;
        }
        return ONE_TO_ONE_CHAT;
    }

    public static EnumC63506OwA valueOf(String str) {
        return (EnumC63506OwA) V0N.LJJJ(EnumC63506OwA.class, str);
    }

    EnumC63506OwA(int i) {
        this.LJLIL = i;
    }
}
