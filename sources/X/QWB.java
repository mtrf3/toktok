package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes12.dex */
public enum QWB implements WireEnum {
    Params(0),
    CustomParams(1),
    ErrCode(100),
    ErrMsg(101);

    public static final ProtoAdapter<QWB> ADAPTER = new EnumAdapter<QWB>() { // from class: X.QWC
        @Override // com.squareup.wire.EnumAdapter
        public final QWB LIZ(int i) {
            return QWB.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static QWB fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 100) {
                    if (i != 101) {
                        return null;
                    }
                    return ErrMsg;
                }
                return ErrCode;
            }
            return CustomParams;
        }
        return Params;
    }

    public static QWB valueOf(String str) {
        return (QWB) V0N.LJJJ(QWB.class, str);
    }

    QWB(int i) {
        this.LJLIL = i;
    }
}
