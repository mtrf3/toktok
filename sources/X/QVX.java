package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes12.dex */
public enum QVX implements WireEnum {
    None(0),
    ACK(1),
    Data(2),
    Sync(3),
    Poll(4),
    FIN(5);

    public static final ProtoAdapter<QVX> ADAPTER = new EnumAdapter<QVX>() { // from class: X.QVu
        @Override // com.squareup.wire.EnumAdapter
        public final QVX LIZ(int i) {
            return QVX.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static QVX fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return FIN;
                        }
                        return Poll;
                    }
                    return Sync;
                }
                return Data;
            }
            return ACK;
        }
        return None;
    }

    public static QVX valueOf(String str) {
        return (QVX) V0N.LJJJ(QVX.class, str);
    }

    QVX(int i) {
        this.LJLIL = i;
    }
}
