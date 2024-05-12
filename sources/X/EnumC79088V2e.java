package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.V2e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC79088V2e implements WireEnum {
    NoIcon(0),
    PlayIcon(1);

    public static final ProtoAdapter<EnumC79088V2e> ADAPTER = new EnumAdapter<EnumC79088V2e>() { // from class: X.V2g
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC79088V2e LIZ(int i) {
            return EnumC79088V2e.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC79088V2e fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PlayIcon;
        }
        return NoIcon;
    }

    public static EnumC79088V2e valueOf(String str) {
        return (EnumC79088V2e) V0N.LJJJ(EnumC79088V2e.class, str);
    }

    EnumC79088V2e(int i) {
        this.LJLIL = i;
    }
}
