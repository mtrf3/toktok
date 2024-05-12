package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.QSr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67037QSr implements InterfaceC67070QTy {
    public final /* synthetic */ InterfaceC67043QSx LIZ;

    @Override // X.InterfaceC67070QTy
    public final boolean LJFF() {
        return this.LIZ.isConnected();
    }

    public C67037QSr(InterfaceC67043QSx interfaceC67043QSx) {
        this.LIZ = interfaceC67043QSx;
    }

    @Override // X.InterfaceC67070QTy
    public final void LIZ(QT0 qt0) {
        if (qt0 != null) {
            CopyOnWriteArrayList<QT0> copyOnWriteArrayList = C67035QSp.LJ;
            if (!copyOnWriteArrayList.contains(qt0)) {
                copyOnWriteArrayList.add(qt0);
            }
        }
    }

    @Override // X.InterfaceC67070QTy
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        this.LIZ.LIZIZ(wsChannelMsg);
    }
}
