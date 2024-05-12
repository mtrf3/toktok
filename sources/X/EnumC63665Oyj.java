package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Oyj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63665Oyj implements WireEnum {
    COUNTER(0),
    TIMER(1);

    public static final ProtoAdapter<EnumC63665Oyj> ADAPTER = new EnumAdapter<EnumC63665Oyj>() { // from class: X.Oyr
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63665Oyj LIZ(int i) {
            return EnumC63665Oyj.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63665Oyj fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TIMER;
        }
        return COUNTER;
    }

    public static EnumC63665Oyj valueOf(String str) {
        return (EnumC63665Oyj) V0N.LJJJ(EnumC63665Oyj.class, str);
    }

    EnumC63665Oyj(int i) {
        this.LJLIL = i;
    }
}
