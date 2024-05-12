package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes12.dex */
public enum QVF implements WireEnum {
    Default(0),
    HttpPoll(1),
    HeartbeatPong(2);

    public static final ProtoAdapter<QVF> ADAPTER = new EnumAdapter<QVF>() { // from class: X.QVJ
        @Override // com.squareup.wire.EnumAdapter
        public final QVF LIZ(int i) {
            return QVF.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static QVF fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return HeartbeatPong;
            }
            return HttpPoll;
        }
        return Default;
    }

    public static QVF valueOf(String str) {
        return (QVF) V0N.LJJJ(QVF.class, str);
    }

    QVF(int i) {
        this.LJLIL = i;
    }
}
