package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.YXy, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public enum EnumC87558YXy implements WireEnum {
    UNKNOWN_ACTION(0),
    FAVORITE(1),
    PIN(2),
    UNREAD(3);

    public static final ProtoAdapter<EnumC87558YXy> ADAPTER = new EnumAdapter<EnumC87558YXy>() { // from class: X.YXx
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC87558YXy LIZ(int i) {
            return EnumC87558YXy.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC87558YXy fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return UNREAD;
                }
                return PIN;
            }
            return FAVORITE;
        }
        return UNKNOWN_ACTION;
    }

    public static EnumC87558YXy valueOf(String str) {
        return (EnumC87558YXy) V0N.LJJJ(EnumC87558YXy.class, str);
    }

    EnumC87558YXy(int i) {
        this.LJLIL = i;
    }
}
