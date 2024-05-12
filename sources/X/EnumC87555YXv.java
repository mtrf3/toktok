package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.YXv, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public enum EnumC87555YXv implements WireEnum {
    DEFAULT_TOKEN(0),
    APP_TOKEN(1),
    SERVER_TOKEN(2);

    public static final ProtoAdapter<EnumC87555YXv> ADAPTER = new EnumAdapter<EnumC87555YXv>() { // from class: X.YXw
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC87555YXv LIZ(int i) {
            return EnumC87555YXv.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC87555YXv fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SERVER_TOKEN;
            }
            return APP_TOKEN;
        }
        return DEFAULT_TOKEN;
    }

    public static EnumC87555YXv valueOf(String str) {
        return (EnumC87555YXv) V0N.LJJJ(EnumC87555YXv.class, str);
    }

    EnumC87555YXv(int i) {
        this.LJLIL = i;
    }
}
