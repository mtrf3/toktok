package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.OwH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63513OwH implements WireEnum {
    OLDER(1),
    NEWER(2),
    FROM_LATEST(3);

    public static final ProtoAdapter<EnumC63513OwH> ADAPTER = new EnumAdapter<EnumC63513OwH>() { // from class: X.OwI
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63513OwH LIZ(int i) {
            return EnumC63513OwH.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63513OwH fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return FROM_LATEST;
            }
            return NEWER;
        }
        return OLDER;
    }

    public static EnumC63513OwH valueOf(String str) {
        return (EnumC63513OwH) V0N.LJJJ(EnumC63513OwH.class, str);
    }

    EnumC63513OwH(int i) {
        this.LJLIL = i;
    }
}
