package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QMV implements QUG {
    public final int LJLIL;
    public final int LJLILLLLZI;

    @Override // X.QUG
    public final WsChannelMsg LJIILLIIL(C67101QVd protocol) {
        o.LJIIJ(protocol, "protocol");
        ProtoAdapter<C67101QVd> protoAdapter = C67101QVd.ADAPTER;
        byte[] encode = protoAdapter.encode(protocol);
        QMR qmr = new QMR(this.LJLIL);
        qmr.LJFF = encode;
        qmr.LJ = 2;
        qmr.LIZLLL = this.LJLILLLLZI;
        qmr.LJII = "pb";
        qmr.LJI = "pb";
        qmr.LJFF = protoAdapter.encode(protocol);
        return qmr.LIZ();
    }

    @Override // X.QUG
    public final C67101QVd LJJIJLIJ(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return C67101QVd.ADAPTER.decode(bArr);
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.QUG
    public final byte[] LJJJI(C67101QVd c67101QVd) {
        if (c67101QVd == null) {
            return null;
        }
        return C67101QVd.ADAPTER.encode(c67101QVd);
    }

    public QMV(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
