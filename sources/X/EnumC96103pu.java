package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.3pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC96103pu implements WireEnum {
    USER_SET_CONVERSATION_CATEGORY_PRIMARY(1),
    USER_SET_CONVERSATION_CATEGORY_SECONDARY(2);

    public static final ProtoAdapter<EnumC96103pu> ADAPTER = new EnumAdapter<EnumC96103pu>() { // from class: X.3pz
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC96103pu LIZ(int i) {
            return EnumC96103pu.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC96103pu fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return USER_SET_CONVERSATION_CATEGORY_SECONDARY;
        }
        return USER_SET_CONVERSATION_CATEGORY_PRIMARY;
    }

    public static EnumC96103pu valueOf(String str) {
        return (EnumC96103pu) V0N.LJJJ(EnumC96103pu.class, str);
    }

    EnumC96103pu(int i) {
        this.LJLIL = i;
    }
}
