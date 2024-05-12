package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.3pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC96123pw implements WireEnum {
    IgnoreSenderRankUpdate(1),
    IgnoreReceiverRankUpdate(2),
    IgnoreAllRankUpdate(3);

    public static final ProtoAdapter<EnumC96123pw> ADAPTER = new EnumAdapter<EnumC96123pw>() { // from class: X.3px
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC96123pw LIZ(int i) {
            return EnumC96123pw.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC96123pw fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return IgnoreAllRankUpdate;
            }
            return IgnoreReceiverRankUpdate;
        }
        return IgnoreSenderRankUpdate;
    }

    public static EnumC96123pw valueOf(String str) {
        return (EnumC96123pw) V0N.LJJJ(EnumC96123pw.class, str);
    }

    EnumC96123pw(int i) {
        this.LJLIL = i;
    }
}
