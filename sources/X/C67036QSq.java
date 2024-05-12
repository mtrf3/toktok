package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.sync.SyncSDK;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.QSq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67036QSq implements InterfaceC66942QPa {
    public final /* synthetic */ C66947QPf LIZ;

    public C67036QSq(C66947QPf c66947QPf) {
        this.LIZ = c66947QPf;
    }

    @Override // X.InterfaceC66942QPa
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        SyncSDK.onReceiveWsEvent(wsChannelMsg);
    }

    @Override // X.InterfaceC66942QPa
    public final void LIZLLL(C66930QOo c66930QOo) {
        Iterator<QT0> it = C67035QSp.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(c66930QOo);
        }
        if (o.LJ(C67035QSp.LIZIZ().syncConnectOpt, Boolean.TRUE)) {
            C67035QSp.LIZ(false, this.LIZ, c66930QOo);
        }
    }
}
