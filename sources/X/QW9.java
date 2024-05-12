package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes12.dex */
public enum QW9 implements WireEnum {
    Device(0),
    User(1);

    public static final ProtoAdapter<QW9> ADAPTER = new EnumAdapter<QW9>() { // from class: X.QWA
        @Override // com.squareup.wire.EnumAdapter
        public final QW9 LIZ(int i) {
            return QW9.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static QW9 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return User;
        }
        return Device;
    }

    public static QW9 valueOf(String str) {
        return (QW9) V0N.LJJJ(QW9.class, str);
    }

    QW9(int i) {
        this.LJLIL = i;
    }
}
