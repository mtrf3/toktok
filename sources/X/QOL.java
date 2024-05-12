package X;

import android.content.Context;
import com.bytedance.common.wschannel.MainProcessMsg;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class QOL implements QO6 {
    public QOX LIZ;
    public final QOQ LIZIZ;
    public final QOO LIZJ;
    public final Context LIZLLL;
    public SsWsApp LJ;
    public EnumC66933QOr LJFF;
    public final AtomicBoolean LJI;
    public final ConcurrentHashMap<Integer, Boolean> LJII;

    public final void LIZJ() {
        this.LIZJ.LIZJ(this.LIZ.LIZ, this.LIZLLL);
        this.LJI.set(true);
    }

    public final void LIZ(QOX qox) {
        if (qox.LIZ == this.LIZ.LIZ) {
            if (this.LJI.get()) {
                return;
            }
            this.LIZ = qox;
            SsWsApp LIZ = QOV.LIZ(qox);
            this.LJ = LIZ;
            this.LIZJ.LIZIZ(this.LIZLLL, LIZ);
            return;
        }
        throw new IllegalArgumentException("channelId isn't the same");
    }

    public final void LIZIZ(WsChannelMsg wsChannelMsg, QOR qor) {
        if (wsChannelMsg.channelId == this.LIZ.LIZ) {
            if (this.LJI.get()) {
                if (qor != null) {
                    qor.LIZ();
                    return;
                }
                return;
            }
            this.LIZJ.LIZLLL(this.LIZLLL, new MainProcessMsg(wsChannelMsg, qor));
            return;
        }
        throw new IllegalArgumentException("channelId isn't the same");
    }

    public QOL(Context context, QOX qox, QOQ qoq) {
        QON qon = QOV.LIZ;
        this.LJI = new AtomicBoolean(false);
        this.LJII = new ConcurrentHashMap<>();
        this.LIZLLL = context;
        this.LIZJ = qon;
        this.LIZ = qox;
        this.LIZIZ = qoq;
        this.LJ = QOV.LIZ(qox);
    }
}
